package typings.clearbladejsServer.CbServer

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimerCreateOptions extends js.Object {
  var description: js.UndefOr[String] = js.undefined
  var frequency: js.UndefOr[Double] = js.undefined
  var repeats: js.UndefOr[Double] = js.undefined
  var service_name: js.UndefOr[String] = js.undefined
  var start_time: js.UndefOr[Date] = js.undefined
  var user_id: js.UndefOr[String] = js.undefined
  var user_token: js.UndefOr[String] = js.undefined
}

object TimerCreateOptions {
  @scala.inline
  def apply(
    description: String = null,
    frequency: Int | Double = null,
    repeats: Int | Double = null,
    service_name: String = null,
    start_time: Date = null,
    user_id: String = null,
    user_token: String = null
  ): TimerCreateOptions = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (frequency != null) __obj.updateDynamic("frequency")(frequency.asInstanceOf[js.Any])
    if (repeats != null) __obj.updateDynamic("repeats")(repeats.asInstanceOf[js.Any])
    if (service_name != null) __obj.updateDynamic("service_name")(service_name.asInstanceOf[js.Any])
    if (start_time != null) __obj.updateDynamic("start_time")(start_time.asInstanceOf[js.Any])
    if (user_id != null) __obj.updateDynamic("user_id")(user_id.asInstanceOf[js.Any])
    if (user_token != null) __obj.updateDynamic("user_token")(user_token.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimerCreateOptions]
  }
}

