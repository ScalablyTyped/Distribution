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
  def apply(): GpuDeviceMemoryInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GpuDeviceMemoryInfo]
  }
  @scala.inline
  implicit class GpuDeviceMemoryInfoOps[Self <: GpuDeviceMemoryInfo] (val x: Self) extends AnyVal {
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
    def setSizeInMiB(value: GpuDeviceMemorySize): Self = this.set("SizeInMiB", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSizeInMiB: Self = this.set("SizeInMiB", js.undefined)
  }
  
}

