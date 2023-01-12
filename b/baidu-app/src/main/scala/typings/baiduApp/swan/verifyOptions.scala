package typings.baiduApp.swan

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait verifyOptions
  extends StObject
     with BaseOptions[Any, Any] {
  
  @JSName("success")
  var success_verifyOptions: js.UndefOr[js.Function1[/* res */ verifyTask, Unit]] = js.undefined
}
object verifyOptions {
  
  inline def apply(): verifyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[verifyOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: verifyOptions] (val x: Self) extends AnyVal {
    
    inline def setSuccess(value: /* res */ verifyTask => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
