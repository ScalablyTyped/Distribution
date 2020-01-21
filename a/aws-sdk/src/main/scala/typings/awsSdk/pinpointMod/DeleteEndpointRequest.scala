package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteEndpointRequest extends js.Object {
  /**
    * The unique identifier for the application. This identifier is displayed as the Project ID on the Amazon Pinpoint console.
    */
  var ApplicationId: string = js.native
  /**
    * The unique identifier for the endpoint.
    */
  var EndpointId: string = js.native
}

object DeleteEndpointRequest {
  @scala.inline
  def apply(ApplicationId: string, EndpointId: string): DeleteEndpointRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], EndpointId = EndpointId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteEndpointRequest]
  }
}

