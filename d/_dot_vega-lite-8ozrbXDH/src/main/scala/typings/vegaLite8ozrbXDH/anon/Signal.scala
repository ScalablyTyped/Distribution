package typings.vegaLite8ozrbXDH.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Signal extends StObject {
  
  var signal: String
}
object Signal {
  
  inline def apply(signal: String): Signal = {
    val __obj = js.Dynamic.literal(signal = signal.asInstanceOf[js.Any])
    __obj.asInstanceOf[Signal]
  }
  
  extension [Self <: Signal](x: Self) {
    
    inline def setSignal(value: String): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
  }
}
