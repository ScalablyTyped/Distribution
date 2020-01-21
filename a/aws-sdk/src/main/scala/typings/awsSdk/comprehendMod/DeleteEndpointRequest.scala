package typings.awsSdk.comprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteEndpointRequest extends js.Object {
  /**
    * The Amazon Resource Number (ARN) of the endpoint being deleted.
    */
  var EndpointArn: ComprehendEndpointArn = js.native
}

object DeleteEndpointRequest {
  @scala.inline
  def apply(EndpointArn: ComprehendEndpointArn): DeleteEndpointRequest = {
    val __obj = js.Dynamic.literal(EndpointArn = EndpointArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteEndpointRequest]
  }
}

