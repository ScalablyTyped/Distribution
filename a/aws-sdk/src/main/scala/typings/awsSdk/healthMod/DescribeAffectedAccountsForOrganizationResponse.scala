package typings.awsSdk.healthMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAffectedAccountsForOrganizationResponse extends StObject {
  
  /**
    * A JSON set of elements of the affected accounts.
    */
  var affectedAccounts: js.UndefOr[affectedAccountsList] = js.undefined
  
  /**
    * This parameter specifies if the AWS Health event is a public AWS service event or an account-specific event.   If the eventScopeCode value is PUBLIC, then the affectedAccounts value is always empty.   If the eventScopeCode value is ACCOUNT_SPECIFIC, then the affectedAccounts value lists the affected AWS accounts in your organization. For example, if an event affects a service such as Amazon Elastic Compute Cloud and you have AWS accounts that use that service, those account IDs appear in the response.   If the eventScopeCode value is NONE, then the eventArn that you specified in the request is invalid or doesn't exist.  
    */
  var eventScopeCode: js.UndefOr[typings.awsSdk.healthMod.eventScopeCode] = js.undefined
  
  /**
    * If the results of a search are large, only a portion of the results are returned, and a nextToken pagination token is returned in the response. To retrieve the next batch of results, reissue the search request and include the returned token. When all results have been returned, the response does not contain a pagination token value.
    */
  var nextToken: js.UndefOr[typings.awsSdk.healthMod.nextToken] = js.undefined
}
object DescribeAffectedAccountsForOrganizationResponse {
  
  @scala.inline
  def apply(): DescribeAffectedAccountsForOrganizationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAffectedAccountsForOrganizationResponse]
  }
  
  @scala.inline
  implicit class DescribeAffectedAccountsForOrganizationResponseMutableBuilder[Self <: DescribeAffectedAccountsForOrganizationResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAffectedAccounts(value: affectedAccountsList): Self = StObject.set(x, "affectedAccounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAffectedAccountsUndefined: Self = StObject.set(x, "affectedAccounts", js.undefined)
    
    @scala.inline
    def setAffectedAccountsVarargs(value: accountId*): Self = StObject.set(x, "affectedAccounts", js.Array(value :_*))
    
    @scala.inline
    def setEventScopeCode(value: eventScopeCode): Self = StObject.set(x, "eventScopeCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventScopeCodeUndefined: Self = StObject.set(x, "eventScopeCode", js.undefined)
    
    @scala.inline
    def setNextToken(value: nextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
