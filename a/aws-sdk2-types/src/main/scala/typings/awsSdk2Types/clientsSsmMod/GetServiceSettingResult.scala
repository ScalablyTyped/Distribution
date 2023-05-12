package typings.awsSdk2Types.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetServiceSettingResult extends StObject {
  
  /**
    * The query result of the current service setting.
    */
  var ServiceSetting: js.UndefOr[typings.awsSdk2Types.clientsSsmMod.ServiceSetting] = js.undefined
}
object GetServiceSettingResult {
  
  inline def apply(): GetServiceSettingResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetServiceSettingResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetServiceSettingResult] (val x: Self) extends AnyVal {
    
    inline def setServiceSetting(value: ServiceSetting): Self = StObject.set(x, "ServiceSetting", value.asInstanceOf[js.Any])
    
    inline def setServiceSettingUndefined: Self = StObject.set(x, "ServiceSetting", js.undefined)
  }
}
