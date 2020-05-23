package typings.axios.mod

import typings.axios.axiosBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AxiosRequestConfig extends js.Object {
  var adapter: js.UndefOr[AxiosAdapter] = js.undefined
  var auth: js.UndefOr[AxiosBasicCredentials] = js.undefined
  var baseURL: js.UndefOr[String] = js.undefined
  var cancelToken: js.UndefOr[CancelToken] = js.undefined
  var data: js.UndefOr[js.Any] = js.undefined
  var headers: js.UndefOr[js.Any] = js.undefined
  var httpAgent: js.UndefOr[js.Any] = js.undefined
  var httpsAgent: js.UndefOr[js.Any] = js.undefined
  var maxContentLength: js.UndefOr[Double] = js.undefined
  var maxRedirects: js.UndefOr[Double] = js.undefined
  var method: js.UndefOr[Method] = js.undefined
  var onDownloadProgress: js.UndefOr[js.Function1[/* progressEvent */ js.Any, Unit]] = js.undefined
  var onUploadProgress: js.UndefOr[js.Function1[/* progressEvent */ js.Any, Unit]] = js.undefined
  var params: js.UndefOr[js.Any] = js.undefined
  var paramsSerializer: js.UndefOr[js.Function1[/* params */ js.Any, String]] = js.undefined
  var proxy: js.UndefOr[AxiosProxyConfig | `false`] = js.undefined
  var responseType: js.UndefOr[ResponseType] = js.undefined
  var socketPath: js.UndefOr[String | Null] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
  var timeoutErrorMessage: js.UndefOr[String] = js.undefined
  var transformRequest: js.UndefOr[AxiosTransformer | js.Array[AxiosTransformer]] = js.undefined
  var transformResponse: js.UndefOr[AxiosTransformer | js.Array[AxiosTransformer]] = js.undefined
  var url: js.UndefOr[String] = js.undefined
  var validateStatus: js.UndefOr[js.Function1[/* status */ Double, Boolean]] = js.undefined
  var withCredentials: js.UndefOr[Boolean] = js.undefined
  var xsrfCookieName: js.UndefOr[String] = js.undefined
  var xsrfHeaderName: js.UndefOr[String] = js.undefined
}

object AxiosRequestConfig {
  @scala.inline
  def apply(
    adapter: /* config */ AxiosRequestConfig => AxiosPromise[js.Any] = null,
    auth: AxiosBasicCredentials = null,
    baseURL: String = null,
    cancelToken: CancelToken = null,
    data: js.Any = null,
    headers: js.Any = null,
    httpAgent: js.Any = null,
    httpsAgent: js.Any = null,
    maxContentLength: js.UndefOr[Double] = js.undefined,
    maxRedirects: js.UndefOr[Double] = js.undefined,
    method: Method = null,
    onDownloadProgress: /* progressEvent */ js.Any => Unit = null,
    onUploadProgress: /* progressEvent */ js.Any => Unit = null,
    params: js.Any = null,
    paramsSerializer: /* params */ js.Any => String = null,
    proxy: AxiosProxyConfig | `false` = null,
    responseType: ResponseType = null,
    socketPath: js.UndefOr[Null | String] = js.undefined,
    timeout: js.UndefOr[Double] = js.undefined,
    timeoutErrorMessage: String = null,
    transformRequest: AxiosTransformer | js.Array[AxiosTransformer] = null,
    transformResponse: AxiosTransformer | js.Array[AxiosTransformer] = null,
    url: String = null,
    validateStatus: /* status */ Double => Boolean = null,
    withCredentials: js.UndefOr[Boolean] = js.undefined,
    xsrfCookieName: String = null,
    xsrfHeaderName: String = null
  ): AxiosRequestConfig = {
    val __obj = js.Dynamic.literal()
    if (adapter != null) __obj.updateDynamic("adapter")(js.Any.fromFunction1(adapter))
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (baseURL != null) __obj.updateDynamic("baseURL")(baseURL.asInstanceOf[js.Any])
    if (cancelToken != null) __obj.updateDynamic("cancelToken")(cancelToken.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (httpAgent != null) __obj.updateDynamic("httpAgent")(httpAgent.asInstanceOf[js.Any])
    if (httpsAgent != null) __obj.updateDynamic("httpsAgent")(httpsAgent.asInstanceOf[js.Any])
    if (!js.isUndefined(maxContentLength)) __obj.updateDynamic("maxContentLength")(maxContentLength.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxRedirects)) __obj.updateDynamic("maxRedirects")(maxRedirects.get.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (onDownloadProgress != null) __obj.updateDynamic("onDownloadProgress")(js.Any.fromFunction1(onDownloadProgress))
    if (onUploadProgress != null) __obj.updateDynamic("onUploadProgress")(js.Any.fromFunction1(onUploadProgress))
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    if (paramsSerializer != null) __obj.updateDynamic("paramsSerializer")(js.Any.fromFunction1(paramsSerializer))
    if (proxy != null) __obj.updateDynamic("proxy")(proxy.asInstanceOf[js.Any])
    if (responseType != null) __obj.updateDynamic("responseType")(responseType.asInstanceOf[js.Any])
    if (!js.isUndefined(socketPath)) __obj.updateDynamic("socketPath")(socketPath.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    if (timeoutErrorMessage != null) __obj.updateDynamic("timeoutErrorMessage")(timeoutErrorMessage.asInstanceOf[js.Any])
    if (transformRequest != null) __obj.updateDynamic("transformRequest")(transformRequest.asInstanceOf[js.Any])
    if (transformResponse != null) __obj.updateDynamic("transformResponse")(transformResponse.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (validateStatus != null) __obj.updateDynamic("validateStatus")(js.Any.fromFunction1(validateStatus))
    if (!js.isUndefined(withCredentials)) __obj.updateDynamic("withCredentials")(withCredentials.get.asInstanceOf[js.Any])
    if (xsrfCookieName != null) __obj.updateDynamic("xsrfCookieName")(xsrfCookieName.asInstanceOf[js.Any])
    if (xsrfHeaderName != null) __obj.updateDynamic("xsrfHeaderName")(xsrfHeaderName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AxiosRequestConfig]
  }
}

