package typings.awsSdk.codestarMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisassociateTeamMemberRequest extends StObject {
  
  /**
    * The ID of the AWS CodeStar project from which you want to remove a team member.
    */
  var projectId: ProjectId
  
  /**
    * The Amazon Resource Name (ARN) of the IAM user or group whom you want to remove from the project.
    */
  var userArn: UserArn
}
object DisassociateTeamMemberRequest {
  
  @scala.inline
  def apply(projectId: ProjectId, userArn: UserArn): DisassociateTeamMemberRequest = {
    val __obj = js.Dynamic.literal(projectId = projectId.asInstanceOf[js.Any], userArn = userArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateTeamMemberRequest]
  }
  
  @scala.inline
  implicit class DisassociateTeamMemberRequestMutableBuilder[Self <: DisassociateTeamMemberRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProjectId(value: ProjectId): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserArn(value: UserArn): Self = StObject.set(x, "userArn", value.asInstanceOf[js.Any])
  }
}
