package typings.awsSdk.iotsitewiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeGatewayResponse extends js.Object {
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
    lastUpdateDate: Timestamp,
    gatewayPlatform: GatewayPlatform = null
  ): DescribeGatewayResponse = {
    val __obj = js.Dynamic.literal(creationDate = creationDate.asInstanceOf[js.Any], gatewayArn = gatewayArn.asInstanceOf[js.Any], gatewayCapabilitySummaries = gatewayCapabilitySummaries.asInstanceOf[js.Any], gatewayId = gatewayId.asInstanceOf[js.Any], gatewayName = gatewayName.asInstanceOf[js.Any], lastUpdateDate = lastUpdateDate.asInstanceOf[js.Any])
    if (gatewayPlatform != null) __obj.updateDynamic("gatewayPlatform")(gatewayPlatform.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeGatewayResponse]
  }
}

