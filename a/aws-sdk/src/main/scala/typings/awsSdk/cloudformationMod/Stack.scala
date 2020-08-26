package typings.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Stack extends js.Object {
  /**
    * The capabilities allowed in the stack.
    */
  var Capabilities: js.UndefOr[typings.awsSdk.cloudformationMod.Capabilities] = js.native
  /**
    * The unique ID of the change set.
    */
  var ChangeSetId: js.UndefOr[typings.awsSdk.cloudformationMod.ChangeSetId] = js.native
  /**
    * The time at which the stack was created.
    */
  var CreationTime: typings.awsSdk.cloudformationMod.CreationTime = js.native
  /**
    * The time the stack was deleted.
    */
  var DeletionTime: js.UndefOr[typings.awsSdk.cloudformationMod.DeletionTime] = js.native
  /**
    * A user-defined description associated with the stack.
    */
  var Description: js.UndefOr[typings.awsSdk.cloudformationMod.Description] = js.native
  /**
    * Boolean to enable or disable rollback on stack creation failures:    true: disable rollback    false: enable rollback  
    */
  var DisableRollback: js.UndefOr[typings.awsSdk.cloudformationMod.DisableRollback] = js.native
  /**
    * Information on whether a stack's actual configuration differs, or has drifted, from it's expected configuration, as defined in the stack template and any values specified as template parameters. For more information, see Detecting Unregulated Configuration Changes to Stacks and Resources.
    */
  var DriftInformation: js.UndefOr[StackDriftInformation] = js.native
  /**
    * Whether termination protection is enabled for the stack.  For nested stacks, termination protection is set on the root stack and cannot be changed directly on the nested stack. For more information, see Protecting a Stack From Being Deleted in the AWS CloudFormation User Guide.
    */
  var EnableTerminationProtection: js.UndefOr[typings.awsSdk.cloudformationMod.EnableTerminationProtection] = js.native
  /**
    * The time the stack was last updated. This field will only be returned if the stack has been updated at least once.
    */
  var LastUpdatedTime: js.UndefOr[typings.awsSdk.cloudformationMod.LastUpdatedTime] = js.native
  /**
    * SNS topic ARNs to which stack related events are published.
    */
  var NotificationARNs: js.UndefOr[typings.awsSdk.cloudformationMod.NotificationARNs] = js.native
  /**
    * A list of output structures.
    */
  var Outputs: js.UndefOr[typings.awsSdk.cloudformationMod.Outputs] = js.native
  /**
    * A list of Parameter structures.
    */
  var Parameters: js.UndefOr[typings.awsSdk.cloudformationMod.Parameters] = js.native
  /**
    * For nested stacks--stacks created as resources for another stack--the stack ID of the direct parent of this stack. For the first level of nested stacks, the root stack is also the parent stack. For more information, see Working with Nested Stacks in the AWS CloudFormation User Guide.
    */
  var ParentId: js.UndefOr[StackId] = js.native
  /**
    * The Amazon Resource Name (ARN) of an AWS Identity and Access Management (IAM) role that is associated with the stack. During a stack operation, AWS CloudFormation uses this role's credentials to make calls on your behalf.
    */
  var RoleARN: js.UndefOr[RoleARN_] = js.native
  /**
    * The rollback triggers for AWS CloudFormation to monitor during stack creation and updating operations, and for the specified monitoring period afterwards.
    */
  var RollbackConfiguration: js.UndefOr[typings.awsSdk.cloudformationMod.RollbackConfiguration] = js.native
  /**
    * For nested stacks--stacks created as resources for another stack--the stack ID of the top-level stack to which the nested stack ultimately belongs. For more information, see Working with Nested Stacks in the AWS CloudFormation User Guide.
    */
  var RootId: js.UndefOr[StackId] = js.native
  /**
    * Unique identifier of the stack.
    */
  var StackId: js.UndefOr[typings.awsSdk.cloudformationMod.StackId] = js.native
  /**
    * The name associated with the stack.
    */
  var StackName: typings.awsSdk.cloudformationMod.StackName = js.native
  /**
    * Current status of the stack.
    */
  var StackStatus: typings.awsSdk.cloudformationMod.StackStatus = js.native
  /**
    * Success/failure message associated with the stack status.
    */
  var StackStatusReason: js.UndefOr[typings.awsSdk.cloudformationMod.StackStatusReason] = js.native
  /**
    * A list of Tags that specify information about the stack.
    */
  var Tags: js.UndefOr[typings.awsSdk.cloudformationMod.Tags] = js.native
  /**
    * The amount of time within which stack creation should complete.
    */
  var TimeoutInMinutes: js.UndefOr[TimeoutMinutes] = js.native
}

object Stack {
  @scala.inline
  def apply(CreationTime: CreationTime, StackName: StackName, StackStatus: StackStatus): Stack = {
    val __obj = js.Dynamic.literal(CreationTime = CreationTime.asInstanceOf[js.Any], StackName = StackName.asInstanceOf[js.Any], StackStatus = StackStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[Stack]
  }
  @scala.inline
  implicit class StackOps[Self <: Stack] (val x: Self) extends AnyVal {
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
    def setCapabilitiesVarargs(value: Capability*): Self = this.set("Capabilities", js.Array(value :_*))
    @scala.inline
    def setCapabilities(value: Capabilities): Self = this.set("Capabilities", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCapabilities: Self = this.set("Capabilities", js.undefined)
    @scala.inline
    def setChangeSetId(value: ChangeSetId): Self = this.set("ChangeSetId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChangeSetId: Self = this.set("ChangeSetId", js.undefined)
    @scala.inline
    def setDeletionTime(value: DeletionTime): Self = this.set("DeletionTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeletionTime: Self = this.set("DeletionTime", js.undefined)
    @scala.inline
    def setDescription(value: Description): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    @scala.inline
    def setDisableRollback(value: DisableRollback): Self = this.set("DisableRollback", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableRollback: Self = this.set("DisableRollback", js.undefined)
    @scala.inline
    def setDriftInformation(value: StackDriftInformation): Self = this.set("DriftInformation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDriftInformation: Self = this.set("DriftInformation", js.undefined)
    @scala.inline
    def setEnableTerminationProtection(value: EnableTerminationProtection): Self = this.set("EnableTerminationProtection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableTerminationProtection: Self = this.set("EnableTerminationProtection", js.undefined)
    @scala.inline
    def setLastUpdatedTime(value: LastUpdatedTime): Self = this.set("LastUpdatedTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastUpdatedTime: Self = this.set("LastUpdatedTime", js.undefined)
    @scala.inline
    def setNotificationARNsVarargs(value: NotificationARN*): Self = this.set("NotificationARNs", js.Array(value :_*))
    @scala.inline
    def setNotificationARNs(value: NotificationARNs): Self = this.set("NotificationARNs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotificationARNs: Self = this.set("NotificationARNs", js.undefined)
    @scala.inline
    def setOutputsVarargs(value: Output*): Self = this.set("Outputs", js.Array(value :_*))
    @scala.inline
    def setOutputs(value: Outputs): Self = this.set("Outputs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutputs: Self = this.set("Outputs", js.undefined)
    @scala.inline
    def setParametersVarargs(value: Parameter*): Self = this.set("Parameters", js.Array(value :_*))
    @scala.inline
    def setParameters(value: Parameters): Self = this.set("Parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParameters: Self = this.set("Parameters", js.undefined)
    @scala.inline
    def setParentId(value: StackId): Self = this.set("ParentId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParentId: Self = this.set("ParentId", js.undefined)
    @scala.inline
    def setRoleARN(value: RoleARN_): Self = this.set("RoleARN", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoleARN: Self = this.set("RoleARN", js.undefined)
    @scala.inline
    def setRollbackConfiguration(value: RollbackConfiguration): Self = this.set("RollbackConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRollbackConfiguration: Self = this.set("RollbackConfiguration", js.undefined)
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
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: Tags): Self = this.set("Tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
    @scala.inline
    def setTimeoutInMinutes(value: TimeoutMinutes): Self = this.set("TimeoutInMinutes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeoutInMinutes: Self = this.set("TimeoutInMinutes", js.undefined)
  }
  
}

