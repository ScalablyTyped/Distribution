package typings.typescriptNn5FuAjk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SharedWorkerGlobalScopeEventMap
  extends StObject
     with WorkerGlobalScopeEventMap {
  
  var connect: MessageEvent[Any]
}
object SharedWorkerGlobalScopeEventMap {
  
  inline def apply(
    connect: MessageEvent[Any],
    error: ErrorEvent,
    languagechange: Event,
    offline: Event,
    online: Event,
    rejectionhandled: PromiseRejectionEvent,
    unhandledrejection: PromiseRejectionEvent
  ): SharedWorkerGlobalScopeEventMap = {
    val __obj = js.Dynamic.literal(connect = connect.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], languagechange = languagechange.asInstanceOf[js.Any], offline = offline.asInstanceOf[js.Any], online = online.asInstanceOf[js.Any], rejectionhandled = rejectionhandled.asInstanceOf[js.Any], unhandledrejection = unhandledrejection.asInstanceOf[js.Any])
    __obj.asInstanceOf[SharedWorkerGlobalScopeEventMap]
  }
  
  extension [Self <: SharedWorkerGlobalScopeEventMap](x: Self) {
    
    inline def setConnect(value: MessageEvent[Any]): Self = StObject.set(x, "connect", value.asInstanceOf[js.Any])
  }
}
