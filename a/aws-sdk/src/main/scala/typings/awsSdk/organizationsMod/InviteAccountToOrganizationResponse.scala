package typings.awsSdk.organizationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InviteAccountToOrganizationResponse extends js.Object {
  
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
  implicit class InviteAccountToOrganizationResponseOps[Self <: InviteAccountToOrganizationResponse] (val x: Self) extends AnyVal {
    
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
    def setHandshake(value: Handshake): Self = this.set("Handshake", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHandshake: Self = this.set("Handshake", js.undefined)
  }
}
