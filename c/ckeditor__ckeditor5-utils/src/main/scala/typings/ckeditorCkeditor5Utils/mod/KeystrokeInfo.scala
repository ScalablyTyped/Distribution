package typings.ckeditorCkeditor5Utils.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeystrokeInfo extends js.Object {
  var altKey: js.UndefOr[Boolean] = js.undefined
  var ctrlKey: js.UndefOr[Boolean] = js.undefined
  var keyCode: Double
  var shiftKey: js.UndefOr[Boolean] = js.undefined
}

object KeystrokeInfo {
  @scala.inline
  def apply(
    keyCode: Double,
    altKey: js.UndefOr[Boolean] = js.undefined,
    ctrlKey: js.UndefOr[Boolean] = js.undefined,
    shiftKey: js.UndefOr[Boolean] = js.undefined
  ): KeystrokeInfo = {
    val __obj = js.Dynamic.literal(keyCode = keyCode.asInstanceOf[js.Any])
    if (!js.isUndefined(altKey)) __obj.updateDynamic("altKey")(altKey.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ctrlKey)) __obj.updateDynamic("ctrlKey")(ctrlKey.get.asInstanceOf[js.Any])
    if (!js.isUndefined(shiftKey)) __obj.updateDynamic("shiftKey")(shiftKey.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeystrokeInfo]
  }
}

