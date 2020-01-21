package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteQueuedReservedInstancesRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The IDs of the Reserved Instances.
    */
  var ReservedInstancesIds: DeleteQueuedReservedInstancesIdList = js.native
}

object DeleteQueuedReservedInstancesRequest {
  @scala.inline
  def apply(
    ReservedInstancesIds: DeleteQueuedReservedInstancesIdList,
    DryRun: js.UndefOr[scala.Boolean] = js.undefined
  ): DeleteQueuedReservedInstancesRequest = {
    val __obj = js.Dynamic.literal(ReservedInstancesIds = ReservedInstancesIds.asInstanceOf[js.Any])
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteQueuedReservedInstancesRequest]
  }
}

