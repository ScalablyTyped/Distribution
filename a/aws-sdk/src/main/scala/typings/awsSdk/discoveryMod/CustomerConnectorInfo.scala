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
}

