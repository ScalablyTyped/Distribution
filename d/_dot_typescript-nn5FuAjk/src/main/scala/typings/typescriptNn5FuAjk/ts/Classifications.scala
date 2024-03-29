package typings.typescriptNn5FuAjk.ts

import typings.typescriptNn5FuAjk.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Classifications extends StObject {
  
  var endOfLineState: EndOfLineState
  
  var spans: Array[Double]
}
object Classifications {
  
  inline def apply(endOfLineState: EndOfLineState, spans: Array[Double]): Classifications = {
    val __obj = js.Dynamic.literal(endOfLineState = endOfLineState.asInstanceOf[js.Any], spans = spans.asInstanceOf[js.Any])
    __obj.asInstanceOf[Classifications]
  }
  
  extension [Self <: Classifications](x: Self) {
    
    inline def setEndOfLineState(value: EndOfLineState): Self = StObject.set(x, "endOfLineState", value.asInstanceOf[js.Any])
    
    inline def setSpans(value: Array[Double]): Self = StObject.set(x, "spans", value.asInstanceOf[js.Any])
  }
}
