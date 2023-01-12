package typings.baiduApp.swan

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SwanIdOptions
  extends StObject
     with BaseOptions[Any, Any] {
  
  @JSName("success")
  var success_SwanIdOptions: js.UndefOr[js.Function1[/* res */ SwanIdTask, Unit]] = js.undefined
}
object SwanIdOptions {
  
  inline def apply(): SwanIdOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SwanIdOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SwanIdOptions] (val x: Self) extends AnyVal {
    
    inline def setSuccess(value: /* res */ SwanIdTask => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
