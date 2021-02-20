package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VpnConnection extends StObject {
  
  /**
    * The category of the VPN connection. A value of VPN indicates an AWS VPN connection. A value of VPN-Classic indicates an AWS Classic VPN connection.
    */
  var Category: js.UndefOr[String] = js.native
  
  /**
    * The configuration information for the VPN connection's customer gateway (in the native XML format). This element is always present in the CreateVpnConnection response; however, it's present in the DescribeVpnConnections response only if the VPN connection is in the pending or available state.
    */
  var CustomerGatewayConfiguration: js.UndefOr[String] = js.native
  
  /**
    * The ID of the customer gateway at your end of the VPN connection.
    */
  var CustomerGatewayId: js.UndefOr[String] = js.native
  
  /**
    * The VPN connection options.
    */
  var Options: js.UndefOr[VpnConnectionOptions] = js.native
  
  /**
    * The static routes associated with the VPN connection.
    */
  var Routes: js.UndefOr[VpnStaticRouteList] = js.native
  
  /**
    * The current state of the VPN connection.
    */
  var State: js.UndefOr[VpnState] = js.native
  
  /**
    * Any tags assigned to the VPN connection.
    */
  var Tags: js.UndefOr[TagList] = js.native
  
  /**
    * The ID of the transit gateway associated with the VPN connection.
    */
  var TransitGatewayId: js.UndefOr[String] = js.native
  
  /**
    * The type of VPN connection.
    */
  var Type: js.UndefOr[GatewayType] = js.native
  
  /**
    * Information about the VPN tunnel.
    */
  var VgwTelemetry: js.UndefOr[VgwTelemetryList] = js.native
  
  /**
    * The ID of the VPN connection.
    */
  var VpnConnectionId: js.UndefOr[String] = js.native
  
  /**
    * The ID of the virtual private gateway at the AWS side of the VPN connection.
    */
  var VpnGatewayId: js.UndefOr[String] = js.native
}
object VpnConnection {
  
  @scala.inline
  def apply(): VpnConnection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VpnConnection]
  }
  
  @scala.inline
  implicit class VpnConnectionMutableBuilder[Self <: VpnConnection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCategory(value: String): Self = StObject.set(x, "Category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoryUndefined: Self = StObject.set(x, "Category", js.undefined)
    
    @scala.inline
    def setCustomerGatewayConfiguration(value: String): Self = StObject.set(x, "CustomerGatewayConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomerGatewayConfigurationUndefined: Self = StObject.set(x, "CustomerGatewayConfiguration", js.undefined)
    
    @scala.inline
    def setCustomerGatewayId(value: String): Self = StObject.set(x, "CustomerGatewayId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomerGatewayIdUndefined: Self = StObject.set(x, "CustomerGatewayId", js.undefined)
    
    @scala.inline
    def setOptions(value: VpnConnectionOptions): Self = StObject.set(x, "Options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "Options", js.undefined)
    
    @scala.inline
    def setRoutes(value: VpnStaticRouteList): Self = StObject.set(x, "Routes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoutesUndefined: Self = StObject.set(x, "Routes", js.undefined)
    
    @scala.inline
    def setRoutesVarargs(value: VpnStaticRoute*): Self = StObject.set(x, "Routes", js.Array(value :_*))
    
    @scala.inline
    def setState(value: VpnState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
    
    @scala.inline
    def setTransitGatewayId(value: String): Self = StObject.set(x, "TransitGatewayId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitGatewayIdUndefined: Self = StObject.set(x, "TransitGatewayId", js.undefined)
    
    @scala.inline
    def setType(value: GatewayType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
    
    @scala.inline
    def setVgwTelemetry(value: VgwTelemetryList): Self = StObject.set(x, "VgwTelemetry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVgwTelemetryUndefined: Self = StObject.set(x, "VgwTelemetry", js.undefined)
    
    @scala.inline
    def setVgwTelemetryVarargs(value: VgwTelemetry*): Self = StObject.set(x, "VgwTelemetry", js.Array(value :_*))
    
    @scala.inline
    def setVpnConnectionId(value: String): Self = StObject.set(x, "VpnConnectionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpnConnectionIdUndefined: Self = StObject.set(x, "VpnConnectionId", js.undefined)
    
    @scala.inline
    def setVpnGatewayId(value: String): Self = StObject.set(x, "VpnGatewayId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpnGatewayIdUndefined: Self = StObject.set(x, "VpnGatewayId", js.undefined)
  }
}
