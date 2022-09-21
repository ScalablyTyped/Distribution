package typings.baiduApp.swan

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoginOptions
  extends StObject
     with BaseOptions[Any, Any] {
  
  /** 接口调用成功的回调函数 */
  @JSName("success")
  var success_LoginOptions: js.UndefOr[js.Function1[/* res */ LoginResponse, Unit]] = js.undefined
}
object LoginOptions {
  
  inline def apply(): LoginOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoginOptions]
  }
  
  extension [Self <: LoginOptions](x: Self) {
    
    inline def setSuccess(value: /* res */ LoginResponse => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
