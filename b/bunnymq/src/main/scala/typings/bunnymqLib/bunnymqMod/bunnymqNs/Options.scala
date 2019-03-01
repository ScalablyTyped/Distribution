package typings
package bunnymqLib.bunnymqMod.bunnymqNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var consumerSuffix: js.UndefOr[java.lang.String] = js.undefined
  var host: js.UndefOr[java.lang.String] = js.undefined
  var hostname: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Number of fetched messages at once on the channel.
    *
    */
  var prefetch: js.UndefOr[scala.Double] = js.undefined
  /**
    * Requeue put back message into the broker if consumer crashes/trigger exception.
    *
    */
  var requeue: js.UndefOr[scala.Boolean] = js.undefined
  var rpcTimeout: js.UndefOr[scala.Double] = js.undefined
  var timeout: js.UndefOr[scala.Double] = js.undefined
  var transport: js.UndefOr[js.Any] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    consumerSuffix: java.lang.String = null,
    host: java.lang.String = null,
    hostname: java.lang.String = null,
    prefetch: scala.Int | scala.Double = null,
    requeue: js.UndefOr[scala.Boolean] = js.undefined,
    rpcTimeout: scala.Int | scala.Double = null,
    timeout: scala.Int | scala.Double = null,
    transport: js.Any = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (consumerSuffix != null) __obj.updateDynamic("consumerSuffix")(consumerSuffix)
    if (host != null) __obj.updateDynamic("host")(host)
    if (hostname != null) __obj.updateDynamic("hostname")(hostname)
    if (prefetch != null) __obj.updateDynamic("prefetch")(prefetch.asInstanceOf[js.Any])
    if (!js.isUndefined(requeue)) __obj.updateDynamic("requeue")(requeue)
    if (rpcTimeout != null) __obj.updateDynamic("rpcTimeout")(rpcTimeout.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (transport != null) __obj.updateDynamic("transport")(transport)
    __obj.asInstanceOf[Options]
  }
}

