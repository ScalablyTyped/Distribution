package typings.chartJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Move extends StObject {
  
  var end: Double
  
  var move: Boolean
  
  var reverse: Boolean
  
  var start: Double
}
object Move {
  
  inline def apply(end: Double, move: Boolean, reverse: Boolean, start: Double): Move = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], move = move.asInstanceOf[js.Any], reverse = reverse.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[Move]
  }
  
  extension [Self <: Move](x: Self) {
    
    inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setMove(value: Boolean): Self = StObject.set(x, "move", value.asInstanceOf[js.Any])
    
    inline def setReverse(value: Boolean): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
    
    inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}
