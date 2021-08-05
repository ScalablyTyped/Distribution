package typings.awsSdk.codestarMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TeamMember extends StObject {
  
  /**
    * The role assigned to the user in the project. Project roles have different levels of access. For more information, see Working with Teams in the AWS CodeStar User Guide. 
    */
  var projectRole: Role
  
  /**
    * Whether the user is allowed to remotely access project resources using an SSH public/private key pair.
    */
  var remoteAccessAllowed: js.UndefOr[RemoteAccessAllowed] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the user in IAM.
    */
  var userArn: UserArn
}
object TeamMember {
  
  inline def apply(projectRole: Role, userArn: UserArn): TeamMember = {
    val __obj = js.Dynamic.literal(projectRole = projectRole.asInstanceOf[js.Any], userArn = userArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamMember]
  }
  
  extension [Self <: TeamMember](x: Self) {
    
    inline def setProjectRole(value: Role): Self = StObject.set(x, "projectRole", value.asInstanceOf[js.Any])
    
    inline def setRemoteAccessAllowed(value: RemoteAccessAllowed): Self = StObject.set(x, "remoteAccessAllowed", value.asInstanceOf[js.Any])
    
    inline def setRemoteAccessAllowedUndefined: Self = StObject.set(x, "remoteAccessAllowed", js.undefined)
    
    inline def setUserArn(value: UserArn): Self = StObject.set(x, "userArn", value.asInstanceOf[js.Any])
  }
}
