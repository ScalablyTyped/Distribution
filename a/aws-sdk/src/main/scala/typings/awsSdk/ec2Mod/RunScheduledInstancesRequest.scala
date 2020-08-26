package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RunScheduledInstancesRequest extends js.Object {
  /**
    * Unique, case-sensitive identifier that ensures the idempotency of the request. For more information, see Ensuring Idempotency.
    */
  var ClientToken: js.UndefOr[String] = js.native
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The number of instances. Default: 1
    */
  var InstanceCount: js.UndefOr[Integer] = js.native
  /**
    * The launch specification. You must match the instance type, Availability Zone, network, and platform of the schedule that you purchased.
    */
  var LaunchSpecification: ScheduledInstancesLaunchSpecification = js.native
  /**
    * The Scheduled Instance ID.
    */
  var ScheduledInstanceId: typings.awsSdk.ec2Mod.ScheduledInstanceId = js.native
}

object RunScheduledInstancesRequest {
  @scala.inline
  def apply(
    LaunchSpecification: ScheduledInstancesLaunchSpecification,
    ScheduledInstanceId: ScheduledInstanceId
  ): RunScheduledInstancesRequest = {
    val __obj = js.Dynamic.literal(LaunchSpecification = LaunchSpecification.asInstanceOf[js.Any], ScheduledInstanceId = ScheduledInstanceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RunScheduledInstancesRequest]
  }
  @scala.inline
  implicit class RunScheduledInstancesRequestOps[Self <: RunScheduledInstancesRequest] (val x: Self) extends AnyVal {
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
    def setLaunchSpecification(value: ScheduledInstancesLaunchSpecification): Self = this.set("LaunchSpecification", value.asInstanceOf[js.Any])
    @scala.inline
    def setScheduledInstanceId(value: ScheduledInstanceId): Self = this.set("ScheduledInstanceId", value.asInstanceOf[js.Any])
    @scala.inline
    def setClientToken(value: String): Self = this.set("ClientToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientToken: Self = this.set("ClientToken", js.undefined)
    @scala.inline
    def setDryRun(value: Boolean): Self = this.set("DryRun", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDryRun: Self = this.set("DryRun", js.undefined)
    @scala.inline
    def setInstanceCount(value: Integer): Self = this.set("InstanceCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceCount: Self = this.set("InstanceCount", js.undefined)
  }
  
}

