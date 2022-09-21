package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResetServiceSettingResult extends StObject {
  
  /**
    * The current, effective service setting after calling the ResetServiceSetting API operation.
    */
  var ServiceSetting: js.UndefOr[typings.awsSdk.ssmMod.ServiceSetting] = js.undefined
}
object ResetServiceSettingResult {
  
  inline def apply(): ResetServiceSettingResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResetServiceSettingResult]
  }
  
  extension [Self <: ResetServiceSettingResult](x: Self) {
    
    inline def setServiceSetting(value: ServiceSetting): Self = StObject.set(x, "ServiceSetting", value.asInstanceOf[js.Any])
    
    inline def setServiceSettingUndefined: Self = StObject.set(x, "ServiceSetting", js.undefined)
  }
}
