package typings.awsSdk.healthMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeAffectedAccountsForOrganizationResponse extends js.Object {
  
  /**
    * A JSON set of elements of the affected accounts.
    */
  var affectedAccounts: js.UndefOr[affectedAccountsList] = js.native
  
  /**
    * This parameter specifies if the AWS Health event is a public AWS service event or an account-specific event.   If the eventScopeCode value is PUBLIC, then the affectedAccounts value is always empty.   If the eventScopeCode value is ACCOUNT_SPECIFIC, then the affectedAccounts value lists the affected AWS accounts in your organization. For example, if an event affects a service such as Amazon Elastic Compute Cloud and you have AWS accounts that use that service, those account IDs appear in the response.   If the eventScopeCode value is NONE, then the eventArn that you specified in the request is invalid or doesn't exist.  
    */
  var eventScopeCode: js.UndefOr[typings.awsSdk.healthMod.eventScopeCode] = js.native
  
  /**
    * If the results of a search are large, only a portion of the results are returned, and a nextToken pagination token is returned in the response. To retrieve the next batch of results, reissue the search request and include the returned token. When all results have been returned, the response does not contain a pagination token value.
    */
  var nextToken: js.UndefOr[typings.awsSdk.healthMod.nextToken] = js.native
}
object DescribeAffectedAccountsForOrganizationResponse {
  
  @scala.inline
  def apply(): DescribeAffectedAccountsForOrganizationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAffectedAccountsForOrganizationResponse]
  }
  
  @scala.inline
  implicit class DescribeAffectedAccountsForOrganizationResponseOps[Self <: DescribeAffectedAccountsForOrganizationResponse] (val x: Self) extends AnyVal {
    
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
    def setAffectedAccountsVarargs(value: accountId*): Self = this.set("affectedAccounts", js.Array(value :_*))
    
    @scala.inline
    def setAffectedAccounts(value: affectedAccountsList): Self = this.set("affectedAccounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAffectedAccounts: Self = this.set("affectedAccounts", js.undefined)
    
    @scala.inline
    def setEventScopeCode(value: eventScopeCode): Self = this.set("eventScopeCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventScopeCode: Self = this.set("eventScopeCode", js.undefined)
    
    @scala.inline
    def setNextToken(value: nextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
}
