package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateEndpointRequest extends js.Object {
  /**
    * The unique identifier for the application. This identifier is displayed as the Project ID on the Amazon Pinpoint console.
    */
  var ApplicationId: string = js.native
  /**
    * The unique identifier for the endpoint.
    */
  var EndpointId: string = js.native
  var EndpointRequest: typings.awsSdk.pinpointMod.EndpointRequest = js.native
}

object UpdateEndpointRequest {
  @scala.inline
  def apply(ApplicationId: string, EndpointId: string, EndpointRequest: EndpointRequest): UpdateEndpointRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], EndpointId = EndpointId.asInstanceOf[js.Any], EndpointRequest = EndpointRequest.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UpdateEndpointRequest]
  }
}

