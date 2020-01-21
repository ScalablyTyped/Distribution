package typings.baiduApp.swan

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserInfoResponse extends js.Object {
  var data: js.Any
  /** 包括敏感数据在内的完整用户信息的加密数据，详细见加密数据解密算法 */
  var encryptData: String
  var iv: js.Any
  /** 不包括敏感信息的原始数据字符串，用于计算签名。 */
  var rawData: String
  /** 使用 sha1( rawData + sessionkey ) 得到字符串，用于校验用户信息。 */
  var signature: String
  /** 用户信息对象，不包含 openid 等敏感信息 */
  var userInfo: UserInfo
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
}

