package typings.azureCoreRestPipeline.coreRestPipelineMod

import typings.azureAbortController.abortSignalMod.AbortSignalLike
import typings.azureCoreTracing.mod.OperationTracingOptions
import typings.std.ReadableStream
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PipelineRequestOptions extends StObject {
  
  /**
    * Used to abort the request later.
    */
  var abortSignal: js.UndefOr[AbortSignalLike] = js.undefined
  
  /** Set to true if the request is sent over HTTP instead of HTTPS */
  var allowInsecureConnection: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The HTTP body content (if any)
    */
  var body: js.UndefOr[RequestBodyType] = js.undefined
  
  /**
    * If the connection should not be reused.
    */
  var disableKeepAlive: js.UndefOr[Boolean] = js.undefined
  
  /**
    * BROWSER ONLY
    *
    * A browser only option to enable use of the Streams API. If this option is set and streaming is used
    * (see `streamResponseStatusCodes`), the response will have a property `browserStream` instead of
    * `blobBody` which will be undefined.
    *
    * Default value is false
    */
  var enableBrowserStreams: js.UndefOr[Boolean] = js.undefined
  
  /**
    * To simulate a browser form post
    */
  var formData: js.UndefOr[FormDataMap] = js.undefined
  
  /**
    * The HTTP headers to use when making the request.
    */
  var headers: js.UndefOr[HttpHeaders] = js.undefined
  
  /**
    * The HTTP method to use when making the request.
    */
  var method: js.UndefOr[HttpMethods] = js.undefined
  
  /** Callback which fires upon download progress. */
  var onDownloadProgress: js.UndefOr[js.Function1[/* progress */ TransferProgressEvent, Unit]] = js.undefined
  
  /**
    * Callback which fires upon upload progress.
    */
  var onUploadProgress: js.UndefOr[js.Function1[/* progress */ TransferProgressEvent, Unit]] = js.undefined
  
  /**
    * Proxy configuration.
    */
  var proxySettings: js.UndefOr[ProxySettings] = js.undefined
  
  /**
    * A unique identifier for the request. Used for logging and tracing.
    */
  var requestId: js.UndefOr[String] = js.undefined
  
  /**
    * A list of response status codes whose corresponding PipelineResponse body should be treated as a stream.
    */
  var streamResponseStatusCodes: js.UndefOr[Set[Double]] = js.undefined
  
  /**
    * The number of milliseconds a request can take before automatically being terminated.
    * If the request is terminated, an `AbortError` is thrown.
    * Defaults to 0, which disables the timeout.
    */
  var timeout: js.UndefOr[Double] = js.undefined
  
  /**
    * Options used to create a span when tracing is enabled.
    */
  var tracingOptions: js.UndefOr[OperationTracingOptions] = js.undefined
  
  /**
    * The URL to make the request to.
    */
  var url: String
  
  /**
    * If credentials (cookies) should be sent along during an XHR.
    * Defaults to false.
    */
  var withCredentials: js.UndefOr[Boolean] = js.undefined
}
object PipelineRequestOptions {
  
  inline def apply(url: String): PipelineRequestOptions = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[PipelineRequestOptions]
  }
  
  extension [Self <: PipelineRequestOptions](x: Self) {
    
    inline def setAbortSignal(value: AbortSignalLike): Self = StObject.set(x, "abortSignal", value.asInstanceOf[js.Any])
    
    inline def setAbortSignalUndefined: Self = StObject.set(x, "abortSignal", js.undefined)
    
    inline def setAllowInsecureConnection(value: Boolean): Self = StObject.set(x, "allowInsecureConnection", value.asInstanceOf[js.Any])
    
    inline def setAllowInsecureConnectionUndefined: Self = StObject.set(x, "allowInsecureConnection", js.undefined)
    
    inline def setBody(value: RequestBodyType): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyFunction0(value: () => ReadableStream[Any | js.typedarray.Uint8Array]): Self = StObject.set(x, "body", js.Any.fromFunction0(value))
    
    inline def setBodyNull: Self = StObject.set(x, "body", null)
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setDisableKeepAlive(value: Boolean): Self = StObject.set(x, "disableKeepAlive", value.asInstanceOf[js.Any])
    
    inline def setDisableKeepAliveUndefined: Self = StObject.set(x, "disableKeepAlive", js.undefined)
    
    inline def setEnableBrowserStreams(value: Boolean): Self = StObject.set(x, "enableBrowserStreams", value.asInstanceOf[js.Any])
    
    inline def setEnableBrowserStreamsUndefined: Self = StObject.set(x, "enableBrowserStreams", js.undefined)
    
    inline def setFormData(value: FormDataMap): Self = StObject.set(x, "formData", value.asInstanceOf[js.Any])
    
    inline def setFormDataUndefined: Self = StObject.set(x, "formData", js.undefined)
    
    inline def setHeaders(value: HttpHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setMethod(value: HttpMethods): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setOnDownloadProgress(value: /* progress */ TransferProgressEvent => Unit): Self = StObject.set(x, "onDownloadProgress", js.Any.fromFunction1(value))
    
    inline def setOnDownloadProgressUndefined: Self = StObject.set(x, "onDownloadProgress", js.undefined)
    
    inline def setOnUploadProgress(value: /* progress */ TransferProgressEvent => Unit): Self = StObject.set(x, "onUploadProgress", js.Any.fromFunction1(value))
    
    inline def setOnUploadProgressUndefined: Self = StObject.set(x, "onUploadProgress", js.undefined)
    
    inline def setProxySettings(value: ProxySettings): Self = StObject.set(x, "proxySettings", value.asInstanceOf[js.Any])
    
    inline def setProxySettingsUndefined: Self = StObject.set(x, "proxySettings", js.undefined)
    
    inline def setRequestId(value: String): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    inline def setRequestIdUndefined: Self = StObject.set(x, "requestId", js.undefined)
    
    inline def setStreamResponseStatusCodes(value: Set[Double]): Self = StObject.set(x, "streamResponseStatusCodes", value.asInstanceOf[js.Any])
    
    inline def setStreamResponseStatusCodesUndefined: Self = StObject.set(x, "streamResponseStatusCodes", js.undefined)
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    inline def setTracingOptions(value: OperationTracingOptions): Self = StObject.set(x, "tracingOptions", value.asInstanceOf[js.Any])
    
    inline def setTracingOptionsUndefined: Self = StObject.set(x, "tracingOptions", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setWithCredentials(value: Boolean): Self = StObject.set(x, "withCredentials", value.asInstanceOf[js.Any])
    
    inline def setWithCredentialsUndefined: Self = StObject.set(x, "withCredentials", js.undefined)
  }
}
