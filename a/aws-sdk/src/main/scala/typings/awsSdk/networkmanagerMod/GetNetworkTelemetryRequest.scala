package typings.awsSdk.networkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetNetworkTelemetryRequest extends StObject {
  
  /**
    * The Amazon Web Services account ID.
    */
  var AccountId: js.UndefOr[AWSAccountId] = js.undefined
  
  /**
    * The Amazon Web Services Region.
    */
  var AwsRegion: js.UndefOr[ExternalRegionCode] = js.undefined
  
  /**
    * The ID of a core network.
    */
  var CoreNetworkId: js.UndefOr[typings.awsSdk.networkmanagerMod.CoreNetworkId] = js.undefined
  
  /**
    * The ID of the global network.
    */
  var GlobalNetworkId: typings.awsSdk.networkmanagerMod.GlobalNetworkId
  
  /**
    * The maximum number of results to return.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.networkmanagerMod.MaxResults] = js.undefined
  
  /**
    * The token for the next page of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.networkmanagerMod.NextToken] = js.undefined
  
  /**
    * The ARN of the gateway.
    */
  var RegisteredGatewayArn: js.UndefOr[ResourceArn] = js.undefined
  
  /**
    * The ARN of the resource.
    */
  var ResourceArn: js.UndefOr[typings.awsSdk.networkmanagerMod.ResourceArn] = js.undefined
  
  /**
    * The resource type. The following are the supported resource types for Direct Connect:    dxcon     dx-gateway     dx-vif    The following are the supported resource types for Network Manager:    connection     device     link     site    The following are the supported resource types for Amazon VPC:    customer-gateway     transit-gateway     transit-gateway-attachment     transit-gateway-connect-peer     transit-gateway-route-table     vpn-connection   
    */
  var ResourceType: js.UndefOr[ConstrainedString] = js.undefined
}
object GetNetworkTelemetryRequest {
  
  inline def apply(GlobalNetworkId: GlobalNetworkId): GetNetworkTelemetryRequest = {
    val __obj = js.Dynamic.literal(GlobalNetworkId = GlobalNetworkId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetNetworkTelemetryRequest]
  }
  
  extension [Self <: GetNetworkTelemetryRequest](x: Self) {
    
    inline def setAccountId(value: AWSAccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "AccountId", js.undefined)
    
    inline def setAwsRegion(value: ExternalRegionCode): Self = StObject.set(x, "AwsRegion", value.asInstanceOf[js.Any])
    
    inline def setAwsRegionUndefined: Self = StObject.set(x, "AwsRegion", js.undefined)
    
    inline def setCoreNetworkId(value: CoreNetworkId): Self = StObject.set(x, "CoreNetworkId", value.asInstanceOf[js.Any])
    
    inline def setCoreNetworkIdUndefined: Self = StObject.set(x, "CoreNetworkId", js.undefined)
    
    inline def setGlobalNetworkId(value: GlobalNetworkId): Self = StObject.set(x, "GlobalNetworkId", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setRegisteredGatewayArn(value: ResourceArn): Self = StObject.set(x, "RegisteredGatewayArn", value.asInstanceOf[js.Any])
    
    inline def setRegisteredGatewayArnUndefined: Self = StObject.set(x, "RegisteredGatewayArn", js.undefined)
    
    inline def setResourceArn(value: ResourceArn): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
    
    inline def setResourceArnUndefined: Self = StObject.set(x, "ResourceArn", js.undefined)
    
    inline def setResourceType(value: ConstrainedString): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeUndefined: Self = StObject.set(x, "ResourceType", js.undefined)
  }
}
