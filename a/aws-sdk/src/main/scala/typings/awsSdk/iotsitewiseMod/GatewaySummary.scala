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
  def apply(creationDate: Timestamp, gatewayId: ID, gatewayName: Name, lastUpdateDate: Timestamp): GatewaySummary = {
    val __obj = js.Dynamic.literal(creationDate = creationDate.asInstanceOf[js.Any], gatewayId = gatewayId.asInstanceOf[js.Any], gatewayName = gatewayName.asInstanceOf[js.Any], lastUpdateDate = lastUpdateDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[GatewaySummary]
  }
  @scala.inline
  implicit class GatewaySummaryOps[Self <: GatewaySummary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCreationDate(value: Timestamp): Self = this.set("creationDate", value.asInstanceOf[js.Any])
    @scala.inline
    def setGatewayId(value: ID): Self = this.set("gatewayId", value.asInstanceOf[js.Any])
    @scala.inline
    def setGatewayName(value: Name): Self = this.set("gatewayName", value.asInstanceOf[js.Any])
    @scala.inline
    def setLastUpdateDate(value: Timestamp): Self = this.set("lastUpdateDate", value.asInstanceOf[js.Any])
    @scala.inline
    def setGatewayCapabilitySummariesVarargs(value: GatewayCapabilitySummary*): Self = this.set("gatewayCapabilitySummaries", js.Array(value :_*))
    @scala.inline
    def setGatewayCapabilitySummaries(value: GatewayCapabilitySummaries): Self = this.set("gatewayCapabilitySummaries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGatewayCapabilitySummaries: Self = this.set("gatewayCapabilitySummaries", js.undefined)
  }
  
}

