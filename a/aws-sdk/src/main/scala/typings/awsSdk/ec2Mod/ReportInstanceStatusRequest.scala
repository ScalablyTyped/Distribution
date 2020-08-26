package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReportInstanceStatusRequest extends js.Object {
  /**
    * Descriptive text about the health state of your instance.
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The time at which the reported instance health state ended.
    */
  var EndTime: js.UndefOr[DateTime] = js.native
  /**
    * The instances.
    */
  var Instances: InstanceIdStringList = js.native
  /**
    * The reason codes that describe the health state of your instance.    instance-stuck-in-state: My instance is stuck in a state.    unresponsive: My instance is unresponsive.    not-accepting-credentials: My instance is not accepting my credentials.    password-not-available: A password is not available for my instance.    performance-network: My instance is experiencing performance problems that I believe are network related.    performance-instance-store: My instance is experiencing performance problems that I believe are related to the instance stores.    performance-ebs-volume: My instance is experiencing performance problems that I believe are related to an EBS volume.    performance-other: My instance is experiencing performance problems.    other: [explain using the description parameter]  
    */
  var ReasonCodes: ReasonCodesList = js.native
  /**
    * The time at which the reported instance health state began.
    */
  var StartTime: js.UndefOr[DateTime] = js.native
  /**
    * The status of all instances listed.
    */
  var Status: ReportStatusType = js.native
}

object ReportInstanceStatusRequest {
  @scala.inline
  def apply(Instances: InstanceIdStringList, ReasonCodes: ReasonCodesList, Status: ReportStatusType): ReportInstanceStatusRequest = {
    val __obj = js.Dynamic.literal(Instances = Instances.asInstanceOf[js.Any], ReasonCodes = ReasonCodes.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReportInstanceStatusRequest]
  }
  @scala.inline
  implicit class ReportInstanceStatusRequestOps[Self <: ReportInstanceStatusRequest] (val x: Self) extends AnyVal {
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
    def setInstancesVarargs(value: InstanceId*): Self = this.set("Instances", js.Array(value :_*))
    @scala.inline
    def setInstances(value: InstanceIdStringList): Self = this.set("Instances", value.asInstanceOf[js.Any])
    @scala.inline
    def setReasonCodesVarargs(value: ReportInstanceReasonCodes*): Self = this.set("ReasonCodes", js.Array(value :_*))
    @scala.inline
    def setReasonCodes(value: ReasonCodesList): Self = this.set("ReasonCodes", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: ReportStatusType): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: String): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    @scala.inline
    def setDryRun(value: Boolean): Self = this.set("DryRun", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDryRun: Self = this.set("DryRun", js.undefined)
    @scala.inline
    def setEndTime(value: DateTime): Self = this.set("EndTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndTime: Self = this.set("EndTime", js.undefined)
    @scala.inline
    def setStartTime(value: DateTime): Self = this.set("StartTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartTime: Self = this.set("StartTime", js.undefined)
  }
  
}

