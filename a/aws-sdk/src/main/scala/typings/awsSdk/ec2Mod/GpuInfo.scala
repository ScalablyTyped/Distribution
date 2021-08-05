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
  
  inline def apply(): GpuInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GpuInfo]
  }
  
  extension [Self <: GpuInfo](x: Self) {
    
    inline def setGpus(value: GpuDeviceInfoList): Self = StObject.set(x, "Gpus", value.asInstanceOf[js.Any])
    
    inline def setGpusUndefined: Self = StObject.set(x, "Gpus", js.undefined)
    
    inline def setGpusVarargs(value: GpuDeviceInfo*): Self = StObject.set(x, "Gpus", js.Array(value :_*))
    
    inline def setTotalGpuMemoryInMiB(value: totalGpuMemory): Self = StObject.set(x, "TotalGpuMemoryInMiB", value.asInstanceOf[js.Any])
    
    inline def setTotalGpuMemoryInMiBUndefined: Self = StObject.set(x, "TotalGpuMemoryInMiB", js.undefined)
  }
}
