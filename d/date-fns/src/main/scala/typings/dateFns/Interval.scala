package typings.dateFns

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Type Aliases
trait Interval extends StObject {
  
  var end: js.Date | Double
  
  var start: js.Date | Double
}
object Interval {
  
  inline def apply(end: js.Date | Double, start: js.Date | Double): Interval = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[Interval]
  }
  
  extension [Self <: Interval](x: Self) {
    
    inline def setEnd(value: js.Date | Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setStart(value: js.Date | Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}
