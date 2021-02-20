package typings.awsSdk.guarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetInvitationsCountResponse extends StObject {
  
  /**
    * The number of received invitations.
    */
  var InvitationsCount: js.UndefOr[Integer] = js.native
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
    def setInvitationsCount(value: Integer): Self = StObject.set(x, "InvitationsCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvitationsCountUndefined: Self = StObject.set(x, "InvitationsCount", js.undefined)
  }
}
