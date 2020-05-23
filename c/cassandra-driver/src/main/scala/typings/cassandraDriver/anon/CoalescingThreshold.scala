package typings.cassandraDriver.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CoalescingThreshold extends js.Object {
  var coalescingThreshold: js.UndefOr[Double] = js.undefined
  var connectTimeout: js.UndefOr[Double] = js.undefined
  var defunctReadTimeoutThreshold: js.UndefOr[Double] = js.undefined
  var keepAlive: js.UndefOr[Boolean] = js.undefined
  var keepAliveDelay: js.UndefOr[Double] = js.undefined
  var readTimeout: js.UndefOr[Double] = js.undefined
  var tcpNoDelay: js.UndefOr[Boolean] = js.undefined
}

object CoalescingThreshold {
  @scala.inline
  def apply(
    coalescingThreshold: js.UndefOr[Double] = js.undefined,
    connectTimeout: js.UndefOr[Double] = js.undefined,
    defunctReadTimeoutThreshold: js.UndefOr[Double] = js.undefined,
    keepAlive: js.UndefOr[Boolean] = js.undefined,
    keepAliveDelay: js.UndefOr[Double] = js.undefined,
    readTimeout: js.UndefOr[Double] = js.undefined,
    tcpNoDelay: js.UndefOr[Boolean] = js.undefined
  ): CoalescingThreshold = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(coalescingThreshold)) __obj.updateDynamic("coalescingThreshold")(coalescingThreshold.get.asInstanceOf[js.Any])
    if (!js.isUndefined(connectTimeout)) __obj.updateDynamic("connectTimeout")(connectTimeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(defunctReadTimeoutThreshold)) __obj.updateDynamic("defunctReadTimeoutThreshold")(defunctReadTimeoutThreshold.get.asInstanceOf[js.Any])
    if (!js.isUndefined(keepAlive)) __obj.updateDynamic("keepAlive")(keepAlive.get.asInstanceOf[js.Any])
    if (!js.isUndefined(keepAliveDelay)) __obj.updateDynamic("keepAliveDelay")(keepAliveDelay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(readTimeout)) __obj.updateDynamic("readTimeout")(readTimeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tcpNoDelay)) __obj.updateDynamic("tcpNoDelay")(tcpNoDelay.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoalescingThreshold]
  }
}

