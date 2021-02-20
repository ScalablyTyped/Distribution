package typings.awsSdk.macie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteInvitationsResponse extends StObject {
  
  /**
    * An array of objects, one for each account whose invitation hasn't been deleted. Each object identifies the account and explains why the request hasn't been processed for that account.
    */
  var unprocessedAccounts: js.UndefOr[listOfUnprocessedAccount] = js.native
}
object DeleteInvitationsResponse {
  
  @scala.inline
  def apply(): DeleteInvitationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteInvitationsResponse]
  }
  
  @scala.inline
  implicit class DeleteInvitationsResponseMutableBuilder[Self <: DeleteInvitationsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUnprocessedAccounts(value: listOfUnprocessedAccount): Self = StObject.set(x, "unprocessedAccounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnprocessedAccountsUndefined: Self = StObject.set(x, "unprocessedAccounts", js.undefined)
    
    @scala.inline
    def setUnprocessedAccountsVarargs(value: UnprocessedAccount*): Self = StObject.set(x, "unprocessedAccounts", js.Array(value :_*))
  }
}
