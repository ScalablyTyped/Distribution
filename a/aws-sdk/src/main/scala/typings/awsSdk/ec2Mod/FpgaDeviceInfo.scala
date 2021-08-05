package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FpgaDeviceInfo extends StObject {
  
  /**
    * The count of FPGA accelerators for the instance type.
    */
  var Count: js.UndefOr[FpgaDeviceCount] = js.undefined
  
  /**
    * The manufacturer of the FPGA accelerator.
    */
  var Manufacturer: js.UndefOr[FpgaDeviceManufacturerName] = js.undefined
  
  /**
    * Describes the memory for the FPGA accelerator for the instance type.
    */
  var MemoryInfo: js.UndefOr[FpgaDeviceMemoryInfo] = js.undefined
  
  /**
    * The name of the FPGA accelerator.
    */
  var Name: js.UndefOr[FpgaDeviceName] = js.undefined
}
object FpgaDeviceInfo {
  
  inline def apply(): FpgaDeviceInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FpgaDeviceInfo]
  }
  
  extension [Self <: FpgaDeviceInfo](x: Self) {
    
    inline def setCount(value: FpgaDeviceCount): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "Count", js.undefined)
    
    inline def setManufacturer(value: FpgaDeviceManufacturerName): Self = StObject.set(x, "Manufacturer", value.asInstanceOf[js.Any])
    
    inline def setManufacturerUndefined: Self = StObject.set(x, "Manufacturer", js.undefined)
    
    inline def setMemoryInfo(value: FpgaDeviceMemoryInfo): Self = StObject.set(x, "MemoryInfo", value.asInstanceOf[js.Any])
    
    inline def setMemoryInfoUndefined: Self = StObject.set(x, "MemoryInfo", js.undefined)
    
    inline def setName(value: FpgaDeviceName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
