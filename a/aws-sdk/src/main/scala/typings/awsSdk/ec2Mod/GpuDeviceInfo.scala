package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GpuDeviceInfo extends js.Object {
  
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
  implicit class GpuDeviceInfoOps[Self <: GpuDeviceInfo] (val x: Self) extends AnyVal {
    
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
    def setCount(value: GpuDeviceCount): Self = this.set("Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCount: Self = this.set("Count", js.undefined)
    
    @scala.inline
    def setManufacturer(value: GpuDeviceManufacturerName): Self = this.set("Manufacturer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteManufacturer: Self = this.set("Manufacturer", js.undefined)
    
    @scala.inline
    def setMemoryInfo(value: GpuDeviceMemoryInfo): Self = this.set("MemoryInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMemoryInfo: Self = this.set("MemoryInfo", js.undefined)
    
    @scala.inline
    def setName(value: GpuDeviceName): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
  }
}
