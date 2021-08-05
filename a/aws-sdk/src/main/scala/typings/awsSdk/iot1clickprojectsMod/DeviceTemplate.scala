package typings.awsSdk.iot1clickprojectsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceTemplate extends StObject {
  
  /**
    * An optional Lambda function to invoke instead of the default Lambda function provided by the placement template.
    */
  var callbackOverrides: js.UndefOr[DeviceCallbackOverrideMap] = js.undefined
  
  /**
    * The device type, which currently must be "button".
    */
  var deviceType: js.UndefOr[DeviceType] = js.undefined
}
object DeviceTemplate {
  
  inline def apply(): DeviceTemplate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceTemplate]
  }
  
  extension [Self <: DeviceTemplate](x: Self) {
    
    inline def setCallbackOverrides(value: DeviceCallbackOverrideMap): Self = StObject.set(x, "callbackOverrides", value.asInstanceOf[js.Any])
    
    inline def setCallbackOverridesUndefined: Self = StObject.set(x, "callbackOverrides", js.undefined)
    
    inline def setDeviceType(value: DeviceType): Self = StObject.set(x, "deviceType", value.asInstanceOf[js.Any])
    
    inline def setDeviceTypeUndefined: Self = StObject.set(x, "deviceType", js.undefined)
  }
}
