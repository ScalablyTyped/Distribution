package typings.baiduApp.swan

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetUserInfoOptions
  extends StObject
     with BaseOptions[Any, Any] {
  
  // 是否带上登录态信息
  var lang: js.UndefOr[String] = js.undefined
  
  // 指定返回用户信息的语言，zh_CN 简体中文，zh_TW 繁体中文，en 英文。默认为en。
  /** 接口调用成功的回调函数 */
  @JSName("success")
  var success_GetUserInfoOptions: js.UndefOr[js.Function1[/* res */ UserInfoResponse, Unit]] = js.undefined
  
  var withCredentials: js.UndefOr[Boolean] = js.undefined
}
object GetUserInfoOptions {
  
  inline def apply(): GetUserInfoOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetUserInfoOptions]
  }
  
  extension [Self <: GetUserInfoOptions](x: Self) {
    
    inline def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
    
    inline def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
    
    inline def setSuccess(value: /* res */ UserInfoResponse => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    inline def setWithCredentials(value: Boolean): Self = StObject.set(x, "withCredentials", value.asInstanceOf[js.Any])
    
    inline def setWithCredentialsUndefined: Self = StObject.set(x, "withCredentials", js.undefined)
  }
}
