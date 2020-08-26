package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteFlowLogsRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * One or more flow log IDs. Constraint: Maximum of 1000 flow log IDs.
    */
  var FlowLogIds: FlowLogIdList = js.native
}

object DeleteFlowLogsRequest {
  @scala.inline
  def apply(FlowLogIds: FlowLogIdList): DeleteFlowLogsRequest = {
    val __obj = js.Dynamic.literal(FlowLogIds = FlowLogIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteFlowLogsRequest]
  }
  @scala.inline
  implicit class DeleteFlowLogsRequestOps[Self <: DeleteFlowLogsRequest] (val x: Self) extends AnyVal {
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
    def setFlowLogIdsVarargs(value: VpcFlowLogId*): Self = this.set("FlowLogIds", js.Array(value :_*))
    @scala.inline
    def setFlowLogIds(value: FlowLogIdList): Self = this.set("FlowLogIds", value.asInstanceOf[js.Any])
    @scala.inline
    def setDryRun(value: Boolean): Self = this.set("DryRun", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDryRun: Self = this.set("DryRun", js.undefined)
  }
  
}

