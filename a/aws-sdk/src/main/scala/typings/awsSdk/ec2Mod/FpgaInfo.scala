package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FpgaInfo extends js.Object {
  
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
  implicit class FpgaInfoOps[Self <: FpgaInfo] (val x: Self) extends AnyVal {
    
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
    def setFpgasVarargs(value: FpgaDeviceInfo*): Self = this.set("Fpgas", js.Array(value :_*))
    
    @scala.inline
    def setFpgas(value: FpgaDeviceInfoList): Self = this.set("Fpgas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFpgas: Self = this.set("Fpgas", js.undefined)
    
    @scala.inline
    def setTotalFpgaMemoryInMiB(value: totalFpgaMemory): Self = this.set("TotalFpgaMemoryInMiB", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalFpgaMemoryInMiB: Self = this.set("TotalFpgaMemoryInMiB", js.undefined)
  }
}
