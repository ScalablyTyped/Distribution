package typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreEventItemResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _EventItemResponse extends js.Object {
  /**
    * A custom message that is associated with the processing of an event.
    */
  var Message: js.UndefOr[String] = js.undefined
  /**
    * The status returned in the response as a result of processing the event.
    *
    * Possible values: 400 (for invalid events) and 202 (for events that were accepted).
    */
  var StatusCode: js.UndefOr[Double] = js.undefined
}

object _EventItemResponse {
  @scala.inline
  def apply(Message: String = null, StatusCode: Int | Double = null): _EventItemResponse = {
    val __obj = js.Dynamic.literal()
    if (Message != null) __obj.updateDynamic("Message")(Message.asInstanceOf[js.Any])
    if (StatusCode != null) __obj.updateDynamic("StatusCode")(StatusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[_EventItemResponse]
  }
}

