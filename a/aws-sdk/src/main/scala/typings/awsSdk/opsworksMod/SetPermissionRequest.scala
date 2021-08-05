package typings.awsSdk.opsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetPermissionRequest extends StObject {
  
  /**
    * The user is allowed to use SSH to communicate with the instance.
    */
  var AllowSsh: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The user is allowed to use sudo to elevate privileges.
    */
  var AllowSudo: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The user's IAM ARN. This can also be a federated user's ARN.
    */
  var IamUserArn: String
  
  /**
    * The user's permission level, which must be set to one of the following strings. You cannot set your own permissions level.    deny     show     deploy     manage     iam_only    For more information about the permissions associated with these levels, see Managing User Permissions.
    */
  var Level: js.UndefOr[String] = js.undefined
  
  /**
    * The stack ID.
    */
  var StackId: String
}
object SetPermissionRequest {
  
  inline def apply(IamUserArn: String, StackId: String): SetPermissionRequest = {
    val __obj = js.Dynamic.literal(IamUserArn = IamUserArn.asInstanceOf[js.Any], StackId = StackId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetPermissionRequest]
  }
  
  extension [Self <: SetPermissionRequest](x: Self) {
    
    inline def setAllowSsh(value: Boolean): Self = StObject.set(x, "AllowSsh", value.asInstanceOf[js.Any])
    
    inline def setAllowSshUndefined: Self = StObject.set(x, "AllowSsh", js.undefined)
    
    inline def setAllowSudo(value: Boolean): Self = StObject.set(x, "AllowSudo", value.asInstanceOf[js.Any])
    
    inline def setAllowSudoUndefined: Self = StObject.set(x, "AllowSudo", js.undefined)
    
    inline def setIamUserArn(value: String): Self = StObject.set(x, "IamUserArn", value.asInstanceOf[js.Any])
    
    inline def setLevel(value: String): Self = StObject.set(x, "Level", value.asInstanceOf[js.Any])
    
    inline def setLevelUndefined: Self = StObject.set(x, "Level", js.undefined)
    
    inline def setStackId(value: String): Self = StObject.set(x, "StackId", value.asInstanceOf[js.Any])
  }
}
