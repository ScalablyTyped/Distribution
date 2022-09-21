package typings.typescriptNn5FuAjk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AbstractWorkerEventMap extends StObject {
  
  var error: ErrorEvent
}
object AbstractWorkerEventMap {
  
  inline def apply(error: ErrorEvent): AbstractWorkerEventMap = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[AbstractWorkerEventMap]
  }
  
  extension [Self <: AbstractWorkerEventMap](x: Self) {
    
    inline def setError(value: ErrorEvent): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
  }
}
