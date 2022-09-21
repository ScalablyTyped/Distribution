package typings.typescriptNn5FuAjk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AudioWorkletNodeEventMap extends StObject {
  
  var processorerror: Event
}
object AudioWorkletNodeEventMap {
  
  inline def apply(processorerror: Event): AudioWorkletNodeEventMap = {
    val __obj = js.Dynamic.literal(processorerror = processorerror.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioWorkletNodeEventMap]
  }
  
  extension [Self <: AudioWorkletNodeEventMap](x: Self) {
    
    inline def setProcessorerror(value: Event): Self = StObject.set(x, "processorerror", value.asInstanceOf[js.Any])
  }
}
