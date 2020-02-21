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
    * The resource type.
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
  def apply(
    Parameters: Parameters = null,
    PolicyType: PolicyTypeValues = null,
    ResourceTypes: ResourceTypeValuesList = null,
    Schedules: ScheduleList = null,
    TargetTags: TargetTagList = null
  ): PolicyDetails = {
    val __obj = js.Dynamic.literal()
    if (Parameters != null) __obj.updateDynamic("Parameters")(Parameters.asInstanceOf[js.Any])
    if (PolicyType != null) __obj.updateDynamic("PolicyType")(PolicyType.asInstanceOf[js.Any])
    if (ResourceTypes != null) __obj.updateDynamic("ResourceTypes")(ResourceTypes.asInstanceOf[js.Any])
    if (Schedules != null) __obj.updateDynamic("Schedules")(Schedules.asInstanceOf[js.Any])
    if (TargetTags != null) __obj.updateDynamic("TargetTags")(TargetTags.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolicyDetails]
  }
}

