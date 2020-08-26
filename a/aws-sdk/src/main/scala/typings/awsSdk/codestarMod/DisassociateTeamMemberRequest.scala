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
  @scala.inline
  implicit class DisassociateTeamMemberRequestOps[Self <: DisassociateTeamMemberRequest] (val x: Self) extends AnyVal {
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
  }
  
}

