package typings.awsSdk.networkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomerGatewayAssociation extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the customer gateway.
    */
  var CustomerGatewayArn: js.UndefOr[String] = js.native
  
  /**
    * The ID of the device.
    */
  var DeviceId: js.UndefOr[String] = js.native
  
  /**
    * The ID of the global network.
    */
  var GlobalNetworkId: js.UndefOr[String] = js.native
  
  /**
    * The ID of the link.
    */
  var LinkId: js.UndefOr[String] = js.native
  
  /**
    * The association state.
    */
  var State: js.UndefOr[CustomerGatewayAssociationState] = js.native
}
object CustomerGatewayAssociation {
  
  @scala.inline
  def apply(): CustomerGatewayAssociation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomerGatewayAssociation]
  }
  
  @scala.inline
  implicit class CustomerGatewayAssociationMutableBuilder[Self <: CustomerGatewayAssociation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustomerGatewayArn(value: String): Self = StObject.set(x, "CustomerGatewayArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomerGatewayArnUndefined: Self = StObject.set(x, "CustomerGatewayArn", js.undefined)
    
    @scala.inline
    def setDeviceId(value: String): Self = StObject.set(x, "DeviceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceIdUndefined: Self = StObject.set(x, "DeviceId", js.undefined)
    
    @scala.inline
    def setGlobalNetworkId(value: String): Self = StObject.set(x, "GlobalNetworkId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobalNetworkIdUndefined: Self = StObject.set(x, "GlobalNetworkId", js.undefined)
    
    @scala.inline
    def setLinkId(value: String): Self = StObject.set(x, "LinkId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkIdUndefined: Self = StObject.set(x, "LinkId", js.undefined)
    
    @scala.inline
    def setState(value: CustomerGatewayAssociationState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
  }
}
