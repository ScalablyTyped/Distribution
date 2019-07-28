package typings.cassandraDashDriver

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CoreConnectionsPerHost extends js.Object {
  var coreConnectionsPerHost: js.UndefOr[NumberDictionary[Double]] = js.undefined
  var heartBeatInterval: js.UndefOr[Double] = js.undefined
  var maxRequestsPerConnection: js.UndefOr[Double] = js.undefined
  var warmup: js.UndefOr[Boolean] = js.undefined
}

object Anon_CoreConnectionsPerHost {
  @scala.inline
  def apply(
    coreConnectionsPerHost: NumberDictionary[Double] = null,
    heartBeatInterval: Int | Double = null,
    maxRequestsPerConnection: Int | Double = null,
    warmup: js.UndefOr[Boolean] = js.undefined
  ): Anon_CoreConnectionsPerHost = {
    val __obj = js.Dynamic.literal()
    if (coreConnectionsPerHost != null) __obj.updateDynamic("coreConnectionsPerHost")(coreConnectionsPerHost)
    if (heartBeatInterval != null) __obj.updateDynamic("heartBeatInterval")(heartBeatInterval.asInstanceOf[js.Any])
    if (maxRequestsPerConnection != null) __obj.updateDynamic("maxRequestsPerConnection")(maxRequestsPerConnection.asInstanceOf[js.Any])
    if (!js.isUndefined(warmup)) __obj.updateDynamic("warmup")(warmup)
    __obj.asInstanceOf[Anon_CoreConnectionsPerHost]
  }
}

