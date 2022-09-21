package typings.awsSdk.pinpointsmsvoicev2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteVoiceMessageSpendLimitOverrideResult extends StObject {
  
  /**
    * The current monthly limit, in US dollars.
    */
  var MonthlyLimit: js.UndefOr[typings.awsSdk.pinpointsmsvoicev2Mod.MonthlyLimit] = js.undefined
}
object DeleteVoiceMessageSpendLimitOverrideResult {
  
  inline def apply(): DeleteVoiceMessageSpendLimitOverrideResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteVoiceMessageSpendLimitOverrideResult]
  }
  
  extension [Self <: DeleteVoiceMessageSpendLimitOverrideResult](x: Self) {
    
    inline def setMonthlyLimit(value: MonthlyLimit): Self = StObject.set(x, "MonthlyLimit", value.asInstanceOf[js.Any])
    
    inline def setMonthlyLimitUndefined: Self = StObject.set(x, "MonthlyLimit", js.undefined)
  }
}
