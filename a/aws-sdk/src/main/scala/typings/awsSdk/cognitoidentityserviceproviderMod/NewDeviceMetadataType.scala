package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NewDeviceMetadataType extends js.Object {
  
  /**
    * The device group key.
    */
  var DeviceGroupKey: js.UndefOr[StringType] = js.native
  
  /**
    * The device key.
    */
  var DeviceKey: js.UndefOr[DeviceKeyType] = js.native
}
object NewDeviceMetadataType {
  
  @scala.inline
  def apply(): NewDeviceMetadataType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NewDeviceMetadataType]
  }
  
  @scala.inline
  implicit class NewDeviceMetadataTypeOps[Self <: NewDeviceMetadataType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDeviceGroupKey(value: StringType): Self = this.set("DeviceGroupKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceGroupKey: Self = this.set("DeviceGroupKey", js.undefined)
    
    @scala.inline
    def setDeviceKey(value: DeviceKeyType): Self = this.set("DeviceKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceKey: Self = this.set("DeviceKey", js.undefined)
  }
}
