package typings.awsSdk.codestarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateTeamMemberRequest extends js.Object {
  
  /**
    * The ID of the project.
    */
  var projectId: ProjectId = js.native
  
  /**
    * The role assigned to the user in the project. Project roles have different levels of access. For more information, see Working with Teams in the AWS CodeStar User Guide.
    */
  var projectRole: js.UndefOr[Role] = js.native
  
  /**
    * Whether a team member is allowed to remotely access project resources using the SSH public key associated with the user's profile. Even if this is set to True, the user must associate a public key with their profile before the user can access resources.
    */
  var remoteAccessAllowed: js.UndefOr[RemoteAccessAllowed] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the user for whom you want to change team membership attributes.
    */
  var userArn: UserArn = js.native
}
object UpdateTeamMemberRequest {
  
  @scala.inline
  def apply(projectId: ProjectId, userArn: UserArn): UpdateTeamMemberRequest = {
    val __obj = js.Dynamic.literal(projectId = projectId.asInstanceOf[js.Any], userArn = userArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateTeamMemberRequest]
  }
  
  @scala.inline
  implicit class UpdateTeamMemberRequestOps[Self <: UpdateTeamMemberRequest] (val x: Self) extends AnyVal {
    
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
    def setProjectId(value: ProjectId): Self = this.set("projectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserArn(value: UserArn): Self = this.set("userArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectRole(value: Role): Self = this.set("projectRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProjectRole: Self = this.set("projectRole", js.undefined)
    
    @scala.inline
    def setRemoteAccessAllowed(value: RemoteAccessAllowed): Self = this.set("remoteAccessAllowed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemoteAccessAllowed: Self = this.set("remoteAccessAllowed", js.undefined)
  }
}
