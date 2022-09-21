package typings.consumerDataStandards.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Weekdays
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * Indicates whether the tariff is applicable Monday to Friday
    */
  var weekdays: Boolean
  
  /**
    * Indicates whether the tariff is applicable Saturday and Sunday
    */
  var weekend: Boolean
}
object Weekdays {
  
  inline def apply(weekdays: Boolean, weekend: Boolean): Weekdays = {
    val __obj = js.Dynamic.literal(weekdays = weekdays.asInstanceOf[js.Any], weekend = weekend.asInstanceOf[js.Any])
    __obj.asInstanceOf[Weekdays]
  }
  
  extension [Self <: Weekdays](x: Self) {
    
    inline def setWeekdays(value: Boolean): Self = StObject.set(x, "weekdays", value.asInstanceOf[js.Any])
    
    inline def setWeekend(value: Boolean): Self = StObject.set(x, "weekend", value.asInstanceOf[js.Any])
  }
}
