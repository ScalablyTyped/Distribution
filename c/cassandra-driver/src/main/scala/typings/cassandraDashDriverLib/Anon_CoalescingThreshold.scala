package typings
package cassandraDashDriverLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CoalescingThreshold extends js.Object {
  var coalescingThreshold: js.UndefOr[scala.Double] = js.undefined
  var connectTimeout: js.UndefOr[scala.Double] = js.undefined
  var defunctReadTimeoutThreshold: js.UndefOr[scala.Double] = js.undefined
  var keepAlive: js.UndefOr[scala.Boolean] = js.undefined
  var keepAliveDelay: js.UndefOr[scala.Double] = js.undefined
  var readTimeout: js.UndefOr[scala.Double] = js.undefined
  var tcpNoDelay: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_CoalescingThreshold {
  @scala.inline
  def apply(
    coalescingThreshold: scala.Int | scala.Double = null,
    connectTimeout: scala.Int | scala.Double = null,
    defunctReadTimeoutThreshold: scala.Int | scala.Double = null,
    keepAlive: js.UndefOr[scala.Boolean] = js.undefined,
    keepAliveDelay: scala.Int | scala.Double = null,
    readTimeout: scala.Int | scala.Double = null,
    tcpNoDelay: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_CoalescingThreshold = {
    val __obj = js.Dynamic.literal()
    if (coalescingThreshold != null) __obj.updateDynamic("coalescingThreshold")(coalescingThreshold.asInstanceOf[js.Any])
    if (connectTimeout != null) __obj.updateDynamic("connectTimeout")(connectTimeout.asInstanceOf[js.Any])
    if (defunctReadTimeoutThreshold != null) __obj.updateDynamic("defunctReadTimeoutThreshold")(defunctReadTimeoutThreshold.asInstanceOf[js.Any])
    if (!js.isUndefined(keepAlive)) __obj.updateDynamic("keepAlive")(keepAlive)
    if (keepAliveDelay != null) __obj.updateDynamic("keepAliveDelay")(keepAliveDelay.asInstanceOf[js.Any])
    if (readTimeout != null) __obj.updateDynamic("readTimeout")(readTimeout.asInstanceOf[js.Any])
    if (!js.isUndefined(tcpNoDelay)) __obj.updateDynamic("tcpNoDelay")(tcpNoDelay)
    __obj.asInstanceOf[Anon_CoalescingThreshold]
  }
}

