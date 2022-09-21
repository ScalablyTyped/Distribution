package typings.typescriptNn5FuAjk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DedicatedWorkerGlobalScopeEventMap
  extends StObject
     with WorkerGlobalScopeEventMap {
  
  var message: MessageEvent[Any]
  
  var messageerror: MessageEvent[Any]
}
object DedicatedWorkerGlobalScopeEventMap {
  
  inline def apply(
    error: ErrorEvent,
    languagechange: Event,
    message: MessageEvent[Any],
    messageerror: MessageEvent[Any],
    offline: Event,
    online: Event,
    rejectionhandled: PromiseRejectionEvent,
    unhandledrejection: PromiseRejectionEvent
  ): DedicatedWorkerGlobalScopeEventMap = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], languagechange = languagechange.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], messageerror = messageerror.asInstanceOf[js.Any], offline = offline.asInstanceOf[js.Any], online = online.asInstanceOf[js.Any], rejectionhandled = rejectionhandled.asInstanceOf[js.Any], unhandledrejection = unhandledrejection.asInstanceOf[js.Any])
    __obj.asInstanceOf[DedicatedWorkerGlobalScopeEventMap]
  }
  
  extension [Self <: DedicatedWorkerGlobalScopeEventMap](x: Self) {
    
    inline def setMessage(value: MessageEvent[Any]): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageerror(value: MessageEvent[Any]): Self = StObject.set(x, "messageerror", value.asInstanceOf[js.Any])
  }
}
