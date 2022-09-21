package typings.awsSdk.iotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GatewaySummary extends StObject {
  
  /**
    * The date the gateway was created, in Unix epoch time.
    */
  var creationDate: js.Date
  
  /**
    * A list of gateway capability summaries that each contain a namespace and status. Each gateway capability defines data sources for the gateway. To retrieve a capability configuration's definition, use DescribeGatewayCapabilityConfiguration.
    */
  var gatewayCapabilitySummaries: js.UndefOr[GatewayCapabilitySummaries] = js.undefined
  
  /**
    * The ID of the gateway device.
    */
  var gatewayId: ID
  
  /**
    * The name of the asset.
    */
  var gatewayName: Name
  
  var gatewayPlatform: js.UndefOr[GatewayPlatform] = js.undefined
  
  /**
    * The date the gateway was last updated, in Unix epoch time.
    */
  var lastUpdateDate: js.Date
}
object GatewaySummary {
  
  inline def apply(creationDate: js.Date, gatewayId: ID, gatewayName: Name, lastUpdateDate: js.Date): GatewaySummary = {
    val __obj = js.Dynamic.literal(creationDate = creationDate.asInstanceOf[js.Any], gatewayId = gatewayId.asInstanceOf[js.Any], gatewayName = gatewayName.asInstanceOf[js.Any], lastUpdateDate = lastUpdateDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[GatewaySummary]
  }
  
  extension [Self <: GatewaySummary](x: Self) {
    
    inline def setCreationDate(value: js.Date): Self = StObject.set(x, "creationDate", value.asInstanceOf[js.Any])
    
    inline def setGatewayCapabilitySummaries(value: GatewayCapabilitySummaries): Self = StObject.set(x, "gatewayCapabilitySummaries", value.asInstanceOf[js.Any])
    
    inline def setGatewayCapabilitySummariesUndefined: Self = StObject.set(x, "gatewayCapabilitySummaries", js.undefined)
    
    inline def setGatewayCapabilitySummariesVarargs(value: GatewayCapabilitySummary*): Self = StObject.set(x, "gatewayCapabilitySummaries", js.Array(value*))
    
    inline def setGatewayId(value: ID): Self = StObject.set(x, "gatewayId", value.asInstanceOf[js.Any])
    
    inline def setGatewayName(value: Name): Self = StObject.set(x, "gatewayName", value.asInstanceOf[js.Any])
    
    inline def setGatewayPlatform(value: GatewayPlatform): Self = StObject.set(x, "gatewayPlatform", value.asInstanceOf[js.Any])
    
    inline def setGatewayPlatformUndefined: Self = StObject.set(x, "gatewayPlatform", js.undefined)
    
    inline def setLastUpdateDate(value: js.Date): Self = StObject.set(x, "lastUpdateDate", value.asInstanceOf[js.Any])
  }
}
