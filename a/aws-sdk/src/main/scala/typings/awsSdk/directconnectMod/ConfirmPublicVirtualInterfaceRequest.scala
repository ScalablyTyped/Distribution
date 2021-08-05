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
  
  inline def apply(virtualInterfaceId: VirtualInterfaceId): ConfirmPublicVirtualInterfaceRequest = {
    val __obj = js.Dynamic.literal(virtualInterfaceId = virtualInterfaceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfirmPublicVirtualInterfaceRequest]
  }
  
  extension [Self <: ConfirmPublicVirtualInterfaceRequest](x: Self) {
    
    inline def setVirtualInterfaceId(value: VirtualInterfaceId): Self = StObject.set(x, "virtualInterfaceId", value.asInstanceOf[js.Any])
  }
}
