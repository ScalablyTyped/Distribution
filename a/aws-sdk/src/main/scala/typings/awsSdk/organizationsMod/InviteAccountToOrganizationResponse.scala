package typings.awsSdk.organizationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InviteAccountToOrganizationResponse extends StObject {
  
  /**
    * A structure that contains details about the handshake that is created to support this invitation request.
    */
  var Handshake: js.UndefOr[typings.awsSdk.organizationsMod.Handshake] = js.native
}
object InviteAccountToOrganizationResponse {
  
  @scala.inline
  def apply(): InviteAccountToOrganizationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InviteAccountToOrganizationResponse]
  }
  
  @scala.inline
  implicit class InviteAccountToOrganizationResponseMutableBuilder[Self <: InviteAccountToOrganizationResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHandshake(value: Handshake): Self = StObject.set(x, "Handshake", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHandshakeUndefined: Self = StObject.set(x, "Handshake", js.undefined)
  }
}
