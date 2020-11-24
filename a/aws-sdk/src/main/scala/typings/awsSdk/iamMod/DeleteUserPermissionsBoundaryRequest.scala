package typings.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteUserPermissionsBoundaryRequest extends js.Object {
  
  /**
    * The name (friendly name, not ARN) of the IAM user from which you want to remove the permissions boundary.
    */
  var UserName: userNameType = js.native
}
object DeleteUserPermissionsBoundaryRequest {
  
  @scala.inline
  def apply(UserName: userNameType): DeleteUserPermissionsBoundaryRequest = {
    val __obj = js.Dynamic.literal(UserName = UserName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteUserPermissionsBoundaryRequest]
  }
  
  @scala.inline
  implicit class DeleteUserPermissionsBoundaryRequestOps[Self <: DeleteUserPermissionsBoundaryRequest] (val x: Self) extends AnyVal {
    
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
    def setUserName(value: userNameType): Self = this.set("UserName", value.asInstanceOf[js.Any])
  }
}
