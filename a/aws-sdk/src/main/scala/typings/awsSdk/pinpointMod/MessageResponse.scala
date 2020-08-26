package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MessageResponse extends js.Object {
  /**
    * The unique identifier for the application that was used to send the message.
    */
  var ApplicationId: string = js.native
  /**
    * A map that contains a multipart response for each address that the message was sent to. In the map, the endpoint ID is the key and the result is the value.
    */
  var EndpointResult: js.UndefOr[MapOfEndpointMessageResult] = js.native
  /**
    * The identifier for the original request that the message was delivered for.
    */
  var RequestId: js.UndefOr[string] = js.native
  /**
    * A map that contains a multipart response for each address (email address, phone number, or push notification token) that the message was sent to. In the map, the address is the key and the result is the value.
    */
  var Result: js.UndefOr[MapOfMessageResult] = js.native
}

object MessageResponse {
  @scala.inline
  def apply(ApplicationId: string): MessageResponse = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageResponse]
  }
  @scala.inline
  implicit class MessageResponseOps[Self <: MessageResponse] (val x: Self) extends AnyVal {
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
    def setEndpointResult(value: MapOfEndpointMessageResult): Self = this.set("EndpointResult", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndpointResult: Self = this.set("EndpointResult", js.undefined)
    @scala.inline
    def setRequestId(value: string): Self = this.set("RequestId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestId: Self = this.set("RequestId", js.undefined)
    @scala.inline
    def setResult(value: MapOfMessageResult): Self = this.set("Result", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResult: Self = this.set("Result", js.undefined)
  }
  
}

