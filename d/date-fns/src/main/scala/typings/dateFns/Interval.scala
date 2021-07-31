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
  
  @scala.inline
  def apply(end: Date | Double, start: Date | Double): Interval = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[Interval]
  }
  
  @scala.inline
  implicit class IntervalMutableBuilder[Self <: Interval] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnd(value: Date | Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: Date | Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}
