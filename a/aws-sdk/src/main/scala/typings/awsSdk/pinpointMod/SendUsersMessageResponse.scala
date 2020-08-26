package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SendUsersMessageResponse extends js.Object {
  /**
    * The unique identifier for the application that was used to send the message.
    */
  var ApplicationId: string = js.native
  /**
    * The unique identifier that was assigned to the message request.
    */
  var RequestId: js.UndefOr[string] = js.native
  /**
    * An object that indicates which endpoints the message was sent to, for each user. The object lists user IDs and, for each user ID, provides the endpoint IDs that the message was sent to. For each endpoint ID, it provides an EndpointMessageResult object.
    */
  var Result: js.UndefOr[MapOfMapOfEndpointMessageResult] = js.native
}

object SendUsersMessageResponse {
  @scala.inline
  def apply(ApplicationId: string): SendUsersMessageResponse = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendUsersMessageResponse]
  }
  @scala.inline
  implicit class SendUsersMessageResponseOps[Self <: SendUsersMessageResponse] (val x: Self) extends AnyVal {
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
    def setApplicationId(value: string): Self = this.set("ApplicationId", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequestId(value: string): Self = this.set("RequestId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestId: Self = this.set("RequestId", js.undefined)
    @scala.inline
    def setResult(value: MapOfMapOfEndpointMessageResult): Self = this.set("Result", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResult: Self = this.set("Result", js.undefined)
  }
  
}

