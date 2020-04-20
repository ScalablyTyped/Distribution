package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateEmailTemplateResponse extends js.Object {
  var MessageBody: typings.awsSdk.pinpointMod.MessageBody = js.native
}

object UpdateEmailTemplateResponse {
  @scala.inline
  def apply(MessageBody: MessageBody): UpdateEmailTemplateResponse = {
    val __obj = js.Dynamic.literal(MessageBody = MessageBody.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateEmailTemplateResponse]
  }
}

