package typings.azureCoreRestPipeline.types3Dot1CoreRestPipelineMod

import typings.azureAbortController.typesSrcAbortSignalMod.AbortSignalLike
import typings.azureCoreTracing.mod.OperationTracingOptions
import typings.node.NodeJS.ReadableStream
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PipelineRequest extends StObject {
  
  /**
    * Used to abort the request later.
    */
  var abortSignal: js.UndefOr[AbortSignalLike] = js.undefined
  
  /**
    * NODEJS ONLY
    *
    * A Node-only option to provide a custom `http.Agent`/`https.Agent`.
    * Does nothing when running in the browser.
    */
  var agent: js.UndefOr[Agent] = js.undefined
  
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
    * A browser only option to enable browser Streams. If this option is set and a response is a stream
    * the response will have a property `browserStream` instead of `blobBody` which will be undefined.
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
  var headers: HttpHeaders
  
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
    * Proxy configuration.
    */
  var proxySettings: js.UndefOr[ProxySettings] = js.undefined
  
  /**
    * A unique identifier for the request. Used for logging and tracing.
    */
  var requestId: String
  
  /**
    * A list of response status codes whose corresponding PipelineResponse body should be treated as a stream.
    * When streamResponseStatusCodes contains the value Number.POSITIVE_INFINITY any status would be treated as a stream.
    */
  var streamResponseStatusCodes: js.UndefOr[Set[Double]] = js.undefined
  
  /**
    * The number of milliseconds a request can take before automatically being terminated.
    * If the request is terminated, an `AbortError` is thrown.
    * Defaults to 0, which disables the timeout.
    */
  var timeout: Double
  
  /** Settings for configuring TLS authentication */
  var tlsSettings: js.UndefOr[TlsSettings] = js.undefined
  
  /**
    * Tracing options to use for any created Spans.
    */
  var tracingOptions: js.UndefOr[OperationTracingOptions] = js.undefined
  
  /**
    * The URL to make the request to.
    */
  var url: String
  
  /**
    * Indicates whether the user agent should send cookies from the other domain in the case of cross-origin requests.
    * Defaults to false.
    */
  var withCredentials: Boolean
}
object PipelineRequest {
  
  inline def apply(
    headers: HttpHeaders,
    method: HttpMethods,
    requestId: String,
    timeout: Double,
    url: String,
    withCredentials: Boolean
  ): PipelineRequest = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], withCredentials = withCredentials.asInstanceOf[js.Any])
    __obj.asInstanceOf[PipelineRequest]
  }
  
  extension [Self <: PipelineRequest](x: Self) {
    
    inline def setAbortSignal(value: AbortSignalLike): Self = StObject.set(x, "abortSignal", value.asInstanceOf[js.Any])
    
    inline def setAbortSignalUndefined: Self = StObject.set(x, "abortSignal", js.undefined)
    
    inline def setAgent(value: Agent): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
    
    inline def setAgentUndefined: Self = StObject.set(x, "agent", js.undefined)
    
    inline def setAllowInsecureConnection(value: Boolean): Self = StObject.set(x, "allowInsecureConnection", value.asInstanceOf[js.Any])
    
    inline def setAllowInsecureConnectionUndefined: Self = StObject.set(x, "allowInsecureConnection", js.undefined)
    
    inline def setBody(value: RequestBodyType): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyFunction0(value: () => ReadableStream | typings.std.ReadableStream[js.typedarray.Uint8Array]): Self = StObject.set(x, "body", js.Any.fromFunction0(value))
    
    inline def setBodyNull: Self = StObject.set(x, "body", null)
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setDisableKeepAlive(value: Boolean): Self = StObject.set(x, "disableKeepAlive", value.asInstanceOf[js.Any])
    
    inline def setDisableKeepAliveUndefined: Self = StObject.set(x, "disableKeepAlive", js.undefined)
    
    inline def setEnableBrowserStreams(value: Boolean): Self = StObject.set(x, "enableBrowserStreams", value.asInstanceOf[js.Any])
    
    inline def setEnableBrowserStreamsUndefined: Self = StObject.set(x, "enableBrowserStreams", js.undefined)
    
    inline def setFormData(value: FormDataMap): Self = StObject.set(x, "formData", value.asInstanceOf[js.Any])
    
    inline def setFormDataUndefined: Self = StObject.set(x, "formData", js.undefined)
    
    inline def setHeaders(value: HttpHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setMethod(value: HttpMethods): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setOnDownloadProgress(value: /* progress */ TransferProgressEvent => Unit): Self = StObject.set(x, "onDownloadProgress", js.Any.fromFunction1(value))
    
    inline def setOnDownloadProgressUndefined: Self = StObject.set(x, "onDownloadProgress", js.undefined)
    
    inline def setOnUploadProgress(value: /* progress */ TransferProgressEvent => Unit): Self = StObject.set(x, "onUploadProgress", js.Any.fromFunction1(value))
    
    inline def setOnUploadProgressUndefined: Self = StObject.set(x, "onUploadProgress", js.undefined)
    
    inline def setProxySettings(value: ProxySettings): Self = StObject.set(x, "proxySettings", value.asInstanceOf[js.Any])
    
    inline def setProxySettingsUndefined: Self = StObject.set(x, "proxySettings", js.undefined)
    
    inline def setRequestId(value: String): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    inline def setStreamResponseStatusCodes(value: Set[Double]): Self = StObject.set(x, "streamResponseStatusCodes", value.asInstanceOf[js.Any])
    
    inline def setStreamResponseStatusCodesUndefined: Self = StObject.set(x, "streamResponseStatusCodes", js.undefined)
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTlsSettings(value: TlsSettings): Self = StObject.set(x, "tlsSettings", value.asInstanceOf[js.Any])
    
    inline def setTlsSettingsUndefined: Self = StObject.set(x, "tlsSettings", js.undefined)
    
    inline def setTracingOptions(value: OperationTracingOptions): Self = StObject.set(x, "tracingOptions", value.asInstanceOf[js.Any])
    
    inline def setTracingOptionsUndefined: Self = StObject.set(x, "tracingOptions", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setWithCredentials(value: Boolean): Self = StObject.set(x, "withCredentials", value.asInstanceOf[js.Any])
  }
}
