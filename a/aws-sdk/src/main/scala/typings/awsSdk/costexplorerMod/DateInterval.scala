package typings.awsSdk.costexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DateInterval extends StObject {
  
  /**
    * The end of the time period that you want the usage and costs for. The end date is exclusive. For example, if end is 2017-05-01, AWS retrieves cost and usage data from the start date up to, but not including, 2017-05-01.
    */
  var End: YearMonthDay
  
  /**
    * The beginning of the time period that you want the usage and costs for. The start date is inclusive. For example, if start is 2017-01-01, AWS retrieves cost and usage data starting at 2017-01-01 up to the end date.
    */
  var Start: YearMonthDay
}
object DateInterval {
  
  @scala.inline
  def apply(End: YearMonthDay, Start: YearMonthDay): DateInterval = {
    val __obj = js.Dynamic.literal(End = End.asInstanceOf[js.Any], Start = Start.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateInterval]
  }
  
  @scala.inline
  implicit class DateIntervalMutableBuilder[Self <: DateInterval] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnd(value: YearMonthDay): Self = StObject.set(x, "End", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: YearMonthDay): Self = StObject.set(x, "Start", value.asInstanceOf[js.Any])
  }
}
