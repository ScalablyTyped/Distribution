package typings
package atCkeditorCkeditor5DashUtilsLib.atCkeditorCkeditor5DashUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeystrokeInfo extends js.Object {
  var altKey: js.UndefOr[scala.Boolean] = js.undefined
  var ctrlKey: js.UndefOr[scala.Boolean] = js.undefined
  var keyCode: scala.Double
  var shiftKey: js.UndefOr[scala.Boolean] = js.undefined
}

object KeystrokeInfo {
  @scala.inline
  def apply(
    keyCode: scala.Double,
    altKey: js.UndefOr[scala.Boolean] = js.undefined,
    ctrlKey: js.UndefOr[scala.Boolean] = js.undefined,
    shiftKey: js.UndefOr[scala.Boolean] = js.undefined
  ): KeystrokeInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("keyCode")(keyCode)
    if (!js.isUndefined(altKey)) __obj.updateDynamic("altKey")(altKey)
    if (!js.isUndefined(ctrlKey)) __obj.updateDynamic("ctrlKey")(ctrlKey)
    if (!js.isUndefined(shiftKey)) __obj.updateDynamic("shiftKey")(shiftKey)
    __obj.asInstanceOf[KeystrokeInfo]
  }
}

