package typings.baiduApp.swan

import typings.baiduApp.anon.errMsgstringExtConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetExtConfigOptions
  extends StObject
     with BaseOptions[js.Any, js.Any] {
  
  @JSName("success")
  def success_MGetExtConfigOptions(res: errMsgstringExtConfig): Unit
}
object GetExtConfigOptions {
  
  inline def apply(success: errMsgstringExtConfig => Unit): GetExtConfigOptions = {
    val __obj = js.Dynamic.literal(success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[GetExtConfigOptions]
  }
  
  extension [Self <: GetExtConfigOptions](x: Self) {
    
    inline def setSuccess(value: errMsgstringExtConfig => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
  }
}
