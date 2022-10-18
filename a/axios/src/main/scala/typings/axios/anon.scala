package typings.axios

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Instantiable4
import org.scalablytyped.runtime.Instantiable5
import org.scalablytyped.runtime.StringDictionary
import typings.axios.axiosBooleans.`false`
import typings.axios.mod.AxiosAdapter
import typings.axios.mod.AxiosBasicCredentials
import typings.axios.mod.AxiosError
import typings.axios.mod.AxiosHeaderValue
import typings.axios.mod.AxiosInterceptorManager
import typings.axios.mod.AxiosProgressEvent
import typings.axios.mod.AxiosProxyConfig
import typings.axios.mod.AxiosRequestConfig
import typings.axios.mod.AxiosRequestTransformer
import typings.axios.mod.AxiosResponse
import typings.axios.mod.AxiosResponseTransformer
import typings.axios.mod.CancelToken
import typings.axios.mod.FormSerializerOptions
import typings.axios.mod.GenericAbortSignal
import typings.axios.mod.MaxDownloadRate
import typings.axios.mod.MaxUploadRate
import typings.axios.mod.Method
import typings.axios.mod.Milliseconds
import typings.axios.mod.ParamsSerializerOptions
import typings.axios.mod.RawAxiosRequestHeaders
import typings.axios.mod.ResponseType
import typings.axios.mod.TransitionalOptions
import typings.axios.mod.responseEncoding
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait FormData extends StObject {
    
    var FormData: js.UndefOr[Instantiable1[/* args (repeated) */ Any, js.Object]] = js.undefined
  }
  object FormData {
    
    inline def apply(): FormData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FormData]
    }
    
    extension [Self <: FormData](x: Self) {
      
      inline def setFormData(value: Instantiable1[/* args (repeated) */ Any, js.Object]): Self = StObject.set(x, "FormData", value.asInstanceOf[js.Any])
      
      inline def setFormDataUndefined: Self = StObject.set(x, "FormData", js.undefined)
    }
  }
  
  trait Headers extends StObject {
    
    var headers: Record[String, String]
  }
  object Headers {
    
    inline def apply(headers: Record[String, String]): Headers = {
      val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any])
      __obj.asInstanceOf[Headers]
    }
    
    extension [Self <: Headers](x: Self) {
      
      inline def setHeaders(value: Record[String, String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined axios.axios.HeadersDefaults & {[key: string] : axios.axios.AxiosHeaderValue} */
  trait HeadersDefaultskeystringA
    extends StObject
       with /* key */ StringDictionary[AxiosHeaderValue] {
    
    var common: RawAxiosRequestHeaders
    
    var delete: RawAxiosRequestHeaders
    
    var get: RawAxiosRequestHeaders
    
    var head: RawAxiosRequestHeaders
    
    var link: js.UndefOr[RawAxiosRequestHeaders] = js.undefined
    
    var options: js.UndefOr[RawAxiosRequestHeaders] = js.undefined
    
    var patch: RawAxiosRequestHeaders
    
    var post: RawAxiosRequestHeaders
    
    var purge: js.UndefOr[RawAxiosRequestHeaders] = js.undefined
    
    var put: RawAxiosRequestHeaders
    
    var unlink: js.UndefOr[RawAxiosRequestHeaders] = js.undefined
  }
  object HeadersDefaultskeystringA {
    
    inline def apply(
      common: RawAxiosRequestHeaders,
      delete: RawAxiosRequestHeaders,
      get: RawAxiosRequestHeaders,
      head: RawAxiosRequestHeaders,
      patch: RawAxiosRequestHeaders,
      post: RawAxiosRequestHeaders,
      put: RawAxiosRequestHeaders
    ): HeadersDefaultskeystringA = {
      val __obj = js.Dynamic.literal(common = common.asInstanceOf[js.Any], delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], head = head.asInstanceOf[js.Any], patch = patch.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any], put = put.asInstanceOf[js.Any])
      __obj.asInstanceOf[HeadersDefaultskeystringA]
    }
    
    extension [Self <: HeadersDefaultskeystringA](x: Self) {
      
      inline def setCommon(value: RawAxiosRequestHeaders): Self = StObject.set(x, "common", value.asInstanceOf[js.Any])
      
      inline def setDelete(value: RawAxiosRequestHeaders): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
      
      inline def setGet(value: RawAxiosRequestHeaders): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
      
      inline def setHead(value: RawAxiosRequestHeaders): Self = StObject.set(x, "head", value.asInstanceOf[js.Any])
      
      inline def setLink(value: RawAxiosRequestHeaders): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
      
      inline def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
      
      inline def setOptions(value: RawAxiosRequestHeaders): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setPatch(value: RawAxiosRequestHeaders): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
      
      inline def setPost(value: RawAxiosRequestHeaders): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
      
      inline def setPurge(value: RawAxiosRequestHeaders): Self = StObject.set(x, "purge", value.asInstanceOf[js.Any])
      
      inline def setPurgeUndefined: Self = StObject.set(x, "purge", js.undefined)
      
      inline def setPut(value: RawAxiosRequestHeaders): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
      
      inline def setUnlink(value: RawAxiosRequestHeaders): Self = StObject.set(x, "unlink", value.asInstanceOf[js.Any])
      
      inline def setUnlinkUndefined: Self = StObject.set(x, "unlink", js.undefined)
    }
  }
  
  /* Inlined std.Omit<axios.axios.AxiosDefaults<any>, 'headers'> & {  headers :axios.axios.HeadersDefaults & {[key: string] : axios.axios.AxiosHeaderValue}} */
  trait OmitAxiosDefaultsanyheade extends StObject {
    
    var adapter: js.UndefOr[AxiosAdapter] = js.undefined
    
    var auth: js.UndefOr[AxiosBasicCredentials] = js.undefined
    
    var baseURL: js.UndefOr[String] = js.undefined
    
    var beforeRedirect: js.UndefOr[
        js.Function2[/* options */ Record[String, Any], /* responseDetails */ Headers, Unit]
      ] = js.undefined
    
    var cancelToken: js.UndefOr[CancelToken] = js.undefined
    
    var data: js.UndefOr[Any] = js.undefined
    
    var decompress: js.UndefOr[Boolean] = js.undefined
    
    var env: js.UndefOr[FormData] = js.undefined
    
    var formSerializer: js.UndefOr[FormSerializerOptions] = js.undefined
    
    var headers: HeadersDefaultskeystringA
    
    var httpAgent: js.UndefOr[Any] = js.undefined
    
    var httpsAgent: js.UndefOr[Any] = js.undefined
    
    var insecureHTTPParser: js.UndefOr[Boolean] = js.undefined
    
    var maxBodyLength: js.UndefOr[Double] = js.undefined
    
    var maxContentLength: js.UndefOr[Double] = js.undefined
    
    var maxRate: js.UndefOr[Double | (js.Tuple2[MaxUploadRate, MaxDownloadRate])] = js.undefined
    
    var maxRedirects: js.UndefOr[Double] = js.undefined
    
    var method: js.UndefOr[Method | String] = js.undefined
    
    var onDownloadProgress: js.UndefOr[js.Function1[/* progressEvent */ AxiosProgressEvent, Unit]] = js.undefined
    
    var onUploadProgress: js.UndefOr[js.Function1[/* progressEvent */ AxiosProgressEvent, Unit]] = js.undefined
    
    var params: js.UndefOr[Any] = js.undefined
    
    var paramsSerializer: js.UndefOr[ParamsSerializerOptions] = js.undefined
    
    var proxy: js.UndefOr[AxiosProxyConfig | `false`] = js.undefined
    
    var responseEncoding: js.UndefOr[typings.axios.mod.responseEncoding | String] = js.undefined
    
    var responseType: js.UndefOr[ResponseType] = js.undefined
    
    var signal: js.UndefOr[GenericAbortSignal] = js.undefined
    
    var socketPath: js.UndefOr[String | Null] = js.undefined
    
    var timeout: js.UndefOr[Milliseconds] = js.undefined
    
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
  object OmitAxiosDefaultsanyheade {
    
    inline def apply(headers: HeadersDefaultskeystringA): OmitAxiosDefaultsanyheade = {
      val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any])
      __obj.asInstanceOf[OmitAxiosDefaultsanyheade]
    }
    
    extension [Self <: OmitAxiosDefaultsanyheade](x: Self) {
      
      inline def setAdapter(value: /* config */ AxiosRequestConfig[Any] => js.Promise[AxiosResponse[Any, Any]]): Self = StObject.set(x, "adapter", js.Any.fromFunction1(value))
      
      inline def setAdapterUndefined: Self = StObject.set(x, "adapter", js.undefined)
      
      inline def setAuth(value: AxiosBasicCredentials): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
      
      inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
      
      inline def setBaseURL(value: String): Self = StObject.set(x, "baseURL", value.asInstanceOf[js.Any])
      
      inline def setBaseURLUndefined: Self = StObject.set(x, "baseURL", js.undefined)
      
      inline def setBeforeRedirect(value: (/* options */ Record[String, Any], /* responseDetails */ Headers) => Unit): Self = StObject.set(x, "beforeRedirect", js.Any.fromFunction2(value))
      
      inline def setBeforeRedirectUndefined: Self = StObject.set(x, "beforeRedirect", js.undefined)
      
      inline def setCancelToken(value: CancelToken): Self = StObject.set(x, "cancelToken", value.asInstanceOf[js.Any])
      
      inline def setCancelTokenUndefined: Self = StObject.set(x, "cancelToken", js.undefined)
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setDecompress(value: Boolean): Self = StObject.set(x, "decompress", value.asInstanceOf[js.Any])
      
      inline def setDecompressUndefined: Self = StObject.set(x, "decompress", js.undefined)
      
      inline def setEnv(value: FormData): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
      
      inline def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
      
      inline def setFormSerializer(value: FormSerializerOptions): Self = StObject.set(x, "formSerializer", value.asInstanceOf[js.Any])
      
      inline def setFormSerializerUndefined: Self = StObject.set(x, "formSerializer", js.undefined)
      
      inline def setHeaders(value: HeadersDefaultskeystringA): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
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
      
      inline def setMaxRate(value: Double | (js.Tuple2[MaxUploadRate, MaxDownloadRate])): Self = StObject.set(x, "maxRate", value.asInstanceOf[js.Any])
      
      inline def setMaxRateUndefined: Self = StObject.set(x, "maxRate", js.undefined)
      
      inline def setMaxRedirects(value: Double): Self = StObject.set(x, "maxRedirects", value.asInstanceOf[js.Any])
      
      inline def setMaxRedirectsUndefined: Self = StObject.set(x, "maxRedirects", js.undefined)
      
      inline def setMethod(value: Method | String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setOnDownloadProgress(value: /* progressEvent */ AxiosProgressEvent => Unit): Self = StObject.set(x, "onDownloadProgress", js.Any.fromFunction1(value))
      
      inline def setOnDownloadProgressUndefined: Self = StObject.set(x, "onDownloadProgress", js.undefined)
      
      inline def setOnUploadProgress(value: /* progressEvent */ AxiosProgressEvent => Unit): Self = StObject.set(x, "onUploadProgress", js.Any.fromFunction1(value))
      
      inline def setOnUploadProgressUndefined: Self = StObject.set(x, "onUploadProgress", js.undefined)
      
      inline def setParams(value: Any): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setParamsSerializer(value: ParamsSerializerOptions): Self = StObject.set(x, "paramsSerializer", value.asInstanceOf[js.Any])
      
      inline def setParamsSerializerUndefined: Self = StObject.set(x, "paramsSerializer", js.undefined)
      
      inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      inline def setProxy(value: AxiosProxyConfig | `false`): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
      
      inline def setProxyUndefined: Self = StObject.set(x, "proxy", js.undefined)
      
      inline def setResponseEncoding(value: responseEncoding | String): Self = StObject.set(x, "responseEncoding", value.asInstanceOf[js.Any])
      
      inline def setResponseEncodingUndefined: Self = StObject.set(x, "responseEncoding", js.undefined)
      
      inline def setResponseType(value: ResponseType): Self = StObject.set(x, "responseType", value.asInstanceOf[js.Any])
      
      inline def setResponseTypeUndefined: Self = StObject.set(x, "responseType", js.undefined)
      
      inline def setSignal(value: GenericAbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
      
      inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
      
      inline def setSocketPath(value: String): Self = StObject.set(x, "socketPath", value.asInstanceOf[js.Any])
      
      inline def setSocketPathNull: Self = StObject.set(x, "socketPath", null)
      
      inline def setSocketPathUndefined: Self = StObject.set(x, "socketPath", js.undefined)
      
      inline def setTimeout(value: Milliseconds): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutErrorMessage(value: String): Self = StObject.set(x, "timeoutErrorMessage", value.asInstanceOf[js.Any])
      
      inline def setTimeoutErrorMessageUndefined: Self = StObject.set(x, "timeoutErrorMessage", js.undefined)
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setTransformRequest(value: AxiosRequestTransformer | js.Array[AxiosRequestTransformer]): Self = StObject.set(x, "transformRequest", value.asInstanceOf[js.Any])
      
      inline def setTransformRequestUndefined: Self = StObject.set(x, "transformRequest", js.undefined)
      
      inline def setTransformRequestVarargs(value: AxiosRequestTransformer*): Self = StObject.set(x, "transformRequest", js.Array(value*))
      
      inline def setTransformResponse(value: AxiosResponseTransformer | js.Array[AxiosResponseTransformer]): Self = StObject.set(x, "transformResponse", value.asInstanceOf[js.Any])
      
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
  
  /* Inlined std.Partial<axios.axios.HeadersDefaults> */
  trait PartialHeadersDefaults extends StObject {
    
    var common: js.UndefOr[RawAxiosRequestHeaders] = js.undefined
    
    var delete: js.UndefOr[RawAxiosRequestHeaders] = js.undefined
    
    var get: js.UndefOr[RawAxiosRequestHeaders] = js.undefined
    
    var head: js.UndefOr[RawAxiosRequestHeaders] = js.undefined
    
    var link: js.UndefOr[RawAxiosRequestHeaders] = js.undefined
    
    var options: js.UndefOr[RawAxiosRequestHeaders] = js.undefined
    
    var patch: js.UndefOr[RawAxiosRequestHeaders] = js.undefined
    
    var post: js.UndefOr[RawAxiosRequestHeaders] = js.undefined
    
    var purge: js.UndefOr[RawAxiosRequestHeaders] = js.undefined
    
    var put: js.UndefOr[RawAxiosRequestHeaders] = js.undefined
    
    var unlink: js.UndefOr[RawAxiosRequestHeaders] = js.undefined
  }
  object PartialHeadersDefaults {
    
    inline def apply(): PartialHeadersDefaults = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialHeadersDefaults]
    }
    
    extension [Self <: PartialHeadersDefaults](x: Self) {
      
      inline def setCommon(value: RawAxiosRequestHeaders): Self = StObject.set(x, "common", value.asInstanceOf[js.Any])
      
      inline def setCommonUndefined: Self = StObject.set(x, "common", js.undefined)
      
      inline def setDelete(value: RawAxiosRequestHeaders): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
      
      inline def setDeleteUndefined: Self = StObject.set(x, "delete", js.undefined)
      
      inline def setGet(value: RawAxiosRequestHeaders): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
      
      inline def setGetUndefined: Self = StObject.set(x, "get", js.undefined)
      
      inline def setHead(value: RawAxiosRequestHeaders): Self = StObject.set(x, "head", value.asInstanceOf[js.Any])
      
      inline def setHeadUndefined: Self = StObject.set(x, "head", js.undefined)
      
      inline def setLink(value: RawAxiosRequestHeaders): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
      
      inline def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
      
      inline def setOptions(value: RawAxiosRequestHeaders): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setPatch(value: RawAxiosRequestHeaders): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
      
      inline def setPatchUndefined: Self = StObject.set(x, "patch", js.undefined)
      
      inline def setPost(value: RawAxiosRequestHeaders): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
      
      inline def setPostUndefined: Self = StObject.set(x, "post", js.undefined)
      
      inline def setPurge(value: RawAxiosRequestHeaders): Self = StObject.set(x, "purge", value.asInstanceOf[js.Any])
      
      inline def setPurgeUndefined: Self = StObject.set(x, "purge", js.undefined)
      
      inline def setPut(value: RawAxiosRequestHeaders): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
      
      inline def setPutUndefined: Self = StObject.set(x, "put", js.undefined)
      
      inline def setUnlink(value: RawAxiosRequestHeaders): Self = StObject.set(x, "unlink", value.asInstanceOf[js.Any])
      
      inline def setUnlinkUndefined: Self = StObject.set(x, "unlink", js.undefined)
    }
  }
  
  trait Password extends StObject {
    
    var password: String
    
    var username: String
  }
  object Password {
    
    inline def apply(password: String, username: String): Password = {
      val __obj = js.Dynamic.literal(password = password.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[Password]
    }
    
    extension [Self <: Password](x: Self) {
      
      inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    }
  }
  
  trait Request extends StObject {
    
    var request: AxiosInterceptorManager[AxiosRequestConfig[Any]]
    
    var response: AxiosInterceptorManager[AxiosResponse[Any, Any]]
  }
  object Request {
    
    inline def apply(
      request: AxiosInterceptorManager[AxiosRequestConfig[Any]],
      response: AxiosInterceptorManager[AxiosResponse[Any, Any]]
    ): Request = {
      val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
      __obj.asInstanceOf[Request]
    }
    
    extension [Self <: Request](x: Self) {
      
      inline def setRequest(value: AxiosInterceptorManager[AxiosRequestConfig[Any]]): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      inline def setResponse(value: AxiosInterceptorManager[AxiosResponse[Any, Any]]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    }
  }
  
  trait Setcookie extends StObject {
    
    var `set-cookie`: js.UndefOr[js.Array[String]] = js.undefined
  }
  object Setcookie {
    
    inline def apply(): Setcookie = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Setcookie]
    }
    
    extension [Self <: Setcookie](x: Self) {
      
      inline def `setSet-cookie`(value: js.Array[String]): Self = StObject.set(x, "set-cookie", value.asInstanceOf[js.Any])
      
      inline def `setSet-cookieUndefined`: Self = StObject.set(x, "set-cookie", js.undefined)
      
      inline def `setSet-cookieVarargs`(value: String*): Self = StObject.set(x, "set-cookie", js.Array(value*))
    }
  }
  
  @js.native
  trait TypeofAxiosError
    extends StObject
       with Instantiable0[AxiosError[js.Object, js.Object]]
       with Instantiable1[/* message */ String, AxiosError[js.Object, js.Object]]
       with Instantiable2[
          (/* message */ String) | (/* message */ Unit), 
          /* code */ String, 
          AxiosError[js.Object, js.Object]
        ]
       with Instantiable3[
          (/* message */ String) | (/* message */ Unit), 
          (/* code */ String) | (/* code */ Unit), 
          /* config */ AxiosRequestConfig[/* import warning: RewrittenClass.unapply cls was tparam D */ Any], 
          AxiosError[js.Object, js.Object]
        ]
       with Instantiable4[
          (/* message */ String) | (/* message */ Unit), 
          (/* code */ String) | (/* code */ Unit), 
          (/* config */ AxiosRequestConfig[/* import warning: RewrittenClass.unapply cls was tparam D */ Any]) | (/* config */ Unit), 
          /* request */ Any, 
          AxiosError[js.Object, js.Object]
        ]
       with Instantiable5[
          (/* message */ String) | (/* message */ Unit), 
          (/* code */ String) | (/* code */ Unit), 
          (/* config */ AxiosRequestConfig[/* import warning: RewrittenClass.unapply cls was tparam D */ Any]) | (/* config */ Unit), 
          (/* request */ Any) | (/* request */ Unit), 
          /* response */ AxiosResponse[
            /* import warning: RewrittenClass.unapply cls was tparam T */ Any, 
            /* import warning: RewrittenClass.unapply cls was tparam D */ Any
          ], 
          AxiosError[js.Object, js.Object]
        ] {
    
    val ECONNABORTED: /* "ECONNABORTED" */ String = js.native
    
    val ERR_BAD_OPTION: /* "ERR_BAD_OPTION" */ String = js.native
    
    val ERR_BAD_OPTION_VALUE: /* "ERR_BAD_OPTION_VALUE" */ String = js.native
    
    val ERR_BAD_REQUEST: /* "ERR_BAD_REQUEST" */ String = js.native
    
    val ERR_BAD_RESPONSE: /* "ERR_BAD_RESPONSE" */ String = js.native
    
    val ERR_CANCELED: /* "ERR_CANCELED" */ String = js.native
    
    val ERR_DEPRECATED: /* "ERR_DEPRECATED" */ String = js.native
    
    val ERR_FR_TOO_MANY_REDIRECTS: /* "ERR_FR_TOO_MANY_REDIRECTS" */ String = js.native
    
    val ERR_INVALID_URL: /* "ERR_INVALID_URL" */ String = js.native
    
    val ERR_NETWORK: /* "ERR_NETWORK" */ String = js.native
    
    val ERR_NOT_SUPPORT: /* "ERR_NOT_SUPPORT" */ String = js.native
    
    val ETIMEDOUT: /* "ETIMEDOUT" */ String = js.native
  }
}
