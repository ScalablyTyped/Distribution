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
  def apply(
    Count: js.UndefOr[FpgaDeviceCount] = js.undefined,
    Manufacturer: FpgaDeviceManufacturerName = null,
    MemoryInfo: FpgaDeviceMemoryInfo = null,
    Name: FpgaDeviceName = null
  ): FpgaDeviceInfo = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Count)) __obj.updateDynamic("Count")(Count.get.asInstanceOf[js.Any])
    if (Manufacturer != null) __obj.updateDynamic("Manufacturer")(Manufacturer.asInstanceOf[js.Any])
    if (MemoryInfo != null) __obj.updateDynamic("MemoryInfo")(MemoryInfo.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[FpgaDeviceInfo]
  }
}

