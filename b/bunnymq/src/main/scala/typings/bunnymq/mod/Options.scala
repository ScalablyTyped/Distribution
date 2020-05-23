package typings.bunnymq.mod

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
    prefetch: js.UndefOr[Double] = js.undefined,
    requeue: js.UndefOr[Boolean] = js.undefined,
    rpcTimeout: js.UndefOr[Double] = js.undefined,
    timeout: js.UndefOr[Double] = js.undefined,
    transport: js.Any = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (consumerSuffix != null) __obj.updateDynamic("consumerSuffix")(consumerSuffix.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (hostname != null) __obj.updateDynamic("hostname")(hostname.asInstanceOf[js.Any])
    if (!js.isUndefined(prefetch)) __obj.updateDynamic("prefetch")(prefetch.get.asInstanceOf[js.Any])
    if (!js.isUndefined(requeue)) __obj.updateDynamic("requeue")(requeue.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rpcTimeout)) __obj.updateDynamic("rpcTimeout")(rpcTimeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    if (transport != null) __obj.updateDynamic("transport")(transport.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

