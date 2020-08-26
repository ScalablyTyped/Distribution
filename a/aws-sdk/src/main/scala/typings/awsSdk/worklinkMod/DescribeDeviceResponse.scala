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
  def apply(): DescribeDeviceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDeviceResponse]
  }
  @scala.inline
  implicit class DescribeDeviceResponseOps[Self <: DescribeDeviceResponse] (val x: Self) extends AnyVal {
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
    def setFirstAccessedTime(value: DateTime): Self = this.set("FirstAccessedTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFirstAccessedTime: Self = this.set("FirstAccessedTime", js.undefined)
    @scala.inline
    def setLastAccessedTime(value: DateTime): Self = this.set("LastAccessedTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastAccessedTime: Self = this.set("LastAccessedTime", js.undefined)
    @scala.inline
    def setManufacturer(value: DeviceManufacturer): Self = this.set("Manufacturer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteManufacturer: Self = this.set("Manufacturer", js.undefined)
    @scala.inline
    def setModel(value: DeviceModel): Self = this.set("Model", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModel: Self = this.set("Model", js.undefined)
    @scala.inline
    def setOperatingSystem(value: DeviceOperatingSystemName): Self = this.set("OperatingSystem", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOperatingSystem: Self = this.set("OperatingSystem", js.undefined)
    @scala.inline
    def setOperatingSystemVersion(value: DeviceOperatingSystemVersion): Self = this.set("OperatingSystemVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOperatingSystemVersion: Self = this.set("OperatingSystemVersion", js.undefined)
    @scala.inline
    def setPatchLevel(value: DevicePatchLevel): Self = this.set("PatchLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePatchLevel: Self = this.set("PatchLevel", js.undefined)
    @scala.inline
    def setStatus(value: DeviceStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    @scala.inline
    def setUsername(value: Username): Self = this.set("Username", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUsername: Self = this.set("Username", js.undefined)
  }
  
}

