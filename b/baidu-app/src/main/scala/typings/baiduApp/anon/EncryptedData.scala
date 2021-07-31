package typings.baiduApp.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EncryptedData extends StObject {
  
  /** 包括敏感数据在内的完整转发信息的加密数据，详细见[加密数据解密算法](https://smartprogram.baidu.com/docs/develop/api/open_log/#login/) */
  var encryptedData: String
  
  /** 错误信息 */
  var errMsg: String
  
  /** 加密算法的初始向量，详细见[加密数据解密算法](https://smartprogram.baidu.com/docs/develop/api/open_log/#login/) */
  var iv: String
}
object EncryptedData {
  
  @scala.inline
  def apply(encryptedData: String, errMsg: String, iv: String): EncryptedData = {
    val __obj = js.Dynamic.literal(encryptedData = encryptedData.asInstanceOf[js.Any], errMsg = errMsg.asInstanceOf[js.Any], iv = iv.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncryptedData]
  }
  
  @scala.inline
  implicit class EncryptedDataMutableBuilder[Self <: EncryptedData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEncryptedData(value: String): Self = StObject.set(x, "encryptedData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIv(value: String): Self = StObject.set(x, "iv", value.asInstanceOf[js.Any])
  }
}
