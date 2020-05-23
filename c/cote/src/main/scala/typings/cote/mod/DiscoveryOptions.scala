package typings.cote.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiscoveryOptions extends js.Object {
  /**
    * Address to bind to.
    */
  var address: js.UndefOr[String] = js.undefined
  /**
    * Broadcast address if using broadcast.
    */
  var broadcast: js.UndefOr[String] = js.undefined
  /**
    * How often to to check for missing nodes in milliseconds.
    */
  var checkInterval: js.UndefOr[Double] = js.undefined
  /**
    * Prevents Monitor from drawing.
    */
  var disableScreen: js.UndefOr[Boolean] = js.undefined
  /**
    * How often to broadcast a hello packet in milliseconds.
    */
  var helloInterval: js.UndefOr[Double] = js.undefined
  /**
    * Notifies when another service goes online.
    */
  var helloLogsEnabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Ignores messages from other services within the same process.
    */
  var ignoreProcess: js.UndefOr[Boolean] = js.undefined
  /**
    * If false, disables `helloLogsEnabled` and `statusLogsEnabled` no matter
    * what value they have, and also own hello log.
    */
  var log: js.UndefOr[Boolean] = js.undefined
  /**
    * Consider a master node dead if not seen in this many milliseconds.
    */
  var masterTimeout: js.UndefOr[Double] = js.undefined
  /**
    * Skips key equality checks when logging.
    */
  var monitor: js.UndefOr[Boolean] = js.undefined
  /**
    * Multicast address if using multicast.
    */
  var multicast: js.UndefOr[String] = js.undefined
  /**
    * Consider a node dead if not seen in this many milliseconds.
    */
  var nodeTimeout: js.UndefOr[Double] = js.undefined
  /**
    * Milliseconds between emissions of own status for monitoring.
    */
  var statusInterval: js.UndefOr[Double] = js.undefined
  /**
    * Notifies when another service goes online or offline. If false, disables
    * `helloLogsEnabled` as well.
    */
  var statusLogsEnabled: js.UndefOr[Boolean] = js.undefined
}

object DiscoveryOptions {
  @scala.inline
  def apply(
    address: String = null,
    broadcast: String = null,
    checkInterval: js.UndefOr[Double] = js.undefined,
    disableScreen: js.UndefOr[Boolean] = js.undefined,
    helloInterval: js.UndefOr[Double] = js.undefined,
    helloLogsEnabled: js.UndefOr[Boolean] = js.undefined,
    ignoreProcess: js.UndefOr[Boolean] = js.undefined,
    log: js.UndefOr[Boolean] = js.undefined,
    masterTimeout: js.UndefOr[Double] = js.undefined,
    monitor: js.UndefOr[Boolean] = js.undefined,
    multicast: String = null,
    nodeTimeout: js.UndefOr[Double] = js.undefined,
    statusInterval: js.UndefOr[Double] = js.undefined,
    statusLogsEnabled: js.UndefOr[Boolean] = js.undefined
  ): DiscoveryOptions = {
    val __obj = js.Dynamic.literal()
    if (address != null) __obj.updateDynamic("address")(address.asInstanceOf[js.Any])
    if (broadcast != null) __obj.updateDynamic("broadcast")(broadcast.asInstanceOf[js.Any])
    if (!js.isUndefined(checkInterval)) __obj.updateDynamic("checkInterval")(checkInterval.get.asInstanceOf[js.Any])
    if (!js.isUndefined(disableScreen)) __obj.updateDynamic("disableScreen")(disableScreen.get.asInstanceOf[js.Any])
    if (!js.isUndefined(helloInterval)) __obj.updateDynamic("helloInterval")(helloInterval.get.asInstanceOf[js.Any])
    if (!js.isUndefined(helloLogsEnabled)) __obj.updateDynamic("helloLogsEnabled")(helloLogsEnabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreProcess)) __obj.updateDynamic("ignoreProcess")(ignoreProcess.get.asInstanceOf[js.Any])
    if (!js.isUndefined(log)) __obj.updateDynamic("log")(log.get.asInstanceOf[js.Any])
    if (!js.isUndefined(masterTimeout)) __obj.updateDynamic("masterTimeout")(masterTimeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(monitor)) __obj.updateDynamic("monitor")(monitor.get.asInstanceOf[js.Any])
    if (multicast != null) __obj.updateDynamic("multicast")(multicast.asInstanceOf[js.Any])
    if (!js.isUndefined(nodeTimeout)) __obj.updateDynamic("nodeTimeout")(nodeTimeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(statusInterval)) __obj.updateDynamic("statusInterval")(statusInterval.get.asInstanceOf[js.Any])
    if (!js.isUndefined(statusLogsEnabled)) __obj.updateDynamic("statusLogsEnabled")(statusLogsEnabled.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiscoveryOptions]
  }
}

