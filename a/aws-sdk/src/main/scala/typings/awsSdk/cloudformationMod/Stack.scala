package typings.awsSdk.cloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Stack extends StObject {
  
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
  implicit class StackMutableBuilder[Self <: Stack] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCapabilities(value: Capabilities): Self = StObject.set(x, "Capabilities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCapabilitiesUndefined: Self = StObject.set(x, "Capabilities", js.undefined)
    
    @scala.inline
    def setCapabilitiesVarargs(value: Capability*): Self = StObject.set(x, "Capabilities", js.Array(value :_*))
    
    @scala.inline
    def setChangeSetId(value: ChangeSetId): Self = StObject.set(x, "ChangeSetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangeSetIdUndefined: Self = StObject.set(x, "ChangeSetId", js.undefined)
    
    @scala.inline
    def setCreationTime(value: CreationTime): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeletionTime(value: DeletionTime): Self = StObject.set(x, "DeletionTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeletionTimeUndefined: Self = StObject.set(x, "DeletionTime", js.undefined)
    
    @scala.inline
    def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setDisableRollback(value: DisableRollback): Self = StObject.set(x, "DisableRollback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableRollbackUndefined: Self = StObject.set(x, "DisableRollback", js.undefined)
    
    @scala.inline
    def setDriftInformation(value: StackDriftInformation): Self = StObject.set(x, "DriftInformation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDriftInformationUndefined: Self = StObject.set(x, "DriftInformation", js.undefined)
    
    @scala.inline
    def setEnableTerminationProtection(value: EnableTerminationProtection): Self = StObject.set(x, "EnableTerminationProtection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableTerminationProtectionUndefined: Self = StObject.set(x, "EnableTerminationProtection", js.undefined)
    
    @scala.inline
    def setLastUpdatedTime(value: LastUpdatedTime): Self = StObject.set(x, "LastUpdatedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdatedTimeUndefined: Self = StObject.set(x, "LastUpdatedTime", js.undefined)
    
    @scala.inline
    def setNotificationARNs(value: NotificationARNs): Self = StObject.set(x, "NotificationARNs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotificationARNsUndefined: Self = StObject.set(x, "NotificationARNs", js.undefined)
    
    @scala.inline
    def setNotificationARNsVarargs(value: NotificationARN*): Self = StObject.set(x, "NotificationARNs", js.Array(value :_*))
    
    @scala.inline
    def setOutputs(value: Outputs): Self = StObject.set(x, "Outputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputsUndefined: Self = StObject.set(x, "Outputs", js.undefined)
    
    @scala.inline
    def setOutputsVarargs(value: Output*): Self = StObject.set(x, "Outputs", js.Array(value :_*))
    
    @scala.inline
    def setParameters(value: Parameters): Self = StObject.set(x, "Parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParametersUndefined: Self = StObject.set(x, "Parameters", js.undefined)
    
    @scala.inline
    def setParametersVarargs(value: Parameter*): Self = StObject.set(x, "Parameters", js.Array(value :_*))
    
    @scala.inline
    def setParentId(value: StackId): Self = StObject.set(x, "ParentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentIdUndefined: Self = StObject.set(x, "ParentId", js.undefined)
    
    @scala.inline
    def setRoleARN(value: RoleARN_): Self = StObject.set(x, "RoleARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleARNUndefined: Self = StObject.set(x, "RoleARN", js.undefined)
    
    @scala.inline
    def setRollbackConfiguration(value: RollbackConfiguration): Self = StObject.set(x, "RollbackConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRollbackConfigurationUndefined: Self = StObject.set(x, "RollbackConfiguration", js.undefined)
    
    @scala.inline
    def setRootId(value: StackId): Self = StObject.set(x, "RootId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootIdUndefined: Self = StObject.set(x, "RootId", js.undefined)
    
    @scala.inline
    def setStackId(value: StackId): Self = StObject.set(x, "StackId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackIdUndefined: Self = StObject.set(x, "StackId", js.undefined)
    
    @scala.inline
    def setStackName(value: StackName): Self = StObject.set(x, "StackName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackStatus(value: StackStatus): Self = StObject.set(x, "StackStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackStatusReason(value: StackStatusReason): Self = StObject.set(x, "StackStatusReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackStatusReasonUndefined: Self = StObject.set(x, "StackStatusReason", js.undefined)
    
    @scala.inline
    def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
    
    @scala.inline
    def setTimeoutInMinutes(value: TimeoutMinutes): Self = StObject.set(x, "TimeoutInMinutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutInMinutesUndefined: Self = StObject.set(x, "TimeoutInMinutes", js.undefined)
  }
}
