package typings
package clearbladejsDashServerLib.CbServerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimerCreateOptions extends js.Object {
  var description: js.UndefOr[java.lang.String] = js.undefined
  var frequency: js.UndefOr[scala.Double] = js.undefined
  var repeats: js.UndefOr[scala.Double] = js.undefined
  var service_name: js.UndefOr[java.lang.String] = js.undefined
  var start_time: js.UndefOr[stdLib.Date] = js.undefined
  var user_id: js.UndefOr[java.lang.String] = js.undefined
  var user_token: js.UndefOr[java.lang.String] = js.undefined
}

object TimerCreateOptions {
  @scala.inline
  def apply(
    description: java.lang.String = null,
    frequency: scala.Int | scala.Double = null,
    repeats: scala.Int | scala.Double = null,
    service_name: java.lang.String = null,
    start_time: stdLib.Date = null,
    user_id: java.lang.String = null,
    user_token: java.lang.String = null
  ): TimerCreateOptions = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description)
    if (frequency != null) __obj.updateDynamic("frequency")(frequency.asInstanceOf[js.Any])
    if (repeats != null) __obj.updateDynamic("repeats")(repeats.asInstanceOf[js.Any])
    if (service_name != null) __obj.updateDynamic("service_name")(service_name)
    if (start_time != null) __obj.updateDynamic("start_time")(start_time)
    if (user_id != null) __obj.updateDynamic("user_id")(user_id)
    if (user_token != null) __obj.updateDynamic("user_token")(user_token)
    __obj.asInstanceOf[TimerCreateOptions]
  }
}

