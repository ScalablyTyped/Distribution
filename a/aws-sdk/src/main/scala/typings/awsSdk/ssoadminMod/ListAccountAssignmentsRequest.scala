package typings.awsSdk.ssoadminMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAccountAssignmentsRequest extends StObject {
  
  /**
    * The identifier of the AWS account from which to list the assignments.
    */
  var AccountId: TargetId
  
  /**
    * The ARN of the SSO instance under which the operation will be executed. For more information about ARNs, see Amazon Resource Names (ARNs) and AWS Service Namespaces in the AWS General Reference.
    */
  var InstanceArn: typings.awsSdk.ssoadminMod.InstanceArn
  
  /**
    * The maximum number of results to display for the assignment.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.ssoadminMod.MaxResults] = js.undefined
  
  /**
    * The pagination token for the list API. Initially the value is null. Use the output of previous API calls to make subsequent calls.
    */
  var NextToken: js.UndefOr[Token] = js.undefined
  
  /**
    * The ARN of the permission set from which to list assignments.
    */
  var PermissionSetArn: typings.awsSdk.ssoadminMod.PermissionSetArn
}
object ListAccountAssignmentsRequest {
  
  @scala.inline
  def apply(AccountId: TargetId, InstanceArn: InstanceArn, PermissionSetArn: PermissionSetArn): ListAccountAssignmentsRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], InstanceArn = InstanceArn.asInstanceOf[js.Any], PermissionSetArn = PermissionSetArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAccountAssignmentsRequest]
  }
  
  @scala.inline
  implicit class ListAccountAssignmentsRequestMutableBuilder[Self <: ListAccountAssignmentsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: TargetId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceArn(value: InstanceArn): Self = StObject.set(x, "InstanceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setPermissionSetArn(value: PermissionSetArn): Self = StObject.set(x, "PermissionSetArn", value.asInstanceOf[js.Any])
  }
}
