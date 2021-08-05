package typings.awsSdk.cognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NewDeviceMetadataType extends StObject {
  
  /**
    * The device group key.
    */
  var DeviceGroupKey: js.UndefOr[StringType] = js.undefined
  
  /**
    * The device key.
    */
  var DeviceKey: js.UndefOr[DeviceKeyType] = js.undefined
}
object NewDeviceMetadataType {
  
  inline def apply(): NewDeviceMetadataType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NewDeviceMetadataType]
  }
  
  extension [Self <: NewDeviceMetadataType](x: Self) {
    
    inline def setDeviceGroupKey(value: StringType): Self = StObject.set(x, "DeviceGroupKey", value.asInstanceOf[js.Any])
    
    inline def setDeviceGroupKeyUndefined: Self = StObject.set(x, "DeviceGroupKey", js.undefined)
    
    inline def setDeviceKey(value: DeviceKeyType): Self = StObject.set(x, "DeviceKey", value.asInstanceOf[js.Any])
    
    inline def setDeviceKeyUndefined: Self = StObject.set(x, "DeviceKey", js.undefined)
  }
}
