package typings.awsSdk.directconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeVirtualInterfacesRequest extends StObject {
  
  /**
    * The ID of the connection.
    */
  var connectionId: js.UndefOr[ConnectionId] = js.undefined
  
  /**
    * The ID of the virtual interface.
    */
  var virtualInterfaceId: js.UndefOr[VirtualInterfaceId] = js.undefined
}
object DescribeVirtualInterfacesRequest {
  
  @scala.inline
  def apply(): DescribeVirtualInterfacesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeVirtualInterfacesRequest]
  }
  
  @scala.inline
  implicit class DescribeVirtualInterfacesRequestMutableBuilder[Self <: DescribeVirtualInterfacesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnectionId(value: ConnectionId): Self = StObject.set(x, "connectionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionIdUndefined: Self = StObject.set(x, "connectionId", js.undefined)
    
    @scala.inline
    def setVirtualInterfaceId(value: VirtualInterfaceId): Self = StObject.set(x, "virtualInterfaceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualInterfaceIdUndefined: Self = StObject.set(x, "virtualInterfaceId", js.undefined)
  }
}
