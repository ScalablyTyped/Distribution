package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstanceHardware extends js.Object {
  
  /**
    * The number of vCPUs the instance has.
    */
  var cpuCount: js.UndefOr[integer] = js.native
  
  /**
    * The disks attached to the instance.
    */
  var disks: js.UndefOr[DiskList] = js.native
  
  /**
    * The amount of RAM in GB on the instance (e.g., 1.0).
    */
  var ramSizeInGb: js.UndefOr[float] = js.native
}
object InstanceHardware {
  
  @scala.inline
  def apply(): InstanceHardware = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceHardware]
  }
  
  @scala.inline
  implicit class InstanceHardwareOps[Self <: InstanceHardware] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCpuCount(value: integer): Self = this.set("cpuCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCpuCount: Self = this.set("cpuCount", js.undefined)
    
    @scala.inline
    def setDisksVarargs(value: Disk*): Self = this.set("disks", js.Array(value :_*))
    
    @scala.inline
    def setDisks(value: DiskList): Self = this.set("disks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisks: Self = this.set("disks", js.undefined)
    
    @scala.inline
    def setRamSizeInGb(value: float): Self = this.set("ramSizeInGb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRamSizeInGb: Self = this.set("ramSizeInGb", js.undefined)
  }
}
