package typings.axios.mod

import typings.axios.anon.FormData
import typings.axios.anon.Headers
import typings.axios.axiosBooleans.`false`
import typings.std.AbortSignal
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Omit<axios.axios.AxiosRequestConfig<D>, 'headers'> */
trait AxiosDefaults[D] extends StObject {
  
  var adapter: js.UndefOr[AxiosAdapter] = js.undefined
  
  var auth: js.UndefOr[AxiosBasicCredentials] = js.undefined
  
  var baseURL: js.UndefOr[String] = js.undefined
  
  var beforeRedirect: js.UndefOr[
    js.Function2[/* options */ Record[String, Any], /* responseDetails */ Headers, Unit]
  ] = js.undefined
  
  var cancelToken: js.UndefOr[CancelToken] = js.undefined
  
  var data: js.UndefOr[D] = js.undefined
  
  var decompress: js.UndefOr[Boolean] = js.undefined
  
  var env: js.UndefOr[FormData] = js.undefined
  
  var headers: HeadersDefaults
  
  var httpAgent: js.UndefOr[Any] = js.undefined
  
  var httpsAgent: js.UndefOr[Any] = js.undefined
  
  var insecureHTTPParser: js.UndefOr[Boolean] = js.undefined
  
  var maxBodyLength: js.UndefOr[Double] = js.undefined
  
  var maxContentLength: js.UndefOr[Double] = js.undefined
  
  var maxRedirects: js.UndefOr[Double] = js.undefined
  
  var method: js.UndefOr[Method | String] = js.undefined
  
  var onDownloadProgress: js.UndefOr[js.Function1[/* progressEvent */ Any, Unit]] = js.undefined
  
  var onUploadProgress: js.UndefOr[js.Function1[/* progressEvent */ Any, Unit]] = js.undefined
  
  var params: js.UndefOr[Any] = js.undefined
  
  var paramsSerializer: js.UndefOr[js.Function1[/* params */ Any, String]] = js.undefined
  
  var proxy: js.UndefOr[AxiosProxyConfig | `false`] = js.undefined
  
  var responseEncoding: js.UndefOr[typings.axios.mod.responseEncoding | String] = js.undefined
  
  var responseType: js.UndefOr[ResponseType] = js.undefined
  
  var signal: js.UndefOr[AbortSignal] = js.undefined
  
  var socketPath: js.UndefOr[String | Null] = js.undefined
  
  var timeout: js.UndefOr[Double] = js.undefined
  
  var timeoutErrorMessage: js.UndefOr[String] = js.undefined
  
  var transformRequest: js.UndefOr[AxiosRequestTransformer | js.Array[AxiosRequestTransformer]] = js.undefined
  
  var transformResponse: js.UndefOr[AxiosResponseTransformer | js.Array[AxiosResponseTransformer]] = js.undefined
  
  var transitional: js.UndefOr[TransitionalOptions] = js.undefined
  
  var url: js.UndefOr[String] = js.undefined
  
  var validateStatus: js.UndefOr[(js.Function1[/* status */ Double, Boolean]) | Null] = js.undefined
  
  var withCredentials: js.UndefOr[Boolean] = js.undefined
  
  var xsrfCookieName: js.UndefOr[String] = js.undefined
  
  var xsrfHeaderName: js.UndefOr[String] = js.undefined
}
object AxiosDefaults {
  
  inline def apply[D](headers: HeadersDefaults): AxiosDefaults[D] = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[AxiosDefaults[D]]
  }
  
  extension [Self <: AxiosDefaults[?], D](x: Self & AxiosDefaults[D]) {
    
    inline def setAdapter(value: /* config */ AxiosRequestConfig[Any] => AxiosPromise[Any]): Self = StObject.set(x, "adapter", js.Any.fromFunction1(value))
    
    inline def setAdapterUndefined: Self = StObject.set(x, "adapter", js.undefined)
    
    inline def setAuth(value: AxiosBasicCredentials): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    inline def setBaseURL(value: String): Self = StObject.set(x, "baseURL", value.asInstanceOf[js.Any])
    
    inline def setBaseURLUndefined: Self = StObject.set(x, "baseURL", js.undefined)
    
    inline def setBeforeRedirect(value: (/* options */ Record[String, Any], /* responseDetails */ Headers) => Unit): Self = StObject.set(x, "beforeRedirect", js.Any.fromFunction2(value))
    
    inline def setBeforeRedirectUndefined: Self = StObject.set(x, "beforeRedirect", js.undefined)
    
    inline def setCancelToken(value: CancelToken): Self = StObject.set(x, "cancelToken", value.asInstanceOf[js.Any])
    
    inline def setCancelTokenUndefined: Self = StObject.set(x, "cancelToken", js.undefined)
    
    inline def setData(value: D): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDecompress(value: Boolean): Self = StObject.set(x, "decompress", value.asInstanceOf[js.Any])
    
    inline def setDecompressUndefined: Self = StObject.set(x, "decompress", js.undefined)
    
    inline def setEnv(value: FormData): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
    
    inline def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
    
    inline def setHeaders(value: HeadersDefaults): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHttpAgent(value: Any): Self = StObject.set(x, "httpAgent", value.asInstanceOf[js.Any])
    
    inline def setHttpAgentUndefined: Self = StObject.set(x, "httpAgent", js.undefined)
    
    inline def setHttpsAgent(value: Any): Self = StObject.set(x, "httpsAgent", value.asInstanceOf[js.Any])
    
    inline def setHttpsAgentUndefined: Self = StObject.set(x, "httpsAgent", js.undefined)
    
    inline def setInsecureHTTPParser(value: Boolean): Self = StObject.set(x, "insecureHTTPParser", value.asInstanceOf[js.Any])
    
    inline def setInsecureHTTPParserUndefined: Self = StObject.set(x, "insecureHTTPParser", js.undefined)
    
    inline def setMaxBodyLength(value: Double): Self = StObject.set(x, "maxBodyLength", value.asInstanceOf[js.Any])
    
    inline def setMaxBodyLengthUndefined: Self = StObject.set(x, "maxBodyLength", js.undefined)
    
    inline def setMaxContentLength(value: Double): Self = StObject.set(x, "maxContentLength", value.asInstanceOf[js.Any])
    
    inline def setMaxContentLengthUndefined: Self = StObject.set(x, "maxContentLength", js.undefined)
    
    inline def setMaxRedirects(value: Double): Self = StObject.set(x, "maxRedirects", value.asInstanceOf[js.Any])
    
    inline def setMaxRedirectsUndefined: Self = StObject.set(x, "maxRedirects", js.undefined)
    
    inline def setMethod(value: Method | String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setOnDownloadProgress(value: /* progressEvent */ Any => Unit): Self = StObject.set(x, "onDownloadProgress", js.Any.fromFunction1(value))
    
    inline def setOnDownloadProgressUndefined: Self = StObject.set(x, "onDownloadProgress", js.undefined)
    
    inline def setOnUploadProgress(value: /* progressEvent */ Any => Unit): Self = StObject.set(x, "onUploadProgress", js.Any.fromFunction1(value))
    
    inline def setOnUploadProgressUndefined: Self = StObject.set(x, "onUploadProgress", js.undefined)
    
    inline def setParams(value: Any): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setParamsSerializer(value: /* params */ Any => String): Self = StObject.set(x, "paramsSerializer", js.Any.fromFunction1(value))
    
    inline def setParamsSerializerUndefined: Self = StObject.set(x, "paramsSerializer", js.undefined)
    
    inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    
    inline def setProxy(value: AxiosProxyConfig | `false`): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
    
    inline def setProxyUndefined: Self = StObject.set(x, "proxy", js.undefined)
    
    inline def setResponseEncoding(value: responseEncoding | String): Self = StObject.set(x, "responseEncoding", value.asInstanceOf[js.Any])
    
    inline def setResponseEncodingUndefined: Self = StObject.set(x, "responseEncoding", js.undefined)
    
    inline def setResponseType(value: ResponseType): Self = StObject.set(x, "responseType", value.asInstanceOf[js.Any])
    
    inline def setResponseTypeUndefined: Self = StObject.set(x, "responseType", js.undefined)
    
    inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
    
    inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
    
    inline def setSocketPath(value: String): Self = StObject.set(x, "socketPath", value.asInstanceOf[js.Any])
    
    inline def setSocketPathNull: Self = StObject.set(x, "socketPath", null)
    
    inline def setSocketPathUndefined: Self = StObject.set(x, "socketPath", js.undefined)
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutErrorMessage(value: String): Self = StObject.set(x, "timeoutErrorMessage", value.asInstanceOf[js.Any])
    
    inline def setTimeoutErrorMessageUndefined: Self = StObject.set(x, "timeoutErrorMessage", js.undefined)
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    inline def setTransformRequest(value: AxiosRequestTransformer | js.Array[AxiosRequestTransformer]): Self = StObject.set(x, "transformRequest", value.asInstanceOf[js.Any])
    
    inline def setTransformRequestFunction2(value: (/* data */ Any, /* headers */ js.UndefOr[AxiosRequestHeaders]) => Any): Self = StObject.set(x, "transformRequest", js.Any.fromFunction2(value))
    
    inline def setTransformRequestUndefined: Self = StObject.set(x, "transformRequest", js.undefined)
    
    inline def setTransformRequestVarargs(value: AxiosRequestTransformer*): Self = StObject.set(x, "transformRequest", js.Array(value*))
    
    inline def setTransformResponse(value: AxiosResponseTransformer | js.Array[AxiosResponseTransformer]): Self = StObject.set(x, "transformResponse", value.asInstanceOf[js.Any])
    
    inline def setTransformResponseFunction2(value: (/* data */ Any, /* headers */ js.UndefOr[AxiosResponseHeaders]) => Any): Self = StObject.set(x, "transformResponse", js.Any.fromFunction2(value))
    
    inline def setTransformResponseUndefined: Self = StObject.set(x, "transformResponse", js.undefined)
    
    inline def setTransformResponseVarargs(value: AxiosResponseTransformer*): Self = StObject.set(x, "transformResponse", js.Array(value*))
    
    inline def setTransitional(value: TransitionalOptions): Self = StObject.set(x, "transitional", value.asInstanceOf[js.Any])
    
    inline def setTransitionalUndefined: Self = StObject.set(x, "transitional", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def setValidateStatus(value: /* status */ Double => Boolean): Self = StObject.set(x, "validateStatus", js.Any.fromFunction1(value))
    
    inline def setValidateStatusNull: Self = StObject.set(x, "validateStatus", null)
    
    inline def setValidateStatusUndefined: Self = StObject.set(x, "validateStatus", js.undefined)
    
    inline def setWithCredentials(value: Boolean): Self = StObject.set(x, "withCredentials", value.asInstanceOf[js.Any])
    
    inline def setWithCredentialsUndefined: Self = StObject.set(x, "withCredentials", js.undefined)
    
    inline def setXsrfCookieName(value: String): Self = StObject.set(x, "xsrfCookieName", value.asInstanceOf[js.Any])
    
    inline def setXsrfCookieNameUndefined: Self = StObject.set(x, "xsrfCookieName", js.undefined)
    
    inline def setXsrfHeaderName(value: String): Self = StObject.set(x, "xsrfHeaderName", value.asInstanceOf[js.Any])
    
    inline def setXsrfHeaderNameUndefined: Self = StObject.set(x, "xsrfHeaderName", js.undefined)
  }
}
