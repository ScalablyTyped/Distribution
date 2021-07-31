package typings.awsSdk.directconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfirmPublicVirtualInterfaceRequest extends StObject {
  
  /**
    * The ID of the virtual interface.
    */
  var virtualInterfaceId: VirtualInterfaceId
}
object ConfirmPublicVirtualInterfaceRequest {
  
  @scala.inline
  def apply(virtualInterfaceId: VirtualInterfaceId): ConfirmPublicVirtualInterfaceRequest = {
    val __obj = js.Dynamic.literal(virtualInterfaceId = virtualInterfaceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfirmPublicVirtualInterfaceRequest]
  }
  
  @scala.inline
  implicit class ConfirmPublicVirtualInterfaceRequestMutableBuilder[Self <: ConfirmPublicVirtualInterfaceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVirtualInterfaceId(value: VirtualInterfaceId): Self = StObject.set(x, "virtualInterfaceId", value.asInstanceOf[js.Any])
  }
}
