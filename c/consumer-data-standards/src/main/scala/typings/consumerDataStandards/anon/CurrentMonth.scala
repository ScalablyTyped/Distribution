package typings.consumerDataStandards.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CurrentMonth
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * Percentage availability of the CDR platform so far for the current calendar month. 0.0 means 0%. 1.0 means 100%.
    */
  var currentMonth: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Percentage availability of the CDR platform for previous calendar months. The first element indicates the last month and so on. A maximum of twelve entries is required if available. 0.0 means 0%. 1.0 means 100%.
    */
  var previousMonths: js.UndefOr[js.Array[Double] | Null] = js.undefined
}
object CurrentMonth {
  
  inline def apply(): CurrentMonth = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CurrentMonth]
  }
  
  extension [Self <: CurrentMonth](x: Self) {
    
    inline def setCurrentMonth(value: Double): Self = StObject.set(x, "currentMonth", value.asInstanceOf[js.Any])
    
    inline def setCurrentMonthNull: Self = StObject.set(x, "currentMonth", null)
    
    inline def setCurrentMonthUndefined: Self = StObject.set(x, "currentMonth", js.undefined)
    
    inline def setPreviousMonths(value: js.Array[Double]): Self = StObject.set(x, "previousMonths", value.asInstanceOf[js.Any])
    
    inline def setPreviousMonthsNull: Self = StObject.set(x, "previousMonths", null)
    
    inline def setPreviousMonthsUndefined: Self = StObject.set(x, "previousMonths", js.undefined)
    
    inline def setPreviousMonthsVarargs(value: Double*): Self = StObject.set(x, "previousMonths", js.Array(value*))
  }
}
