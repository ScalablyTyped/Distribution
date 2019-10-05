package typings.cesium

import typings.cesium.cesiumMod.DefaultProxy
import typings.cesium.cesiumMod.Resource
import typings.cesium.cesiumMod.Resource.RetryCallback
import typings.std.Error
import typings.std.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HeadersPreserveQueryParameters extends js.Object {
  var headers: js.UndefOr[js.Any] = js.undefined
  var preserveQueryParameters: js.UndefOr[Boolean] = js.undefined
  var proxy: js.UndefOr[DefaultProxy] = js.undefined
  var queryParameters: js.UndefOr[js.Any] = js.undefined
  var request: js.UndefOr[Request] = js.undefined
  var retryAttempts: js.UndefOr[Double] = js.undefined
  var retryCallback: js.UndefOr[RetryCallback] = js.undefined
  var templateValues: js.UndefOr[js.Any] = js.undefined
  var url: js.UndefOr[String] = js.undefined
}

object Anon_HeadersPreserveQueryParameters {
  @scala.inline
  def apply(
    headers: js.Any = null,
    preserveQueryParameters: js.UndefOr[Boolean] = js.undefined,
    proxy: DefaultProxy = null,
    queryParameters: js.Any = null,
    request: Request = null,
    retryAttempts: Int | Double = null,
    retryCallback: (/* resource */ Resource, /* error */ Error) => Unit = null,
    templateValues: js.Any = null,
    url: String = null
  ): Anon_HeadersPreserveQueryParameters = {
    val __obj = js.Dynamic.literal()
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (!js.isUndefined(preserveQueryParameters)) __obj.updateDynamic("preserveQueryParameters")(preserveQueryParameters)
    if (proxy != null) __obj.updateDynamic("proxy")(proxy)
    if (queryParameters != null) __obj.updateDynamic("queryParameters")(queryParameters)
    if (request != null) __obj.updateDynamic("request")(request)
    if (retryAttempts != null) __obj.updateDynamic("retryAttempts")(retryAttempts.asInstanceOf[js.Any])
    if (retryCallback != null) __obj.updateDynamic("retryCallback")(js.Any.fromFunction2(retryCallback))
    if (templateValues != null) __obj.updateDynamic("templateValues")(templateValues)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[Anon_HeadersPreserveQueryParameters]
  }
}

