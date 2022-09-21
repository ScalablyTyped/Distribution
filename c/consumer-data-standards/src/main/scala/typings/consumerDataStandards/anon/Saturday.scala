package typings.consumerDataStandards.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Saturday
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * Indicates the demand tariff is applicable on Saturdays
    */
  var saturday: Boolean
  
  /**
    * Indicates the demand tariff is applicable on Sundays
    */
  var sunday: Boolean
  
  /**
    * Indicates the demand tariff is applicable on weekdays
    */
  var weekdays: Boolean
}
object Saturday {
  
  inline def apply(saturday: Boolean, sunday: Boolean, weekdays: Boolean): Saturday = {
    val __obj = js.Dynamic.literal(saturday = saturday.asInstanceOf[js.Any], sunday = sunday.asInstanceOf[js.Any], weekdays = weekdays.asInstanceOf[js.Any])
    __obj.asInstanceOf[Saturday]
  }
  
  extension [Self <: Saturday](x: Self) {
    
    inline def setSaturday(value: Boolean): Self = StObject.set(x, "saturday", value.asInstanceOf[js.Any])
    
    inline def setSunday(value: Boolean): Self = StObject.set(x, "sunday", value.asInstanceOf[js.Any])
    
    inline def setWeekdays(value: Boolean): Self = StObject.set(x, "weekdays", value.asInstanceOf[js.Any])
  }
}
