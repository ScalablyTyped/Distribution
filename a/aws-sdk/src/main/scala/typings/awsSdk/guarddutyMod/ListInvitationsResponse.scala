package typings.awsSdk.guarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListInvitationsResponse extends StObject {
  
  /**
    * A list of invitation descriptions.
    */
  var Invitations: js.UndefOr[typings.awsSdk.guarddutyMod.Invitations] = js.undefined
  
  /**
    * The pagination parameter to be used on the next list operation to retrieve more items.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object ListInvitationsResponse {
  
  inline def apply(): ListInvitationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListInvitationsResponse]
  }
  
  extension [Self <: ListInvitationsResponse](x: Self) {
    
    inline def setInvitations(value: Invitations): Self = StObject.set(x, "Invitations", value.asInstanceOf[js.Any])
    
    inline def setInvitationsUndefined: Self = StObject.set(x, "Invitations", js.undefined)
    
    inline def setInvitationsVarargs(value: Invitation*): Self = StObject.set(x, "Invitations", js.Array(value :_*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
