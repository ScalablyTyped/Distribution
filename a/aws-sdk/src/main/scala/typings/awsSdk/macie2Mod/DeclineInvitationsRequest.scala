package typings.awsSdk.macie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeclineInvitationsRequest extends StObject {
  
  /**
    * An array that lists AWS account IDs, one for each account that sent an invitation to decline.
    */
  var accountIds: listOfString = js.native
}
object DeclineInvitationsRequest {
  
  @scala.inline
  def apply(accountIds: listOfString): DeclineInvitationsRequest = {
    val __obj = js.Dynamic.literal(accountIds = accountIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeclineInvitationsRequest]
  }
  
  @scala.inline
  implicit class DeclineInvitationsRequestMutableBuilder[Self <: DeclineInvitationsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountIds(value: listOfString): Self = StObject.set(x, "accountIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdsVarargs(value: string*): Self = StObject.set(x, "accountIds", js.Array(value :_*))
  }
}
