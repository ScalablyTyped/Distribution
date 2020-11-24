package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateInputDeviceResponse extends js.Object {
  
  /**
    * The unique ARN of the input device.
    */
  var Arn: js.UndefOr[string] = js.native
  
  /**
    * The state of the connection between the input device and AWS.
    */
  var ConnectionState: js.UndefOr[InputDeviceConnectionState] = js.native
  
  /**
    * The status of the action to synchronize the device configuration. If you change the configuration of the input device (for example, the maximum bitrate), MediaLive sends the new data to the device. The device might not update itself immediately. SYNCED means the device has updated its configuration. SYNCING means that it has not updated its configuration.
    */
  var DeviceSettingsSyncState: js.UndefOr[typings.awsSdk.medialiveMod.DeviceSettingsSyncState] = js.native
  
  /**
    * The status of software on the input device.
    */
  var DeviceUpdateStatus: js.UndefOr[typings.awsSdk.medialiveMod.DeviceUpdateStatus] = js.native
  
  /**
    * Settings that describe an input device that is type HD.
    */
  var HdDeviceSettings: js.UndefOr[InputDeviceHdSettings] = js.native
  
  /**
    * The unique ID of the input device.
    */
  var Id: js.UndefOr[string] = js.native
  
  /**
    * The network MAC address of the input device.
    */
  var MacAddress: js.UndefOr[string] = js.native
  
  /**
    * A name that you specify for the input device.
    */
  var Name: js.UndefOr[string] = js.native
  
  /**
    * The network settings for the input device.
    */
  var NetworkSettings: js.UndefOr[InputDeviceNetworkSettings] = js.native
  
  /**
    * The unique serial number of the input device.
    */
  var SerialNumber: js.UndefOr[string] = js.native
  
  /**
    * The type of the input device.
    */
  var Type: js.UndefOr[InputDeviceType] = js.native
}
object UpdateInputDeviceResponse {
  
  @scala.inline
  def apply(): UpdateInputDeviceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateInputDeviceResponse]
  }
  
  @scala.inline
  implicit class UpdateInputDeviceResponseOps[Self <: UpdateInputDeviceResponse] (val x: Self) extends AnyVal {
    
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
    def setArn(value: string): Self = this.set("Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArn: Self = this.set("Arn", js.undefined)
    
    @scala.inline
    def setConnectionState(value: InputDeviceConnectionState): Self = this.set("ConnectionState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectionState: Self = this.set("ConnectionState", js.undefined)
    
    @scala.inline
    def setDeviceSettingsSyncState(value: DeviceSettingsSyncState): Self = this.set("DeviceSettingsSyncState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceSettingsSyncState: Self = this.set("DeviceSettingsSyncState", js.undefined)
    
    @scala.inline
    def setDeviceUpdateStatus(value: DeviceUpdateStatus): Self = this.set("DeviceUpdateStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceUpdateStatus: Self = this.set("DeviceUpdateStatus", js.undefined)
    
    @scala.inline
    def setHdDeviceSettings(value: InputDeviceHdSettings): Self = this.set("HdDeviceSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHdDeviceSettings: Self = this.set("HdDeviceSettings", js.undefined)
    
    @scala.inline
    def setId(value: string): Self = this.set("Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("Id", js.undefined)
    
    @scala.inline
    def setMacAddress(value: string): Self = this.set("MacAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMacAddress: Self = this.set("MacAddress", js.undefined)
    
    @scala.inline
    def setName(value: string): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    
    @scala.inline
    def setNetworkSettings(value: InputDeviceNetworkSettings): Self = this.set("NetworkSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetworkSettings: Self = this.set("NetworkSettings", js.undefined)
    
    @scala.inline
    def setSerialNumber(value: string): Self = this.set("SerialNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSerialNumber: Self = this.set("SerialNumber", js.undefined)
    
    @scala.inline
    def setType(value: InputDeviceType): Self = this.set("Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("Type", js.undefined)
  }
}
