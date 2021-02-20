package typings.baiduApp.swan

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserInfoResponse extends StObject {
  
  var data: js.Any = js.native
  
  /** 包括敏感数据在内的完整用户信息的加密数据，详细见加密数据解密算法 */
  var encryptData: String = js.native
  
  var iv: js.Any = js.native
  
  /** 不包括敏感信息的原始数据字符串，用于计算签名。 */
  var rawData: String = js.native
  
  /** 使用 sha1( rawData + sessionkey ) 得到字符串，用于校验用户信息。 */
  var signature: String = js.native
  
  /** 用户信息对象，不包含 openid 等敏感信息 */
  var userInfo: UserInfo = js.native
}
object UserInfoResponse {
  
  @scala.inline
  def apply(
    data: js.Any,
    encryptData: String,
    iv: js.Any,
    rawData: String,
    signature: String,
    userInfo: UserInfo
  ): UserInfoResponse = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], encryptData = encryptData.asInstanceOf[js.Any], iv = iv.asInstanceOf[js.Any], rawData = rawData.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any], userInfo = userInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserInfoResponse]
  }
  
  @scala.inline
  implicit class UserInfoResponseMutableBuilder[Self <: UserInfoResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncryptData(value: String): Self = StObject.set(x, "encryptData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIv(value: js.Any): Self = StObject.set(x, "iv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRawData(value: String): Self = StObject.set(x, "rawData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignature(value: String): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserInfo(value: UserInfo): Self = StObject.set(x, "userInfo", value.asInstanceOf[js.Any])
  }
}
