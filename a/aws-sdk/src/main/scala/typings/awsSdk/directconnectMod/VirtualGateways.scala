package typings.awsSdk.directconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VirtualGateways extends StObject {
  
  /**
    * The virtual private gateways.
    */
  var virtualGateways: js.UndefOr[VirtualGatewayList] = js.undefined
}
object VirtualGateways {
  
  @scala.inline
  def apply(): VirtualGateways = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VirtualGateways]
  }
  
  @scala.inline
  implicit class VirtualGatewaysMutableBuilder[Self <: VirtualGateways] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVirtualGateways(value: VirtualGatewayList): Self = StObject.set(x, "virtualGateways", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualGatewaysUndefined: Self = StObject.set(x, "virtualGateways", js.undefined)
    
    @scala.inline
    def setVirtualGatewaysVarargs(value: VirtualGateway*): Self = StObject.set(x, "virtualGateways", js.Array(value :_*))
  }
}
