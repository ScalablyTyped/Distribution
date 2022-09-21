package typings.awsSdk.cloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StackSetOperation extends StObject {
  
  /**
    * The type of stack set operation: CREATE, UPDATE, or DELETE. Create and delete operations affect only the specified stack set instances that are associated with the specified stack set. Update operations affect both the stack set itself, in addition to all associated stack set instances.
    */
  var Action: js.UndefOr[StackSetOperationAction] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the IAM role used to perform this stack set operation. Use customized administrator roles to control which users or groups can manage specific stack sets within the same administrator account. For more information, see Define Permissions for Multiple Administrators in the CloudFormation User Guide.
    */
  var AdministrationRoleARN: js.UndefOr[RoleARN_] = js.undefined
  
  /**
    * The time at which the operation was initiated. Note that the creation times for the stack set operation might differ from the creation time of the individual stacks themselves. This is because CloudFormation needs to perform preparatory work for the operation, such as dispatching the work to the requested Regions, before actually creating the first stacks.
    */
  var CreationTimestamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    * [Service-managed permissions] The Organizations accounts affected by the stack operation.
    */
  var DeploymentTargets: js.UndefOr[typings.awsSdk.cloudformationMod.DeploymentTargets] = js.undefined
  
  /**
    * The time at which the stack set operation ended, across all accounts and Regions specified. Note that this doesn't necessarily mean that the stack set operation was successful, or even attempted, in each account or Region.
    */
  var EndTimestamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The name of the IAM execution role used to create or update the stack set. Use customized execution roles to control which stack resources users and groups can include in their stack sets.
    */
  var ExecutionRoleName: js.UndefOr[typings.awsSdk.cloudformationMod.ExecutionRoleName] = js.undefined
  
  /**
    * The unique ID of a stack set operation.
    */
  var OperationId: js.UndefOr[ClientRequestToken] = js.undefined
  
  /**
    * The preferences for how CloudFormation performs this stack set operation.
    */
  var OperationPreferences: js.UndefOr[StackSetOperationPreferences] = js.undefined
  
  /**
    * For stack set operations of action type DELETE, specifies whether to remove the stack instances from the specified stack set, but doesn't delete the stacks. You can't re-associate a retained stack, or add an existing, saved stack to a new stack set.
    */
  var RetainStacks: js.UndefOr[RetainStacksNullable] = js.undefined
  
  /**
    * Detailed information about the drift status of the stack set. This includes information about drift operations currently being performed on the stack set. This information will only be present for stack set operations whose Action type is DETECT_DRIFT. For more information, see Detecting Unmanaged Changes in Stack Sets in the CloudFormation User Guide.
    */
  var StackSetDriftDetectionDetails: js.UndefOr[typings.awsSdk.cloudformationMod.StackSetDriftDetectionDetails] = js.undefined
  
  /**
    * The ID of the stack set.
    */
  var StackSetId: js.UndefOr[typings.awsSdk.cloudformationMod.StackSetId] = js.undefined
  
  /**
    * The status of the operation.    FAILED: The operation exceeded the specified failure tolerance. The failure tolerance value that you've set for an operation is applied for each Region during stack create and update operations. If the number of failed stacks within a Region exceeds the failure tolerance, the status of the operation in the Region is set to FAILED. This in turn sets the status of the operation as a whole to FAILED, and CloudFormation cancels the operation in any remaining Regions.    QUEUED: [Service-managed permissions] For automatic deployments that require a sequence of operations, the operation is queued to be performed. For more information, see the stack set operation status codes in the CloudFormation User Guide.    RUNNING: The operation is currently being performed.    STOPPED: The user has canceled the operation.    STOPPING: The operation is in the process of stopping, at user request.    SUCCEEDED: The operation completed creating or updating all the specified stacks without exceeding the failure tolerance for the operation.  
    */
  var Status: js.UndefOr[StackSetOperationStatus] = js.undefined
  
  /**
    * The status of the operation in details.
    */
  var StatusReason: js.UndefOr[StackSetOperationStatusReason] = js.undefined
}
object StackSetOperation {
  
  inline def apply(): StackSetOperation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StackSetOperation]
  }
  
  extension [Self <: StackSetOperation](x: Self) {
    
    inline def setAction(value: StackSetOperationAction): Self = StObject.set(x, "Action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "Action", js.undefined)
    
    inline def setAdministrationRoleARN(value: RoleARN_): Self = StObject.set(x, "AdministrationRoleARN", value.asInstanceOf[js.Any])
    
    inline def setAdministrationRoleARNUndefined: Self = StObject.set(x, "AdministrationRoleARN", js.undefined)
    
    inline def setCreationTimestamp(value: js.Date): Self = StObject.set(x, "CreationTimestamp", value.asInstanceOf[js.Any])
    
    inline def setCreationTimestampUndefined: Self = StObject.set(x, "CreationTimestamp", js.undefined)
    
    inline def setDeploymentTargets(value: DeploymentTargets): Self = StObject.set(x, "DeploymentTargets", value.asInstanceOf[js.Any])
    
    inline def setDeploymentTargetsUndefined: Self = StObject.set(x, "DeploymentTargets", js.undefined)
    
    inline def setEndTimestamp(value: js.Date): Self = StObject.set(x, "EndTimestamp", value.asInstanceOf[js.Any])
    
    inline def setEndTimestampUndefined: Self = StObject.set(x, "EndTimestamp", js.undefined)
    
    inline def setExecutionRoleName(value: ExecutionRoleName): Self = StObject.set(x, "ExecutionRoleName", value.asInstanceOf[js.Any])
    
    inline def setExecutionRoleNameUndefined: Self = StObject.set(x, "ExecutionRoleName", js.undefined)
    
    inline def setOperationId(value: ClientRequestToken): Self = StObject.set(x, "OperationId", value.asInstanceOf[js.Any])
    
    inline def setOperationIdUndefined: Self = StObject.set(x, "OperationId", js.undefined)
    
    inline def setOperationPreferences(value: StackSetOperationPreferences): Self = StObject.set(x, "OperationPreferences", value.asInstanceOf[js.Any])
    
    inline def setOperationPreferencesUndefined: Self = StObject.set(x, "OperationPreferences", js.undefined)
    
    inline def setRetainStacks(value: RetainStacksNullable): Self = StObject.set(x, "RetainStacks", value.asInstanceOf[js.Any])
    
    inline def setRetainStacksUndefined: Self = StObject.set(x, "RetainStacks", js.undefined)
    
    inline def setStackSetDriftDetectionDetails(value: StackSetDriftDetectionDetails): Self = StObject.set(x, "StackSetDriftDetectionDetails", value.asInstanceOf[js.Any])
    
    inline def setStackSetDriftDetectionDetailsUndefined: Self = StObject.set(x, "StackSetDriftDetectionDetails", js.undefined)
    
    inline def setStackSetId(value: StackSetId): Self = StObject.set(x, "StackSetId", value.asInstanceOf[js.Any])
    
    inline def setStackSetIdUndefined: Self = StObject.set(x, "StackSetId", js.undefined)
    
    inline def setStatus(value: StackSetOperationStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusReason(value: StackSetOperationStatusReason): Self = StObject.set(x, "StatusReason", value.asInstanceOf[js.Any])
    
    inline def setStatusReasonUndefined: Self = StObject.set(x, "StatusReason", js.undefined)
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
