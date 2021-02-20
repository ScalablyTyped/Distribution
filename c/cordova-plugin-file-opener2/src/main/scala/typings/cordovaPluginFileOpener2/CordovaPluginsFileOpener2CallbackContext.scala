package typings.cordovaPluginFileOpener2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CordovaPluginsFileOpener2CallbackContext extends StObject {
  
  var error: js.UndefOr[js.Function1[/* error */ CordovaPluginsFileOpener2Result, Unit]] = js.native
  
  var success: js.UndefOr[js.Function0[Unit]] = js.native
}
object CordovaPluginsFileOpener2CallbackContext {
  
  @scala.inline
  def apply(): CordovaPluginsFileOpener2CallbackContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CordovaPluginsFileOpener2CallbackContext]
  }
  
  @scala.inline
  implicit class CordovaPluginsFileOpener2CallbackContextMutableBuilder[Self <: CordovaPluginsFileOpener2CallbackContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError(value: /* error */ CordovaPluginsFileOpener2Result => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    @scala.inline
    def setSuccess(value: () => Unit): Self = StObject.set(x, "success", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
