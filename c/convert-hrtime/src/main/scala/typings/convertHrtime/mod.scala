package typings.convertHrtime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
  @JSImport("convert-hrtime", JSImport.Namespace)
  @js.native
  def apply(hrtime: js.Tuple2[Double, Double]): HRTime = js.native
  
  @js.native
  trait HRTime extends StObject {
    
    var milliseconds: Double = js.native
    
    var nanoseconds: Double = js.native
    
    var seconds: Double = js.native
  }
  object HRTime {
    
    @scala.inline
    def apply(milliseconds: Double, nanoseconds: Double, seconds: Double): HRTime = {
      val __obj = js.Dynamic.literal(milliseconds = milliseconds.asInstanceOf[js.Any], nanoseconds = nanoseconds.asInstanceOf[js.Any], seconds = seconds.asInstanceOf[js.Any])
      __obj.asInstanceOf[HRTime]
    }
    
    @scala.inline
    implicit class HRTimeMutableBuilder[Self <: HRTime] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMilliseconds(value: Double): Self = StObject.set(x, "milliseconds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNanoseconds(value: Double): Self = StObject.set(x, "nanoseconds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeconds(value: Double): Self = StObject.set(x, "seconds", value.asInstanceOf[js.Any])
    }
  }
}
