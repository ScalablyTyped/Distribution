package typings.awsSdk.pinpointsmsvoicev2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetVoiceMessageSpendLimitOverrideResult extends StObject {
  
  /**
    * The current monthly limit to enforce on sending voice messages.
    */
  var MonthlyLimit: js.UndefOr[typings.awsSdk.pinpointsmsvoicev2Mod.MonthlyLimit] = js.undefined
}
object SetVoiceMessageSpendLimitOverrideResult {
  
  inline def apply(): SetVoiceMessageSpendLimitOverrideResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SetVoiceMessageSpendLimitOverrideResult]
  }
  
  extension [Self <: SetVoiceMessageSpendLimitOverrideResult](x: Self) {
    
    inline def setMonthlyLimit(value: MonthlyLimit): Self = StObject.set(x, "MonthlyLimit", value.asInstanceOf[js.Any])
    
    inline def setMonthlyLimitUndefined: Self = StObject.set(x, "MonthlyLimit", js.undefined)
  }
}
