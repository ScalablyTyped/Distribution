package typings.cassandraDriver

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCoalescingThreshold extends js.Object {
  var coalescingThreshold: js.UndefOr[Double] = js.undefined
  var connectTimeout: js.UndefOr[Double] = js.undefined
  var defunctReadTimeoutThreshold: js.UndefOr[Double] = js.undefined
  var keepAlive: js.UndefOr[Boolean] = js.undefined
  var keepAliveDelay: js.UndefOr[Double] = js.undefined
  var readTimeout: js.UndefOr[Double] = js.undefined
  var tcpNoDelay: js.UndefOr[Boolean] = js.undefined
}

object AnonCoalescingThreshold {
  @scala.inline
  def apply(
    coalescingThreshold: Int | Double = null,
    connectTimeout: Int | Double = null,
    defunctReadTimeoutThreshold: Int | Double = null,
    keepAlive: js.UndefOr[Boolean] = js.undefined,
    keepAliveDelay: Int | Double = null,
    readTimeout: Int | Double = null,
    tcpNoDelay: js.UndefOr[Boolean] = js.undefined
  ): AnonCoalescingThreshold = {
    val __obj = js.Dynamic.literal()
    if (coalescingThreshold != null) __obj.updateDynamic("coalescingThreshold")(coalescingThreshold.asInstanceOf[js.Any])
    if (connectTimeout != null) __obj.updateDynamic("connectTimeout")(connectTimeout.asInstanceOf[js.Any])
    if (defunctReadTimeoutThreshold != null) __obj.updateDynamic("defunctReadTimeoutThreshold")(defunctReadTimeoutThreshold.asInstanceOf[js.Any])
    if (!js.isUndefined(keepAlive)) __obj.updateDynamic("keepAlive")(keepAlive.asInstanceOf[js.Any])
    if (keepAliveDelay != null) __obj.updateDynamic("keepAliveDelay")(keepAliveDelay.asInstanceOf[js.Any])
    if (readTimeout != null) __obj.updateDynamic("readTimeout")(readTimeout.asInstanceOf[js.Any])
    if (!js.isUndefined(tcpNoDelay)) __obj.updateDynamic("tcpNoDelay")(tcpNoDelay.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCoalescingThreshold]
  }
}

