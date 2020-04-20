package typings.awsSdk.globalacceleratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteEndpointGroupRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the endpoint group to delete.
    */
  var EndpointGroupArn: GenericString = js.native
}

object DeleteEndpointGroupRequest {
  @scala.inline
  def apply(EndpointGroupArn: GenericString): DeleteEndpointGroupRequest = {
    val __obj = js.Dynamic.literal(EndpointGroupArn = EndpointGroupArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteEndpointGroupRequest]
  }
}

