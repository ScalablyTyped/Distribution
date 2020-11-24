package typings.awsSdk.smsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VmServer extends js.Object {
  
  /**
    * The name of the VM manager.
    */
  var vmManagerName: js.UndefOr[VmManagerName] = js.native
  
  /**
    * The type of VM management product.
    */
  var vmManagerType: js.UndefOr[VmManagerType] = js.native
  
  /**
    * The name of the VM.
    */
  var vmName: js.UndefOr[VmName] = js.native
  
  /**
    * The VM folder path in the vCenter Server virtual machine inventory tree.
    */
  var vmPath: js.UndefOr[VmPath] = js.native
  
  /**
    * The VM server location.
    */
  var vmServerAddress: js.UndefOr[VmServerAddress] = js.native
}
object VmServer {
  
  @scala.inline
  def apply(): VmServer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VmServer]
  }
  
  @scala.inline
  implicit class VmServerOps[Self <: VmServer] (val x: Self) extends AnyVal {
    
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
    def setVmManagerName(value: VmManagerName): Self = this.set("vmManagerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVmManagerName: Self = this.set("vmManagerName", js.undefined)
    
    @scala.inline
    def setVmManagerType(value: VmManagerType): Self = this.set("vmManagerType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVmManagerType: Self = this.set("vmManagerType", js.undefined)
    
    @scala.inline
    def setVmName(value: VmName): Self = this.set("vmName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVmName: Self = this.set("vmName", js.undefined)
    
    @scala.inline
    def setVmPath(value: VmPath): Self = this.set("vmPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVmPath: Self = this.set("vmPath", js.undefined)
    
    @scala.inline
    def setVmServerAddress(value: VmServerAddress): Self = this.set("vmServerAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVmServerAddress: Self = this.set("vmServerAddress", js.undefined)
  }
}
