package typings.awsSdk.dlmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PolicyDetails extends js.Object {
  /**
    * A set of optional parameters for the policy. 
    */
  var Parameters: js.UndefOr[typings.awsSdk.dlmMod.Parameters] = js.native
  /**
    * The valid target resource types and actions a policy can manage. The default is EBS_SNAPSHOT_MANAGEMENT.
    */
  var PolicyType: js.UndefOr[PolicyTypeValues] = js.native
  /**
    * The resource type. Use VOLUME to create snapshots of individual volumes or use INSTANCE to create multi-volume snapshots from the volumes for an instance.
    */
  var ResourceTypes: js.UndefOr[ResourceTypeValuesList] = js.native
  /**
    * The schedule of policy-defined actions.
    */
  var Schedules: js.UndefOr[ScheduleList] = js.native
  /**
    * The single tag that identifies targeted resources for this policy.
    */
  var TargetTags: js.UndefOr[TargetTagList] = js.native
}

object PolicyDetails {
  @scala.inline
  def apply(): PolicyDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolicyDetails]
  }
  @scala.inline
  implicit class PolicyDetailsOps[Self <: PolicyDetails] (val x: Self) extends AnyVal {
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
    def setParameters(value: Parameters): Self = this.set("Parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParameters: Self = this.set("Parameters", js.undefined)
    @scala.inline
    def setPolicyType(value: PolicyTypeValues): Self = this.set("PolicyType", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePolicyType: Self = this.set("PolicyType", js.undefined)
    @scala.inline
    def setResourceTypesVarargs(value: ResourceTypeValues*): Self = this.set("ResourceTypes", js.Array(value :_*))
    @scala.inline
    def setResourceTypes(value: ResourceTypeValuesList): Self = this.set("ResourceTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceTypes: Self = this.set("ResourceTypes", js.undefined)
    @scala.inline
    def setSchedulesVarargs(value: Schedule*): Self = this.set("Schedules", js.Array(value :_*))
    @scala.inline
    def setSchedules(value: ScheduleList): Self = this.set("Schedules", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSchedules: Self = this.set("Schedules", js.undefined)
    @scala.inline
    def setTargetTagsVarargs(value: Tag*): Self = this.set("TargetTags", js.Array(value :_*))
    @scala.inline
    def setTargetTags(value: TargetTagList): Self = this.set("TargetTags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetTags: Self = this.set("TargetTags", js.undefined)
  }
  
}

