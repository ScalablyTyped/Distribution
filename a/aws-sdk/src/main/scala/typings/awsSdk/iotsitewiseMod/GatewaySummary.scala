package typings.awsSdk.iotsitewiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GatewaySummary extends js.Object {
  /**
    * The date the gateway was created, in Unix epoch time.
    */
  var creationDate: Timestamp = js.native
  /**
    * A list of gateway capability summaries that each contain a namespace and status. Each gateway capability defines data sources for the gateway. To retrieve a capability configuration's definition, use DescribeGatewayCapabilityConfiguration.
    */
  var gatewayCapabilitySummaries: js.UndefOr[GatewayCapabilitySummaries] = js.native
  /**
    * The ID of the gateway device.
    */
  var gatewayId: ID = js.native
  /**
    * The name of the asset.
    */
  var gatewayName: Name = js.native
  /**
    * The date the gateway was last updated, in Unix epoch time.
    */
  var lastUpdateDate: Timestamp = js.native
}

object GatewaySummary {
  @scala.inline
  def apply(
    creationDate: Timestamp,
    gatewayId: ID,
    gatewayName: Name,
    lastUpdateDate: Timestamp,
    gatewayCapabilitySummaries: GatewayCapabilitySummaries = null
  ): GatewaySummary = {
    val __obj = js.Dynamic.literal(creationDate = creationDate.asInstanceOf[js.Any], gatewayId = gatewayId.asInstanceOf[js.Any], gatewayName = gatewayName.asInstanceOf[js.Any], lastUpdateDate = lastUpdateDate.asInstanceOf[js.Any])
    if (gatewayCapabilitySummaries != null) __obj.updateDynamic("gatewayCapabilitySummaries")(gatewayCapabilitySummaries.asInstanceOf[js.Any])
    __obj.asInstanceOf[GatewaySummary]
  }
}

