package typings.awsSdk.directconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateVirtualInterfaceAttributesRequest extends StObject {
  
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
  implicit class UpdateVirtualInterfaceAttributesRequestMutableBuilder[Self <: UpdateVirtualInterfaceAttributesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMtu(value: MTU): Self = StObject.set(x, "mtu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMtuUndefined: Self = StObject.set(x, "mtu", js.undefined)
    
    @scala.inline
    def setVirtualInterfaceId(value: VirtualInterfaceId): Self = StObject.set(x, "virtualInterfaceId", value.asInstanceOf[js.Any])
  }
}
