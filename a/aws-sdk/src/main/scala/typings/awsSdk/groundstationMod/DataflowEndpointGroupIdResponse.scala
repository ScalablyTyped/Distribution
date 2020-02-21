package typings.awsSdk.groundstationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataflowEndpointGroupIdResponse extends js.Object {
  /**
    * UUID of a dataflow endpoint group.
    */
  var dataflowEndpointGroupId: js.UndefOr[String] = js.native
}

object DataflowEndpointGroupIdResponse {
  @scala.inline
  def apply(dataflowEndpointGroupId: String = null): DataflowEndpointGroupIdResponse = {
    val __obj = js.Dynamic.literal()
    if (dataflowEndpointGroupId != null) __obj.updateDynamic("dataflowEndpointGroupId")(dataflowEndpointGroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataflowEndpointGroupIdResponse]
  }
}

