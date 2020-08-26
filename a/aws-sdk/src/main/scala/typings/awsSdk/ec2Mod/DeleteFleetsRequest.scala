package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteFleetsRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The IDs of the EC2 Fleets.
    */
  var FleetIds: FleetIdSet = js.native
  /**
    * Indicates whether to terminate instances for an EC2 Fleet if it is deleted successfully.
    */
  var TerminateInstances: Boolean = js.native
}

object DeleteFleetsRequest {
  @scala.inline
  def apply(FleetIds: FleetIdSet, TerminateInstances: Boolean): DeleteFleetsRequest = {
    val __obj = js.Dynamic.literal(FleetIds = FleetIds.asInstanceOf[js.Any], TerminateInstances = TerminateInstances.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteFleetsRequest]
  }
  @scala.inline
  implicit class DeleteFleetsRequestOps[Self <: DeleteFleetsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFleetIdsVarargs(value: FleetId*): Self = this.set("FleetIds", js.Array(value :_*))
    @scala.inline
    def setFleetIds(value: FleetIdSet): Self = this.set("FleetIds", value.asInstanceOf[js.Any])
    @scala.inline
    def setTerminateInstances(value: Boolean): Self = this.set("TerminateInstances", value.asInstanceOf[js.Any])
    @scala.inline
    def setDryRun(value: Boolean): Self = this.set("DryRun", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDryRun: Self = this.set("DryRun", js.undefined)
  }
  
}

