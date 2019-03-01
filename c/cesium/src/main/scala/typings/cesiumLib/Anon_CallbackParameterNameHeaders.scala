package typings
package cesiumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CallbackParameterNameHeaders extends js.Object {
  var callbackParameterName: js.UndefOr[java.lang.String] = js.undefined
  var headers: js.UndefOr[js.Any] = js.undefined
  var proxy: js.UndefOr[cesiumLib.cesiumMod.CesiumNs.DefaultProxy] = js.undefined
  var queryParameters: js.UndefOr[js.Any] = js.undefined
  var request: js.UndefOr[stdLib.Request] = js.undefined
  var retryAttempts: js.UndefOr[scala.Double] = js.undefined
  var retryCallback: js.UndefOr[cesiumLib.cesiumMod.CesiumNs.ResourceNs.RetryCallback] = js.undefined
  var templateValues: js.UndefOr[js.Any] = js.undefined
  var url: java.lang.String
}

object Anon_CallbackParameterNameHeaders {
  @scala.inline
  def apply(
    url: java.lang.String,
    callbackParameterName: java.lang.String = null,
    headers: js.Any = null,
    proxy: cesiumLib.cesiumMod.CesiumNs.DefaultProxy = null,
    queryParameters: js.Any = null,
    request: stdLib.Request = null,
    retryAttempts: scala.Int | scala.Double = null,
    retryCallback: cesiumLib.cesiumMod.CesiumNs.ResourceNs.RetryCallback = null,
    templateValues: js.Any = null
  ): Anon_CallbackParameterNameHeaders = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("url")(url)
    if (callbackParameterName != null) __obj.updateDynamic("callbackParameterName")(callbackParameterName)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (proxy != null) __obj.updateDynamic("proxy")(proxy)
    if (queryParameters != null) __obj.updateDynamic("queryParameters")(queryParameters)
    if (request != null) __obj.updateDynamic("request")(request)
    if (retryAttempts != null) __obj.updateDynamic("retryAttempts")(retryAttempts.asInstanceOf[js.Any])
    if (retryCallback != null) __obj.updateDynamic("retryCallback")(retryCallback)
    if (templateValues != null) __obj.updateDynamic("templateValues")(templateValues)
    __obj.asInstanceOf[Anon_CallbackParameterNameHeaders]
  }
}

