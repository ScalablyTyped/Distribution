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
  
  @scala.inline
  def apply(): NewDeviceMetadataType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NewDeviceMetadataType]
  }
  
  @scala.inline
  implicit class NewDeviceMetadataTypeMutableBuilder[Self <: NewDeviceMetadataType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeviceGroupKey(value: StringType): Self = StObject.set(x, "DeviceGroupKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceGroupKeyUndefined: Self = StObject.set(x, "DeviceGroupKey", js.undefined)
    
    @scala.inline
    def setDeviceKey(value: DeviceKeyType): Self = StObject.set(x, "DeviceKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceKeyUndefined: Self = StObject.set(x, "DeviceKey", js.undefined)
  }
}
