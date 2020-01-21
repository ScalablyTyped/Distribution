package typings.cssTree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Parentheses
  extends CssNodeCommon
     with CssNode {
  var children: List[CssNode]
  @JSName("type")
  var type_Parentheses: typings.cssTree.cssTreeStrings.Parentheses
}

object Parentheses {
  @scala.inline
  def apply(
    children: List[CssNode],
    `type`: typings.cssTree.cssTreeStrings.Parentheses,
    loc: CssLocation = null
  ): Parentheses = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parentheses]
  }
}

