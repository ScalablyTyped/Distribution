package typings.awsSdk.ssoadminMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListPermissionSetProvisioningStatusRequest extends StObject {
  
  /**
    * Filters results based on the passed attribute value.
    */
  var Filter: js.UndefOr[OperationStatusFilter] = js.undefined
  
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
}
object ListPermissionSetProvisioningStatusRequest {
  
  @scala.inline
  def apply(InstanceArn: InstanceArn): ListPermissionSetProvisioningStatusRequest = {
    val __obj = js.Dynamic.literal(InstanceArn = InstanceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPermissionSetProvisioningStatusRequest]
  }
  
  @scala.inline
  implicit class ListPermissionSetProvisioningStatusRequestMutableBuilder[Self <: ListPermissionSetProvisioningStatusRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilter(value: OperationStatusFilter): Self = StObject.set(x, "Filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "Filter", js.undefined)
    
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
  }
}
