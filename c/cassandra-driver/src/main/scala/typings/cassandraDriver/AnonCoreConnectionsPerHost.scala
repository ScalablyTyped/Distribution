package typings.cassandraDriver

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCoreConnectionsPerHost extends js.Object {
  var coreConnectionsPerHost: js.UndefOr[NumberDictionary[Double]] = js.undefined
  var heartBeatInterval: js.UndefOr[Double] = js.undefined
  var maxRequestsPerConnection: js.UndefOr[Double] = js.undefined
  var warmup: js.UndefOr[Boolean] = js.undefined
}

object AnonCoreConnectionsPerHost {
  @scala.inline
  def apply(
    coreConnectionsPerHost: NumberDictionary[Double] = null,
    heartBeatInterval: Int | Double = null,
    maxRequestsPerConnection: Int | Double = null,
    warmup: js.UndefOr[Boolean] = js.undefined
  ): AnonCoreConnectionsPerHost = {
    val __obj = js.Dynamic.literal()
    if (coreConnectionsPerHost != null) __obj.updateDynamic("coreConnectionsPerHost")(coreConnectionsPerHost.asInstanceOf[js.Any])
    if (heartBeatInterval != null) __obj.updateDynamic("heartBeatInterval")(heartBeatInterval.asInstanceOf[js.Any])
    if (maxRequestsPerConnection != null) __obj.updateDynamic("maxRequestsPerConnection")(maxRequestsPerConnection.asInstanceOf[js.Any])
    if (!js.isUndefined(warmup)) __obj.updateDynamic("warmup")(warmup.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCoreConnectionsPerHost]
  }
}

