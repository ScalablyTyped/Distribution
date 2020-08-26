package typings.awsSdk.discoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomerConnectorInfo extends js.Object {
  /**
    * Number of active discovery connectors.
    */
  var activeConnectors: Integer = js.native
  /**
    * Number of blacklisted discovery connectors.
    */
  var blackListedConnectors: Integer = js.native
  /**
    * Number of healthy discovery connectors.
    */
  var healthyConnectors: Integer = js.native
  /**
    * Number of discovery connectors with status SHUTDOWN,
    */
  var shutdownConnectors: Integer = js.native
  /**
    * Total number of discovery connectors.
    */
  var totalConnectors: Integer = js.native
  /**
    * Number of unhealthy discovery connectors.
    */
  var unhealthyConnectors: Integer = js.native
  /**
    * Number of unknown discovery connectors.
    */
  var unknownConnectors: Integer = js.native
}

object CustomerConnectorInfo {
  @scala.inline
  def apply(
    activeConnectors: Integer,
    blackListedConnectors: Integer,
    healthyConnectors: Integer,
    shutdownConnectors: Integer,
    totalConnectors: Integer,
    unhealthyConnectors: Integer,
    unknownConnectors: Integer
  ): CustomerConnectorInfo = {
    val __obj = js.Dynamic.literal(activeConnectors = activeConnectors.asInstanceOf[js.Any], blackListedConnectors = blackListedConnectors.asInstanceOf[js.Any], healthyConnectors = healthyConnectors.asInstanceOf[js.Any], shutdownConnectors = shutdownConnectors.asInstanceOf[js.Any], totalConnectors = totalConnectors.asInstanceOf[js.Any], unhealthyConnectors = unhealthyConnectors.asInstanceOf[js.Any], unknownConnectors = unknownConnectors.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomerConnectorInfo]
  }
  @scala.inline
  implicit class CustomerConnectorInfoOps[Self <: CustomerConnectorInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setActiveConnectors(value: Integer): Self = this.set("activeConnectors", value.asInstanceOf[js.Any])
    @scala.inline
    def setBlackListedConnectors(value: Integer): Self = this.set("blackListedConnectors", value.asInstanceOf[js.Any])
    @scala.inline
    def setHealthyConnectors(value: Integer): Self = this.set("healthyConnectors", value.asInstanceOf[js.Any])
    @scala.inline
    def setShutdownConnectors(value: Integer): Self = this.set("shutdownConnectors", value.asInstanceOf[js.Any])
    @scala.inline
    def setTotalConnectors(value: Integer): Self = this.set("totalConnectors", value.asInstanceOf[js.Any])
    @scala.inline
    def setUnhealthyConnectors(value: Integer): Self = this.set("unhealthyConnectors", value.asInstanceOf[js.Any])
    @scala.inline
    def setUnknownConnectors(value: Integer): Self = this.set("unknownConnectors", value.asInstanceOf[js.Any])
  }
  
}

