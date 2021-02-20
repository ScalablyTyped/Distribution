package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GpuDeviceInfo extends StObject {
  
  /**
    * The number of GPUs for the instance type.
    */
  var Count: js.UndefOr[GpuDeviceCount] = js.native
  
  /**
    * The manufacturer of the GPU accelerator.
    */
  var Manufacturer: js.UndefOr[GpuDeviceManufacturerName] = js.native
  
  /**
    * Describes the memory available to the GPU accelerator.
    */
  var MemoryInfo: js.UndefOr[GpuDeviceMemoryInfo] = js.native
  
  /**
    * The name of the GPU accelerator.
    */
  var Name: js.UndefOr[GpuDeviceName] = js.native
}
object GpuDeviceInfo {
  
  @scala.inline
  def apply(): GpuDeviceInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GpuDeviceInfo]
  }
  
  @scala.inline
  implicit class GpuDeviceInfoMutableBuilder[Self <: GpuDeviceInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCount(value: GpuDeviceCount): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountUndefined: Self = StObject.set(x, "Count", js.undefined)
    
    @scala.inline
    def setManufacturer(value: GpuDeviceManufacturerName): Self = StObject.set(x, "Manufacturer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManufacturerUndefined: Self = StObject.set(x, "Manufacturer", js.undefined)
    
    @scala.inline
    def setMemoryInfo(value: GpuDeviceMemoryInfo): Self = StObject.set(x, "MemoryInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemoryInfoUndefined: Self = StObject.set(x, "MemoryInfo", js.undefined)
    
    @scala.inline
    def setName(value: GpuDeviceName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
