package typings.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetPermissionRequest extends js.Object {
  
  /**
    * The user is allowed to use SSH to communicate with the instance.
    */
  var AllowSsh: js.UndefOr[Boolean] = js.native
  
  /**
    * The user is allowed to use sudo to elevate privileges.
    */
  var AllowSudo: js.UndefOr[Boolean] = js.native
  
  /**
    * The user's IAM ARN. This can also be a federated user's ARN.
    */
  var IamUserArn: String = js.native
  
  /**
    * The user's permission level, which must be set to one of the following strings. You cannot set your own permissions level.    deny     show     deploy     manage     iam_only    For more information about the permissions associated with these levels, see Managing User Permissions.
    */
  var Level: js.UndefOr[String] = js.native
  
  /**
    * The stack ID.
    */
  var StackId: String = js.native
}
object SetPermissionRequest {
  
  @scala.inline
  def apply(IamUserArn: String, StackId: String): SetPermissionRequest = {
    val __obj = js.Dynamic.literal(IamUserArn = IamUserArn.asInstanceOf[js.Any], StackId = StackId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetPermissionRequest]
  }
  
  @scala.inline
  implicit class SetPermissionRequestOps[Self <: SetPermissionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setIamUserArn(value: String): Self = this.set("IamUserArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackId(value: String): Self = this.set("StackId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowSsh(value: Boolean): Self = this.set("AllowSsh", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowSsh: Self = this.set("AllowSsh", js.undefined)
    
    @scala.inline
    def setAllowSudo(value: Boolean): Self = this.set("AllowSudo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowSudo: Self = this.set("AllowSudo", js.undefined)
    
    @scala.inline
    def setLevel(value: String): Self = this.set("Level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLevel: Self = this.set("Level", js.undefined)
  }
}
