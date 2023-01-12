package typings.azureCoreHttp

import org.scalablytyped.runtime.StringDictionary
import typings.azureAbortController.typesSrcAbortSignalMod.AbortSignalLike
import typings.azureCoreHttp.typesLatestSrcHttpHeadersMod.HttpHeadersLike
import typings.azureCoreHttp.typesLatestSrcHttpOperationResponseMod.HttpOperationResponse
import typings.azureCoreHttp.typesLatestSrcOperationResponseMod.OperationResponse
import typings.azureCoreHttp.typesLatestSrcOperationSpecMod.OperationSpec
import typings.azureCoreHttp.typesLatestSrcSerializerMod.Mapper
import typings.azureCoreHttp.typesLatestSrcServiceClientMod.ProxySettings
import typings.azureCoreHttp.typesLatestSrcUtilSerializerDotcommonMod.SerializerOptions
import typings.node.NodeJS.ReadableStream
import typings.std.Blob
import typings.std.Record
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesLatestSrcWebResourceMod {
  
  @JSImport("@azure/core-http/types/latest/src/webResource", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@azure/core-http/types/latest/src/webResource", "WebResource")
  @js.native
  open class WebResource protected ()
    extends StObject
       with WebResourceLike {
    def this(
      url: js.UndefOr[String],
      method: js.UndefOr[HttpMethods],
      body: js.UndefOr[Any],
      query: js.UndefOr[StringDictionary[Any]],
      headers: js.UndefOr[StringDictionary[Any] | HttpHeadersLike],
      streamResponseBody: js.UndefOr[Boolean],
      withCredentials: js.UndefOr[Boolean],
      abortSignal: js.UndefOr[AbortSignalLike],
      timeout: js.UndefOr[Double],
      onUploadProgress: js.UndefOr[js.Function1[/* progress */ TransferProgressEvent, Unit]],
      onDownloadProgress: js.UndefOr[js.Function1[/* progress */ TransferProgressEvent, Unit]],
      proxySettings: js.UndefOr[ProxySettings],
      keepAlive: js.UndefOr[Boolean],
      decompressResponse: js.UndefOr[Boolean],
      streamResponseStatusCodes: js.UndefOr[Set[Double]]
    ) = this()
    
    /**
      * The HTTP headers to use when making the request.
      */
    /* CompleteClass */
    var headers: HttpHeadersLike = js.native
    
    /**
      * The HTTP method to use when making the request.
      */
    /* CompleteClass */
    var method: HttpMethods = js.native
    
    /**
      * Sets options on the request.
      */
    /* CompleteClass */
    override def prepare(options: RequestPrepareOptions): WebResourceLike = js.native
    
    /**
      * A unique identifier for the request. Used for logging and tracing.
      */
    /* CompleteClass */
    var requestId: String = js.native
    
    /**
      * Tracing: Options used to create a span when tracing is enabled.
      */
    var spanOptions: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpanOptions */ Any
      ] = js.native
    
    /**
      * The number of milliseconds a request can take before automatically being terminated.
      * If the request is terminated, an `AbortError` is thrown.
      */
    /* CompleteClass */
    var timeout: Double = js.native
    
    /**
      * The URL being accessed by the request.
      */
    /* CompleteClass */
    var url: String = js.native
    
    /**
      * Validates that the required properties such as method, url, headers["Content-Type"],
      * headers["accept-language"] are defined. It will throw an error if one of the above
      * mentioned properties are not defined.
      */
    /* CompleteClass */
    override def validateRequestProperties(): Unit = js.native
    
    /**
      * If credentials (cookies) should be sent along during an XHR.
      */
    /* CompleteClass */
    var withCredentials: Boolean = js.native
  }
  
  inline def isWebResourceLike(`object`: Any): /* is @azure/core-http.@azure/core-http/types/latest/src/webResource.WebResourceLike */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isWebResourceLike")(`object`.asInstanceOf[js.Any]).asInstanceOf[/* is @azure/core-http.@azure/core-http/types/latest/src/webResource.WebResourceLike */ Boolean]
  
  /* Rewritten from type alias, can be one of: 
    - typings.azureCoreHttp.azureCoreHttpStrings.GET
    - typings.azureCoreHttp.azureCoreHttpStrings.PUT
    - typings.azureCoreHttp.azureCoreHttpStrings.POST
    - typings.azureCoreHttp.azureCoreHttpStrings.DELETE
    - typings.azureCoreHttp.azureCoreHttpStrings.PATCH
    - typings.azureCoreHttp.azureCoreHttpStrings.HEAD
    - typings.azureCoreHttp.azureCoreHttpStrings.OPTIONS
    - typings.azureCoreHttp.azureCoreHttpStrings.TRACE
  */
  trait HttpMethods extends StObject
  object HttpMethods {
    
    inline def DELETE: typings.azureCoreHttp.azureCoreHttpStrings.DELETE = "DELETE".asInstanceOf[typings.azureCoreHttp.azureCoreHttpStrings.DELETE]
    
    inline def GET: typings.azureCoreHttp.azureCoreHttpStrings.GET = "GET".asInstanceOf[typings.azureCoreHttp.azureCoreHttpStrings.GET]
    
    inline def HEAD: typings.azureCoreHttp.azureCoreHttpStrings.HEAD = "HEAD".asInstanceOf[typings.azureCoreHttp.azureCoreHttpStrings.HEAD]
    
    inline def OPTIONS: typings.azureCoreHttp.azureCoreHttpStrings.OPTIONS = "OPTIONS".asInstanceOf[typings.azureCoreHttp.azureCoreHttpStrings.OPTIONS]
    
    inline def PATCH: typings.azureCoreHttp.azureCoreHttpStrings.PATCH = "PATCH".asInstanceOf[typings.azureCoreHttp.azureCoreHttpStrings.PATCH]
    
    inline def POST: typings.azureCoreHttp.azureCoreHttpStrings.POST = "POST".asInstanceOf[typings.azureCoreHttp.azureCoreHttpStrings.POST]
    
    inline def PUT: typings.azureCoreHttp.azureCoreHttpStrings.PUT = "PUT".asInstanceOf[typings.azureCoreHttp.azureCoreHttpStrings.PUT]
    
    inline def TRACE: typings.azureCoreHttp.azureCoreHttpStrings.TRACE = "TRACE".asInstanceOf[typings.azureCoreHttp.azureCoreHttpStrings.TRACE]
  }
  
  type HttpRequestBody = Blob | String | js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView | js.Function0[ReadableStream]
  
  trait ParameterValue
    extends StObject
       with /**
    * May contain other properties.
    */
  /* key */ StringDictionary[Any] {
    
    /**
      * Disables URL encoding if set to true.
      */
    var skipUrlEncoding: Boolean
    
    /**
      * Value of the parameter.
      */
    var value: Any
  }
  object ParameterValue {
    
    inline def apply(skipUrlEncoding: Boolean, value: Any): ParameterValue = {
      val __obj = js.Dynamic.literal(skipUrlEncoding = skipUrlEncoding.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParameterValue]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ParameterValue] (val x: Self) extends AnyVal {
      
      inline def setSkipUrlEncoding(value: Boolean): Self = StObject.set(x, "skipUrlEncoding", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait RequestOptionsBase
    extends StObject
       with /**
    * May contain other properties.
    */
  /* key */ StringDictionary[Any] {
    
    /**
      * Signal of an abort controller. Can be used to abort both sending a network request and waiting for a response.
      */
    var abortSignal: js.UndefOr[AbortSignalLike] = js.undefined
    
    /**
      * will be applied before the request is sent.
      */
    var customHeaders: js.UndefOr[StringDictionary[String]] = js.undefined
    
    /**
      * Callback which fires upon download progress.
      */
    var onDownloadProgress: js.UndefOr[js.Function1[/* progress */ TransferProgressEvent, Unit]] = js.undefined
    
    /**
      * Callback which fires upon upload progress.
      */
    var onUploadProgress: js.UndefOr[js.Function1[/* progress */ TransferProgressEvent, Unit]] = js.undefined
    
    /**
      * Options to override XML parsing/building behavior.
      */
    var serializerOptions: js.UndefOr[SerializerOptions] = js.undefined
    
    /**
      * Whether or not the HttpOperationResponse should be deserialized. If this is undefined, then the
      * HttpOperationResponse should be deserialized.
      */
    var shouldDeserialize: js.UndefOr[Boolean | (js.Function1[/* response */ HttpOperationResponse, Boolean])] = js.undefined
    
    /**
      * The number of milliseconds a request can take before automatically being terminated.
      * If the request is terminated, an `AbortError` is thrown.
      */
    var timeout: js.UndefOr[Double] = js.undefined
    
    /**
      * Tracing: Context used when creating spans.
      */
    var tracingContext: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Context */ Any
      ] = js.undefined
  }
  object RequestOptionsBase {
    
    inline def apply(): RequestOptionsBase = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RequestOptionsBase]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RequestOptionsBase] (val x: Self) extends AnyVal {
      
      inline def setAbortSignal(value: AbortSignalLike): Self = StObject.set(x, "abortSignal", value.asInstanceOf[js.Any])
      
      inline def setAbortSignalUndefined: Self = StObject.set(x, "abortSignal", js.undefined)
      
      inline def setCustomHeaders(value: StringDictionary[String]): Self = StObject.set(x, "customHeaders", value.asInstanceOf[js.Any])
      
      inline def setCustomHeadersUndefined: Self = StObject.set(x, "customHeaders", js.undefined)
      
      inline def setOnDownloadProgress(value: /* progress */ TransferProgressEvent => Unit): Self = StObject.set(x, "onDownloadProgress", js.Any.fromFunction1(value))
      
      inline def setOnDownloadProgressUndefined: Self = StObject.set(x, "onDownloadProgress", js.undefined)
      
      inline def setOnUploadProgress(value: /* progress */ TransferProgressEvent => Unit): Self = StObject.set(x, "onUploadProgress", js.Any.fromFunction1(value))
      
      inline def setOnUploadProgressUndefined: Self = StObject.set(x, "onUploadProgress", js.undefined)
      
      inline def setSerializerOptions(value: SerializerOptions): Self = StObject.set(x, "serializerOptions", value.asInstanceOf[js.Any])
      
      inline def setSerializerOptionsUndefined: Self = StObject.set(x, "serializerOptions", js.undefined)
      
      inline def setShouldDeserialize(value: Boolean | (js.Function1[/* response */ HttpOperationResponse, Boolean])): Self = StObject.set(x, "shouldDeserialize", value.asInstanceOf[js.Any])
      
      inline def setShouldDeserializeFunction1(value: /* response */ HttpOperationResponse => Boolean): Self = StObject.set(x, "shouldDeserialize", js.Any.fromFunction1(value))
      
      inline def setShouldDeserializeUndefined: Self = StObject.set(x, "shouldDeserialize", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setTracingContext(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Context */ Any
      ): Self = StObject.set(x, "tracingContext", value.asInstanceOf[js.Any])
      
      inline def setTracingContextUndefined: Self = StObject.set(x, "tracingContext", js.undefined)
    }
  }
  
  trait RequestPrepareOptions extends StObject {
    
    /**
      * Signal of an abort controller. Can be used to abort both sending a network request and waiting for a response.
      */
    var abortSignal: js.UndefOr[AbortSignalLike] = js.undefined
    
    /**
      * The base url of the request. Default value is: "https://management.azure.com". This is
      * applicable only with pathTemplate. If you are providing options.url then it is expected that
      * you provide the complete url.
      */
    var baseUrl: js.UndefOr[String] = js.undefined
    
    /**
      * The request body. It can be of any type. This value will be serialized if it is not a stream.
      */
    var body: js.UndefOr[Any] = js.undefined
    
    /**
      * Indicates whether the request body is a stream (useful for file upload scenarios).
      */
    var bodyIsStream: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Provides information on how to deserialize the response body.
      */
    var deserializationMapper: js.UndefOr[Record[String, Any]] = js.undefined
    
    /**
      * When set to true, instructs the client to not set "x-ms-client-request-id" header to a new Guid().
      */
    var disableClientRequestId: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Indicates whether this method should JSON.stringify() the request body. Default value: false.
      */
    var disableJsonStringifyOnBody: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Form data, used to build the request body.
      */
    var formData: js.UndefOr[StringDictionary[Any]] = js.undefined
    
    /**
      * A dictionary of request headers that need to be applied to the request.
      * Here the key is the "header-name" and the value is the "header-value". The header-value MUST be of type string.
      *  - ContentType must be provided with the key name as "Content-Type". Default value "application/json; charset=utf-8".
      *  - "Transfer-Encoding" is set to "chunked" by default if "options.bodyIsStream" is set to true.
      *  - "Content-Type" is set to "application/octet-stream" by default if "options.bodyIsStream" is set to true.
      *  - "accept-language" by default is set to "en-US"
      *  - "x-ms-client-request-id" by default is set to a new Guid. To not generate a guid for the request, please set options.disableClientRequestId to true
      */
    var headers: js.UndefOr[StringDictionary[Any]] = js.undefined
    
    /**
      * A dictionary of mappers that may be used while [de]serialization.
      */
    var mappers: js.UndefOr[StringDictionary[Any]] = js.undefined
    
    /**
      * The HTTP request method. Valid values are "GET", "PUT", "HEAD", "DELETE", "OPTIONS", "POST",
      * or "PATCH".
      */
    var method: HttpMethods
    
    /**
      * Allows keeping track of the progress of downloading the incoming response.
      */
    var onDownloadProgress: js.UndefOr[js.Function1[/* progress */ TransferProgressEvent, Unit]] = js.undefined
    
    /**
      * Allows keeping track of the progress of uploading the outgoing request.
      */
    var onUploadProgress: js.UndefOr[js.Function1[/* progress */ TransferProgressEvent, Unit]] = js.undefined
    
    /**
      * A dictionary of path parameters that need to be replaced with actual values in the pathTemplate.
      * Here the key is the "path-parameter-name" and the value is the "path-parameter-value".
      * The "path-parameter-value" can be of type "string"  or it can be of type "object".
      * The "object" format should be used when you want to skip url encoding. While using the object format,
      * the object must have a property named value which provides the "path-parameter-value".
      * Example:
      *    - path-parameter-value in "object" format: `{ "path-parameter-name": { value: "path-parameter-value", skipUrlEncoding: true } }`
      *    - path-parameter-value in "string" format: `{ "path-parameter-name": "path-parameter-value" }`.
      */
    var pathParameters: js.UndefOr[StringDictionary[Any | ParameterValue]] = js.undefined
    
    /**
      * The path template of the request url. Either provide the "url" or provide the "pathTemplate" in
      * the options object. Both the options are mutually exclusive.
      * Example: `/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Storage/storageAccounts/{accountName}`
      */
    var pathTemplate: js.UndefOr[String] = js.undefined
    
    /**
      * A dictionary of query parameters to be appended to the url, where
      * the "key" is the "query-parameter-name" and the "value" is the "query-parameter-value".
      * The "query-parameter-value" can be of type "string" or it can be of type "object".
      * The "object" format should be used when you want to skip url encoding. While using the object format,
      * the object must have a property named value which provides the "query-parameter-value".
      * Example:
      *    - query-parameter-value in "object" format: `{ "query-parameter-name": { value: "query-parameter-value", skipUrlEncoding: true } }`
      *    - query-parameter-value in "string" format: `{ "query-parameter-name": "query-parameter-value"}`.
      * Note: "If options.url already has some query parameters, then the value provided in options.queryParameters will be appended to the url.
      */
    var queryParameters: js.UndefOr[StringDictionary[Any | ParameterValue]] = js.undefined
    
    /**
      * Provides information on how to serialize the request body.
      */
    var serializationMapper: js.UndefOr[Mapper] = js.undefined
    
    /**
      * Tracing: Options used to create a span when tracing is enabled.
      */
    var spanOptions: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpanOptions */ Any
      ] = js.undefined
    
    /**
      * Tracing: Context used when creating spans.
      */
    var tracingContext: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Context */ Any
      ] = js.undefined
    
    /**
      * The request url. It may or may not have query parameters in it. Either provide the "url" or
      * provide the "pathTemplate" in the options object. Both the options are mutually exclusive.
      */
    var url: js.UndefOr[String] = js.undefined
  }
  object RequestPrepareOptions {
    
    inline def apply(method: HttpMethods): RequestPrepareOptions = {
      val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequestPrepareOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RequestPrepareOptions] (val x: Self) extends AnyVal {
      
      inline def setAbortSignal(value: AbortSignalLike): Self = StObject.set(x, "abortSignal", value.asInstanceOf[js.Any])
      
      inline def setAbortSignalUndefined: Self = StObject.set(x, "abortSignal", js.undefined)
      
      inline def setBaseUrl(value: String): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
      
      inline def setBaseUrlUndefined: Self = StObject.set(x, "baseUrl", js.undefined)
      
      inline def setBody(value: Any): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyIsStream(value: Boolean): Self = StObject.set(x, "bodyIsStream", value.asInstanceOf[js.Any])
      
      inline def setBodyIsStreamUndefined: Self = StObject.set(x, "bodyIsStream", js.undefined)
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setDeserializationMapper(value: Record[String, Any]): Self = StObject.set(x, "deserializationMapper", value.asInstanceOf[js.Any])
      
      inline def setDeserializationMapperUndefined: Self = StObject.set(x, "deserializationMapper", js.undefined)
      
      inline def setDisableClientRequestId(value: Boolean): Self = StObject.set(x, "disableClientRequestId", value.asInstanceOf[js.Any])
      
      inline def setDisableClientRequestIdUndefined: Self = StObject.set(x, "disableClientRequestId", js.undefined)
      
      inline def setDisableJsonStringifyOnBody(value: Boolean): Self = StObject.set(x, "disableJsonStringifyOnBody", value.asInstanceOf[js.Any])
      
      inline def setDisableJsonStringifyOnBodyUndefined: Self = StObject.set(x, "disableJsonStringifyOnBody", js.undefined)
      
      inline def setFormData(value: StringDictionary[Any]): Self = StObject.set(x, "formData", value.asInstanceOf[js.Any])
      
      inline def setFormDataUndefined: Self = StObject.set(x, "formData", js.undefined)
      
      inline def setHeaders(value: StringDictionary[Any]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setMappers(value: StringDictionary[Any]): Self = StObject.set(x, "mappers", value.asInstanceOf[js.Any])
      
      inline def setMappersUndefined: Self = StObject.set(x, "mappers", js.undefined)
      
      inline def setMethod(value: HttpMethods): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setOnDownloadProgress(value: /* progress */ TransferProgressEvent => Unit): Self = StObject.set(x, "onDownloadProgress", js.Any.fromFunction1(value))
      
      inline def setOnDownloadProgressUndefined: Self = StObject.set(x, "onDownloadProgress", js.undefined)
      
      inline def setOnUploadProgress(value: /* progress */ TransferProgressEvent => Unit): Self = StObject.set(x, "onUploadProgress", js.Any.fromFunction1(value))
      
      inline def setOnUploadProgressUndefined: Self = StObject.set(x, "onUploadProgress", js.undefined)
      
      inline def setPathParameters(value: StringDictionary[Any | ParameterValue]): Self = StObject.set(x, "pathParameters", value.asInstanceOf[js.Any])
      
      inline def setPathParametersUndefined: Self = StObject.set(x, "pathParameters", js.undefined)
      
      inline def setPathTemplate(value: String): Self = StObject.set(x, "pathTemplate", value.asInstanceOf[js.Any])
      
      inline def setPathTemplateUndefined: Self = StObject.set(x, "pathTemplate", js.undefined)
      
      inline def setQueryParameters(value: StringDictionary[Any | ParameterValue]): Self = StObject.set(x, "queryParameters", value.asInstanceOf[js.Any])
      
      inline def setQueryParametersUndefined: Self = StObject.set(x, "queryParameters", js.undefined)
      
      inline def setSerializationMapper(value: Mapper): Self = StObject.set(x, "serializationMapper", value.asInstanceOf[js.Any])
      
      inline def setSerializationMapperUndefined: Self = StObject.set(x, "serializationMapper", js.undefined)
      
      inline def setSpanOptions(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpanOptions */ Any
      ): Self = StObject.set(x, "spanOptions", value.asInstanceOf[js.Any])
      
      inline def setSpanOptionsUndefined: Self = StObject.set(x, "spanOptions", js.undefined)
      
      inline def setTracingContext(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Context */ Any
      ): Self = StObject.set(x, "tracingContext", value.asInstanceOf[js.Any])
      
      inline def setTracingContextUndefined: Self = StObject.set(x, "tracingContext", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TransferProgressEvent] (val x: Self) extends AnyVal {
      
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
      * A function that returns the proper OperationResponse for the given OperationSpec and
      * HttpOperationResponse combination. If this is undefined, then a simple status code lookup will
      * be used.
      */
    var operationResponseGetter: js.UndefOr[
        js.Function2[
          /* operationSpec */ OperationSpec, 
          /* response */ HttpOperationResponse, 
          js.UndefOr[OperationResponse]
        ]
      ] = js.undefined
    
    /**
      * Used to parse the response.
      */
    var operationSpec: js.UndefOr[OperationSpec] = js.undefined
    
    /**
      * Sets options on the request.
      */
    def prepare(options: RequestPrepareOptions): WebResourceLike
    
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
      * Whether or not the HttpOperationResponse should be deserialized. If this is undefined, then the
      * HttpOperationResponse should be deserialized.
      */
    var shouldDeserialize: js.UndefOr[Boolean | (js.Function1[/* response */ HttpOperationResponse, Boolean])] = js.undefined
    
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
      * Tracing: Context used when creating spans.
      */
    var tracingContext: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Context */ Any
      ] = js.undefined
    
    /**
      * The URL being accessed by the request.
      */
    var url: String
    
    /**
      * Validates that the required properties such as method, url, headers["Content-Type"],
      * headers["accept-language"] are defined. It will throw an error if one of the above
      * mentioned properties are not defined.
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
      prepare: RequestPrepareOptions => WebResourceLike,
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
      
      inline def setOperationResponseGetter(
        value: (/* operationSpec */ OperationSpec, /* response */ HttpOperationResponse) => js.UndefOr[OperationResponse]
      ): Self = StObject.set(x, "operationResponseGetter", js.Any.fromFunction2(value))
      
      inline def setOperationResponseGetterUndefined: Self = StObject.set(x, "operationResponseGetter", js.undefined)
      
      inline def setOperationSpec(value: OperationSpec): Self = StObject.set(x, "operationSpec", value.asInstanceOf[js.Any])
      
      inline def setOperationSpecUndefined: Self = StObject.set(x, "operationSpec", js.undefined)
      
      inline def setPrepare(value: RequestPrepareOptions => WebResourceLike): Self = StObject.set(x, "prepare", js.Any.fromFunction1(value))
      
      inline def setProxySettings(value: ProxySettings): Self = StObject.set(x, "proxySettings", value.asInstanceOf[js.Any])
      
      inline def setProxySettingsUndefined: Self = StObject.set(x, "proxySettings", js.undefined)
      
      inline def setQuery(value: StringDictionary[Any]): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
      
      inline def setRequestId(value: String): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
      
      inline def setShouldDeserialize(value: Boolean | (js.Function1[/* response */ HttpOperationResponse, Boolean])): Self = StObject.set(x, "shouldDeserialize", value.asInstanceOf[js.Any])
      
      inline def setShouldDeserializeFunction1(value: /* response */ HttpOperationResponse => Boolean): Self = StObject.set(x, "shouldDeserialize", js.Any.fromFunction1(value))
      
      inline def setShouldDeserializeUndefined: Self = StObject.set(x, "shouldDeserialize", js.undefined)
      
      inline def setStreamResponseBody(value: Boolean): Self = StObject.set(x, "streamResponseBody", value.asInstanceOf[js.Any])
      
      inline def setStreamResponseBodyUndefined: Self = StObject.set(x, "streamResponseBody", js.undefined)
      
      inline def setStreamResponseStatusCodes(value: Set[Double]): Self = StObject.set(x, "streamResponseStatusCodes", value.asInstanceOf[js.Any])
      
      inline def setStreamResponseStatusCodesUndefined: Self = StObject.set(x, "streamResponseStatusCodes", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTracingContext(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Context */ Any
      ): Self = StObject.set(x, "tracingContext", value.asInstanceOf[js.Any])
      
      inline def setTracingContextUndefined: Self = StObject.set(x, "tracingContext", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setValidateRequestProperties(value: () => Unit): Self = StObject.set(x, "validateRequestProperties", js.Any.fromFunction0(value))
      
      inline def setWithCredentials(value: Boolean): Self = StObject.set(x, "withCredentials", value.asInstanceOf[js.Any])
    }
  }
}
