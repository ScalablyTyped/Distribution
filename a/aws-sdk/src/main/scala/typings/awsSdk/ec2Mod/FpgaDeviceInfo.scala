package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FpgaDeviceInfo extends StObject {
  
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
  def apply(): FpgaDeviceInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FpgaDeviceInfo]
  }
  
  @scala.inline
  implicit class FpgaDeviceInfoMutableBuilder[Self <: FpgaDeviceInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCount(value: FpgaDeviceCount): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountUndefined: Self = StObject.set(x, "Count", js.undefined)
    
    @scala.inline
    def setManufacturer(value: FpgaDeviceManufacturerName): Self = StObject.set(x, "Manufacturer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManufacturerUndefined: Self = StObject.set(x, "Manufacturer", js.undefined)
    
    @scala.inline
    def setMemoryInfo(value: FpgaDeviceMemoryInfo): Self = StObject.set(x, "MemoryInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemoryInfoUndefined: Self = StObject.set(x, "MemoryInfo", js.undefined)
    
    @scala.inline
    def setName(value: FpgaDeviceName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
