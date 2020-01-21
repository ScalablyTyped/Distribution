package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateTemplateMessageBody extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the message template that was created.
    */
  var Arn: js.UndefOr[string] = js.native
  /**
    * The message that's returned from the API for the request to create the message template.
    */
  var Message: js.UndefOr[string] = js.native
  /**
    * The unique identifier for the request to create the message template.
    */
  var RequestID: js.UndefOr[string] = js.native
}

object CreateTemplateMessageBody {
  @scala.inline
  def apply(Arn: string = null, Message: string = null, RequestID: string = null): CreateTemplateMessageBody = {
    val __obj = js.Dynamic.literal()
    if (Arn != null) __obj.updateDynamic("Arn")(Arn.asInstanceOf[js.Any])
    if (Message != null) __obj.updateDynamic("Message")(Message.asInstanceOf[js.Any])
    if (RequestID != null) __obj.updateDynamic("RequestID")(RequestID.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTemplateMessageBody]
  }
}

