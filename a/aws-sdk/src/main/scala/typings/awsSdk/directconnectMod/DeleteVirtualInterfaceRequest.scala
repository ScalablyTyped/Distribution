package typings.awsSdk.directconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteVirtualInterfaceRequest extends StObject {
  
  /**
    * The ID of the virtual interface.
    */
  var virtualInterfaceId: VirtualInterfaceId = js.native
}
object DeleteVirtualInterfaceRequest {
  
  @scala.inline
  def apply(virtualInterfaceId: VirtualInterfaceId): DeleteVirtualInterfaceRequest = {
    val __obj = js.Dynamic.literal(virtualInterfaceId = virtualInterfaceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteVirtualInterfaceRequest]
  }
  
  @scala.inline
  implicit class DeleteVirtualInterfaceRequestMutableBuilder[Self <: DeleteVirtualInterfaceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVirtualInterfaceId(value: VirtualInterfaceId): Self = StObject.set(x, "virtualInterfaceId", value.asInstanceOf[js.Any])
  }
}
