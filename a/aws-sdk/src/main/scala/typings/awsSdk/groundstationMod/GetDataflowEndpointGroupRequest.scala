package typings.awsSdk.groundstationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDataflowEndpointGroupRequest extends js.Object {
  /**
    * UUID of a dataflow endpoint group.
    */
  var dataflowEndpointGroupId: String = js.native
}

object GetDataflowEndpointGroupRequest {
  @scala.inline
  def apply(dataflowEndpointGroupId: String): GetDataflowEndpointGroupRequest = {
    val __obj = js.Dynamic.literal(dataflowEndpointGroupId = dataflowEndpointGroupId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetDataflowEndpointGroupRequest]
  }
}

