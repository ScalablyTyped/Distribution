package typings
package cssDashTreeLib.cssDashTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HexColor
  extends CssNodeCommon
     with CssNode
     with CssNodePlain {
  @JSName("type")
  var type_HexColor: cssDashTreeLib.cssDashTreeLibStrings.HexColor
  var value: java.lang.String
}

object HexColor {
  @scala.inline
  def apply(
    `type`: cssDashTreeLib.cssDashTreeLibStrings.HexColor,
    value: java.lang.String,
    loc: CssLocation = null
  ): HexColor = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("value")(value)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[HexColor]
  }
}

