package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GpuInfo extends js.Object {
  
  /**
    * Describes the GPU accelerators for the instance type.
    */
  var Gpus: js.UndefOr[GpuDeviceInfoList] = js.native
  
  /**
    * The total size of the memory for the GPU accelerators for the instance type, in MiB.
    */
  var TotalGpuMemoryInMiB: js.UndefOr[totalGpuMemory] = js.native
}
object GpuInfo {
  
  @scala.inline
  def apply(): GpuInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GpuInfo]
  }
  
  @scala.inline
  implicit class GpuInfoOps[Self <: GpuInfo] (val x: Self) extends AnyVal {
    
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
    def setGpusVarargs(value: GpuDeviceInfo*): Self = this.set("Gpus", js.Array(value :_*))
    
    @scala.inline
    def setGpus(value: GpuDeviceInfoList): Self = this.set("Gpus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGpus: Self = this.set("Gpus", js.undefined)
    
    @scala.inline
    def setTotalGpuMemoryInMiB(value: totalGpuMemory): Self = this.set("TotalGpuMemoryInMiB", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalGpuMemoryInMiB: Self = this.set("TotalGpuMemoryInMiB", js.undefined)
  }
}
