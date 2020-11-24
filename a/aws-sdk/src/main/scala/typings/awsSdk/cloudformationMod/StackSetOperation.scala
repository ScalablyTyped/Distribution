package typings.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StackSetOperation extends js.Object {
  
  /**
    * The type of stack set operation: CREATE, UPDATE, or DELETE. Create and delete operations affect only the specified stack set instances that are associated with the specified stack set. Update operations affect both the stack set itself, as well as all associated stack set instances.
    */
  var Action: js.UndefOr[StackSetOperationAction] = js.native
  
  /**
    * The Amazon Resource Number (ARN) of the IAM role used to perform this stack set operation.  Use customized administrator roles to control which users or groups can manage specific stack sets within the same administrator account. For more information, see Define Permissions for Multiple Administrators in the AWS CloudFormation User Guide.
    */
  var AdministrationRoleARN: js.UndefOr[RoleARN_] = js.native
  
  /**
    * The time at which the operation was initiated. Note that the creation times for the stack set operation might differ from the creation time of the individual stacks themselves. This is because AWS CloudFormation needs to perform preparatory work for the operation, such as dispatching the work to the requested Regions, before actually creating the first stacks.
    */
  var CreationTimestamp: js.UndefOr[Timestamp] = js.native
  
  /**
    * [Service-managed permissions] The AWS Organizations accounts affected by the stack operation.
    */
  var DeploymentTargets: js.UndefOr[typings.awsSdk.cloudformationMod.DeploymentTargets] = js.native
  
  /**
    * The time at which the stack set operation ended, across all accounts and Regions specified. Note that this doesn't necessarily mean that the stack set operation was successful, or even attempted, in each account or Region.
    */
  var EndTimestamp: js.UndefOr[Timestamp] = js.native
  
  /**
    * The name of the IAM execution role used to create or update the stack set. Use customized execution roles to control which stack resources users and groups can include in their stack sets. 
    */
  var ExecutionRoleName: js.UndefOr[typings.awsSdk.cloudformationMod.ExecutionRoleName] = js.native
  
  /**
    * The unique ID of a stack set operation.
    */
  var OperationId: js.UndefOr[ClientRequestToken] = js.native
  
  /**
    * The preferences for how AWS CloudFormation performs this stack set operation.
    */
  var OperationPreferences: js.UndefOr[StackSetOperationPreferences] = js.native
  
  /**
    * For stack set operations of action type DELETE, specifies whether to remove the stack instances from the specified stack set, but doesn't delete the stacks. You can't reassociate a retained stack, or add an existing, saved stack to a new stack set.
    */
  var RetainStacks: js.UndefOr[RetainStacksNullable] = js.native
  
  /**
    * Detailed information about the drift status of the stack set. This includes information about drift operations currently being performed on the stack set. this information will only be present for stack set operations whose Action type is DETECT_DRIFT. For more information, see Detecting Unmanaged Changes in Stack Sets in the AWS CloudFormation User Guide.
    */
  var StackSetDriftDetectionDetails: js.UndefOr[typings.awsSdk.cloudformationMod.StackSetDriftDetectionDetails] = js.native
  
  /**
    * The ID of the stack set.
    */
  var StackSetId: js.UndefOr[typings.awsSdk.cloudformationMod.StackSetId] = js.native
  
  /**
    * The status of the operation.     FAILED: The operation exceeded the specified failure tolerance. The failure tolerance value that you've set for an operation is applied for each Region during stack create and update operations. If the number of failed stacks within a Region exceeds the failure tolerance, the status of the operation in the Region is set to FAILED. This in turn sets the status of the operation as a whole to FAILED, and AWS CloudFormation cancels the operation in any remaining Regions.    QUEUED: [Service-managed permissions] For automatic deployments that require a sequence of operations, the operation is queued to be performed. For more information, see the stack set operation status codes in the AWS CloudFormation User Guide.    RUNNING: The operation is currently being performed.    STOPPED: The user has cancelled the operation.    STOPPING: The operation is in the process of stopping, at user request.     SUCCEEDED: The operation completed creating or updating all the specified stacks without exceeding the failure tolerance for the operation.  
    */
  var Status: js.UndefOr[StackSetOperationStatus] = js.native
}
object StackSetOperation {
  
  @scala.inline
  def apply(): StackSetOperation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StackSetOperation]
  }
  
  @scala.inline
  implicit class StackSetOperationOps[Self <: StackSetOperation] (val x: Self) extends AnyVal {
    
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
    def setAction(value: StackSetOperationAction): Self = this.set("Action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAction: Self = this.set("Action", js.undefined)
    
    @scala.inline
    def setAdministrationRoleARN(value: RoleARN_): Self = this.set("AdministrationRoleARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdministrationRoleARN: Self = this.set("AdministrationRoleARN", js.undefined)
    
    @scala.inline
    def setCreationTimestamp(value: Timestamp): Self = this.set("CreationTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationTimestamp: Self = this.set("CreationTimestamp", js.undefined)
    
    @scala.inline
    def setDeploymentTargets(value: DeploymentTargets): Self = this.set("DeploymentTargets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeploymentTargets: Self = this.set("DeploymentTargets", js.undefined)
    
    @scala.inline
    def setEndTimestamp(value: Timestamp): Self = this.set("EndTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndTimestamp: Self = this.set("EndTimestamp", js.undefined)
    
    @scala.inline
    def setExecutionRoleName(value: ExecutionRoleName): Self = this.set("ExecutionRoleName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExecutionRoleName: Self = this.set("ExecutionRoleName", js.undefined)
    
    @scala.inline
    def setOperationId(value: ClientRequestToken): Self = this.set("OperationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOperationId: Self = this.set("OperationId", js.undefined)
    
    @scala.inline
    def setOperationPreferences(value: StackSetOperationPreferences): Self = this.set("OperationPreferences", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOperationPreferences: Self = this.set("OperationPreferences", js.undefined)
    
    @scala.inline
    def setRetainStacks(value: RetainStacksNullable): Self = this.set("RetainStacks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRetainStacks: Self = this.set("RetainStacks", js.undefined)
    
    @scala.inline
    def setStackSetDriftDetectionDetails(value: StackSetDriftDetectionDetails): Self = this.set("StackSetDriftDetectionDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStackSetDriftDetectionDetails: Self = this.set("StackSetDriftDetectionDetails", js.undefined)
    
    @scala.inline
    def setStackSetId(value: StackSetId): Self = this.set("StackSetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStackSetId: Self = this.set("StackSetId", js.undefined)
    
    @scala.inline
    def setStatus(value: StackSetOperationStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
  }
}
