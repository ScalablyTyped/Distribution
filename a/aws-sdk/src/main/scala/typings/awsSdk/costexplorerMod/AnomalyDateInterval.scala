package typings.awsSdk.costexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnomalyDateInterval extends StObject {
  
  /**
    * The last date an anomaly was observed. 
    */
  var EndDate: js.UndefOr[YearMonthDay] = js.undefined
  
  /**
    * The first date an anomaly was observed. 
    */
  var StartDate: YearMonthDay
}
object AnomalyDateInterval {
  
  inline def apply(StartDate: YearMonthDay): AnomalyDateInterval = {
    val __obj = js.Dynamic.literal(StartDate = StartDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnomalyDateInterval]
  }
  
  extension [Self <: AnomalyDateInterval](x: Self) {
    
    inline def setEndDate(value: YearMonthDay): Self = StObject.set(x, "EndDate", value.asInstanceOf[js.Any])
    
    inline def setEndDateUndefined: Self = StObject.set(x, "EndDate", js.undefined)
    
    inline def setStartDate(value: YearMonthDay): Self = StObject.set(x, "StartDate", value.asInstanceOf[js.Any])
  }
}
