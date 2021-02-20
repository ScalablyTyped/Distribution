package typings.awsSdk.ssoadminMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListPermissionSetsProvisionedToAccountRequest extends StObject {
  
  /**
    * The identifier of the AWS account from which to list the assignments.
    */
  var AccountId: typings.awsSdk.ssoadminMod.AccountId = js.native
  
  /**
    * The ARN of the SSO instance under which the operation will be executed. For more information about ARNs, see Amazon Resource Names (ARNs) and AWS Service Namespaces in the AWS General Reference.
    */
  var InstanceArn: typings.awsSdk.ssoadminMod.InstanceArn = js.native
  
  /**
    * The maximum number of results to display for the assignment.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.ssoadminMod.MaxResults] = js.native
  
  /**
    * The pagination token for the list API. Initially the value is null. Use the output of previous API calls to make subsequent calls.
    */
  var NextToken: js.UndefOr[Token] = js.native
  
  /**
    * The status object for the permission set provisioning operation.
    */
  var ProvisioningStatus: js.UndefOr[typings.awsSdk.ssoadminMod.ProvisioningStatus] = js.native
}
object ListPermissionSetsProvisionedToAccountRequest {
  
  @scala.inline
  def apply(AccountId: AccountId, InstanceArn: InstanceArn): ListPermissionSetsProvisionedToAccountRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], InstanceArn = InstanceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPermissionSetsProvisionedToAccountRequest]
  }
  
  @scala.inline
  implicit class ListPermissionSetsProvisionedToAccountRequestMutableBuilder[Self <: ListPermissionSetsProvisionedToAccountRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: AccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
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
    def setProvisioningStatus(value: ProvisioningStatus): Self = StObject.set(x, "ProvisioningStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvisioningStatusUndefined: Self = StObject.set(x, "ProvisioningStatus", js.undefined)
  }
}
