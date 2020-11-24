package typings.awsSdk.smsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VmServerAddress extends js.Object {
  
  /**
    * The ID of the VM.
    */
  var vmId: js.UndefOr[VmId] = js.native
  
  /**
    * The ID of the VM manager.
    */
  var vmManagerId: js.UndefOr[VmManagerId] = js.native
}
object VmServerAddress {
  
  @scala.inline
  def apply(): VmServerAddress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VmServerAddress]
  }
  
  @scala.inline
  implicit class VmServerAddressOps[Self <: VmServerAddress] (val x: Self) extends AnyVal {
    
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
    def setVmId(value: VmId): Self = this.set("vmId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVmId: Self = this.set("vmId", js.undefined)
    
    @scala.inline
    def setVmManagerId(value: VmManagerId): Self = this.set("vmManagerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVmManagerId: Self = this.set("vmManagerId", js.undefined)
  }
}
