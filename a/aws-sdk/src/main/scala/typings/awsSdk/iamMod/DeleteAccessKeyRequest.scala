package typings.awsSdk.iamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteAccessKeyRequest extends StObject {
  
  /**
    * The access key ID for the access key ID and secret access key you want to delete. This parameter allows (through its regex pattern) a string of characters that can consist of any upper or lowercased letter or digit.
    */
  var AccessKeyId: accessKeyIdType
  
  /**
    * The name of the user whose access key pair you want to delete. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
    */
  var UserName: js.UndefOr[existingUserNameType] = js.undefined
}
object DeleteAccessKeyRequest {
  
  inline def apply(AccessKeyId: accessKeyIdType): DeleteAccessKeyRequest = {
    val __obj = js.Dynamic.literal(AccessKeyId = AccessKeyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteAccessKeyRequest]
  }
  
  extension [Self <: DeleteAccessKeyRequest](x: Self) {
    
    inline def setAccessKeyId(value: accessKeyIdType): Self = StObject.set(x, "AccessKeyId", value.asInstanceOf[js.Any])
    
    inline def setUserName(value: existingUserNameType): Self = StObject.set(x, "UserName", value.asInstanceOf[js.Any])
    
    inline def setUserNameUndefined: Self = StObject.set(x, "UserName", js.undefined)
  }
}
