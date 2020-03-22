package typings.cesium

import typings.cesium.mod.DefaultProxy
import typings.std.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPreserveQueryParameters extends js.Object {
  var headers: js.UndefOr[js.Any] = js.undefined
  var preserveQueryParameters: js.UndefOr[Boolean] = js.undefined
  var proxy: js.UndefOr[DefaultProxy] = js.undefined
  var queryParameters: js.UndefOr[js.Any] = js.undefined
  var request: js.UndefOr[Request] = js.undefined
  var retryAttempts: js.UndefOr[Double] = js.undefined
  var retryCallback: js.UndefOr[js.Any] = js.undefined
  var templateValues: js.UndefOr[js.Any] = js.undefined
  var url: js.UndefOr[String] = js.undefined
}

object AnonPreserveQueryParameters {
  @scala.inline
  def apply(
    headers: js.Any = null,
    preserveQueryParameters: js.UndefOr[Boolean] = js.undefined,
    proxy: DefaultProxy = null,
    queryParameters: js.Any = null,
    request: Request = null,
    retryAttempts: Int | Double = null,
    retryCallback: js.Any = null,
    templateValues: js.Any = null,
    url: String = null
  ): AnonPreserveQueryParameters = {
    val __obj = js.Dynamic.literal()
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (!js.isUndefined(preserveQueryParameters)) __obj.updateDynamic("preserveQueryParameters")(preserveQueryParameters.asInstanceOf[js.Any])
    if (proxy != null) __obj.updateDynamic("proxy")(proxy.asInstanceOf[js.Any])
    if (queryParameters != null) __obj.updateDynamic("queryParameters")(queryParameters.asInstanceOf[js.Any])
    if (request != null) __obj.updateDynamic("request")(request.asInstanceOf[js.Any])
    if (retryAttempts != null) __obj.updateDynamic("retryAttempts")(retryAttempts.asInstanceOf[js.Any])
    if (retryCallback != null) __obj.updateDynamic("retryCallback")(retryCallback.asInstanceOf[js.Any])
    if (templateValues != null) __obj.updateDynamic("templateValues")(templateValues.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPreserveQueryParameters]
  }
}

