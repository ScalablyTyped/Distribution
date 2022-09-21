package typings.awsSdk.wellarchitectedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateShareInvitationOutput extends StObject {
  
  /**
    * The updated workload share invitation.
    */
  var ShareInvitation: js.UndefOr[typings.awsSdk.wellarchitectedMod.ShareInvitation] = js.undefined
}
object UpdateShareInvitationOutput {
  
  inline def apply(): UpdateShareInvitationOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateShareInvitationOutput]
  }
  
  extension [Self <: UpdateShareInvitationOutput](x: Self) {
    
    inline def setShareInvitation(value: ShareInvitation): Self = StObject.set(x, "ShareInvitation", value.asInstanceOf[js.Any])
    
    inline def setShareInvitationUndefined: Self = StObject.set(x, "ShareInvitation", js.undefined)
  }
}
