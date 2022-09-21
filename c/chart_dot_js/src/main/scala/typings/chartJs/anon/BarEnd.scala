package typings.chartJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BarEnd extends StObject {
  
  var barEnd: Double
  
  var barStart: Double
  
  var end: Double
  
  var max: Double
  
  var min: Double
  
  var start: Double
}
object BarEnd {
  
  inline def apply(barEnd: Double, barStart: Double, end: Double, max: Double, min: Double, start: Double): BarEnd = {
    val __obj = js.Dynamic.literal(barEnd = barEnd.asInstanceOf[js.Any], barStart = barStart.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[BarEnd]
  }
  
  extension [Self <: BarEnd](x: Self) {
    
    inline def setBarEnd(value: Double): Self = StObject.set(x, "barEnd", value.asInstanceOf[js.Any])
    
    inline def setBarStart(value: Double): Self = StObject.set(x, "barStart", value.asInstanceOf[js.Any])
    
    inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}
