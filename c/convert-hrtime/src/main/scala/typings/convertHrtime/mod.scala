package typings.convertHrtime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("convert-hrtime", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(hrtime: js.BigInt): HighResolutionTime = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hrtime.asInstanceOf[js.Any]).asInstanceOf[HighResolutionTime]
  
  trait HighResolutionTime extends StObject {
    
    var milliseconds: Double
    
    var nanoseconds: js.BigInt
    
    var seconds: Double
  }
  object HighResolutionTime {
    
    inline def apply(milliseconds: Double, nanoseconds: js.BigInt, seconds: Double): HighResolutionTime = {
      val __obj = js.Dynamic.literal(milliseconds = milliseconds.asInstanceOf[js.Any], nanoseconds = nanoseconds.asInstanceOf[js.Any], seconds = seconds.asInstanceOf[js.Any])
      __obj.asInstanceOf[HighResolutionTime]
    }
    
    extension [Self <: HighResolutionTime](x: Self) {
      
      inline def setMilliseconds(value: Double): Self = StObject.set(x, "milliseconds", value.asInstanceOf[js.Any])
      
      inline def setNanoseconds(value: js.BigInt): Self = StObject.set(x, "nanoseconds", value.asInstanceOf[js.Any])
      
      inline def setSeconds(value: Double): Self = StObject.set(x, "seconds", value.asInstanceOf[js.Any])
    }
  }
}
