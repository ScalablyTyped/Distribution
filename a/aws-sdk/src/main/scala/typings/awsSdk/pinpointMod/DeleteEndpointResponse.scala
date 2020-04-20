package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteEndpointResponse extends js.Object {
  var EndpointResponse: typings.awsSdk.pinpointMod.EndpointResponse = js.native
}

object DeleteEndpointResponse {
  @scala.inline
  def apply(EndpointResponse: EndpointResponse): DeleteEndpointResponse = {
    val __obj = js.Dynamic.literal(EndpointResponse = EndpointResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteEndpointResponse]
  }
}

