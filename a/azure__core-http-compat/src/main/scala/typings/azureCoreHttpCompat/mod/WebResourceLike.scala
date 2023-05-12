package typings.azureCoreHttpCompat.mod

import org.scalablytyped.runtime.StringDictionary
import typings.azureAbortController.typesSrcAbortSignalMod.AbortSignalLike
import typings.azureCoreRestPipeline.typesLatestCoreRestPipelineMod.HttpMethods
import typings.azureCoreRestPipeline.typesLatestCoreRestPipelineMod.ProxySettings
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebResourceLike extends StObject {
  
  /**
    * Signal of an abort controller. Can be used to abort both sending a network request and waiting for a response.
    */
  var abortSignal: js.UndefOr[AbortSignalLike] = js.undefined
  
  /**
    * The HTTP body contents of the request.
    */
  var body: js.UndefOr[Any] = js.undefined
  
  /**
    * Whether or not to decompress response according to Accept-Encoding header (node-fetch only)
    */
  var decompressResponse: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Form data, used to build the request body.
    */
  var formData: js.UndefOr[Any] = js.undefined
  
  /**
    * The HTTP headers to use when making the request.
    */
  var headers: HttpHeadersLike
  
  /**
    * If the connection should be reused.
    */
  var keepAlive: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The HTTP method to use when making the request.
    */
  var method: HttpMethods
  
  /** Callback which fires upon download progress. */
  var onDownloadProgress: js.UndefOr[js.Function1[/* progress */ TransferProgressEvent, Unit]] = js.undefined
  
  /**
    * Callback which fires upon upload progress.
    */
  var onUploadProgress: js.UndefOr[js.Function1[/* progress */ TransferProgressEvent, Unit]] = js.undefined
  
  /**
    * This is a no-op for compat purposes and will throw if called.
    */
  def prepare(options: Any): WebResourceLike
  
  /**
    * Proxy configuration.
    */
  var proxySettings: js.UndefOr[ProxySettings] = js.undefined
  
  /**
    * A query string represented as an object.
    */
  var query: js.UndefOr[StringDictionary[Any]] = js.undefined
  
  /**
    * A unique identifier for the request. Used for logging and tracing.
    */
  var requestId: String
  
  /**
    * Whether or not the body of the HttpOperationResponse should be treated as a stream.
    * @deprecated Use streamResponseStatusCodes property instead.
    */
  var streamResponseBody: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A list of response status codes whose corresponding HttpOperationResponse body should be treated as a stream.
    */
  var streamResponseStatusCodes: js.UndefOr[Set[Double]] = js.undefined
  
  /**
    * The number of milliseconds a request can take before automatically being terminated.
    * If the request is terminated, an `AbortError` is thrown.
    */
  var timeout: Double
  
  /**
    * The URL being accessed by the request.
    */
  var url: String
  
  /**
    * Validates that the required properties such as method, url, headers["Content-Type"],
    * headers["accept-language"] are defined. It will throw an error if one of the above
    * mentioned properties are not defined.
    * Note: this a no-op for compat purposes.
    */
  def validateRequestProperties(): Unit
  
  /**
    * If credentials (cookies) should be sent along during an XHR.
    */
  var withCredentials: Boolean
}
object WebResourceLike {
  
  inline def apply(
    headers: HttpHeadersLike,
    method: HttpMethods,
    prepare: Any => WebResourceLike,
    requestId: String,
    timeout: Double,
    url: String,
    validateRequestProperties: () => Unit,
    withCredentials: Boolean
  ): WebResourceLike = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], prepare = js.Any.fromFunction1(prepare), requestId = requestId.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], validateRequestProperties = js.Any.fromFunction0(validateRequestProperties), withCredentials = withCredentials.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebResourceLike]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WebResourceLike] (val x: Self) extends AnyVal {
    
    inline def setAbortSignal(value: AbortSignalLike): Self = StObject.set(x, "abortSignal", value.asInstanceOf[js.Any])
    
    inline def setAbortSignalUndefined: Self = StObject.set(x, "abortSignal", js.undefined)
    
    inline def setBody(value: Any): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setDecompressResponse(value: Boolean): Self = StObject.set(x, "decompressResponse", value.asInstanceOf[js.Any])
    
    inline def setDecompressResponseUndefined: Self = StObject.set(x, "decompressResponse", js.undefined)
    
    inline def setFormData(value: Any): Self = StObject.set(x, "formData", value.asInstanceOf[js.Any])
    
    inline def setFormDataUndefined: Self = StObject.set(x, "formData", js.undefined)
    
    inline def setHeaders(value: HttpHeadersLike): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setKeepAlive(value: Boolean): Self = StObject.set(x, "keepAlive", value.asInstanceOf[js.Any])
    
    inline def setKeepAliveUndefined: Self = StObject.set(x, "keepAlive", js.undefined)
    
    inline def setMethod(value: HttpMethods): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setOnDownloadProgress(value: /* progress */ TransferProgressEvent => Unit): Self = StObject.set(x, "onDownloadProgress", js.Any.fromFunction1(value))
    
    inline def setOnDownloadProgressUndefined: Self = StObject.set(x, "onDownloadProgress", js.undefined)
    
    inline def setOnUploadProgress(value: /* progress */ TransferProgressEvent => Unit): Self = StObject.set(x, "onUploadProgress", js.Any.fromFunction1(value))
    
    inline def setOnUploadProgressUndefined: Self = StObject.set(x, "onUploadProgress", js.undefined)
    
    inline def setPrepare(value: Any => WebResourceLike): Self = StObject.set(x, "prepare", js.Any.fromFunction1(value))
    
    inline def setProxySettings(value: ProxySettings): Self = StObject.set(x, "proxySettings", value.asInstanceOf[js.Any])
    
    inline def setProxySettingsUndefined: Self = StObject.set(x, "proxySettings", js.undefined)
    
    inline def setQuery(value: StringDictionary[Any]): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    inline def setRequestId(value: String): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    inline def setStreamResponseBody(value: Boolean): Self = StObject.set(x, "streamResponseBody", value.asInstanceOf[js.Any])
    
    inline def setStreamResponseBodyUndefined: Self = StObject.set(x, "streamResponseBody", js.undefined)
    
    inline def setStreamResponseStatusCodes(value: Set[Double]): Self = StObject.set(x, "streamResponseStatusCodes", value.asInstanceOf[js.Any])
    
    inline def setStreamResponseStatusCodesUndefined: Self = StObject.set(x, "streamResponseStatusCodes", js.undefined)
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setValidateRequestProperties(value: () => Unit): Self = StObject.set(x, "validateRequestProperties", js.Any.fromFunction0(value))
    
    inline def setWithCredentials(value: Boolean): Self = StObject.set(x, "withCredentials", value.asInstanceOf[js.Any])
  }
}
