package typings
package axiosLib.axiosMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AxiosRequestConfig extends js.Object {
  var adapter: js.UndefOr[AxiosAdapter] = js.undefined
  var auth: js.UndefOr[AxiosBasicCredentials] = js.undefined
  var baseURL: js.UndefOr[java.lang.String] = js.undefined
  var cancelToken: js.UndefOr[CancelToken] = js.undefined
  var data: js.UndefOr[js.Any] = js.undefined
  var headers: js.UndefOr[js.Any] = js.undefined
  var httpAgent: js.UndefOr[js.Any] = js.undefined
  var httpsAgent: js.UndefOr[js.Any] = js.undefined
  var maxContentLength: js.UndefOr[scala.Double] = js.undefined
  var maxRedirects: js.UndefOr[scala.Double] = js.undefined
  var method: js.UndefOr[java.lang.String] = js.undefined
  var onDownloadProgress: js.UndefOr[js.Function1[/* progressEvent */ js.Any, scala.Unit]] = js.undefined
  var onUploadProgress: js.UndefOr[js.Function1[/* progressEvent */ js.Any, scala.Unit]] = js.undefined
  var params: js.UndefOr[js.Any] = js.undefined
  var paramsSerializer: js.UndefOr[js.Function1[/* params */ js.Any, java.lang.String]] = js.undefined
  var proxy: js.UndefOr[AxiosProxyConfig | axiosLib.axiosLibNumbers.`false`] = js.undefined
  var responseType: js.UndefOr[java.lang.String] = js.undefined
  var timeout: js.UndefOr[scala.Double] = js.undefined
  var transformRequest: js.UndefOr[AxiosTransformer | js.Array[AxiosTransformer]] = js.undefined
  var transformResponse: js.UndefOr[AxiosTransformer | js.Array[AxiosTransformer]] = js.undefined
  var url: js.UndefOr[java.lang.String] = js.undefined
  var validateStatus: js.UndefOr[js.Function1[/* status */ scala.Double, scala.Boolean]] = js.undefined
  var withCredentials: js.UndefOr[scala.Boolean] = js.undefined
  var xsrfCookieName: js.UndefOr[java.lang.String] = js.undefined
  var xsrfHeaderName: js.UndefOr[java.lang.String] = js.undefined
}

object AxiosRequestConfig {
  @scala.inline
  def apply(
    adapter: AxiosAdapter = null,
    auth: AxiosBasicCredentials = null,
    baseURL: java.lang.String = null,
    cancelToken: CancelToken = null,
    data: js.Any = null,
    headers: js.Any = null,
    httpAgent: js.Any = null,
    httpsAgent: js.Any = null,
    maxContentLength: scala.Int | scala.Double = null,
    maxRedirects: scala.Int | scala.Double = null,
    method: java.lang.String = null,
    onDownloadProgress: js.Function1[/* progressEvent */ js.Any, scala.Unit] = null,
    onUploadProgress: js.Function1[/* progressEvent */ js.Any, scala.Unit] = null,
    params: js.Any = null,
    paramsSerializer: js.Function1[/* params */ js.Any, java.lang.String] = null,
    proxy: AxiosProxyConfig | axiosLib.axiosLibNumbers.`false` = null,
    responseType: java.lang.String = null,
    timeout: scala.Int | scala.Double = null,
    transformRequest: AxiosTransformer | js.Array[AxiosTransformer] = null,
    transformResponse: AxiosTransformer | js.Array[AxiosTransformer] = null,
    url: java.lang.String = null,
    validateStatus: js.Function1[/* status */ scala.Double, scala.Boolean] = null,
    withCredentials: js.UndefOr[scala.Boolean] = js.undefined,
    xsrfCookieName: java.lang.String = null,
    xsrfHeaderName: java.lang.String = null
  ): AxiosRequestConfig = {
    val __obj = js.Dynamic.literal()
    if (adapter != null) __obj.updateDynamic("adapter")(adapter)
    if (auth != null) __obj.updateDynamic("auth")(auth)
    if (baseURL != null) __obj.updateDynamic("baseURL")(baseURL)
    if (cancelToken != null) __obj.updateDynamic("cancelToken")(cancelToken)
    if (data != null) __obj.updateDynamic("data")(data)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (httpAgent != null) __obj.updateDynamic("httpAgent")(httpAgent)
    if (httpsAgent != null) __obj.updateDynamic("httpsAgent")(httpsAgent)
    if (maxContentLength != null) __obj.updateDynamic("maxContentLength")(maxContentLength.asInstanceOf[js.Any])
    if (maxRedirects != null) __obj.updateDynamic("maxRedirects")(maxRedirects.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method)
    if (onDownloadProgress != null) __obj.updateDynamic("onDownloadProgress")(onDownloadProgress)
    if (onUploadProgress != null) __obj.updateDynamic("onUploadProgress")(onUploadProgress)
    if (params != null) __obj.updateDynamic("params")(params)
    if (paramsSerializer != null) __obj.updateDynamic("paramsSerializer")(paramsSerializer)
    if (proxy != null) __obj.updateDynamic("proxy")(proxy.asInstanceOf[js.Any])
    if (responseType != null) __obj.updateDynamic("responseType")(responseType)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (transformRequest != null) __obj.updateDynamic("transformRequest")(transformRequest.asInstanceOf[js.Any])
    if (transformResponse != null) __obj.updateDynamic("transformResponse")(transformResponse.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url)
    if (validateStatus != null) __obj.updateDynamic("validateStatus")(validateStatus)
    if (!js.isUndefined(withCredentials)) __obj.updateDynamic("withCredentials")(withCredentials)
    if (xsrfCookieName != null) __obj.updateDynamic("xsrfCookieName")(xsrfCookieName)
    if (xsrfHeaderName != null) __obj.updateDynamic("xsrfHeaderName")(xsrfHeaderName)
    __obj.asInstanceOf[AxiosRequestConfig]
  }
}

