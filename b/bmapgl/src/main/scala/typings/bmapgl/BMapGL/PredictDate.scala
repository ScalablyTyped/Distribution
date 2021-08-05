package typings.bmapgl.BMapGL

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PredictDate extends StObject {
  
  var hour: Double
  
  var weekday: Double
}
object PredictDate {
  
  inline def apply(hour: Double, weekday: Double): PredictDate = {
    val __obj = js.Dynamic.literal(hour = hour.asInstanceOf[js.Any], weekday = weekday.asInstanceOf[js.Any])
    __obj.asInstanceOf[PredictDate]
  }
  
  extension [Self <: PredictDate](x: Self) {
    
    inline def setHour(value: Double): Self = StObject.set(x, "hour", value.asInstanceOf[js.Any])
    
    inline def setWeekday(value: Double): Self = StObject.set(x, "weekday", value.asInstanceOf[js.Any])
  }
}
