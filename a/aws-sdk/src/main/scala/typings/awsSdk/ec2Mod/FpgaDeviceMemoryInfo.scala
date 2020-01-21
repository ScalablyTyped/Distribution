package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FpgaDeviceMemoryInfo extends js.Object {
  /**
    * The size (in MiB) for the memory available to the FPGA accelerator.
    */
  var SizeInMiB: js.UndefOr[FpgaDeviceMemorySize] = js.native
}

object FpgaDeviceMemoryInfo {
  @scala.inline
  def apply(SizeInMiB: Int | scala.Double = null): FpgaDeviceMemoryInfo = {
    val __obj = js.Dynamic.literal()
    if (SizeInMiB != null) __obj.updateDynamic("SizeInMiB")(SizeInMiB.asInstanceOf[js.Any])
    __obj.asInstanceOf[FpgaDeviceMemoryInfo]
  }
}

