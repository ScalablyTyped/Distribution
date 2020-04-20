package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetUserEndpointsResponse extends js.Object {
  var EndpointsResponse: typings.awsSdk.pinpointMod.EndpointsResponse = js.native
}

object GetUserEndpointsResponse {
  @scala.inline
  def apply(EndpointsResponse: EndpointsResponse): GetUserEndpointsResponse = {
    val __obj = js.Dynamic.literal(EndpointsResponse = EndpointsResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetUserEndpointsResponse]
  }
}

