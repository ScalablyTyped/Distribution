package typings.awsSdk.iamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccessKey extends StObject {
  
  /**
    * The ID for this access key.
    */
  var AccessKeyId: accessKeyIdType
  
  /**
    * The date when the access key was created.
    */
  var CreateDate: js.UndefOr[dateType] = js.undefined
  
  /**
    * The secret key used to sign requests.
    */
  var SecretAccessKey: accessKeySecretType
  
  /**
    * The status of the access key. Active means that the key is valid for API calls, while Inactive means it is not. 
    */
  var Status: statusType
  
  /**
    * The name of the IAM user that the access key is associated with.
    */
  var UserName: userNameType
}
object AccessKey {
  
  @scala.inline
  def apply(
    AccessKeyId: accessKeyIdType,
    SecretAccessKey: accessKeySecretType,
    Status: statusType,
    UserName: userNameType
  ): AccessKey = {
    val __obj = js.Dynamic.literal(AccessKeyId = AccessKeyId.asInstanceOf[js.Any], SecretAccessKey = SecretAccessKey.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], UserName = UserName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessKey]
  }
  
  @scala.inline
  implicit class AccessKeyMutableBuilder[Self <: AccessKey] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessKeyId(value: accessKeyIdType): Self = StObject.set(x, "AccessKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateDate(value: dateType): Self = StObject.set(x, "CreateDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateDateUndefined: Self = StObject.set(x, "CreateDate", js.undefined)
    
    @scala.inline
    def setSecretAccessKey(value: accessKeySecretType): Self = StObject.set(x, "SecretAccessKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: statusType): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserName(value: userNameType): Self = StObject.set(x, "UserName", value.asInstanceOf[js.Any])
  }
}
