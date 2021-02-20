package typings.awsSdk.codestarMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateTeamMemberResult extends StObject {
  
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
  implicit class UpdateTeamMemberResultMutableBuilder[Self <: UpdateTeamMemberResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProjectRole(value: Role): Self = StObject.set(x, "projectRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectRoleUndefined: Self = StObject.set(x, "projectRole", js.undefined)
    
    @scala.inline
    def setRemoteAccessAllowed(value: RemoteAccessAllowed): Self = StObject.set(x, "remoteAccessAllowed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoteAccessAllowedUndefined: Self = StObject.set(x, "remoteAccessAllowed", js.undefined)
    
    @scala.inline
    def setUserArn(value: UserArn): Self = StObject.set(x, "userArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserArnUndefined: Self = StObject.set(x, "userArn", js.undefined)
  }
}
