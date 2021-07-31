package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateInputDeviceResponse extends StObject {
  
  /**
    * The unique ARN of the input device.
    */
  var Arn: js.UndefOr[string] = js.undefined
  
  /**
    * The state of the connection between the input device and AWS.
    */
  var ConnectionState: js.UndefOr[InputDeviceConnectionState] = js.undefined
  
  /**
    * The status of the action to synchronize the device configuration. If you change the configuration of the input device (for example, the maximum bitrate), MediaLive sends the new data to the device. The device might not update itself immediately. SYNCED means the device has updated its configuration. SYNCING means that it has not updated its configuration.
    */
  var DeviceSettingsSyncState: js.UndefOr[typings.awsSdk.medialiveMod.DeviceSettingsSyncState] = js.undefined
  
  /**
    * The status of software on the input device.
    */
  var DeviceUpdateStatus: js.UndefOr[typings.awsSdk.medialiveMod.DeviceUpdateStatus] = js.undefined
  
  /**
    * Settings that describe an input device that is type HD.
    */
  var HdDeviceSettings: js.UndefOr[InputDeviceHdSettings] = js.undefined
  
  /**
    * The unique ID of the input device.
    */
  var Id: js.UndefOr[string] = js.undefined
  
  /**
    * The network MAC address of the input device.
    */
  var MacAddress: js.UndefOr[string] = js.undefined
  
  /**
    * A name that you specify for the input device.
    */
  var Name: js.UndefOr[string] = js.undefined
  
  /**
    * The network settings for the input device.
    */
  var NetworkSettings: js.UndefOr[InputDeviceNetworkSettings] = js.undefined
  
  /**
    * The unique serial number of the input device.
    */
  var SerialNumber: js.UndefOr[string] = js.undefined
  
  /**
    * The type of the input device.
    */
  var Type: js.UndefOr[InputDeviceType] = js.undefined
}
object UpdateInputDeviceResponse {
  
  @scala.inline
  def apply(): UpdateInputDeviceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateInputDeviceResponse]
  }
  
  @scala.inline
  implicit class UpdateInputDeviceResponseMutableBuilder[Self <: UpdateInputDeviceResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: string): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    @scala.inline
    def setConnectionState(value: InputDeviceConnectionState): Self = StObject.set(x, "ConnectionState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionStateUndefined: Self = StObject.set(x, "ConnectionState", js.undefined)
    
    @scala.inline
    def setDeviceSettingsSyncState(value: DeviceSettingsSyncState): Self = StObject.set(x, "DeviceSettingsSyncState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceSettingsSyncStateUndefined: Self = StObject.set(x, "DeviceSettingsSyncState", js.undefined)
    
    @scala.inline
    def setDeviceUpdateStatus(value: DeviceUpdateStatus): Self = StObject.set(x, "DeviceUpdateStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceUpdateStatusUndefined: Self = StObject.set(x, "DeviceUpdateStatus", js.undefined)
    
    @scala.inline
    def setHdDeviceSettings(value: InputDeviceHdSettings): Self = StObject.set(x, "HdDeviceSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHdDeviceSettingsUndefined: Self = StObject.set(x, "HdDeviceSettings", js.undefined)
    
    @scala.inline
    def setId(value: string): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    @scala.inline
    def setMacAddress(value: string): Self = StObject.set(x, "MacAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMacAddressUndefined: Self = StObject.set(x, "MacAddress", js.undefined)
    
    @scala.inline
    def setName(value: string): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setNetworkSettings(value: InputDeviceNetworkSettings): Self = StObject.set(x, "NetworkSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkSettingsUndefined: Self = StObject.set(x, "NetworkSettings", js.undefined)
    
    @scala.inline
    def setSerialNumber(value: string): Self = StObject.set(x, "SerialNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSerialNumberUndefined: Self = StObject.set(x, "SerialNumber", js.undefined)
    
    @scala.inline
    def setType(value: InputDeviceType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
