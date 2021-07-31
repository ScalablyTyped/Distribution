package typings.awsSdk.costexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnomalyDateInterval extends StObject {
  
  /**
    *  The last date an anomaly was observed. 
    */
  var EndDate: js.UndefOr[YearMonthDay] = js.undefined
  
  /**
    *  The first date an anomaly was observed. 
    */
  var StartDate: YearMonthDay
}
object AnomalyDateInterval {
  
  @scala.inline
  def apply(StartDate: YearMonthDay): AnomalyDateInterval = {
    val __obj = js.Dynamic.literal(StartDate = StartDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnomalyDateInterval]
  }
  
  @scala.inline
  implicit class AnomalyDateIntervalMutableBuilder[Self <: AnomalyDateInterval] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndDate(value: YearMonthDay): Self = StObject.set(x, "EndDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndDateUndefined: Self = StObject.set(x, "EndDate", js.undefined)
    
    @scala.inline
    def setStartDate(value: YearMonthDay): Self = StObject.set(x, "StartDate", value.asInstanceOf[js.Any])
  }
}
