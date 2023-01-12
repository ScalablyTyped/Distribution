package typings.consumerDataStandards.bankingMod

import org.scalablytyped.runtime.StringDictionary
import typings.consumerDataStandards.anon.DayInInterval
import typings.consumerDataStandards.consumerDataStandardsStrings.AFTER
import typings.consumerDataStandards.consumerDataStandardsStrings.BEFORE
import typings.consumerDataStandards.consumerDataStandardsStrings.ON
import typings.consumerDataStandards.consumerDataStandardsStrings.ONLY
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BankingScheduledPaymentRecurrenceIntervalSchedule
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * The limit date after which no more payments should be made using this schedule. If both finalPaymentDate and paymentsRemaining are present then payments will stop according to the most constraining value. If neither field is present the payments will continue indefinitely
    */
  var finalPaymentDate: js.UndefOr[String | Null] = js.undefined
  
  /**
    * An array of interval objects defining the payment schedule.  Each entry in the array is additive, in that it adds payments to the overall payment schedule.  If multiple intervals result in a payment on the same day then only one payment will be made. Must have at least one entry
    */
  var intervals: js.Array[DayInInterval]
  
  /**
    * Enumerated field giving the treatment where a scheduled payment date is not a business day. If absent assumed to be ON.<br/>**AFTER** - If a scheduled payment date is a non-business day the payment will be made on the first business day after the scheduled payment date.<br/>**BEFORE** - If a scheduled payment date is a non-business day the payment will be made on the first business day before the scheduled payment date.<br/>**ON** - If a scheduled payment date is a non-business day the payment will be made on that day regardless.<br/>**ONLY** - Payments only occur on business days. If a scheduled payment date is a non-business day the payment will be ignored
    */
  var nonBusinessDayTreatment: js.UndefOr[AFTER | BEFORE | ON | ONLY | Null] = js.undefined
  
  /**
    * Indicates the number of payments remaining in the schedule. If both finalPaymentDate and paymentsRemaining are present then payments will stop according to the most constraining value, If neither field is present the payments will continue indefinitely
    */
  var paymentsRemaining: js.UndefOr[Double | Null] = js.undefined
}
object BankingScheduledPaymentRecurrenceIntervalSchedule {
  
  inline def apply(intervals: js.Array[DayInInterval]): BankingScheduledPaymentRecurrenceIntervalSchedule = {
    val __obj = js.Dynamic.literal(intervals = intervals.asInstanceOf[js.Any])
    __obj.asInstanceOf[BankingScheduledPaymentRecurrenceIntervalSchedule]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BankingScheduledPaymentRecurrenceIntervalSchedule] (val x: Self) extends AnyVal {
    
    inline def setFinalPaymentDate(value: String): Self = StObject.set(x, "finalPaymentDate", value.asInstanceOf[js.Any])
    
    inline def setFinalPaymentDateNull: Self = StObject.set(x, "finalPaymentDate", null)
    
    inline def setFinalPaymentDateUndefined: Self = StObject.set(x, "finalPaymentDate", js.undefined)
    
    inline def setIntervals(value: js.Array[DayInInterval]): Self = StObject.set(x, "intervals", value.asInstanceOf[js.Any])
    
    inline def setIntervalsVarargs(value: DayInInterval*): Self = StObject.set(x, "intervals", js.Array(value*))
    
    inline def setNonBusinessDayTreatment(value: AFTER | BEFORE | ON | ONLY): Self = StObject.set(x, "nonBusinessDayTreatment", value.asInstanceOf[js.Any])
    
    inline def setNonBusinessDayTreatmentNull: Self = StObject.set(x, "nonBusinessDayTreatment", null)
    
    inline def setNonBusinessDayTreatmentUndefined: Self = StObject.set(x, "nonBusinessDayTreatment", js.undefined)
    
    inline def setPaymentsRemaining(value: Double): Self = StObject.set(x, "paymentsRemaining", value.asInstanceOf[js.Any])
    
    inline def setPaymentsRemainingNull: Self = StObject.set(x, "paymentsRemaining", null)
    
    inline def setPaymentsRemainingUndefined: Self = StObject.set(x, "paymentsRemaining", js.undefined)
  }
}
