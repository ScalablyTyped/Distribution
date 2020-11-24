package typings.axios.mod

import typings.axios.axiosBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AxiosRequestConfig extends js.Object {
  
  var adapter: js.UndefOr[AxiosAdapter] = js.native
  
  var auth: js.UndefOr[AxiosBasicCredentials] = js.native
  
  var baseURL: js.UndefOr[String] = js.native
  
  var cancelToken: js.UndefOr[CancelToken] = js.native
  
  var data: js.UndefOr[js.Any] = js.native
  
  var decompress: js.UndefOr[Boolean] = js.native
  
  var headers: js.UndefOr[js.Any] = js.native
  
  var httpAgent: js.UndefOr[js.Any] = js.native
  
  var httpsAgent: js.UndefOr[js.Any] = js.native
  
  var maxBodyLength: js.UndefOr[Double] = js.native
  
  var maxContentLength: js.UndefOr[Double] = js.native
  
  var maxRedirects: js.UndefOr[Double] = js.native
  
  var method: js.UndefOr[Method] = js.native
  
  var onDownloadProgress: js.UndefOr[js.Function1[/* progressEvent */ js.Any, Unit]] = js.native
  
  var onUploadProgress: js.UndefOr[js.Function1[/* progressEvent */ js.Any, Unit]] = js.native
  
  var params: js.UndefOr[js.Any] = js.native
  
  var paramsSerializer: js.UndefOr[js.Function1[/* params */ js.Any, String]] = js.native
  
  var proxy: js.UndefOr[AxiosProxyConfig | `false`] = js.native
  
  var responseType: js.UndefOr[ResponseType] = js.native
  
  var socketPath: js.UndefOr[String | Null] = js.native
  
  var timeout: js.UndefOr[Double] = js.native
  
  var timeoutErrorMessage: js.UndefOr[String] = js.native
  
  var transformRequest: js.UndefOr[AxiosTransformer | js.Array[AxiosTransformer]] = js.native
  
  var transformResponse: js.UndefOr[AxiosTransformer | js.Array[AxiosTransformer]] = js.native
  
  var url: js.UndefOr[String] = js.native
  
  var validateStatus: js.UndefOr[(js.Function1[/* status */ Double, Boolean]) | Null] = js.native
  
  var withCredentials: js.UndefOr[Boolean] = js.native
  
  var xsrfCookieName: js.UndefOr[String] = js.native
  
  var xsrfHeaderName: js.UndefOr[String] = js.native
}
object AxiosRequestConfig {
  
  @scala.inline
  def apply(): AxiosRequestConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AxiosRequestConfig]
  }
  
  @scala.inline
  implicit class AxiosRequestConfigOps[Self <: AxiosRequestConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAdapter(value: /* config */ AxiosRequestConfig => AxiosPromise[js.Any]): Self = this.set("adapter", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteAdapter: Self = this.set("adapter", js.undefined)
    
    @scala.inline
    def setAuth(value: AxiosBasicCredentials): Self = this.set("auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
    
    @scala.inline
    def setBaseURL(value: String): Self = this.set("baseURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBaseURL: Self = this.set("baseURL", js.undefined)
    
    @scala.inline
    def setCancelToken(value: CancelToken): Self = this.set("cancelToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCancelToken: Self = this.set("cancelToken", js.undefined)
    
    @scala.inline
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setDecompress(value: Boolean): Self = this.set("decompress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDecompress: Self = this.set("decompress", js.undefined)
    
    @scala.inline
    def setHeaders(value: js.Any): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    
    @scala.inline
    def setHttpAgent(value: js.Any): Self = this.set("httpAgent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHttpAgent: Self = this.set("httpAgent", js.undefined)
    
    @scala.inline
    def setHttpsAgent(value: js.Any): Self = this.set("httpsAgent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHttpsAgent: Self = this.set("httpsAgent", js.undefined)
    
    @scala.inline
    def setMaxBodyLength(value: Double): Self = this.set("maxBodyLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxBodyLength: Self = this.set("maxBodyLength", js.undefined)
    
    @scala.inline
    def setMaxContentLength(value: Double): Self = this.set("maxContentLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxContentLength: Self = this.set("maxContentLength", js.undefined)
    
    @scala.inline
    def setMaxRedirects(value: Double): Self = this.set("maxRedirects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxRedirects: Self = this.set("maxRedirects", js.undefined)
    
    @scala.inline
    def setMethod(value: Method): Self = this.set("method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    
    @scala.inline
    def setOnDownloadProgress(value: /* progressEvent */ js.Any => Unit): Self = this.set("onDownloadProgress", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnDownloadProgress: Self = this.set("onDownloadProgress", js.undefined)
    
    @scala.inline
    def setOnUploadProgress(value: /* progressEvent */ js.Any => Unit): Self = this.set("onUploadProgress", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnUploadProgress: Self = this.set("onUploadProgress", js.undefined)
    
    @scala.inline
    def setParams(value: js.Any): Self = this.set("params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParams: Self = this.set("params", js.undefined)
    
    @scala.inline
    def setParamsSerializer(value: /* params */ js.Any => String): Self = this.set("paramsSerializer", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteParamsSerializer: Self = this.set("paramsSerializer", js.undefined)
    
    @scala.inline
    def setProxy(value: AxiosProxyConfig | `false`): Self = this.set("proxy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProxy: Self = this.set("proxy", js.undefined)
    
    @scala.inline
    def setResponseType(value: ResponseType): Self = this.set("responseType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponseType: Self = this.set("responseType", js.undefined)
    
    @scala.inline
    def setSocketPath(value: String): Self = this.set("socketPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSocketPath: Self = this.set("socketPath", js.undefined)
    
    @scala.inline
    def setSocketPathNull: Self = this.set("socketPath", null)
    
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    
    @scala.inline
    def setTimeoutErrorMessage(value: String): Self = this.set("timeoutErrorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeoutErrorMessage: Self = this.set("timeoutErrorMessage", js.undefined)
    
    @scala.inline
    def setTransformRequestVarargs(value: AxiosTransformer*): Self = this.set("transformRequest", js.Array(value :_*))
    
    @scala.inline
    def setTransformRequestFunction2(value: (/* data */ js.Any, /* headers */ js.UndefOr[js.Any]) => js.Any): Self = this.set("transformRequest", js.Any.fromFunction2(value))
    
    @scala.inline
    def setTransformRequest(value: AxiosTransformer | js.Array[AxiosTransformer]): Self = this.set("transformRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransformRequest: Self = this.set("transformRequest", js.undefined)
    
    @scala.inline
    def setTransformResponseVarargs(value: AxiosTransformer*): Self = this.set("transformResponse", js.Array(value :_*))
    
    @scala.inline
    def setTransformResponseFunction2(value: (/* data */ js.Any, /* headers */ js.UndefOr[js.Any]) => js.Any): Self = this.set("transformResponse", js.Any.fromFunction2(value))
    
    @scala.inline
    def setTransformResponse(value: AxiosTransformer | js.Array[AxiosTransformer]): Self = this.set("transformResponse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransformResponse: Self = this.set("transformResponse", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
    
    @scala.inline
    def setValidateStatus(value: /* status */ Double => Boolean): Self = this.set("validateStatus", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteValidateStatus: Self = this.set("validateStatus", js.undefined)
    
    @scala.inline
    def setValidateStatusNull: Self = this.set("validateStatus", null)
    
    @scala.inline
    def setWithCredentials(value: Boolean): Self = this.set("withCredentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWithCredentials: Self = this.set("withCredentials", js.undefined)
    
    @scala.inline
    def setXsrfCookieName(value: String): Self = this.set("xsrfCookieName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXsrfCookieName: Self = this.set("xsrfCookieName", js.undefined)
    
    @scala.inline
    def setXsrfHeaderName(value: String): Self = this.set("xsrfHeaderName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXsrfHeaderName: Self = this.set("xsrfHeaderName", js.undefined)
  }
}
