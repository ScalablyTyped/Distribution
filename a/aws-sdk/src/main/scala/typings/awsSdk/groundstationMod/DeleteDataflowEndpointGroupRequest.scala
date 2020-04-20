package typings.awsSdk.groundstationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteDataflowEndpointGroupRequest extends js.Object {
  /**
    * UUID of a dataflow endpoint group.
    */
  var dataflowEndpointGroupId: String = js.native
}

object DeleteDataflowEndpointGroupRequest {
  @scala.inline
  def apply(dataflowEndpointGroupId: String): DeleteDataflowEndpointGroupRequest = {
    val __obj = js.Dynamic.literal(dataflowEndpointGroupId = dataflowEndpointGroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDataflowEndpointGroupRequest]
  }
}

