package typings.cesium

import typings.cesium.cesiumMod.DefaultProxy
import typings.cesium.cesiumMod.Resource
import typings.cesium.cesiumMod.Resource.RetryCallback
import typings.std.Error
import typings.std.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HeadersProxy extends js.Object {
  var headers: js.UndefOr[js.Any] = js.undefined
  var proxy: js.UndefOr[DefaultProxy] = js.undefined
  var queryParameters: js.UndefOr[js.Any] = js.undefined
  var request: js.UndefOr[Request] = js.undefined
  var retryAttempts: js.UndefOr[Double] = js.undefined
  var retryCallback: js.UndefOr[RetryCallback] = js.undefined
  var templateValues: js.UndefOr[js.Any] = js.undefined
  var url: String
}

object Anon_HeadersProxy {
  @scala.inline
  def apply(
    url: String,
    headers: js.Any = null,
    proxy: DefaultProxy = null,
    queryParameters: js.Any = null,
    request: Request = null,
    retryAttempts: Int | Double = null,
    retryCallback: (/* resource */ Resource, /* error */ Error) => Unit = null,
    templateValues: js.Any = null
  ): Anon_HeadersProxy = {
    val __obj = js.Dynamic.literal(url = url)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (proxy != null) __obj.updateDynamic("proxy")(proxy)
    if (queryParameters != null) __obj.updateDynamic("queryParameters")(queryParameters)
    if (request != null) __obj.updateDynamic("request")(request)
    if (retryAttempts != null) __obj.updateDynamic("retryAttempts")(retryAttempts.asInstanceOf[js.Any])
    if (retryCallback != null) __obj.updateDynamic("retryCallback")(js.Any.fromFunction2(retryCallback))
    if (templateValues != null) __obj.updateDynamic("templateValues")(templateValues)
    __obj.asInstanceOf[Anon_HeadersProxy]
  }
}

