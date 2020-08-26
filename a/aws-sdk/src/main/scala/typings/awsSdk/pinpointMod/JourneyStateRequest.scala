package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JourneyStateRequest extends js.Object {
  /**
    * The status of the journey. Currently, the only supported value is CANCELLED. If you cancel a journey, Amazon Pinpoint continues to perform activities that are currently in progress, until those activities are complete. Amazon Pinpoint also continues to collect and aggregate analytics data for those activities, until they are complete, and any activities that were complete when you cancelled the journey. After you cancel a journey, you can't add, change, or remove any activities from the journey. In addition, Amazon Pinpoint stops evaluating the journey and doesn't perform any activities that haven't started.
    */
  var State: js.UndefOr[typings.awsSdk.pinpointMod.State] = js.native
}

object JourneyStateRequest {
  @scala.inline
  def apply(): JourneyStateRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JourneyStateRequest]
  }
  @scala.inline
  implicit class JourneyStateRequestOps[Self <: JourneyStateRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setState(value: State): Self = this.set("State", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("State", js.undefined)
  }
  
}

