package typings.cordovaPluginFileOpener2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CordovaPluginsFileOpener2CallbackContext extends StObject {
  
  var error: js.UndefOr[js.Function1[/* error */ CordovaPluginsFileOpener2Result, Unit]] = js.undefined
  
  var success: js.UndefOr[js.Function0[Unit]] = js.undefined
}
object CordovaPluginsFileOpener2CallbackContext {
  
  inline def apply(): CordovaPluginsFileOpener2CallbackContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CordovaPluginsFileOpener2CallbackContext]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CordovaPluginsFileOpener2CallbackContext] (val x: Self) extends AnyVal {
    
    inline def setError(value: /* error */ CordovaPluginsFileOpener2Result => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setSuccess(value: () => Unit): Self = StObject.set(x, "success", js.Any.fromFunction0(value))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
