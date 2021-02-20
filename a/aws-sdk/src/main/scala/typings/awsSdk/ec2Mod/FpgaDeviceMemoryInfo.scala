package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FpgaDeviceMemoryInfo extends StObject {
  
  /**
    * The size of the memory available to the FPGA accelerator, in MiB.
    */
  var SizeInMiB: js.UndefOr[FpgaDeviceMemorySize] = js.native
}
object FpgaDeviceMemoryInfo {
  
  @scala.inline
  def apply(): FpgaDeviceMemoryInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FpgaDeviceMemoryInfo]
  }
  
  @scala.inline
  implicit class FpgaDeviceMemoryInfoMutableBuilder[Self <: FpgaDeviceMemoryInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSizeInMiB(value: FpgaDeviceMemorySize): Self = StObject.set(x, "SizeInMiB", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeInMiBUndefined: Self = StObject.set(x, "SizeInMiB", js.undefined)
  }
}
