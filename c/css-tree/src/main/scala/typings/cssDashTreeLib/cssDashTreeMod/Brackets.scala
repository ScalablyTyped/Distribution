package typings
package cssDashTreeLib.cssDashTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Brackets
  extends CssNodeCommon
     with CssNode {
  var children: List[CssNode]
  @JSName("type")
  var type_Brackets: cssDashTreeLib.cssDashTreeLibStrings.Brackets
}

object Brackets {
  @scala.inline
  def apply(
    children: List[CssNode],
    `type`: cssDashTreeLib.cssDashTreeLibStrings.Brackets,
    loc: CssLocation = null
  ): Brackets = {
    val __obj = js.Dynamic.literal(children = children)
    __obj.updateDynamic("type")(`type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[Brackets]
  }
}

