package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GpuInfo extends StObject {
  
  /**
    * Describes the GPU accelerators for the instance type.
    */
  var Gpus: js.UndefOr[GpuDeviceInfoList] = js.undefined
  
  /**
    * The total size of the memory for the GPU accelerators for the instance type, in MiB.
    */
  var TotalGpuMemoryInMiB: js.UndefOr[totalGpuMemory] = js.undefined
}
object GpuInfo {
  
  @scala.inline
  def apply(): GpuInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GpuInfo]
  }
  
  @scala.inline
  implicit class GpuInfoMutableBuilder[Self <: GpuInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGpus(value: GpuDeviceInfoList): Self = StObject.set(x, "Gpus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGpusUndefined: Self = StObject.set(x, "Gpus", js.undefined)
    
    @scala.inline
    def setGpusVarargs(value: GpuDeviceInfo*): Self = StObject.set(x, "Gpus", js.Array(value :_*))
    
    @scala.inline
    def setTotalGpuMemoryInMiB(value: totalGpuMemory): Self = StObject.set(x, "TotalGpuMemoryInMiB", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalGpuMemoryInMiBUndefined: Self = StObject.set(x, "TotalGpuMemoryInMiB", js.undefined)
  }
}
