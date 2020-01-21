package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteDevEndpointRequest extends js.Object {
  /**
    * The name of the DevEndpoint.
    */
  var EndpointName: GenericString = js.native
}

object DeleteDevEndpointRequest {
  @scala.inline
  def apply(EndpointName: GenericString): DeleteDevEndpointRequest = {
    val __obj = js.Dynamic.literal(EndpointName = EndpointName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteDevEndpointRequest]
  }
}

