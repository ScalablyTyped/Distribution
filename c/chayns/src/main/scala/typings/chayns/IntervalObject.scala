package typings.chayns

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IntervalObject extends StObject {
  
  /**
    * end of the interval
    * date/timestamp (in seconds)
    */
  var end: js.Date | Double
  
  /**
    * start of the interval
    * date/timestamp (in seconds)
    */
  var start: js.Date | Double
}
object IntervalObject {
  
  inline def apply(end: js.Date | Double, start: js.Date | Double): IntervalObject = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntervalObject]
  }
  
  extension [Self <: IntervalObject](x: Self) {
    
    inline def setEnd(value: js.Date | Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setStart(value: js.Date | Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}
