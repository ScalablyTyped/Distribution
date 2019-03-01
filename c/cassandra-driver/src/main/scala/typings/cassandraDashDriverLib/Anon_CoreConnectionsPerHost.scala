package typings
package cassandraDashDriverLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CoreConnectionsPerHost extends js.Object {
  var coreConnectionsPerHost: js.UndefOr[org.scalablytyped.runtime.NumberDictionary[scala.Double]] = js.undefined
  var heartBeatInterval: js.UndefOr[scala.Double] = js.undefined
  var maxRequestsPerConnection: js.UndefOr[scala.Double] = js.undefined
  var warmup: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_CoreConnectionsPerHost {
  @scala.inline
  def apply(
    coreConnectionsPerHost: org.scalablytyped.runtime.NumberDictionary[scala.Double] = null,
    heartBeatInterval: scala.Int | scala.Double = null,
    maxRequestsPerConnection: scala.Int | scala.Double = null,
    warmup: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_CoreConnectionsPerHost = {
    val __obj = js.Dynamic.literal()
    if (coreConnectionsPerHost != null) __obj.updateDynamic("coreConnectionsPerHost")(coreConnectionsPerHost)
    if (heartBeatInterval != null) __obj.updateDynamic("heartBeatInterval")(heartBeatInterval.asInstanceOf[js.Any])
    if (maxRequestsPerConnection != null) __obj.updateDynamic("maxRequestsPerConnection")(maxRequestsPerConnection.asInstanceOf[js.Any])
    if (!js.isUndefined(warmup)) __obj.updateDynamic("warmup")(warmup)
    __obj.asInstanceOf[Anon_CoreConnectionsPerHost]
  }
}

