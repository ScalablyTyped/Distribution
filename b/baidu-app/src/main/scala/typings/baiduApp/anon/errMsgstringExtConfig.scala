package typings.baiduApp.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  errMsg :string} & baidu-app.swan.ExtConfig */
@js.native
trait errMsgstringExtConfig extends StObject {
  
  /* 调用结果 */
  var errMsg: String = js.native
  
  /** 第三方平台自定义的数据 */
  var extConfig: js.Any = js.native
}
object errMsgstringExtConfig {
  
  @scala.inline
  def apply(errMsg: String, extConfig: js.Any): errMsgstringExtConfig = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any], extConfig = extConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[errMsgstringExtConfig]
  }
  
  @scala.inline
  implicit class errMsgstringExtConfigMutableBuilder[Self <: errMsgstringExtConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtConfig(value: js.Any): Self = StObject.set(x, "extConfig", value.asInstanceOf[js.Any])
  }
}
