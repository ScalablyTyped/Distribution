package typings.awsSdk.clientsWellarchitectedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateShareInvitationOutput extends StObject {
  
  /**
    * The updated workload or custom lens share invitation.
    */
  var ShareInvitation: js.UndefOr[typings.awsSdk.clientsWellarchitectedMod.ShareInvitation] = js.undefined
}
object UpdateShareInvitationOutput {
  
  inline def apply(): UpdateShareInvitationOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateShareInvitationOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateShareInvitationOutput] (val x: Self) extends AnyVal {
    
    inline def setShareInvitation(value: ShareInvitation): Self = StObject.set(x, "ShareInvitation", value.asInstanceOf[js.Any])
    
    inline def setShareInvitationUndefined: Self = StObject.set(x, "ShareInvitation", js.undefined)
  }
}
