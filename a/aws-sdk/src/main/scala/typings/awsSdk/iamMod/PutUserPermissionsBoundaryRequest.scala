package typings.awsSdk.iamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutUserPermissionsBoundaryRequest extends StObject {
  
  /**
    * The ARN of the policy that is used to set the permissions boundary for the user.
    */
  var PermissionsBoundary: arnType = js.native
  
  /**
    * The name (friendly name, not ARN) of the IAM user for which you want to set the permissions boundary.
    */
  var UserName: userNameType = js.native
}
object PutUserPermissionsBoundaryRequest {
  
  @scala.inline
  def apply(PermissionsBoundary: arnType, UserName: userNameType): PutUserPermissionsBoundaryRequest = {
    val __obj = js.Dynamic.literal(PermissionsBoundary = PermissionsBoundary.asInstanceOf[js.Any], UserName = UserName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutUserPermissionsBoundaryRequest]
  }
  
  @scala.inline
  implicit class PutUserPermissionsBoundaryRequestMutableBuilder[Self <: PutUserPermissionsBoundaryRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPermissionsBoundary(value: arnType): Self = StObject.set(x, "PermissionsBoundary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserName(value: userNameType): Self = StObject.set(x, "UserName", value.asInstanceOf[js.Any])
  }
}
