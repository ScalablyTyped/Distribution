package typings.baidumapWebSdk.BMap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PredictDate extends StObject {
  
  var hour: Double = js.native
  
  var weekday: Double = js.native
}
object PredictDate {
  
  @scala.inline
  def apply(hour: Double, weekday: Double): PredictDate = {
    val __obj = js.Dynamic.literal(hour = hour.asInstanceOf[js.Any], weekday = weekday.asInstanceOf[js.Any])
    __obj.asInstanceOf[PredictDate]
  }
  
  @scala.inline
  implicit class PredictDateMutableBuilder[Self <: PredictDate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHour(value: Double): Self = StObject.set(x, "hour", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeekday(value: Double): Self = StObject.set(x, "weekday", value.asInstanceOf[js.Any])
  }
}
