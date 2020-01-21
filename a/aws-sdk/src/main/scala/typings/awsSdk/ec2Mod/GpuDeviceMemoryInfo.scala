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
  def apply(SizeInMiB: Int | scala.Double = null): GpuDeviceMemoryInfo = {
    val __obj = js.Dynamic.literal()
    if (SizeInMiB != null) __obj.updateDynamic("SizeInMiB")(SizeInMiB.asInstanceOf[js.Any])
    __obj.asInstanceOf[GpuDeviceMemoryInfo]
  }
}

