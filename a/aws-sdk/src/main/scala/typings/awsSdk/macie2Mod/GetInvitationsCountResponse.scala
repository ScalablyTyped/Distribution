package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetInvitationsCountResponse extends js.Object {
  
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
  implicit class GetInvitationsCountResponseOps[Self <: GetInvitationsCountResponse] (val x: Self) extends AnyVal {
    
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
    def setInvitationsCount(value: long): Self = this.set("invitationsCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInvitationsCount: Self = this.set("invitationsCount", js.undefined)
  }
}
