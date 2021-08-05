package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FpgaDeviceMemoryInfo extends StObject {
  
  /**
    * The size of the memory available to the FPGA accelerator, in MiB.
    */
  var SizeInMiB: js.UndefOr[FpgaDeviceMemorySize] = js.undefined
}
object FpgaDeviceMemoryInfo {
  
  inline def apply(): FpgaDeviceMemoryInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FpgaDeviceMemoryInfo]
  }
  
  extension [Self <: FpgaDeviceMemoryInfo](x: Self) {
    
    inline def setSizeInMiB(value: FpgaDeviceMemorySize): Self = StObject.set(x, "SizeInMiB", value.asInstanceOf[js.Any])
    
    inline def setSizeInMiBUndefined: Self = StObject.set(x, "SizeInMiB", js.undefined)
  }
}
