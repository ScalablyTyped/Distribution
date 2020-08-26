package typings.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StackSummary extends js.Object {
  /**
    * The time the stack was created.
    */
  var CreationTime: typings.awsSdk.cloudformationMod.CreationTime = js.native
  /**
    * The time the stack was deleted.
    */
  var DeletionTime: js.UndefOr[typings.awsSdk.cloudformationMod.DeletionTime] = js.native
  /**
    * Summarizes information on whether a stack's actual configuration differs, or has drifted, from it's expected configuration, as defined in the stack template and any values specified as template parameters. For more information, see Detecting Unregulated Configuration Changes to Stacks and Resources.
    */
  var DriftInformation: js.UndefOr[StackDriftInformationSummary] = js.native
  /**
    * The time the stack was last updated. This field will only be returned if the stack has been updated at least once.
    */
  var LastUpdatedTime: js.UndefOr[typings.awsSdk.cloudformationMod.LastUpdatedTime] = js.native
  /**
    * For nested stacks--stacks created as resources for another stack--the stack ID of the direct parent of this stack. For the first level of nested stacks, the root stack is also the parent stack. For more information, see Working with Nested Stacks in the AWS CloudFormation User Guide.
    */
  var ParentId: js.UndefOr[StackId] = js.native
  /**
    * For nested stacks--stacks created as resources for another stack--the stack ID of the top-level stack to which the nested stack ultimately belongs. For more information, see Working with Nested Stacks in the AWS CloudFormation User Guide.
    */
  var RootId: js.UndefOr[StackId] = js.native
  /**
    * Unique stack identifier.
    */
  var StackId: js.UndefOr[typings.awsSdk.cloudformationMod.StackId] = js.native
  /**
    * The name associated with the stack.
    */
  var StackName: typings.awsSdk.cloudformationMod.StackName = js.native
  /**
    * The current status of the stack.
    */
  var StackStatus: typings.awsSdk.cloudformationMod.StackStatus = js.native
  /**
    * Success/Failure message associated with the stack status.
    */
  var StackStatusReason: js.UndefOr[typings.awsSdk.cloudformationMod.StackStatusReason] = js.native
  /**
    * The template description of the template used to create the stack.
    */
  var TemplateDescription: js.UndefOr[typings.awsSdk.cloudformationMod.TemplateDescription] = js.native
}

object StackSummary {
  @scala.inline
  def apply(CreationTime: CreationTime, StackName: StackName, StackStatus: StackStatus): StackSummary = {
    val __obj = js.Dynamic.literal(CreationTime = CreationTime.asInstanceOf[js.Any], StackName = StackName.asInstanceOf[js.Any], StackStatus = StackStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[StackSummary]
  }
  @scala.inline
  implicit class StackSummaryOps[Self <: StackSummary] (val x: Self) extends AnyVal {
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
    def setCreationTime(value: CreationTime): Self = this.set("CreationTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setStackName(value: StackName): Self = this.set("StackName", value.asInstanceOf[js.Any])
    @scala.inline
    def setStackStatus(value: StackStatus): Self = this.set("StackStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeletionTime(value: DeletionTime): Self = this.set("DeletionTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeletionTime: Self = this.set("DeletionTime", js.undefined)
    @scala.inline
    def setDriftInformation(value: StackDriftInformationSummary): Self = this.set("DriftInformation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDriftInformation: Self = this.set("DriftInformation", js.undefined)
    @scala.inline
    def setLastUpdatedTime(value: LastUpdatedTime): Self = this.set("LastUpdatedTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastUpdatedTime: Self = this.set("LastUpdatedTime", js.undefined)
    @scala.inline
    def setParentId(value: StackId): Self = this.set("ParentId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParentId: Self = this.set("ParentId", js.undefined)
    @scala.inline
    def setRootId(value: StackId): Self = this.set("RootId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRootId: Self = this.set("RootId", js.undefined)
    @scala.inline
    def setStackId(value: StackId): Self = this.set("StackId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStackId: Self = this.set("StackId", js.undefined)
    @scala.inline
    def setStackStatusReason(value: StackStatusReason): Self = this.set("StackStatusReason", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStackStatusReason: Self = this.set("StackStatusReason", js.undefined)
    @scala.inline
    def setTemplateDescription(value: TemplateDescription): Self = this.set("TemplateDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplateDescription: Self = this.set("TemplateDescription", js.undefined)
  }
  
}

