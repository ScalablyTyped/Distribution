package typings.consumerDataStandards.anon

import org.scalablytyped.runtime.StringDictionary
import typings.consumerDataStandards.consumerDataStandardsStrings.AFTER
import typings.consumerDataStandards.consumerDataStandardsStrings.BEFORE
import typings.consumerDataStandards.consumerDataStandardsStrings.FRI
import typings.consumerDataStandards.consumerDataStandardsStrings.MON
import typings.consumerDataStandards.consumerDataStandardsStrings.ON
import typings.consumerDataStandards.consumerDataStandardsStrings.ONLY
import typings.consumerDataStandards.consumerDataStandardsStrings.SAT
import typings.consumerDataStandards.consumerDataStandardsStrings.SUN
import typings.consumerDataStandards.consumerDataStandardsStrings.THU
import typings.consumerDataStandards.consumerDataStandardsStrings.TUE
import typings.consumerDataStandards.consumerDataStandardsStrings.WED
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Interval
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * The limit date after which no more payments should be made using this schedule. If both finalPaymentDate and paymentsRemaining are present then payments will stop according to the most constraining value. If neither field is present the payments will continue indefinitely
    */
  var finalPaymentDate: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The interval for the payment. Formatted according to [ISO 8601 Durations](https://en.wikipedia.org/wiki/ISO_8601#Durations) (excludes recurrence syntax) with components less than a day in length ignored. This duration defines the period between payments starting with nextPaymentDate
    */
  var interval: String
  
  /**
    * The weekDay specified. The payment will occur on the last occurrence of this weekday in the interval.
    */
  var lastWeekDay: FRI | MON | SAT | SUN | THU | TUE | WED
  
  /**
    * Enumerated field giving the treatment where a scheduled payment date is not a business day. If absent assumed to be ON.<br/>**AFTER** - If a scheduled payment date is a non-business day the payment will be made on the first business day after the scheduled payment date.<br/>**BEFORE** - If a scheduled payment date is a non-business day the payment will be made on the first business day before the scheduled payment date.<br/>**ON** - If a scheduled payment date is a non-business day the payment will be made on that day regardless.<br/>**ONLY** - Payments only occur on business days. If a scheduled payment date is a non-business day the payment will be ignored
    */
  var nonBusinessDayTreatment: js.UndefOr[AFTER | BEFORE | ON | ONLY | Null] = js.undefined
  
  /**
    * Indicates the number of payments remaining in the schedule. If both finalPaymentDate and paymentsRemaining are present then payments will stop according to the most constraining value. If neither field is present the payments will continue indefinitely
    */
  var paymentsRemaining: js.UndefOr[Double | Null] = js.undefined
}
object Interval {
  
  inline def apply(interval: String, lastWeekDay: FRI | MON | SAT | SUN | THU | TUE | WED): Interval = {
    val __obj = js.Dynamic.literal(interval = interval.asInstanceOf[js.Any], lastWeekDay = lastWeekDay.asInstanceOf[js.Any])
    __obj.asInstanceOf[Interval]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Interval] (val x: Self) extends AnyVal {
    
    inline def setFinalPaymentDate(value: String): Self = StObject.set(x, "finalPaymentDate", value.asInstanceOf[js.Any])
    
    inline def setFinalPaymentDateNull: Self = StObject.set(x, "finalPaymentDate", null)
    
    inline def setFinalPaymentDateUndefined: Self = StObject.set(x, "finalPaymentDate", js.undefined)
    
    inline def setInterval(value: String): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    
    inline def setLastWeekDay(value: FRI | MON | SAT | SUN | THU | TUE | WED): Self = StObject.set(x, "lastWeekDay", value.asInstanceOf[js.Any])
    
    inline def setNonBusinessDayTreatment(value: AFTER | BEFORE | ON | ONLY): Self = StObject.set(x, "nonBusinessDayTreatment", value.asInstanceOf[js.Any])
    
    inline def setNonBusinessDayTreatmentNull: Self = StObject.set(x, "nonBusinessDayTreatment", null)
    
    inline def setNonBusinessDayTreatmentUndefined: Self = StObject.set(x, "nonBusinessDayTreatment", js.undefined)
    
    inline def setPaymentsRemaining(value: Double): Self = StObject.set(x, "paymentsRemaining", value.asInstanceOf[js.Any])
    
    inline def setPaymentsRemainingNull: Self = StObject.set(x, "paymentsRemaining", null)
    
    inline def setPaymentsRemainingUndefined: Self = StObject.set(x, "paymentsRemaining", js.undefined)
  }
}
