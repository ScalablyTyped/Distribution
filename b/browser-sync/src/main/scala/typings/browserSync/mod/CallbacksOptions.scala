package typings.browserSync.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CallbacksOptions extends StObject {
  
  def ready(err: js.Error, bs: BrowserSyncInstance): Unit
}
object CallbacksOptions {
  
  inline def apply(ready: (js.Error, BrowserSyncInstance) => Unit): CallbacksOptions = {
    val __obj = js.Dynamic.literal(ready = js.Any.fromFunction2(ready))
    __obj.asInstanceOf[CallbacksOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CallbacksOptions] (val x: Self) extends AnyVal {
    
    inline def setReady(value: (js.Error, BrowserSyncInstance) => Unit): Self = StObject.set(x, "ready", js.Any.fromFunction2(value))
  }
}
