package typings.awsSdk.macie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateInvitationsResponse extends StObject {
  
  /**
    * An array of objects, one for each account whose invitation hasn't been processed. Each object identifies the account and explains why the invitation hasn't been processed for the account.
    */
  var unprocessedAccounts: js.UndefOr[listOfUnprocessedAccount] = js.undefined
}
object CreateInvitationsResponse {
  
  @scala.inline
  def apply(): CreateInvitationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateInvitationsResponse]
  }
  
  @scala.inline
  implicit class CreateInvitationsResponseMutableBuilder[Self <: CreateInvitationsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUnprocessedAccounts(value: listOfUnprocessedAccount): Self = StObject.set(x, "unprocessedAccounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnprocessedAccountsUndefined: Self = StObject.set(x, "unprocessedAccounts", js.undefined)
    
    @scala.inline
    def setUnprocessedAccountsVarargs(value: UnprocessedAccount*): Self = StObject.set(x, "unprocessedAccounts", js.Array(value :_*))
  }
}
