package typings.awsSdk.codestarMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateTeamMemberRequest extends StObject {
  
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
  implicit class UpdateTeamMemberRequestMutableBuilder[Self <: UpdateTeamMemberRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProjectId(value: ProjectId): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
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
  }
}
