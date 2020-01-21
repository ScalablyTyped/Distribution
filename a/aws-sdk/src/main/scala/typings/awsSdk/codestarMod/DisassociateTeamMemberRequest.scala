package typings.awsSdk.codestarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisassociateTeamMemberRequest extends js.Object {
  /**
    * The ID of the AWS CodeStar project from which you want to remove a team member.
    */
  var projectId: ProjectId = js.native
  /**
    * The Amazon Resource Name (ARN) of the IAM user or group whom you want to remove from the project.
    */
  var userArn: UserArn = js.native
}

object DisassociateTeamMemberRequest {
  @scala.inline
  def apply(projectId: ProjectId, userArn: UserArn): DisassociateTeamMemberRequest = {
    val __obj = js.Dynamic.literal(projectId = projectId.asInstanceOf[js.Any], userArn = userArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DisassociateTeamMemberRequest]
  }
}

