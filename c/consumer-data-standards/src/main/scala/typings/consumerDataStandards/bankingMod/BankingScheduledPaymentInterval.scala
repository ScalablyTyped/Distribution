package typings.consumerDataStandards.bankingMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BankingScheduledPaymentInterval
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * Uses an interval to define the ordinal day within the interval defined by the interval field on which the payment occurs. If the resulting duration is 0 days in length or larger than the number of days in the interval then the payment will occur on the last day of the interval. A duration of 1 day indicates the first day of the interval. If absent the assumed value is P1D. Formatted according to [ISO 8601 Durations](https://en.wikipedia.org/wiki/ISO_8601#Durations) (excludes recurrence syntax) with components less than a day in length ignored. The first day of a week is considered to be Monday.
    */
  var dayInInterval: js.UndefOr[String | Null] = js.undefined
  
  /**
    * An interval for the payment. Formatted according to [ISO 8601 Durations](https://en.wikipedia.org/wiki/ISO_8601#Durations)  (excludes recurrence syntax) with components less than a day in length ignored. This duration defines the period between payments starting with nextPaymentDate
    */
  var interval: String
}
object BankingScheduledPaymentInterval {
  
  inline def apply(interval: String): BankingScheduledPaymentInterval = {
    val __obj = js.Dynamic.literal(interval = interval.asInstanceOf[js.Any])
    __obj.asInstanceOf[BankingScheduledPaymentInterval]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BankingScheduledPaymentInterval] (val x: Self) extends AnyVal {
    
    inline def setDayInInterval(value: String): Self = StObject.set(x, "dayInInterval", value.asInstanceOf[js.Any])
    
    inline def setDayInIntervalNull: Self = StObject.set(x, "dayInInterval", null)
    
    inline def setDayInIntervalUndefined: Self = StObject.set(x, "dayInInterval", js.undefined)
    
    inline def setInterval(value: String): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
  }
}
