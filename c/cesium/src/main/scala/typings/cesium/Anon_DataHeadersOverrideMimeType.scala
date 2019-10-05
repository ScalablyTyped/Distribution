package typings.cesium

import typings.cesium.cesiumMod.DefaultProxy
import typings.cesium.cesiumMod.Resource
import typings.cesium.cesiumMod.Resource.RetryCallback
import typings.std.Error
import typings.std.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DataHeadersOverrideMimeType extends js.Object {
  var data: js.UndefOr[js.Any] = js.undefined
  var headers: js.UndefOr[js.Any] = js.undefined
  var overrideMimeType: js.UndefOr[String] = js.undefined
  var proxy: js.UndefOr[DefaultProxy] = js.undefined
  var queryParameters: js.UndefOr[js.Any] = js.undefined
  var request: js.UndefOr[Request] = js.undefined
  var responseType: js.UndefOr[String] = js.undefined
  var retryAttempts: js.UndefOr[Double] = js.undefined
  var retryCallback: js.UndefOr[RetryCallback] = js.undefined
  var templateValues: js.UndefOr[js.Any] = js.undefined
  var url: String
}

object Anon_DataHeadersOverrideMimeType {
  @scala.inline
  def apply(
    url: String,
    data: js.Any = null,
    headers: js.Any = null,
    overrideMimeType: String = null,
    proxy: DefaultProxy = null,
    queryParameters: js.Any = null,
    request: Request = null,
    responseType: String = null,
    retryAttempts: Int | Double = null,
    retryCallback: (/* resource */ Resource, /* error */ Error) => Unit = null,
    templateValues: js.Any = null
  ): Anon_DataHeadersOverrideMimeType = {
    val __obj = js.Dynamic.literal(url = url)
    if (data != null) __obj.updateDynamic("data")(data)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (overrideMimeType != null) __obj.updateDynamic("overrideMimeType")(overrideMimeType)
    if (proxy != null) __obj.updateDynamic("proxy")(proxy)
    if (queryParameters != null) __obj.updateDynamic("queryParameters")(queryParameters)
    if (request != null) __obj.updateDynamic("request")(request)
    if (responseType != null) __obj.updateDynamic("responseType")(responseType)
    if (retryAttempts != null) __obj.updateDynamic("retryAttempts")(retryAttempts.asInstanceOf[js.Any])
    if (retryCallback != null) __obj.updateDynamic("retryCallback")(js.Any.fromFunction2(retryCallback))
    if (templateValues != null) __obj.updateDynamic("templateValues")(templateValues)
    __obj.asInstanceOf[Anon_DataHeadersOverrideMimeType]
  }
}

