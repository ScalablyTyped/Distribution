package typings.awsSdk.directconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VirtualGateway extends StObject {
  
  /**
    * The ID of the virtual private gateway.
    */
  var virtualGatewayId: js.UndefOr[VirtualGatewayId] = js.undefined
  
  /**
    * The state of the virtual private gateway. The following are the possible values:    pending: Initial state after creating the virtual private gateway.    available: Ready for use by a private virtual interface.    deleting: Initial state after deleting the virtual private gateway.    deleted: The virtual private gateway is deleted. The private virtual interface is unable to send traffic over this gateway.  
    */
  var virtualGatewayState: js.UndefOr[VirtualGatewayState] = js.undefined
}
object VirtualGateway {
  
  @scala.inline
  def apply(): VirtualGateway = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VirtualGateway]
  }
  
  @scala.inline
  implicit class VirtualGatewayMutableBuilder[Self <: VirtualGateway] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVirtualGatewayId(value: VirtualGatewayId): Self = StObject.set(x, "virtualGatewayId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualGatewayIdUndefined: Self = StObject.set(x, "virtualGatewayId", js.undefined)
    
    @scala.inline
    def setVirtualGatewayState(value: VirtualGatewayState): Self = StObject.set(x, "virtualGatewayState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualGatewayStateUndefined: Self = StObject.set(x, "virtualGatewayState", js.undefined)
  }
}
