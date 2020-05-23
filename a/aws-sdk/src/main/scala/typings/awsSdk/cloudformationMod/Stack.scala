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
  def apply(
    CreationTime: CreationTime,
    StackName: StackName,
    StackStatus: StackStatus,
    Capabilities: Capabilities = null,
    ChangeSetId: ChangeSetId = null,
    DeletionTime: DeletionTime = null,
    Description: Description = null,
    DisableRollback: js.UndefOr[DisableRollback] = js.undefined,
    DriftInformation: StackDriftInformation = null,
    EnableTerminationProtection: js.UndefOr[EnableTerminationProtection] = js.undefined,
    LastUpdatedTime: LastUpdatedTime = null,
    NotificationARNs: NotificationARNs = null,
    Outputs: Outputs = null,
    Parameters: Parameters = null,
    ParentId: StackId = null,
    RoleARN: RoleARN_ = null,
    RollbackConfiguration: RollbackConfiguration = null,
    RootId: StackId = null,
    StackId: StackId = null,
    StackStatusReason: StackStatusReason = null,
    Tags: Tags = null,
    TimeoutInMinutes: js.UndefOr[TimeoutMinutes] = js.undefined
  ): Stack = {
    val __obj = js.Dynamic.literal(CreationTime = CreationTime.asInstanceOf[js.Any], StackName = StackName.asInstanceOf[js.Any], StackStatus = StackStatus.asInstanceOf[js.Any])
    if (Capabilities != null) __obj.updateDynamic("Capabilities")(Capabilities.asInstanceOf[js.Any])
    if (ChangeSetId != null) __obj.updateDynamic("ChangeSetId")(ChangeSetId.asInstanceOf[js.Any])
    if (DeletionTime != null) __obj.updateDynamic("DeletionTime")(DeletionTime.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (!js.isUndefined(DisableRollback)) __obj.updateDynamic("DisableRollback")(DisableRollback.get.asInstanceOf[js.Any])
    if (DriftInformation != null) __obj.updateDynamic("DriftInformation")(DriftInformation.asInstanceOf[js.Any])
    if (!js.isUndefined(EnableTerminationProtection)) __obj.updateDynamic("EnableTerminationProtection")(EnableTerminationProtection.get.asInstanceOf[js.Any])
    if (LastUpdatedTime != null) __obj.updateDynamic("LastUpdatedTime")(LastUpdatedTime.asInstanceOf[js.Any])
    if (NotificationARNs != null) __obj.updateDynamic("NotificationARNs")(NotificationARNs.asInstanceOf[js.Any])
    if (Outputs != null) __obj.updateDynamic("Outputs")(Outputs.asInstanceOf[js.Any])
    if (Parameters != null) __obj.updateDynamic("Parameters")(Parameters.asInstanceOf[js.Any])
    if (ParentId != null) __obj.updateDynamic("ParentId")(ParentId.asInstanceOf[js.Any])
    if (RoleARN != null) __obj.updateDynamic("RoleARN")(RoleARN.asInstanceOf[js.Any])
    if (RollbackConfiguration != null) __obj.updateDynamic("RollbackConfiguration")(RollbackConfiguration.asInstanceOf[js.Any])
    if (RootId != null) __obj.updateDynamic("RootId")(RootId.asInstanceOf[js.Any])
    if (StackId != null) __obj.updateDynamic("StackId")(StackId.asInstanceOf[js.Any])
    if (StackStatusReason != null) __obj.updateDynamic("StackStatusReason")(StackStatusReason.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    if (!js.isUndefined(TimeoutInMinutes)) __obj.updateDynamic("TimeoutInMinutes")(TimeoutInMinutes.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Stack]
  }
}

