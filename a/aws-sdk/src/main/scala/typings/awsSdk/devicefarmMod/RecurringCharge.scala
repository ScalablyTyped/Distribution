package typings.awsSdk.devicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RecurringCharge extends StObject {
  
  /**
    * The cost of the recurring charge.
    */
  var cost: js.UndefOr[MonetaryAmount] = js.native
  
  /**
    * The frequency in which charges recur.
    */
  var frequency: js.UndefOr[RecurringChargeFrequency] = js.native
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
    def setCost(value: MonetaryAmount): Self = StObject.set(x, "cost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCostUndefined: Self = StObject.set(x, "cost", js.undefined)
    
    @scala.inline
    def setFrequency(value: RecurringChargeFrequency): Self = StObject.set(x, "frequency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrequencyUndefined: Self = StObject.set(x, "frequency", js.undefined)
  }
}
