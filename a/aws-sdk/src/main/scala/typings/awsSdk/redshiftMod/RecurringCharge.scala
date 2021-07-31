package typings.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecurringCharge extends StObject {
  
  /**
    * The amount charged per the period of time specified by the recurring charge frequency.
    */
  var RecurringChargeAmount: js.UndefOr[Double] = js.undefined
  
  /**
    * The frequency at which the recurring charge amount is applied.
    */
  var RecurringChargeFrequency: js.UndefOr[String] = js.undefined
}
object RecurringCharge {
  
  @scala.inline
  def apply(): RecurringCharge = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecurringCharge]
  }
  
  @scala.inline
  implicit class RecurringChargeMutableBuilder[Self <: RecurringCharge] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRecurringChargeAmount(value: Double): Self = StObject.set(x, "RecurringChargeAmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecurringChargeAmountUndefined: Self = StObject.set(x, "RecurringChargeAmount", js.undefined)
    
    @scala.inline
    def setRecurringChargeFrequency(value: String): Self = StObject.set(x, "RecurringChargeFrequency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecurringChargeFrequencyUndefined: Self = StObject.set(x, "RecurringChargeFrequency", js.undefined)
  }
}
