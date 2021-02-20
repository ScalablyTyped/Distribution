package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RecurringCharge extends StObject {
  
  /**
    * The amount of the recurring charge.
    */
  var Amount: js.UndefOr[Double] = js.native
  
  /**
    * The frequency of the recurring charge.
    */
  var Frequency: js.UndefOr[RecurringChargeFrequency] = js.native
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
    def setAmount(value: Double): Self = StObject.set(x, "Amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAmountUndefined: Self = StObject.set(x, "Amount", js.undefined)
    
    @scala.inline
    def setFrequency(value: RecurringChargeFrequency): Self = StObject.set(x, "Frequency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrequencyUndefined: Self = StObject.set(x, "Frequency", js.undefined)
  }
}
