package typings.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StackResourceSummary extends js.Object {
  /**
    * Information about whether the resource's actual configuration differs, or has drifted, from its expected configuration, as defined in the stack template and any values specified as template parameters. For more information, see Detecting Unregulated Configuration Changes to Stacks and Resources.
    */
  var DriftInformation: js.UndefOr[StackResourceDriftInformationSummary] = js.native
  /**
    * Time the status was updated.
    */
  var LastUpdatedTimestamp: Timestamp = js.native
  /**
    * The logical name of the resource specified in the template.
    */
  var LogicalResourceId: typings.awsSdk.cloudformationMod.LogicalResourceId = js.native
  /**
    * The name or unique identifier that corresponds to a physical instance ID of the resource.
    */
  var PhysicalResourceId: js.UndefOr[typings.awsSdk.cloudformationMod.PhysicalResourceId] = js.native
  /**
    * Current status of the resource.
    */
  var ResourceStatus: typings.awsSdk.cloudformationMod.ResourceStatus = js.native
  /**
    * Success/failure message associated with the resource.
    */
  var ResourceStatusReason: js.UndefOr[typings.awsSdk.cloudformationMod.ResourceStatusReason] = js.native
  /**
    * Type of resource. (For more information, go to  AWS Resource Types Reference in the AWS CloudFormation User Guide.)
    */
  var ResourceType: typings.awsSdk.cloudformationMod.ResourceType = js.native
}

object StackResourceSummary {
  @scala.inline
  def apply(
    LastUpdatedTimestamp: Timestamp,
    LogicalResourceId: LogicalResourceId,
    ResourceStatus: ResourceStatus,
    ResourceType: ResourceType
  ): StackResourceSummary = {
    val __obj = js.Dynamic.literal(LastUpdatedTimestamp = LastUpdatedTimestamp.asInstanceOf[js.Any], LogicalResourceId = LogicalResourceId.asInstanceOf[js.Any], ResourceStatus = ResourceStatus.asInstanceOf[js.Any], ResourceType = ResourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[StackResourceSummary]
  }
  @scala.inline
  implicit class StackResourceSummaryOps[Self <: StackResourceSummary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setLastUpdatedTimestamp(value: Timestamp): Self = this.set("LastUpdatedTimestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def setLogicalResourceId(value: LogicalResourceId): Self = this.set("LogicalResourceId", value.asInstanceOf[js.Any])
    @scala.inline
    def setResourceStatus(value: ResourceStatus): Self = this.set("ResourceStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def setResourceType(value: ResourceType): Self = this.set("ResourceType", value.asInstanceOf[js.Any])
    @scala.inline
    def setDriftInformation(value: StackResourceDriftInformationSummary): Self = this.set("DriftInformation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDriftInformation: Self = this.set("DriftInformation", js.undefined)
    @scala.inline
    def setPhysicalResourceId(value: PhysicalResourceId): Self = this.set("PhysicalResourceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePhysicalResourceId: Self = this.set("PhysicalResourceId", js.undefined)
    @scala.inline
    def setResourceStatusReason(value: ResourceStatusReason): Self = this.set("ResourceStatusReason", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceStatusReason: Self = this.set("ResourceStatusReason", js.undefined)
  }
  
}

