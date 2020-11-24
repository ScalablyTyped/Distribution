package typings.awsSdk.codestarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssociateTeamMemberRequest extends js.Object {
  
  /**
    * A user- or system-generated token that identifies the entity that requested the team member association to the project. This token can be used to repeat the request.
    */
  var clientRequestToken: js.UndefOr[ClientRequestToken] = js.native
  
  /**
    * The ID of the project to which you will add the IAM user.
    */
  var projectId: ProjectId = js.native
  
  /**
    * The AWS CodeStar project role that will apply to this user. This role determines what actions a user can take in an AWS CodeStar project.
    */
  var projectRole: Role = js.native
  
  /**
    * Whether the team member is allowed to use an SSH public/private key pair to remotely access project resources, for example Amazon EC2 instances.
    */
  var remoteAccessAllowed: js.UndefOr[RemoteAccessAllowed] = js.native
  
  /**
    * The Amazon Resource Name (ARN) for the IAM user you want to add to the AWS CodeStar project.
    */
  var userArn: UserArn = js.native
}
object AssociateTeamMemberRequest {
  
  @scala.inline
  def apply(projectId: ProjectId, projectRole: Role, userArn: UserArn): AssociateTeamMemberRequest = {
    val __obj = js.Dynamic.literal(projectId = projectId.asInstanceOf[js.Any], projectRole = projectRole.asInstanceOf[js.Any], userArn = userArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateTeamMemberRequest]
  }
  
  @scala.inline
  implicit class AssociateTeamMemberRequestOps[Self <: AssociateTeamMemberRequest] (val x: Self) extends AnyVal {
    
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
    def setProjectRole(value: Role): Self = this.set("projectRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserArn(value: UserArn): Self = this.set("userArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientRequestToken(value: ClientRequestToken): Self = this.set("clientRequestToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientRequestToken: Self = this.set("clientRequestToken", js.undefined)
    
    @scala.inline
    def setRemoteAccessAllowed(value: RemoteAccessAllowed): Self = this.set("remoteAccessAllowed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemoteAccessAllowed: Self = this.set("remoteAccessAllowed", js.undefined)
  }
}
