package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeInputDeviceResponse extends js.Object {
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

object DescribeInputDeviceResponse {
  @scala.inline
  def apply(
    Arn: string = null,
    ConnectionState: InputDeviceConnectionState = null,
    DeviceSettingsSyncState: DeviceSettingsSyncState = null,
    HdDeviceSettings: InputDeviceHdSettings = null,
    Id: string = null,
    MacAddress: string = null,
    Name: string = null,
    NetworkSettings: InputDeviceNetworkSettings = null,
    SerialNumber: string = null,
    Type: InputDeviceType = null
  ): DescribeInputDeviceResponse = {
    val __obj = js.Dynamic.literal()
    if (Arn != null) __obj.updateDynamic("Arn")(Arn.asInstanceOf[js.Any])
    if (ConnectionState != null) __obj.updateDynamic("ConnectionState")(ConnectionState.asInstanceOf[js.Any])
    if (DeviceSettingsSyncState != null) __obj.updateDynamic("DeviceSettingsSyncState")(DeviceSettingsSyncState.asInstanceOf[js.Any])
    if (HdDeviceSettings != null) __obj.updateDynamic("HdDeviceSettings")(HdDeviceSettings.asInstanceOf[js.Any])
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    if (MacAddress != null) __obj.updateDynamic("MacAddress")(MacAddress.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (NetworkSettings != null) __obj.updateDynamic("NetworkSettings")(NetworkSettings.asInstanceOf[js.Any])
    if (SerialNumber != null) __obj.updateDynamic("SerialNumber")(SerialNumber.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeInputDeviceResponse]
  }
}

