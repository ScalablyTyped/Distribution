package typings.awsSdk.cloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContinueUpdateRollbackInput extends StObject {
  
  /**
    * A unique identifier for this ContinueUpdateRollback request. Specify this token if you plan to retry requests so that AWS CloudFormation knows that you're not attempting to continue the rollback to a stack with the same name. You might retry ContinueUpdateRollback requests to ensure that AWS CloudFormation successfully received them.
    */
  var ClientRequestToken: js.UndefOr[typings.awsSdk.cloudformationMod.ClientRequestToken] = js.undefined
  
  /**
    * A list of the logical IDs of the resources that AWS CloudFormation skips during the continue update rollback operation. You can specify only resources that are in the UPDATE_FAILED state because a rollback failed. You can't specify resources that are in the UPDATE_FAILED state for other reasons, for example, because an update was cancelled. To check why a resource update failed, use the DescribeStackResources action, and view the resource status reason.   Specify this property to skip rolling back resources that AWS CloudFormation can't successfully roll back. We recommend that you  troubleshoot resources before skipping them. AWS CloudFormation sets the status of the specified resources to UPDATE_COMPLETE and continues to roll back the stack. After the rollback is complete, the state of the skipped resources will be inconsistent with the state of the resources in the stack template. Before performing another stack update, you must update the stack or resources to be consistent with each other. If you don't, subsequent stack updates might fail, and the stack will become unrecoverable.   Specify the minimum number of resources required to successfully roll back your stack. For example, a failed resource update might cause dependent resources to fail. In this case, it might not be necessary to skip the dependent resources.  To skip resources that are part of nested stacks, use the following format: NestedStackName.ResourceLogicalID. If you want to specify the logical ID of a stack resource (Type: AWS::CloudFormation::Stack) in the ResourcesToSkip list, then its corresponding embedded stack must be in one of the following states: DELETE_IN_PROGRESS, DELETE_COMPLETE, or DELETE_FAILED.   Don't confuse a child stack's name with its corresponding logical ID defined in the parent stack. For an example of a continue update rollback operation with nested stacks, see Using ResourcesToSkip to recover a nested stacks hierarchy.  
    */
  var ResourcesToSkip: js.UndefOr[typings.awsSdk.cloudformationMod.ResourcesToSkip] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of an AWS Identity and Access Management (IAM) role that AWS CloudFormation assumes to roll back the stack. AWS CloudFormation uses the role's credentials to make calls on your behalf. AWS CloudFormation always uses this role for all future operations on the stack. As long as users have permission to operate on the stack, AWS CloudFormation uses this role even if the users don't have permission to pass it. Ensure that the role grants least privilege. If you don't specify a value, AWS CloudFormation uses the role that was previously associated with the stack. If no role is available, AWS CloudFormation uses a temporary session that is generated from your user credentials.
    */
  var RoleARN: js.UndefOr[RoleARN_] = js.undefined
  
  /**
    * The name or the unique ID of the stack that you want to continue rolling back.  Don't specify the name of a nested stack (a stack that was created by using the AWS::CloudFormation::Stack resource). Instead, use this operation on the parent stack (the stack that contains the AWS::CloudFormation::Stack resource). 
    */
  var StackName: StackNameOrId
}
object ContinueUpdateRollbackInput {
  
  inline def apply(StackName: StackNameOrId): ContinueUpdateRollbackInput = {
    val __obj = js.Dynamic.literal(StackName = StackName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContinueUpdateRollbackInput]
  }
  
  extension [Self <: ContinueUpdateRollbackInput](x: Self) {
    
    inline def setClientRequestToken(value: ClientRequestToken): Self = StObject.set(x, "ClientRequestToken", value.asInstanceOf[js.Any])
    
    inline def setClientRequestTokenUndefined: Self = StObject.set(x, "ClientRequestToken", js.undefined)
    
    inline def setResourcesToSkip(value: ResourcesToSkip): Self = StObject.set(x, "ResourcesToSkip", value.asInstanceOf[js.Any])
    
    inline def setResourcesToSkipUndefined: Self = StObject.set(x, "ResourcesToSkip", js.undefined)
    
    inline def setResourcesToSkipVarargs(value: ResourceToSkip*): Self = StObject.set(x, "ResourcesToSkip", js.Array(value :_*))
    
    inline def setRoleARN(value: RoleARN_): Self = StObject.set(x, "RoleARN", value.asInstanceOf[js.Any])
    
    inline def setRoleARNUndefined: Self = StObject.set(x, "RoleARN", js.undefined)
    
    inline def setStackName(value: StackNameOrId): Self = StObject.set(x, "StackName", value.asInstanceOf[js.Any])
  }
}
