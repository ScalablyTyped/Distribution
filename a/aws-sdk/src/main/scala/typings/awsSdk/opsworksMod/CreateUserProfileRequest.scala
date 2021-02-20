package typings.awsSdk.opsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateUserProfileRequest extends StObject {
  
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
  implicit class CreateUserProfileRequestMutableBuilder[Self <: CreateUserProfileRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowSelfManagement(value: Boolean): Self = StObject.set(x, "AllowSelfManagement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowSelfManagementUndefined: Self = StObject.set(x, "AllowSelfManagement", js.undefined)
    
    @scala.inline
    def setIamUserArn(value: String): Self = StObject.set(x, "IamUserArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSshPublicKey(value: String): Self = StObject.set(x, "SshPublicKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSshPublicKeyUndefined: Self = StObject.set(x, "SshPublicKey", js.undefined)
    
    @scala.inline
    def setSshUsername(value: String): Self = StObject.set(x, "SshUsername", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSshUsernameUndefined: Self = StObject.set(x, "SshUsername", js.undefined)
  }
}
