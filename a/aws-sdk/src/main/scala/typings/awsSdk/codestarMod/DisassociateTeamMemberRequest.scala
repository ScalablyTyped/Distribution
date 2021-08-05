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
  
  inline def apply(projectId: ProjectId, userArn: UserArn): DisassociateTeamMemberRequest = {
    val __obj = js.Dynamic.literal(projectId = projectId.asInstanceOf[js.Any], userArn = userArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateTeamMemberRequest]
  }
  
  extension [Self <: DisassociateTeamMemberRequest](x: Self) {
    
    inline def setProjectId(value: ProjectId): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setUserArn(value: UserArn): Self = StObject.set(x, "userArn", value.asInstanceOf[js.Any])
  }
}
