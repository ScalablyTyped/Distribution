package typings.awsSdk.directconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VirtualInterfaces extends js.Object {
  
  /**
    * The virtual interfaces
    */
  var virtualInterfaces: js.UndefOr[VirtualInterfaceList] = js.native
}
object VirtualInterfaces {
  
  @scala.inline
  def apply(): VirtualInterfaces = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VirtualInterfaces]
  }
  
  @scala.inline
  implicit class VirtualInterfacesOps[Self <: VirtualInterfaces] (val x: Self) extends AnyVal {
    
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
    def setVirtualInterfacesVarargs(value: VirtualInterface*): Self = this.set("virtualInterfaces", js.Array(value :_*))
    
    @scala.inline
    def setVirtualInterfaces(value: VirtualInterfaceList): Self = this.set("virtualInterfaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVirtualInterfaces: Self = this.set("virtualInterfaces", js.undefined)
  }
}
