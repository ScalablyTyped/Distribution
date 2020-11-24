package typings.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateUserProfileRequest extends js.Object {
  
  /**
    * Whether users can specify their own SSH public key through the My Settings page. For more information, see Setting an IAM User's Public SSH Key.
    */
  var AllowSelfManagement: js.UndefOr[Boolean] = js.native
  
  /**
    * The user's IAM ARN; this can also be a federated user's ARN.
    */
  var IamUserArn: String = js.native
  
  /**
    * The user's public SSH key.
    */
  var SshPublicKey: js.UndefOr[String] = js.native
  
  /**
    * The user's SSH user name. The allowable characters are [a-z], [A-Z], [0-9], '-', and '_'. If the specified name includes other punctuation marks, AWS OpsWorks Stacks removes them. For example, my.name will be changed to myname. If you do not specify an SSH user name, AWS OpsWorks Stacks generates one from the IAM user name. 
    */
  var SshUsername: js.UndefOr[String] = js.native
}
object CreateUserProfileRequest {
  
  @scala.inline
  def apply(IamUserArn: String): CreateUserProfileRequest = {
    val __obj = js.Dynamic.literal(IamUserArn = IamUserArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateUserProfileRequest]
  }
  
  @scala.inline
  implicit class CreateUserProfileRequestOps[Self <: CreateUserProfileRequest] (val x: Self) extends AnyVal {
    
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
    def setAllowSelfManagement(value: Boolean): Self = this.set("AllowSelfManagement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowSelfManagement: Self = this.set("AllowSelfManagement", js.undefined)
    
    @scala.inline
    def setSshPublicKey(value: String): Self = this.set("SshPublicKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSshPublicKey: Self = this.set("SshPublicKey", js.undefined)
    
    @scala.inline
    def setSshUsername(value: String): Self = this.set("SshUsername", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSshUsername: Self = this.set("SshUsername", js.undefined)
  }
}
