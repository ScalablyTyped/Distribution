package typings.cssTree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Brackets
  extends CssNodeCommon
     with CssNode {
  var children: List[CssNode]
  @JSName("type")
  var type_Brackets: typings.cssTree.cssTreeStrings.Brackets
}

object Brackets {
  @scala.inline
  def apply(children: List[CssNode], `type`: typings.cssTree.cssTreeStrings.Brackets, loc: CssLocation = null): Brackets = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[Brackets]
  }
}

