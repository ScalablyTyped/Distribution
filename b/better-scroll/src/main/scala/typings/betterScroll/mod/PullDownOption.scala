package typings.betterScroll.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PullDownOption extends StObject {
  
  var stop: Double
  
  var threshold: Double
}
object PullDownOption {
  
  inline def apply(stop: Double, threshold: Double): PullDownOption = {
    val __obj = js.Dynamic.literal(stop = stop.asInstanceOf[js.Any], threshold = threshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[PullDownOption]
  }
  
  extension [Self <: PullDownOption](x: Self) {
    
    inline def setStop(value: Double): Self = StObject.set(x, "stop", value.asInstanceOf[js.Any])
    
    inline def setThreshold(value: Double): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
  }
}
