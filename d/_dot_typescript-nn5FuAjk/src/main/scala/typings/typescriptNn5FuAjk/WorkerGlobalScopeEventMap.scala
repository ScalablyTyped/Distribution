package typings.typescriptNn5FuAjk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkerGlobalScopeEventMap extends StObject {
  
  var error: ErrorEvent
  
  var languagechange: Event
  
  var offline: Event
  
  var online: Event
  
  var rejectionhandled: PromiseRejectionEvent
  
  var unhandledrejection: PromiseRejectionEvent
}
object WorkerGlobalScopeEventMap {
  
  inline def apply(
    error: ErrorEvent,
    languagechange: Event,
    offline: Event,
    online: Event,
    rejectionhandled: PromiseRejectionEvent,
    unhandledrejection: PromiseRejectionEvent
  ): WorkerGlobalScopeEventMap = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], languagechange = languagechange.asInstanceOf[js.Any], offline = offline.asInstanceOf[js.Any], online = online.asInstanceOf[js.Any], rejectionhandled = rejectionhandled.asInstanceOf[js.Any], unhandledrejection = unhandledrejection.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkerGlobalScopeEventMap]
  }
  
  extension [Self <: WorkerGlobalScopeEventMap](x: Self) {
    
    inline def setError(value: ErrorEvent): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setLanguagechange(value: Event): Self = StObject.set(x, "languagechange", value.asInstanceOf[js.Any])
    
    inline def setOffline(value: Event): Self = StObject.set(x, "offline", value.asInstanceOf[js.Any])
    
    inline def setOnline(value: Event): Self = StObject.set(x, "online", value.asInstanceOf[js.Any])
    
    inline def setRejectionhandled(value: PromiseRejectionEvent): Self = StObject.set(x, "rejectionhandled", value.asInstanceOf[js.Any])
    
    inline def setUnhandledrejection(value: PromiseRejectionEvent): Self = StObject.set(x, "unhandledrejection", value.asInstanceOf[js.Any])
  }
}
