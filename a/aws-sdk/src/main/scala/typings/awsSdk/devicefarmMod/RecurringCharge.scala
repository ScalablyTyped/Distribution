package typings.awsSdk.devicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecurringCharge extends StObject {
  
  /**
    * The cost of the recurring charge.
    */
  var cost: js.UndefOr[MonetaryAmount] = js.undefined
  
  /**
    * The frequency in which charges recur.
    */
  var frequency: js.UndefOr[RecurringChargeFrequency] = js.undefined
}
object RecurringCharge {
  
  inline def apply(): RecurringCharge = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecurringCharge]
  }
  
  extension [Self <: RecurringCharge](x: Self) {
    
    inline def setCost(value: MonetaryAmount): Self = StObject.set(x, "cost", value.asInstanceOf[js.Any])
    
    inline def setCostUndefined: Self = StObject.set(x, "cost", js.undefined)
    
    inline def setFrequency(value: RecurringChargeFrequency): Self = StObject.set(x, "frequency", value.asInstanceOf[js.Any])
    
    inline def setFrequencyUndefined: Self = StObject.set(x, "frequency", js.undefined)
  }
}
