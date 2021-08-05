package typings.baiduApp.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  errMsg :string} & baidu-app.swan.ExtConfig */
trait errMsgstringExtConfig extends StObject {
  
  /* 调用结果 */
  var errMsg: String
  
  /** 第三方平台自定义的数据 */
  var extConfig: js.Any
}
object errMsgstringExtConfig {
  
  inline def apply(errMsg: String, extConfig: js.Any): errMsgstringExtConfig = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any], extConfig = extConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[errMsgstringExtConfig]
  }
  
  extension [Self <: errMsgstringExtConfig](x: Self) {
    
    inline def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
    
    inline def setExtConfig(value: js.Any): Self = StObject.set(x, "extConfig", value.asInstanceOf[js.Any])
  }
}
