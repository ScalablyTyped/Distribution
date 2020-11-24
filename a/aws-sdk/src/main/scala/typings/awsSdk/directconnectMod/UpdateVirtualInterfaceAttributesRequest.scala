package typings.awsSdk.directconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateVirtualInterfaceAttributesRequest extends js.Object {
  
  /**
    * The maximum transmission unit (MTU), in bytes. The supported values are 1500 and 9001. The default value is 1500.
    */
  var mtu: js.UndefOr[MTU] = js.native
  
  /**
    * The ID of the virtual private interface.
    */
  var virtualInterfaceId: VirtualInterfaceId = js.native
}
object UpdateVirtualInterfaceAttributesRequest {
  
  @scala.inline
  def apply(virtualInterfaceId: VirtualInterfaceId): UpdateVirtualInterfaceAttributesRequest = {
    val __obj = js.Dynamic.literal(virtualInterfaceId = virtualInterfaceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateVirtualInterfaceAttributesRequest]
  }
  
  @scala.inline
  implicit class UpdateVirtualInterfaceAttributesRequestOps[Self <: UpdateVirtualInterfaceAttributesRequest] (val x: Self) extends AnyVal {
    
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
    def setVirtualInterfaceId(value: VirtualInterfaceId): Self = this.set("virtualInterfaceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMtu(value: MTU): Self = this.set("mtu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMtu: Self = this.set("mtu", js.undefined)
  }
}
