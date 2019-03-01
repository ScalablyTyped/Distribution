package typings
package cssDashTreeLib.cssDashTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValuePlain
  extends CssNodeCommon
     with CssNodePlain {
  var children: js.Array[CssNodePlain]
  @JSName("type")
  var type_ValuePlain: cssDashTreeLib.cssDashTreeLibStrings.Value
}

object ValuePlain {
  @scala.inline
  def apply(
    children: js.Array[CssNodePlain],
    `type`: cssDashTreeLib.cssDashTreeLibStrings.Value,
    loc: CssLocation = null
  ): ValuePlain = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("children")(children)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[ValuePlain]
  }
}

