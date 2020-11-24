package typings.awsSdk.codestarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateTeamMemberResult extends js.Object {
  
  /**
    * The project role granted to the user.
    */
  var projectRole: js.UndefOr[Role] = js.native
  
  /**
    * Whether a team member is allowed to remotely access project resources using the SSH public key associated with the user's profile.
    */
  var remoteAccessAllowed: js.UndefOr[RemoteAccessAllowed] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the user whose team membership attributes were updated.
    */
  var userArn: js.UndefOr[UserArn] = js.native
}
object UpdateTeamMemberResult {
  
  @scala.inline
  def apply(): UpdateTeamMemberResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateTeamMemberResult]
  }
  
  @scala.inline
  implicit class UpdateTeamMemberResultOps[Self <: UpdateTeamMemberResult] (val x: Self) extends AnyVal {
    
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
    def setProjectRole(value: Role): Self = this.set("projectRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProjectRole: Self = this.set("projectRole", js.undefined)
    
    @scala.inline
    def setRemoteAccessAllowed(value: RemoteAccessAllowed): Self = this.set("remoteAccessAllowed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemoteAccessAllowed: Self = this.set("remoteAccessAllowed", js.undefined)
    
    @scala.inline
    def setUserArn(value: UserArn): Self = this.set("userArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserArn: Self = this.set("userArn", js.undefined)
  }
}
