package typings.azureSb.apnsserviceMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{  expiry  :std.Date,   aps  :object,   badge  :number,   alert  :string,   sound  :string,   payload  :object}> */
trait Template extends js.Object {
  var alert: js.UndefOr[String] = js.undefined
  var aps: js.UndefOr[js.Object] = js.undefined
  var badge: js.UndefOr[Double] = js.undefined
  var expiry: js.UndefOr[Date] = js.undefined
  var payload: js.UndefOr[js.Object] = js.undefined
  var sound: js.UndefOr[String] = js.undefined
}

object Template {
  @scala.inline
  def apply(
    alert: String = null,
    aps: js.Object = null,
    badge: js.UndefOr[Double] = js.undefined,
    expiry: Date = null,
    payload: js.Object = null,
    sound: String = null
  ): Template = {
    val __obj = js.Dynamic.literal()
    if (alert != null) __obj.updateDynamic("alert")(alert.asInstanceOf[js.Any])
    if (aps != null) __obj.updateDynamic("aps")(aps.asInstanceOf[js.Any])
    if (!js.isUndefined(badge)) __obj.updateDynamic("badge")(badge.get.asInstanceOf[js.Any])
    if (expiry != null) __obj.updateDynamic("expiry")(expiry.asInstanceOf[js.Any])
    if (payload != null) __obj.updateDynamic("payload")(payload.asInstanceOf[js.Any])
    if (sound != null) __obj.updateDynamic("sound")(sound.asInstanceOf[js.Any])
    __obj.asInstanceOf[Template]
  }
}

