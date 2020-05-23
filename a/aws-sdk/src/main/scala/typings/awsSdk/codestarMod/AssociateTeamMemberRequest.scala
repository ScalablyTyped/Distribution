package typings.awsSdk.codestarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(
    projectId: ProjectId,
    projectRole: Role,
    userArn: UserArn,
    clientRequestToken: ClientRequestToken = null,
    remoteAccessAllowed: js.UndefOr[RemoteAccessAllowed] = js.undefined
  ): AssociateTeamMemberRequest = {
    val __obj = js.Dynamic.literal(projectId = projectId.asInstanceOf[js.Any], projectRole = projectRole.asInstanceOf[js.Any], userArn = userArn.asInstanceOf[js.Any])
    if (clientRequestToken != null) __obj.updateDynamic("clientRequestToken")(clientRequestToken.asInstanceOf[js.Any])
    if (!js.isUndefined(remoteAccessAllowed)) __obj.updateDynamic("remoteAccessAllowed")(remoteAccessAllowed.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateTeamMemberRequest]
  }
}

