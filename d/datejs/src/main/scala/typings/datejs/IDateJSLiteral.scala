package typings.datejs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Defines a structure to be used in the add and set instance methods */
@js.native
trait IDateJSLiteral extends StObject {
  
  var days: Double = js.native
  
  var hours: Double = js.native
  
  var milliseconds: Double = js.native
  
  var minutes: Double = js.native
  
  var months: Double = js.native
  
  var seconds: Double = js.native
  
  var years: Double = js.native
}
object IDateJSLiteral {
  
  @scala.inline
  def apply(
    days: Double,
    hours: Double,
    milliseconds: Double,
    minutes: Double,
    months: Double,
    seconds: Double,
    years: Double
  ): IDateJSLiteral = {
    val __obj = js.Dynamic.literal(days = days.asInstanceOf[js.Any], hours = hours.asInstanceOf[js.Any], milliseconds = milliseconds.asInstanceOf[js.Any], minutes = minutes.asInstanceOf[js.Any], months = months.asInstanceOf[js.Any], seconds = seconds.asInstanceOf[js.Any], years = years.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDateJSLiteral]
  }
  
  @scala.inline
  implicit class IDateJSLiteralMutableBuilder[Self <: IDateJSLiteral] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDays(value: Double): Self = StObject.set(x, "days", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHours(value: Double): Self = StObject.set(x, "hours", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMilliseconds(value: Double): Self = StObject.set(x, "milliseconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinutes(value: Double): Self = StObject.set(x, "minutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonths(value: Double): Self = StObject.set(x, "months", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeconds(value: Double): Self = StObject.set(x, "seconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYears(value: Double): Self = StObject.set(x, "years", value.asInstanceOf[js.Any])
  }
}
