package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FpgaDeviceInfo extends js.Object {
  /**
    * The count of FPGA accelerators for the instance type.
    */
  var Count: js.UndefOr[FpgaDeviceCount] = js.native
  /**
    * The manufacturer of the FPGA accelerator.
    */
  var Manufacturer: js.UndefOr[FpgaDeviceManufacturerName] = js.native
  /**
    * Describes the memory for the FPGA accelerator for the instance type.
    */
  var MemoryInfo: js.UndefOr[FpgaDeviceMemoryInfo] = js.native
  /**
    * The name of the FPGA accelerator.
    */
  var Name: js.UndefOr[FpgaDeviceName] = js.native
}

object FpgaDeviceInfo {
  @scala.inline
  def apply(): FpgaDeviceInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FpgaDeviceInfo]
  }
  @scala.inline
  implicit class FpgaDeviceInfoOps[Self <: FpgaDeviceInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCount(value: FpgaDeviceCount): Self = this.set("Count", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCount: Self = this.set("Count", js.undefined)
    @scala.inline
    def setManufacturer(value: FpgaDeviceManufacturerName): Self = this.set("Manufacturer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteManufacturer: Self = this.set("Manufacturer", js.undefined)
    @scala.inline
    def setMemoryInfo(value: FpgaDeviceMemoryInfo): Self = this.set("MemoryInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMemoryInfo: Self = this.set("MemoryInfo", js.undefined)
    @scala.inline
    def setName(value: FpgaDeviceName): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
  }
  
}

