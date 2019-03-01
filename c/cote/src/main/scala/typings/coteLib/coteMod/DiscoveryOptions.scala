package typings
package coteLib.coteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiscoveryOptions extends js.Object {
  /**
    * Address to bind to.
    */
  var address: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Broadcast address if using broadcast.
    */
  var broadcast: js.UndefOr[java.lang.String] = js.undefined
  /**
    * How often to to check for missing nodes in milliseconds.
    */
  var checkInterval: js.UndefOr[scala.Double] = js.undefined
  /**
    * Prevents Monitor from drawing.
    */
  var disableScreen: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * How often to broadcast a hello packet in milliseconds.
    */
  var helloInterval: js.UndefOr[scala.Double] = js.undefined
  /**
    * Notifies when another service goes online.
    */
  var helloLogsEnabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Ignores messages from other services within the same process.
    */
  var ignoreProcess: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If false, disables `helloLogsEnabled` and `statusLogsEnabled` no matter
    * what value they have, and also own hello log.
    */
  var log: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Consider a master node dead if not seen in this many milliseconds.
    */
  var masterTimeout: js.UndefOr[scala.Double] = js.undefined
  /**
    * Skips key equality checks when logging.
    */
  var monitor: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Multicast address if using multicast.
    */
  var multicast: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Consider a node dead if not seen in this many milliseconds.
    */
  var nodeTimeout: js.UndefOr[scala.Double] = js.undefined
  /**
    * Milliseconds between emissions of own status for monitoring.
    */
  var statusInterval: js.UndefOr[scala.Double] = js.undefined
  /**
    * Notifies when another service goes online or offline. If false, disables
    * `helloLogsEnabled` as well.
    */
  var statusLogsEnabled: js.UndefOr[scala.Boolean] = js.undefined
}

object DiscoveryOptions {
  @scala.inline
  def apply(
    address: java.lang.String = null,
    broadcast: java.lang.String = null,
    checkInterval: scala.Int | scala.Double = null,
    disableScreen: js.UndefOr[scala.Boolean] = js.undefined,
    helloInterval: scala.Int | scala.Double = null,
    helloLogsEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    ignoreProcess: js.UndefOr[scala.Boolean] = js.undefined,
    log: js.UndefOr[scala.Boolean] = js.undefined,
    masterTimeout: scala.Int | scala.Double = null,
    monitor: js.UndefOr[scala.Boolean] = js.undefined,
    multicast: java.lang.String = null,
    nodeTimeout: scala.Int | scala.Double = null,
    statusInterval: scala.Int | scala.Double = null,
    statusLogsEnabled: js.UndefOr[scala.Boolean] = js.undefined
  ): DiscoveryOptions = {
    val __obj = js.Dynamic.literal()
    if (address != null) __obj.updateDynamic("address")(address)
    if (broadcast != null) __obj.updateDynamic("broadcast")(broadcast)
    if (checkInterval != null) __obj.updateDynamic("checkInterval")(checkInterval.asInstanceOf[js.Any])
    if (!js.isUndefined(disableScreen)) __obj.updateDynamic("disableScreen")(disableScreen)
    if (helloInterval != null) __obj.updateDynamic("helloInterval")(helloInterval.asInstanceOf[js.Any])
    if (!js.isUndefined(helloLogsEnabled)) __obj.updateDynamic("helloLogsEnabled")(helloLogsEnabled)
    if (!js.isUndefined(ignoreProcess)) __obj.updateDynamic("ignoreProcess")(ignoreProcess)
    if (!js.isUndefined(log)) __obj.updateDynamic("log")(log)
    if (masterTimeout != null) __obj.updateDynamic("masterTimeout")(masterTimeout.asInstanceOf[js.Any])
    if (!js.isUndefined(monitor)) __obj.updateDynamic("monitor")(monitor)
    if (multicast != null) __obj.updateDynamic("multicast")(multicast)
    if (nodeTimeout != null) __obj.updateDynamic("nodeTimeout")(nodeTimeout.asInstanceOf[js.Any])
    if (statusInterval != null) __obj.updateDynamic("statusInterval")(statusInterval.asInstanceOf[js.Any])
    if (!js.isUndefined(statusLogsEnabled)) __obj.updateDynamic("statusLogsEnabled")(statusLogsEnabled)
    __obj.asInstanceOf[DiscoveryOptions]
  }
}

