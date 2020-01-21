package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateEndpointsBatchRequest extends js.Object {
  /**
    * The unique identifier for the application. This identifier is displayed as the Project ID on the Amazon Pinpoint console.
    */
  var ApplicationId: string = js.native
  var EndpointBatchRequest: typings.awsSdk.pinpointMod.EndpointBatchRequest = js.native
}

object UpdateEndpointsBatchRequest {
  @scala.inline
  def apply(ApplicationId: string, EndpointBatchRequest: EndpointBatchRequest): UpdateEndpointsBatchRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], EndpointBatchRequest = EndpointBatchRequest.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UpdateEndpointsBatchRequest]
  }
}

