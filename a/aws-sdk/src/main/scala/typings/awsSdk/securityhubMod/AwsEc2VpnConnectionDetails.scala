package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsEc2VpnConnectionDetails extends StObject {
  
  /**
    * The category of the VPN connection. VPN indicates an Amazon Web Services VPN connection. VPN-Classic indicates an Amazon Web Services Classic VPN connection.
    */
  var Category: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The configuration information for the VPN connection's customer gateway, in the native XML format.
    */
  var CustomerGatewayConfiguration: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The identifier of the customer gateway that is at your end of the VPN connection.
    */
  var CustomerGatewayId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The VPN connection options.
    */
  var Options: js.UndefOr[AwsEc2VpnConnectionOptionsDetails] = js.undefined
  
  /**
    * The static routes that are associated with the VPN connection.
    */
  var Routes: js.UndefOr[AwsEc2VpnConnectionRoutesList] = js.undefined
  
  /**
    * The current state of the VPN connection. Valid values are as follows:    available     deleted     deleting     pending   
    */
  var State: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The identifier of the transit gateway that is associated with the VPN connection.
    */
  var TransitGatewayId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The type of VPN connection.
    */
  var Type: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Information about the VPN tunnel.
    */
  var VgwTelemetry: js.UndefOr[AwsEc2VpnConnectionVgwTelemetryList] = js.undefined
  
  /**
    * The identifier of the VPN connection.
    */
  var VpnConnectionId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The identifier of the virtual private gateway that is at the Amazon Web Services side of the VPN connection.
    */
  var VpnGatewayId: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsEc2VpnConnectionDetails {
  
  inline def apply(): AwsEc2VpnConnectionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsEc2VpnConnectionDetails]
  }
  
  extension [Self <: AwsEc2VpnConnectionDetails](x: Self) {
    
    inline def setCategory(value: NonEmptyString): Self = StObject.set(x, "Category", value.asInstanceOf[js.Any])
    
    inline def setCategoryUndefined: Self = StObject.set(x, "Category", js.undefined)
    
    inline def setCustomerGatewayConfiguration(value: NonEmptyString): Self = StObject.set(x, "CustomerGatewayConfiguration", value.asInstanceOf[js.Any])
    
    inline def setCustomerGatewayConfigurationUndefined: Self = StObject.set(x, "CustomerGatewayConfiguration", js.undefined)
    
    inline def setCustomerGatewayId(value: NonEmptyString): Self = StObject.set(x, "CustomerGatewayId", value.asInstanceOf[js.Any])
    
    inline def setCustomerGatewayIdUndefined: Self = StObject.set(x, "CustomerGatewayId", js.undefined)
    
    inline def setOptions(value: AwsEc2VpnConnectionOptionsDetails): Self = StObject.set(x, "Options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "Options", js.undefined)
    
    inline def setRoutes(value: AwsEc2VpnConnectionRoutesList): Self = StObject.set(x, "Routes", value.asInstanceOf[js.Any])
    
    inline def setRoutesUndefined: Self = StObject.set(x, "Routes", js.undefined)
    
    inline def setRoutesVarargs(value: AwsEc2VpnConnectionRoutesDetails*): Self = StObject.set(x, "Routes", js.Array(value*))
    
    inline def setState(value: NonEmptyString): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    inline def setTransitGatewayId(value: NonEmptyString): Self = StObject.set(x, "TransitGatewayId", value.asInstanceOf[js.Any])
    
    inline def setTransitGatewayIdUndefined: Self = StObject.set(x, "TransitGatewayId", js.undefined)
    
    inline def setType(value: NonEmptyString): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
    
    inline def setVgwTelemetry(value: AwsEc2VpnConnectionVgwTelemetryList): Self = StObject.set(x, "VgwTelemetry", value.asInstanceOf[js.Any])
    
    inline def setVgwTelemetryUndefined: Self = StObject.set(x, "VgwTelemetry", js.undefined)
    
    inline def setVgwTelemetryVarargs(value: AwsEc2VpnConnectionVgwTelemetryDetails*): Self = StObject.set(x, "VgwTelemetry", js.Array(value*))
    
    inline def setVpnConnectionId(value: NonEmptyString): Self = StObject.set(x, "VpnConnectionId", value.asInstanceOf[js.Any])
    
    inline def setVpnConnectionIdUndefined: Self = StObject.set(x, "VpnConnectionId", js.undefined)
    
    inline def setVpnGatewayId(value: NonEmptyString): Self = StObject.set(x, "VpnGatewayId", value.asInstanceOf[js.Any])
    
    inline def setVpnGatewayIdUndefined: Self = StObject.set(x, "VpnGatewayId", js.undefined)
  }
}
