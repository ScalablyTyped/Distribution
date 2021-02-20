package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FpgaInfo extends StObject {
  
  /**
    * Describes the FPGAs for the instance type.
    */
  var Fpgas: js.UndefOr[FpgaDeviceInfoList] = js.native
  
  /**
    * The total memory of all FPGA accelerators for the instance type.
    */
  var TotalFpgaMemoryInMiB: js.UndefOr[totalFpgaMemory] = js.native
}
object FpgaInfo {
  
  @scala.inline
  def apply(): FpgaInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FpgaInfo]
  }
  
  @scala.inline
  implicit class FpgaInfoMutableBuilder[Self <: FpgaInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFpgas(value: FpgaDeviceInfoList): Self = StObject.set(x, "Fpgas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFpgasUndefined: Self = StObject.set(x, "Fpgas", js.undefined)
    
    @scala.inline
    def setFpgasVarargs(value: FpgaDeviceInfo*): Self = StObject.set(x, "Fpgas", js.Array(value :_*))
    
    @scala.inline
    def setTotalFpgaMemoryInMiB(value: totalFpgaMemory): Self = StObject.set(x, "TotalFpgaMemoryInMiB", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalFpgaMemoryInMiBUndefined: Self = StObject.set(x, "TotalFpgaMemoryInMiB", js.undefined)
  }
}
