package typings.azureCoreHttpCompat

import org.scalablytyped.runtime.StringDictionary
import typings.azureAbortController.typesSrcAbortSignalMod.AbortSignalLike
import typings.azureCoreClient.mod.CommonClientOptions
import typings.azureCoreClient.mod.ServiceClient
import typings.azureCoreClient.mod.ServiceClientOptions
import typings.azureCoreHttpCompat.anon.PreserveCase
import typings.azureCoreRestPipeline.typesLatestCoreRestPipelineMod.HttpMethods
import typings.azureCoreRestPipeline.typesLatestCoreRestPipelineMod.ProxySettings
import typings.std.Blob
import typings.std.ReadableStream
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@azure/core-http-compat", "ExtendedServiceClient")
  @js.native
  open class ExtendedServiceClient protected () extends ServiceClient {
    def this(options: ExtendedServiceClientOptions) = this()
  }
  
  @JSImport("@azure/core-http-compat", "disbaleKeepAlivePolicyName")
  @js.native
  val disbaleKeepAlivePolicyName: /* "DisableKeepAlivePolicy" */ String = js.native
  
  /* Inlined parent std.Omit<@azure/core-client.@azure/core-client.FullOperationResponse, 'request' | 'headers'> */
  trait CompatResponse extends StObject {
    
    var blobBody: js.UndefOr[js.Promise[Blob]] = js.undefined
    
    var bodyAsText: js.UndefOr[String | Null] = js.undefined
    
    var browserStreamBody: js.UndefOr[ReadableStream[js.typedarray.Uint8Array]] = js.undefined
    
    /**
      * A collection of HTTP header key/value pairs.
      */
    var headers: HttpHeadersLike
    
    var parsedBody: js.UndefOr[Any] = js.undefined
    
    var parsedHeaders: js.UndefOr[StringDictionary[Any]] = js.undefined
    
    var readableStreamBody: js.UndefOr[typings.node.NodeJS.ReadableStream] = js.undefined
    
    /**
      * A description of a HTTP request to be made to a remote server.
      */
    var request: WebResourceLike
    
    var status: Double
  }
  object CompatResponse {
    
    inline def apply(headers: HttpHeadersLike, request: WebResourceLike, status: Double): CompatResponse = {
      val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[CompatResponse]
    }
    
    extension [Self <: CompatResponse](x: Self) {
      
      inline def setBlobBody(value: js.Promise[Blob]): Self = StObject.set(x, "blobBody", value.asInstanceOf[js.Any])
      
      inline def setBlobBodyUndefined: Self = StObject.set(x, "blobBody", js.undefined)
      
      inline def setBodyAsText(value: String): Self = StObject.set(x, "bodyAsText", value.asInstanceOf[js.Any])
      
      inline def setBodyAsTextNull: Self = StObject.set(x, "bodyAsText", null)
      
      inline def setBodyAsTextUndefined: Self = StObject.set(x, "bodyAsText", js.undefined)
      
      inline def setBrowserStreamBody(value: ReadableStream[js.typedarray.Uint8Array]): Self = StObject.set(x, "browserStreamBody", value.asInstanceOf[js.Any])
      
      inline def setBrowserStreamBodyUndefined: Self = StObject.set(x, "browserStreamBody", js.undefined)
      
      inline def setHeaders(value: HttpHeadersLike): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setParsedBody(value: Any): Self = StObject.set(x, "parsedBody", value.asInstanceOf[js.Any])
      
      inline def setParsedBodyUndefined: Self = StObject.set(x, "parsedBody", js.undefined)
      
      inline def setParsedHeaders(value: StringDictionary[Any]): Self = StObject.set(x, "parsedHeaders", value.asInstanceOf[js.Any])
      
      inline def setParsedHeadersUndefined: Self = StObject.set(x, "parsedHeaders", js.undefined)
      
      inline def setReadableStreamBody(value: typings.node.NodeJS.ReadableStream): Self = StObject.set(x, "readableStreamBody", value.asInstanceOf[js.Any])
      
      inline def setReadableStreamBodyUndefined: Self = StObject.set(x, "readableStreamBody", js.undefined)
      
      inline def setRequest(value: WebResourceLike): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  trait ExtendedClientOptions extends StObject {
    
    /**
      * Options to disable keep alive.
      */
    var keepAliveOptions: js.UndefOr[KeepAliveOptions] = js.undefined
    
    /**
      * Options to redirect requests.
      */
    var redirectOptions: js.UndefOr[RedirectOptions] = js.undefined
  }
  object ExtendedClientOptions {
    
    inline def apply(): ExtendedClientOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExtendedClientOptions]
    }
    
    extension [Self <: ExtendedClientOptions](x: Self) {
      
      inline def setKeepAliveOptions(value: KeepAliveOptions): Self = StObject.set(x, "keepAliveOptions", value.asInstanceOf[js.Any])
      
      inline def setKeepAliveOptionsUndefined: Self = StObject.set(x, "keepAliveOptions", js.undefined)
      
      inline def setRedirectOptions(value: RedirectOptions): Self = StObject.set(x, "redirectOptions", value.asInstanceOf[js.Any])
      
      inline def setRedirectOptionsUndefined: Self = StObject.set(x, "redirectOptions", js.undefined)
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.azureCoreHttpCompat.mod.ExtendedClientOptions because var conflicts: redirectOptions. Inlined keepAliveOptions */ trait ExtendedCommonClientOptions
    extends StObject
       with CommonClientOptions {
    
    /**
      * Options to disable keep alive.
      */
    var keepAliveOptions: js.UndefOr[KeepAliveOptions] = js.undefined
  }
  object ExtendedCommonClientOptions {
    
    inline def apply(): ExtendedCommonClientOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExtendedCommonClientOptions]
    }
    
    extension [Self <: ExtendedCommonClientOptions](x: Self) {
      
      inline def setKeepAliveOptions(value: KeepAliveOptions): Self = StObject.set(x, "keepAliveOptions", value.asInstanceOf[js.Any])
      
      inline def setKeepAliveOptionsUndefined: Self = StObject.set(x, "keepAliveOptions", js.undefined)
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.azureCoreHttpCompat.mod.ExtendedClientOptions because var conflicts: redirectOptions. Inlined keepAliveOptions */ trait ExtendedServiceClientOptions
    extends StObject
       with ServiceClientOptions {
    
    /**
      * Options to disable keep alive.
      */
    var keepAliveOptions: js.UndefOr[KeepAliveOptions] = js.undefined
  }
  object ExtendedServiceClientOptions {
    
    inline def apply(): ExtendedServiceClientOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExtendedServiceClientOptions]
    }
    
    extension [Self <: ExtendedServiceClientOptions](x: Self) {
      
      inline def setKeepAliveOptions(value: KeepAliveOptions): Self = StObject.set(x, "keepAliveOptions", value.asInstanceOf[js.Any])
      
      inline def setKeepAliveOptionsUndefined: Self = StObject.set(x, "keepAliveOptions", js.undefined)
    }
  }
  
  trait HttpHeader extends StObject {
    
    /**
      * The name of the header.
      */
    var name: String
    
    /**
      * The value of the header.
      */
    var value: String
  }
  object HttpHeader {
    
    inline def apply(name: String, value: String): HttpHeader = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[HttpHeader]
    }
    
    extension [Self <: HttpHeader](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait HttpHeadersLike extends StObject {
    
    /**
      * Get whether or not this header collection contains a header entry for the provided header name.
      */
    def contains(headerName: String): Boolean = js.native
    
    /**
      * Get the header value for the provided header name, or undefined if no header exists in this
      * collection with the provided name.
      * @param headerName - The name of the header.
      */
    def get(headerName: String): js.UndefOr[String] = js.native
    
    /**
      * Get the header names that are contained in this collection.
      */
    def headerNames(): js.Array[String] = js.native
    
    /**
      * Get the header values that are contained in this collection.
      */
    def headerValues(): js.Array[String] = js.native
    
    /**
      * Get the headers that are contained in this collection as an array.
      */
    def headersArray(): js.Array[HttpHeader] = js.native
    
    /**
      * Get the headers that are contained this collection as an object.
      */
    def rawHeaders(): RawHttpHeaders = js.native
    
    /**
      * Remove the header with the provided headerName. Return whether or not the header existed and
      * was removed.
      * @param headerName - The name of the header to remove.
      */
    def remove(headerName: String): Boolean = js.native
    
    /**
      * Set a header in this collection with the provided name and value. The name is
      * case-insensitive.
      * @param headerName - The name of the header to set. This value is case-insensitive.
      * @param headerValue - The value of the header to set.
      */
    def set(headerName: String, headerValue: String): Unit = js.native
    def set(headerName: String, headerValue: Double): Unit = js.native
    
    /**
      * Get the JSON object representation of this HTTP header collection.
      * The result is the same as `rawHeaders()`.
      */
    def toJson(): RawHttpHeaders = js.native
    def toJson(options: PreserveCase): RawHttpHeaders = js.native
  }
  
  trait KeepAliveOptions extends StObject {
    
    /**
      * When true, connections will be kept alive for multiple requests.
      * Defaults to true.
      */
    var enable: js.UndefOr[Boolean] = js.undefined
  }
  object KeepAliveOptions {
    
    inline def apply(): KeepAliveOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[KeepAliveOptions]
    }
    
    extension [Self <: KeepAliveOptions](x: Self) {
      
      inline def setEnable(value: Boolean): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
      
      inline def setEnableUndefined: Self = StObject.set(x, "enable", js.undefined)
    }
  }
  
  type RawHttpHeaders = StringDictionary[String]
  
  trait RedirectOptions extends StObject {
    
    /**
      * When true, redirect responses are followed.  Defaults to true.
      */
    var handleRedirects: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The maximum number of times the redirect URL will be tried before
      * failing.  Defaults to 20.
      */
    var maxRetries: js.UndefOr[Double] = js.undefined
  }
  object RedirectOptions {
    
    inline def apply(): RedirectOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RedirectOptions]
    }
    
    extension [Self <: RedirectOptions](x: Self) {
      
      inline def setHandleRedirects(value: Boolean): Self = StObject.set(x, "handleRedirects", value.asInstanceOf[js.Any])
      
      inline def setHandleRedirectsUndefined: Self = StObject.set(x, "handleRedirects", js.undefined)
      
      inline def setMaxRetries(value: Double): Self = StObject.set(x, "maxRetries", value.asInstanceOf[js.Any])
      
      inline def setMaxRetriesUndefined: Self = StObject.set(x, "maxRetries", js.undefined)
    }
  }
  
  trait TransferProgressEvent extends StObject {
    
    /**
      * The number of bytes loaded so far.
      */
    var loadedBytes: Double
  }
  object TransferProgressEvent {
    
    inline def apply(loadedBytes: Double): TransferProgressEvent = {
      val __obj = js.Dynamic.literal(loadedBytes = loadedBytes.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransferProgressEvent]
    }
    
    extension [Self <: TransferProgressEvent](x: Self) {
      
      inline def setLoadedBytes(value: Double): Self = StObject.set(x, "loadedBytes", value.asInstanceOf[js.Any])
    }
  }
  
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
      * If credentials (cookies) should be sent along during an XHR.
      */
    var withCredentials: Boolean
  }
  object WebResourceLike {
    
    inline def apply(
      headers: HttpHeadersLike,
      method: HttpMethods,
      requestId: String,
      timeout: Double,
      url: String,
      withCredentials: Boolean
    ): WebResourceLike = {
      val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], withCredentials = withCredentials.asInstanceOf[js.Any])
      __obj.asInstanceOf[WebResourceLike]
    }
    
    extension [Self <: WebResourceLike](x: Self) {
      
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
      
      inline def setWithCredentials(value: Boolean): Self = StObject.set(x, "withCredentials", value.asInstanceOf[js.Any])
    }
  }
}
