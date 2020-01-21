package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDevEndpointRequest extends js.Object {
  /**
    * Name of the DevEndpoint to retrieve information for.
    */
  var EndpointName: GenericString = js.native
}

object GetDevEndpointRequest {
  @scala.inline
  def apply(EndpointName: GenericString): GetDevEndpointRequest = {
    val __obj = js.Dynamic.literal(EndpointName = EndpointName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetDevEndpointRequest]
  }
}

