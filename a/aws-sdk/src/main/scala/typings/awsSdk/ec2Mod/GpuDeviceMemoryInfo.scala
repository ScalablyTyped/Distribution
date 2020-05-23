package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GpuDeviceMemoryInfo extends js.Object {
  /**
    * The size (in MiB) for the memory available to the GPU accelerator.
    */
  var SizeInMiB: js.UndefOr[GpuDeviceMemorySize] = js.native
}

object GpuDeviceMemoryInfo {
  @scala.inline
  def apply(SizeInMiB: js.UndefOr[GpuDeviceMemorySize] = js.undefined): GpuDeviceMemoryInfo = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(SizeInMiB)) __obj.updateDynamic("SizeInMiB")(SizeInMiB.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GpuDeviceMemoryInfo]
  }
}

