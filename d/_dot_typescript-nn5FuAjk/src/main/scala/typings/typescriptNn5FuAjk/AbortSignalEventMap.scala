package typings.typescriptNn5FuAjk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AbortSignalEventMap extends StObject {
  
  var abort: Event
}
object AbortSignalEventMap {
  
  inline def apply(abort: Event): AbortSignalEventMap = {
    val __obj = js.Dynamic.literal(abort = abort.asInstanceOf[js.Any])
    __obj.asInstanceOf[AbortSignalEventMap]
  }
  
  extension [Self <: AbortSignalEventMap](x: Self) {
    
    inline def setAbort(value: Event): Self = StObject.set(x, "abort", value.asInstanceOf[js.Any])
  }
}
