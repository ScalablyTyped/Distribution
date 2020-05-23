package typings.cassandraDriver.anon

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CoreConnectionsPerHost extends js.Object {
  var coreConnectionsPerHost: js.UndefOr[NumberDictionary[Double]] = js.undefined
  var heartBeatInterval: js.UndefOr[Double] = js.undefined
  var maxRequestsPerConnection: js.UndefOr[Double] = js.undefined
  var warmup: js.UndefOr[Boolean] = js.undefined
}

object CoreConnectionsPerHost {
  @scala.inline
  def apply(
    coreConnectionsPerHost: NumberDictionary[Double] = null,
    heartBeatInterval: js.UndefOr[Double] = js.undefined,
    maxRequestsPerConnection: js.UndefOr[Double] = js.undefined,
    warmup: js.UndefOr[Boolean] = js.undefined
  ): CoreConnectionsPerHost = {
    val __obj = js.Dynamic.literal()
    if (coreConnectionsPerHost != null) __obj.updateDynamic("coreConnectionsPerHost")(coreConnectionsPerHost.asInstanceOf[js.Any])
    if (!js.isUndefined(heartBeatInterval)) __obj.updateDynamic("heartBeatInterval")(heartBeatInterval.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxRequestsPerConnection)) __obj.updateDynamic("maxRequestsPerConnection")(maxRequestsPerConnection.get.asInstanceOf[js.Any])
    if (!js.isUndefined(warmup)) __obj.updateDynamic("warmup")(warmup.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoreConnectionsPerHost]
  }
}

