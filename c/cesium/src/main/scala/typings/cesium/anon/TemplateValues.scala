package typings.cesium.anon

import typings.cesium.mod.DefaultProxy
import typings.cesium.mod.Resource
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TemplateValues extends js.Object {
  var headers: js.UndefOr[js.Any] = js.undefined
  var preserveQueryParameters: js.UndefOr[Boolean] = js.undefined
  var proxy: js.UndefOr[DefaultProxy] = js.undefined
  var queryParameters: js.UndefOr[js.Any] = js.undefined
  var request: js.UndefOr[typings.std.Request] = js.undefined
  var retryAttempts: js.UndefOr[Double] = js.undefined
  var retryCallback: js.UndefOr[typings.cesium.mod.Resource.RetryCallback] = js.undefined
  var templateValues: js.UndefOr[js.Any] = js.undefined
  var url: js.UndefOr[String] = js.undefined
}

object TemplateValues {
  @scala.inline
  def apply(
    headers: js.Any = null,
    preserveQueryParameters: js.UndefOr[Boolean] = js.undefined,
    proxy: DefaultProxy = null,
    queryParameters: js.Any = null,
    request: typings.std.Request = null,
    retryAttempts: js.UndefOr[Double] = js.undefined,
    retryCallback: (/* resource */ Resource, /* error */ Error) => Unit = null,
    templateValues: js.Any = null,
    url: String = null
  ): TemplateValues = {
    val __obj = js.Dynamic.literal()
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (!js.isUndefined(preserveQueryParameters)) __obj.updateDynamic("preserveQueryParameters")(preserveQueryParameters.get.asInstanceOf[js.Any])
    if (proxy != null) __obj.updateDynamic("proxy")(proxy.asInstanceOf[js.Any])
    if (queryParameters != null) __obj.updateDynamic("queryParameters")(queryParameters.asInstanceOf[js.Any])
    if (request != null) __obj.updateDynamic("request")(request.asInstanceOf[js.Any])
    if (!js.isUndefined(retryAttempts)) __obj.updateDynamic("retryAttempts")(retryAttempts.get.asInstanceOf[js.Any])
    if (retryCallback != null) __obj.updateDynamic("retryCallback")(js.Any.fromFunction2(retryCallback))
    if (templateValues != null) __obj.updateDynamic("templateValues")(templateValues.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[TemplateValues]
  }
}

