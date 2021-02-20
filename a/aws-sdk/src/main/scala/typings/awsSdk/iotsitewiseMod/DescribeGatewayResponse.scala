package typings.awsSdk.iotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeGatewayResponse extends StObject {
  
  /**
    * The date the gateway was created, in Unix epoch time.
    */
  var creationDate: Timestamp = js.native
  
  /**
    * The ARN of the gateway, which has the following format.  arn:${Partition}:iotsitewise:${Region}:${Account}:gateway/${GatewayId} 
    */
  var gatewayArn: ARN = js.native
  
  /**
    * A list of gateway capability summaries that each contain a namespace and status. Each gateway capability defines data sources for the gateway. To retrieve a capability configuration's definition, use DescribeGatewayCapabilityConfiguration.
    */
  var gatewayCapabilitySummaries: GatewayCapabilitySummaries = js.native
  
  /**
    * The ID of the gateway device.
    */
  var gatewayId: ID = js.native
  
  /**
    * The name of the gateway.
    */
  var gatewayName: Name = js.native
  
  /**
    * The gateway's platform.
    */
  var gatewayPlatform: js.UndefOr[GatewayPlatform] = js.native
  
  /**
    * The date the gateway was last updated, in Unix epoch time.
    */
  var lastUpdateDate: Timestamp = js.native
}
object DescribeGatewayResponse {
  
  @scala.inline
  def apply(
    creationDate: Timestamp,
    gatewayArn: ARN,
    gatewayCapabilitySummaries: GatewayCapabilitySummaries,
    gatewayId: ID,
    gatewayName: Name,
    lastUpdateDate: Timestamp
  ): DescribeGatewayResponse = {
    val __obj = js.Dynamic.literal(creationDate = creationDate.asInstanceOf[js.Any], gatewayArn = gatewayArn.asInstanceOf[js.Any], gatewayCapabilitySummaries = gatewayCapabilitySummaries.asInstanceOf[js.Any], gatewayId = gatewayId.asInstanceOf[js.Any], gatewayName = gatewayName.asInstanceOf[js.Any], lastUpdateDate = lastUpdateDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeGatewayResponse]
  }
  
  @scala.inline
  implicit class DescribeGatewayResponseMutableBuilder[Self <: DescribeGatewayResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreationDate(value: Timestamp): Self = StObject.set(x, "creationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGatewayArn(value: ARN): Self = StObject.set(x, "gatewayArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGatewayCapabilitySummaries(value: GatewayCapabilitySummaries): Self = StObject.set(x, "gatewayCapabilitySummaries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGatewayCapabilitySummariesVarargs(value: GatewayCapabilitySummary*): Self = StObject.set(x, "gatewayCapabilitySummaries", js.Array(value :_*))
    
    @scala.inline
    def setGatewayId(value: ID): Self = StObject.set(x, "gatewayId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGatewayName(value: Name): Self = StObject.set(x, "gatewayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGatewayPlatform(value: GatewayPlatform): Self = StObject.set(x, "gatewayPlatform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGatewayPlatformUndefined: Self = StObject.set(x, "gatewayPlatform", js.undefined)
    
    @scala.inline
    def setLastUpdateDate(value: Timestamp): Self = StObject.set(x, "lastUpdateDate", value.asInstanceOf[js.Any])
  }
}
