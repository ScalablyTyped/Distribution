package typings.awsSdk.worklinkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeDeviceResponse extends js.Object {
  /**
    * The date that the device first signed in to Amazon WorkLink.
    */
  var FirstAccessedTime: js.UndefOr[DateTime] = js.native
  /**
    * The date that the device last accessed Amazon WorkLink.
    */
  var LastAccessedTime: js.UndefOr[DateTime] = js.native
  /**
    * The manufacturer of the device.
    */
  var Manufacturer: js.UndefOr[DeviceManufacturer] = js.native
  /**
    * The model of the device.
    */
  var Model: js.UndefOr[DeviceModel] = js.native
  /**
    * The operating system of the device.
    */
  var OperatingSystem: js.UndefOr[DeviceOperatingSystemName] = js.native
  /**
    * The operating system version of the device.
    */
  var OperatingSystemVersion: js.UndefOr[DeviceOperatingSystemVersion] = js.native
  /**
    * The operating system patch level of the device.
    */
  var PatchLevel: js.UndefOr[DevicePatchLevel] = js.native
  /**
    * The current state of the device.
    */
  var Status: js.UndefOr[DeviceStatus] = js.native
  /**
    * The user name associated with the device.
    */
  var Username: js.UndefOr[typings.awsSdk.worklinkMod.Username] = js.native
}

object DescribeDeviceResponse {
  @scala.inline
  def apply(
    FirstAccessedTime: DateTime = null,
    LastAccessedTime: DateTime = null,
    Manufacturer: DeviceManufacturer = null,
    Model: DeviceModel = null,
    OperatingSystem: DeviceOperatingSystemName = null,
    OperatingSystemVersion: DeviceOperatingSystemVersion = null,
    PatchLevel: DevicePatchLevel = null,
    Status: DeviceStatus = null,
    Username: Username = null
  ): DescribeDeviceResponse = {
    val __obj = js.Dynamic.literal()
    if (FirstAccessedTime != null) __obj.updateDynamic("FirstAccessedTime")(FirstAccessedTime.asInstanceOf[js.Any])
    if (LastAccessedTime != null) __obj.updateDynamic("LastAccessedTime")(LastAccessedTime.asInstanceOf[js.Any])
    if (Manufacturer != null) __obj.updateDynamic("Manufacturer")(Manufacturer.asInstanceOf[js.Any])
    if (Model != null) __obj.updateDynamic("Model")(Model.asInstanceOf[js.Any])
    if (OperatingSystem != null) __obj.updateDynamic("OperatingSystem")(OperatingSystem.asInstanceOf[js.Any])
    if (OperatingSystemVersion != null) __obj.updateDynamic("OperatingSystemVersion")(OperatingSystemVersion.asInstanceOf[js.Any])
    if (PatchLevel != null) __obj.updateDynamic("PatchLevel")(PatchLevel.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (Username != null) __obj.updateDynamic("Username")(Username.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDeviceResponse]
  }
}

