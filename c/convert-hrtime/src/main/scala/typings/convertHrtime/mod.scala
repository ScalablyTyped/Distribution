package typings.convertHrtime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
  Convert the result of [`process.hrtime()`](https://nodejs.org/api/process.html#process_process_hrtime_time) to seconds, milliseconds, nanoseconds.
  @example
  ```
  import convertHrtime = require('convert-hrtime');
  convertHrtime(process.hrtime(process.hrtime()));
  //=> {seconds: 0.000002399, milliseconds: 0.002399, nanoseconds: 2399}
  ```
  */
  inline def apply(hrtime: js.Tuple2[Double, Double]): HRTime = ^.asInstanceOf[js.Dynamic].apply(hrtime.asInstanceOf[js.Any]).asInstanceOf[HRTime]
  
  @JSImport("convert-hrtime", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait HRTime extends StObject {
    
    var milliseconds: Double
    
    var nanoseconds: Double
    
    var seconds: Double
  }
  object HRTime {
    
    inline def apply(milliseconds: Double, nanoseconds: Double, seconds: Double): HRTime = {
      val __obj = js.Dynamic.literal(milliseconds = milliseconds.asInstanceOf[js.Any], nanoseconds = nanoseconds.asInstanceOf[js.Any], seconds = seconds.asInstanceOf[js.Any])
      __obj.asInstanceOf[HRTime]
    }
    
    extension [Self <: HRTime](x: Self) {
      
      inline def setMilliseconds(value: Double): Self = StObject.set(x, "milliseconds", value.asInstanceOf[js.Any])
      
      inline def setNanoseconds(value: Double): Self = StObject.set(x, "nanoseconds", value.asInstanceOf[js.Any])
      
      inline def setSeconds(value: Double): Self = StObject.set(x, "seconds", value.asInstanceOf[js.Any])
    }
  }
}
