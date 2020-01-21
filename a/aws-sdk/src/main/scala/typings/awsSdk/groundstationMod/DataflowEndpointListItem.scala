package typings.awsSdk.groundstationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataflowEndpointListItem extends js.Object {
  /**
    * ARN of a dataflow endpoint group.
    */
  var dataflowEndpointGroupArn: js.UndefOr[DataflowEndpointGroupArn] = js.native
  /**
    * UUID of a dataflow endpoint group.
    */
  var dataflowEndpointGroupId: js.UndefOr[String] = js.native
}

object DataflowEndpointListItem {
  @scala.inline
  def apply(dataflowEndpointGroupArn: DataflowEndpointGroupArn = null, dataflowEndpointGroupId: String = null): DataflowEndpointListItem = {
    val __obj = js.Dynamic.literal()
    if (dataflowEndpointGroupArn != null) __obj.updateDynamic("dataflowEndpointGroupArn")(dataflowEndpointGroupArn.asInstanceOf[js.Any])
    if (dataflowEndpointGroupId != null) __obj.updateDynamic("dataflowEndpointGroupId")(dataflowEndpointGroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataflowEndpointListItem]
  }
}

