package typings
package cssDashTreeLib.cssDashTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Parentheses
  extends CssNodeCommon
     with CssNode {
  var children: List[CssNode]
  @JSName("type")
  var type_Parentheses: cssDashTreeLib.cssDashTreeLibStrings.Parentheses
}

object Parentheses {
  @scala.inline
  def apply(
    children: List[CssNode],
    `type`: cssDashTreeLib.cssDashTreeLibStrings.Parentheses,
    loc: CssLocation = null
  ): Parentheses = {
    val __obj = js.Dynamic.literal(children = children)
    __obj.updateDynamic("type")(`type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[Parentheses]
  }
}

