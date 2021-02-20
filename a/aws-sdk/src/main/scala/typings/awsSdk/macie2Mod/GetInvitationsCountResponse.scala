package typings.awsSdk.macie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetInvitationsCountResponse extends StObject {
  
  /**
    * The total number of invitations that were received by the account, not including the currently accepted invitation.
    */
  var invitationsCount: js.UndefOr[long] = js.native
}
object GetInvitationsCountResponse {
  
  @scala.inline
  def apply(): GetInvitationsCountResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetInvitationsCountResponse]
  }
  
  @scala.inline
  implicit class GetInvitationsCountResponseMutableBuilder[Self <: GetInvitationsCountResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInvitationsCount(value: long): Self = StObject.set(x, "invitationsCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvitationsCountUndefined: Self = StObject.set(x, "invitationsCount", js.undefined)
  }
}
