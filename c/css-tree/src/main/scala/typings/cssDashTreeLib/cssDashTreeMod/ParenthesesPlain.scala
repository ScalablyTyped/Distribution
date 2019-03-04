package typings
package cssDashTreeLib.cssDashTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParenthesesPlain
  extends CssNodeCommon
     with CssNodePlain {
  var children: js.Array[CssNodePlain]
  @JSName("type")
  var type_ParenthesesPlain: cssDashTreeLib.cssDashTreeLibStrings.Parentheses
}

object ParenthesesPlain {
  @scala.inline
  def apply(
    children: js.Array[CssNodePlain],
    `type`: cssDashTreeLib.cssDashTreeLibStrings.Parentheses,
    loc: CssLocation = null
  ): ParenthesesPlain = {
    val __obj = js.Dynamic.literal(children = children)
    __obj.updateDynamic("type")(`type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[ParenthesesPlain]
  }
}

