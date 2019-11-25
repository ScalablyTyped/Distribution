package typings.cote.coteMod

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
    checkInterval: Int | Double = null,
    disableScreen: js.UndefOr[Boolean] = js.undefined,
    helloInterval: Int | Double = null,
    helloLogsEnabled: js.UndefOr[Boolean] = js.undefined,
    ignoreProcess: js.UndefOr[Boolean] = js.undefined,
    log: js.UndefOr[Boolean] = js.undefined,
    masterTimeout: Int | Double = null,
    monitor: js.UndefOr[Boolean] = js.undefined,
    multicast: String = null,
    nodeTimeout: Int | Double = null,
    statusInterval: Int | Double = null,
    statusLogsEnabled: js.UndefOr[Boolean] = js.undefined
  ): DiscoveryOptions = {
    val __obj = js.Dynamic.literal()
    if (address != null) __obj.updateDynamic("address")(address.asInstanceOf[js.Any])
    if (broadcast != null) __obj.updateDynamic("broadcast")(broadcast.asInstanceOf[js.Any])
    if (checkInterval != null) __obj.updateDynamic("checkInterval")(checkInterval.asInstanceOf[js.Any])
    if (!js.isUndefined(disableScreen)) __obj.updateDynamic("disableScreen")(disableScreen.asInstanceOf[js.Any])
    if (helloInterval != null) __obj.updateDynamic("helloInterval")(helloInterval.asInstanceOf[js.Any])
    if (!js.isUndefined(helloLogsEnabled)) __obj.updateDynamic("helloLogsEnabled")(helloLogsEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreProcess)) __obj.updateDynamic("ignoreProcess")(ignoreProcess.asInstanceOf[js.Any])
    if (!js.isUndefined(log)) __obj.updateDynamic("log")(log.asInstanceOf[js.Any])
    if (masterTimeout != null) __obj.updateDynamic("masterTimeout")(masterTimeout.asInstanceOf[js.Any])
    if (!js.isUndefined(monitor)) __obj.updateDynamic("monitor")(monitor.asInstanceOf[js.Any])
    if (multicast != null) __obj.updateDynamic("multicast")(multicast.asInstanceOf[js.Any])
    if (nodeTimeout != null) __obj.updateDynamic("nodeTimeout")(nodeTimeout.asInstanceOf[js.Any])
    if (statusInterval != null) __obj.updateDynamic("statusInterval")(statusInterval.asInstanceOf[js.Any])
    if (!js.isUndefined(statusLogsEnabled)) __obj.updateDynamic("statusLogsEnabled")(statusLogsEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiscoveryOptions]
  }
}

