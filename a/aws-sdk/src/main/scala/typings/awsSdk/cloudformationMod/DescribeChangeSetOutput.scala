package typings.awsSdk.cloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeChangeSetOutput extends StObject {
  
  /**
    * If you execute the change set, the list of capabilities that were explicitly acknowledged when the change set was created.
    */
  var Capabilities: js.UndefOr[typings.awsSdk.cloudformationMod.Capabilities] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the change set.
    */
  var ChangeSetId: js.UndefOr[typings.awsSdk.cloudformationMod.ChangeSetId] = js.undefined
  
  /**
    * The name of the change set.
    */
  var ChangeSetName: js.UndefOr[typings.awsSdk.cloudformationMod.ChangeSetName] = js.undefined
  
  /**
    * A list of Change structures that describes the resources CloudFormation changes if you execute the change set.
    */
  var Changes: js.UndefOr[typings.awsSdk.cloudformationMod.Changes] = js.undefined
  
  /**
    * The start time when the change set was created, in UTC.
    */
  var CreationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Information about the change set.
    */
  var Description: js.UndefOr[typings.awsSdk.cloudformationMod.Description] = js.undefined
  
  /**
    * If the change set execution status is AVAILABLE, you can execute the change set. If you can't execute the change set, the status indicates why. For example, a change set might be in an UNAVAILABLE state because CloudFormation is still creating it or in an OBSOLETE state because the stack was already updated.
    */
  var ExecutionStatus: js.UndefOr[typings.awsSdk.cloudformationMod.ExecutionStatus] = js.undefined
  
  /**
    * Verifies if IncludeNestedStacks is set to True.
    */
  var IncludeNestedStacks: js.UndefOr[typings.awsSdk.cloudformationMod.IncludeNestedStacks] = js.undefined
  
  /**
    * If the output exceeds 1 MB, a string that identifies the next page of changes. If there is no additional page, this value is null.
    */
  var NextToken: js.UndefOr[typings.awsSdk.cloudformationMod.NextToken] = js.undefined
  
  /**
    * The ARNs of the Amazon Simple Notification Service (Amazon SNS) topics that will be associated with the stack if you execute the change set.
    */
  var NotificationARNs: js.UndefOr[typings.awsSdk.cloudformationMod.NotificationARNs] = js.undefined
  
  /**
    * A list of Parameter structures that describes the input parameters and their values used to create the change set. For more information, see the Parameter data type.
    */
  var Parameters: js.UndefOr[typings.awsSdk.cloudformationMod.Parameters] = js.undefined
  
  /**
    * Specifies the change set ID of the parent change set in the current nested change set hierarchy.
    */
  var ParentChangeSetId: js.UndefOr[ChangeSetId] = js.undefined
  
  /**
    * The rollback triggers for CloudFormation to monitor during stack creation and updating operations, and for the specified monitoring period afterwards.
    */
  var RollbackConfiguration: js.UndefOr[typings.awsSdk.cloudformationMod.RollbackConfiguration] = js.undefined
  
  /**
    * Specifies the change set ID of the root change set in the current nested change set hierarchy.
    */
  var RootChangeSetId: js.UndefOr[ChangeSetId] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the stack that's associated with the change set.
    */
  var StackId: js.UndefOr[typings.awsSdk.cloudformationMod.StackId] = js.undefined
  
  /**
    * The name of the stack that's associated with the change set.
    */
  var StackName: js.UndefOr[typings.awsSdk.cloudformationMod.StackName] = js.undefined
  
  /**
    * The current status of the change set, such as CREATE_IN_PROGRESS, CREATE_COMPLETE, or FAILED.
    */
  var Status: js.UndefOr[ChangeSetStatus] = js.undefined
  
  /**
    * A description of the change set's status. For example, if your attempt to create a change set failed, CloudFormation shows the error message.
    */
  var StatusReason: js.UndefOr[ChangeSetStatusReason] = js.undefined
  
  /**
    * If you execute the change set, the tags that will be associated with the stack.
    */
  var Tags: js.UndefOr[typings.awsSdk.cloudformationMod.Tags] = js.undefined
}
object DescribeChangeSetOutput {
  
  inline def apply(): DescribeChangeSetOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeChangeSetOutput]
  }
  
  extension [Self <: DescribeChangeSetOutput](x: Self) {
    
    inline def setCapabilities(value: Capabilities): Self = StObject.set(x, "Capabilities", value.asInstanceOf[js.Any])
    
    inline def setCapabilitiesUndefined: Self = StObject.set(x, "Capabilities", js.undefined)
    
    inline def setCapabilitiesVarargs(value: Capability*): Self = StObject.set(x, "Capabilities", js.Array(value*))
    
    inline def setChangeSetId(value: ChangeSetId): Self = StObject.set(x, "ChangeSetId", value.asInstanceOf[js.Any])
    
    inline def setChangeSetIdUndefined: Self = StObject.set(x, "ChangeSetId", js.undefined)
    
    inline def setChangeSetName(value: ChangeSetName): Self = StObject.set(x, "ChangeSetName", value.asInstanceOf[js.Any])
    
    inline def setChangeSetNameUndefined: Self = StObject.set(x, "ChangeSetName", js.undefined)
    
    inline def setChanges(value: Changes): Self = StObject.set(x, "Changes", value.asInstanceOf[js.Any])
    
    inline def setChangesUndefined: Self = StObject.set(x, "Changes", js.undefined)
    
    inline def setChangesVarargs(value: Change*): Self = StObject.set(x, "Changes", js.Array(value*))
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setExecutionStatus(value: ExecutionStatus): Self = StObject.set(x, "ExecutionStatus", value.asInstanceOf[js.Any])
    
    inline def setExecutionStatusUndefined: Self = StObject.set(x, "ExecutionStatus", js.undefined)
    
    inline def setIncludeNestedStacks(value: IncludeNestedStacks): Self = StObject.set(x, "IncludeNestedStacks", value.asInstanceOf[js.Any])
    
    inline def setIncludeNestedStacksUndefined: Self = StObject.set(x, "IncludeNestedStacks", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setNotificationARNs(value: NotificationARNs): Self = StObject.set(x, "NotificationARNs", value.asInstanceOf[js.Any])
    
    inline def setNotificationARNsUndefined: Self = StObject.set(x, "NotificationARNs", js.undefined)
    
    inline def setNotificationARNsVarargs(value: NotificationARN*): Self = StObject.set(x, "NotificationARNs", js.Array(value*))
    
    inline def setParameters(value: Parameters): Self = StObject.set(x, "Parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "Parameters", js.undefined)
    
    inline def setParametersVarargs(value: Parameter*): Self = StObject.set(x, "Parameters", js.Array(value*))
    
    inline def setParentChangeSetId(value: ChangeSetId): Self = StObject.set(x, "ParentChangeSetId", value.asInstanceOf[js.Any])
    
    inline def setParentChangeSetIdUndefined: Self = StObject.set(x, "ParentChangeSetId", js.undefined)
    
    inline def setRollbackConfiguration(value: RollbackConfiguration): Self = StObject.set(x, "RollbackConfiguration", value.asInstanceOf[js.Any])
    
    inline def setRollbackConfigurationUndefined: Self = StObject.set(x, "RollbackConfiguration", js.undefined)
    
    inline def setRootChangeSetId(value: ChangeSetId): Self = StObject.set(x, "RootChangeSetId", value.asInstanceOf[js.Any])
    
    inline def setRootChangeSetIdUndefined: Self = StObject.set(x, "RootChangeSetId", js.undefined)
    
    inline def setStackId(value: StackId): Self = StObject.set(x, "StackId", value.asInstanceOf[js.Any])
    
    inline def setStackIdUndefined: Self = StObject.set(x, "StackId", js.undefined)
    
    inline def setStackName(value: StackName): Self = StObject.set(x, "StackName", value.asInstanceOf[js.Any])
    
    inline def setStackNameUndefined: Self = StObject.set(x, "StackName", js.undefined)
    
    inline def setStatus(value: ChangeSetStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusReason(value: ChangeSetStatusReason): Self = StObject.set(x, "StatusReason", value.asInstanceOf[js.Any])
    
    inline def setStatusReasonUndefined: Self = StObject.set(x, "StatusReason", js.undefined)
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
