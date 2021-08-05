package typings.awsSdk.opsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateUserProfileRequest extends StObject {
  
  /**
    * Whether users can specify their own SSH public key through the My Settings page. For more information, see Managing User Permissions.
    */
  var AllowSelfManagement: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The user IAM ARN. This can also be a federated user's ARN.
    */
  var IamUserArn: String
  
  /**
    * The user's new SSH public key.
    */
  var SshPublicKey: js.UndefOr[String] = js.undefined
  
  /**
    * The user's SSH user name. The allowable characters are [a-z], [A-Z], [0-9], '-', and '_'. If the specified name includes other punctuation marks, AWS OpsWorks Stacks removes them. For example, my.name will be changed to myname. If you do not specify an SSH user name, AWS OpsWorks Stacks generates one from the IAM user name. 
    */
  var SshUsername: js.UndefOr[String] = js.undefined
}
object UpdateUserProfileRequest {
  
  inline def apply(IamUserArn: String): UpdateUserProfileRequest = {
    val __obj = js.Dynamic.literal(IamUserArn = IamUserArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateUserProfileRequest]
  }
  
  extension [Self <: UpdateUserProfileRequest](x: Self) {
    
    inline def setAllowSelfManagement(value: Boolean): Self = StObject.set(x, "AllowSelfManagement", value.asInstanceOf[js.Any])
    
    inline def setAllowSelfManagementUndefined: Self = StObject.set(x, "AllowSelfManagement", js.undefined)
    
    inline def setIamUserArn(value: String): Self = StObject.set(x, "IamUserArn", value.asInstanceOf[js.Any])
    
    inline def setSshPublicKey(value: String): Self = StObject.set(x, "SshPublicKey", value.asInstanceOf[js.Any])
    
    inline def setSshPublicKeyUndefined: Self = StObject.set(x, "SshPublicKey", js.undefined)
    
    inline def setSshUsername(value: String): Self = StObject.set(x, "SshUsername", value.asInstanceOf[js.Any])
    
    inline def setSshUsernameUndefined: Self = StObject.set(x, "SshUsername", js.undefined)
  }
}
