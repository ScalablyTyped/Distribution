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
  def apply(
    CreationTime: CreationTime,
    StackName: StackName,
    StackStatus: StackStatus,
    DeletionTime: DeletionTime = null,
    DriftInformation: StackDriftInformationSummary = null,
    LastUpdatedTime: LastUpdatedTime = null,
    ParentId: StackId = null,
    RootId: StackId = null,
    StackId: StackId = null,
    StackStatusReason: StackStatusReason = null,
    TemplateDescription: TemplateDescription = null
  ): StackSummary = {
    val __obj = js.Dynamic.literal(CreationTime = CreationTime.asInstanceOf[js.Any], StackName = StackName.asInstanceOf[js.Any], StackStatus = StackStatus.asInstanceOf[js.Any])
    if (DeletionTime != null) __obj.updateDynamic("DeletionTime")(DeletionTime.asInstanceOf[js.Any])
    if (DriftInformation != null) __obj.updateDynamic("DriftInformation")(DriftInformation.asInstanceOf[js.Any])
    if (LastUpdatedTime != null) __obj.updateDynamic("LastUpdatedTime")(LastUpdatedTime.asInstanceOf[js.Any])
    if (ParentId != null) __obj.updateDynamic("ParentId")(ParentId.asInstanceOf[js.Any])
    if (RootId != null) __obj.updateDynamic("RootId")(RootId.asInstanceOf[js.Any])
    if (StackId != null) __obj.updateDynamic("StackId")(StackId.asInstanceOf[js.Any])
    if (StackStatusReason != null) __obj.updateDynamic("StackStatusReason")(StackStatusReason.asInstanceOf[js.Any])
    if (TemplateDescription != null) __obj.updateDynamic("TemplateDescription")(TemplateDescription.asInstanceOf[js.Any])
    __obj.asInstanceOf[StackSummary]
  }
}

