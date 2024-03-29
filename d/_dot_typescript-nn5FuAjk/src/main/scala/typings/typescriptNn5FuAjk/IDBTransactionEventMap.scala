package typings.typescriptNn5FuAjk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDBTransactionEventMap extends StObject {
  
  var abort: Event
  
  var complete: Event
  
  var error: Event
}
object IDBTransactionEventMap {
  
  inline def apply(abort: Event, complete: Event, error: Event): IDBTransactionEventMap = {
    val __obj = js.Dynamic.literal(abort = abort.asInstanceOf[js.Any], complete = complete.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDBTransactionEventMap]
  }
  
  extension [Self <: IDBTransactionEventMap](x: Self) {
    
    inline def setAbort(value: Event): Self = StObject.set(x, "abort", value.asInstanceOf[js.Any])
    
    inline def setComplete(value: Event): Self = StObject.set(x, "complete", value.asInstanceOf[js.Any])
    
    inline def setError(value: Event): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
  }
}
