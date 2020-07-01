package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JourneyCustomMessage extends js.Object {
  /**
    * The message content that's passed to an AWS Lambda function or to a web hook.
    */
  var Data: js.UndefOr[string] = js.native
}

object JourneyCustomMessage {
  @scala.inline
  def apply(Data: string = null): JourneyCustomMessage = {
    val __obj = js.Dynamic.literal()
    if (Data != null) __obj.updateDynamic("Data")(Data.asInstanceOf[js.Any])
    __obj.asInstanceOf[JourneyCustomMessage]
  }
}

