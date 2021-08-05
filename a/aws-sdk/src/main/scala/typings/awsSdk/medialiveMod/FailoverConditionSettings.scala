package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FailoverConditionSettings extends StObject {
  
  /**
    * MediaLive will perform a failover if content is not detected in this input for the specified period.
    */
  var InputLossSettings: js.UndefOr[InputLossFailoverSettings] = js.undefined
}
object FailoverConditionSettings {
  
  inline def apply(): FailoverConditionSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FailoverConditionSettings]
  }
  
  extension [Self <: FailoverConditionSettings](x: Self) {
    
    inline def setInputLossSettings(value: InputLossFailoverSettings): Self = StObject.set(x, "InputLossSettings", value.asInstanceOf[js.Any])
    
    inline def setInputLossSettingsUndefined: Self = StObject.set(x, "InputLossSettings", js.undefined)
  }
}
