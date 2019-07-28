package typings.bunnymq.bunnymqMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var consumerSuffix: js.UndefOr[String] = js.undefined
  var host: js.UndefOr[String] = js.undefined
  var hostname: js.UndefOr[String] = js.undefined
  /**
    * Number of fetched messages at once on the channel.
    *
    */
  var prefetch: js.UndefOr[Double] = js.undefined
  /**
    * Requeue put back message into the broker if consumer crashes/trigger exception.
    *
    */
  var requeue: js.UndefOr[Boolean] = js.undefined
  var rpcTimeout: js.UndefOr[Double] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
  var transport: js.UndefOr[js.Any] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    consumerSuffix: String = null,
    host: String = null,
    hostname: String = null,
    prefetch: Int | Double = null,
    requeue: js.UndefOr[Boolean] = js.undefined,
    rpcTimeout: Int | Double = null,
    timeout: Int | Double = null,
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

