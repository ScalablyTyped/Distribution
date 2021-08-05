package typings.dateFns

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Type Aliases
trait Interval extends StObject {
  
  var end: Date | Double
  
  var start: Date | Double
}
object Interval {
  
  inline def apply(end: Date | Double, start: Date | Double): Interval = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[Interval]
  }
  
  extension [Self <: Interval](x: Self) {
    
    inline def setEnd(value: Date | Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setStart(value: Date | Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}
