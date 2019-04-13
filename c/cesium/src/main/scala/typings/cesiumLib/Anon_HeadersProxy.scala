package typings
package cesiumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HeadersProxy extends js.Object {
  var headers: js.UndefOr[js.Any] = js.undefined
  var proxy: js.UndefOr[cesiumLib.cesiumMod.DefaultProxy] = js.undefined
  var queryParameters: js.UndefOr[js.Any] = js.undefined
  var request: js.UndefOr[stdLib.Request] = js.undefined
  var retryAttempts: js.UndefOr[scala.Double] = js.undefined
  var retryCallback: js.UndefOr[cesiumLib.cesiumMod.ResourceNs.RetryCallback] = js.undefined
  var templateValues: js.UndefOr[js.Any] = js.undefined
  var url: java.lang.String
}

object Anon_HeadersProxy {
  @scala.inline
  def apply(
    url: java.lang.String,
    headers: js.Any = null,
    proxy: cesiumLib.cesiumMod.DefaultProxy = null,
    queryParameters: js.Any = null,
    request: stdLib.Request = null,
    retryAttempts: scala.Int | scala.Double = null,
    retryCallback: cesiumLib.cesiumMod.ResourceNs.RetryCallback = null,
    templateValues: js.Any = null
  ): Anon_HeadersProxy = {
    val __obj = js.Dynamic.literal(url = url)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (proxy != null) __obj.updateDynamic("proxy")(proxy)
    if (queryParameters != null) __obj.updateDynamic("queryParameters")(queryParameters)
    if (request != null) __obj.updateDynamic("request")(request)
    if (retryAttempts != null) __obj.updateDynamic("retryAttempts")(retryAttempts.asInstanceOf[js.Any])
    if (retryCallback != null) __obj.updateDynamic("retryCallback")(retryCallback)
    if (templateValues != null) __obj.updateDynamic("templateValues")(templateValues)
    __obj.asInstanceOf[Anon_HeadersProxy]
  }
}

