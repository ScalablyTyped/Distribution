package typings.consumerDataStandards.bankingMod

import org.scalablytyped.runtime.StringDictionary
import typings.consumerDataStandards.anon.DictkDescription
import typings.consumerDataStandards.anon.FinalPaymentDate
import typings.consumerDataStandards.anon.Interval
import typings.consumerDataStandards.anon.PaymentDate
import typings.consumerDataStandards.consumerDataStandardsStrings.eventBased
import typings.consumerDataStandards.consumerDataStandardsStrings.intervalSchedule
import typings.consumerDataStandards.consumerDataStandardsStrings.lastWeekDay
import typings.consumerDataStandards.consumerDataStandardsStrings.onceOff
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BankingScheduledPaymentRecurrence
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * Indicates that the schedule of payments is defined according to an external event that cannot be predetermined. Mandatory if recurrenceUType is set to eventBased
    */
  var eventBased: js.UndefOr[DictkDescription] = js.undefined
  
  /**
    * Indicates that the schedule of payments is defined by a series of intervals. Mandatory if recurrenceUType is set to intervalSchedule
    */
  var intervalSchedule: js.UndefOr[FinalPaymentDate] = js.undefined
  
  /**
    * Indicates that the schedule of payments is defined according to the last occurrence of a specific weekday in an interval. Mandatory if recurrenceUType is set to lastWeekDay
    */
  var lastWeekDay: js.UndefOr[Interval] = js.undefined
  
  /**
    * The date of the next payment under the recurrence schedule
    */
  var nextPaymentDate: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Indicates that the payment is a once off payment on a specific future date. Mandatory if recurrenceUType is set to onceOff
    */
  var onceOff: js.UndefOr[PaymentDate] = js.undefined
  
  /**
    * The type of recurrence used to define the schedule
    */
  var recurrenceUType: eventBased | intervalSchedule | lastWeekDay | onceOff
}
object BankingScheduledPaymentRecurrence {
  
  inline def apply(recurrenceUType: eventBased | intervalSchedule | lastWeekDay | onceOff): BankingScheduledPaymentRecurrence = {
    val __obj = js.Dynamic.literal(recurrenceUType = recurrenceUType.asInstanceOf[js.Any])
    __obj.asInstanceOf[BankingScheduledPaymentRecurrence]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BankingScheduledPaymentRecurrence] (val x: Self) extends AnyVal {
    
    inline def setEventBased(value: DictkDescription): Self = StObject.set(x, "eventBased", value.asInstanceOf[js.Any])
    
    inline def setEventBasedUndefined: Self = StObject.set(x, "eventBased", js.undefined)
    
    inline def setIntervalSchedule(value: FinalPaymentDate): Self = StObject.set(x, "intervalSchedule", value.asInstanceOf[js.Any])
    
    inline def setIntervalScheduleUndefined: Self = StObject.set(x, "intervalSchedule", js.undefined)
    
    inline def setLastWeekDay(value: Interval): Self = StObject.set(x, "lastWeekDay", value.asInstanceOf[js.Any])
    
    inline def setLastWeekDayUndefined: Self = StObject.set(x, "lastWeekDay", js.undefined)
    
    inline def setNextPaymentDate(value: String): Self = StObject.set(x, "nextPaymentDate", value.asInstanceOf[js.Any])
    
    inline def setNextPaymentDateNull: Self = StObject.set(x, "nextPaymentDate", null)
    
    inline def setNextPaymentDateUndefined: Self = StObject.set(x, "nextPaymentDate", js.undefined)
    
    inline def setOnceOff(value: PaymentDate): Self = StObject.set(x, "onceOff", value.asInstanceOf[js.Any])
    
    inline def setOnceOffUndefined: Self = StObject.set(x, "onceOff", js.undefined)
    
    inline def setRecurrenceUType(value: eventBased | intervalSchedule | lastWeekDay | onceOff): Self = StObject.set(x, "recurrenceUType", value.asInstanceOf[js.Any])
  }
}
