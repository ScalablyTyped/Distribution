package typings.azureCoreHttp

import org.scalablytyped.runtime.StringDictionary
import typings.azureAbortController.typesSrcAbortSignalMod.AbortSignalLike
import typings.azureCoreAuth.mod.TokenCredential
import typings.azureCoreHttp.anon.AUTHORIZATION
import typings.azureCoreHttp.anon.AbortErrorMsg
import typings.azureCoreHttp.anon.CustomNoProxyList
import typings.azureCoreHttp.anon.HttpVerbs
import typings.azureCoreHttp.anon.Span
import typings.azureCoreHttp.azureCoreHttpStrings.Base64Url
import typings.azureCoreHttp.azureCoreHttpStrings.Boolean
import typings.azureCoreHttp.azureCoreHttpStrings.ByteArray
import typings.azureCoreHttp.azureCoreHttpStrings.Composite
import typings.azureCoreHttp.azureCoreHttpStrings.Date
import typings.azureCoreHttp.azureCoreHttpStrings.DateTime
import typings.azureCoreHttp.azureCoreHttpStrings.DateTimeRfc1123
import typings.azureCoreHttp.azureCoreHttpStrings.Dictionary
import typings.azureCoreHttp.azureCoreHttpStrings.Enum
import typings.azureCoreHttp.azureCoreHttpStrings.Number
import typings.azureCoreHttp.azureCoreHttpStrings.Object
import typings.azureCoreHttp.azureCoreHttpStrings.Sequence
import typings.azureCoreHttp.azureCoreHttpStrings.Stream
import typings.azureCoreHttp.azureCoreHttpStrings.TimeSpan
import typings.azureCoreHttp.azureCoreHttpStrings.UnixTime
import typings.azureCoreHttp.typesLatestSrcCreateSpanLegacyMod.SpanConfig
import typings.azureCoreHttp.typesLatestSrcCredentialsApiKeyCredentialsMod.ApiKeyCredentialOptions
import typings.azureCoreHttp.typesLatestSrcCredentialsServiceClientCredentialsMod.ServiceClientCredentials
import typings.azureCoreHttp.typesLatestSrcHttpHeadersMod.HttpHeadersLike
import typings.azureCoreHttp.typesLatestSrcHttpHeadersMod.RawHttpHeaders
import typings.azureCoreHttp.typesLatestSrcHttpOperationResponseMod.HttpOperationResponse
import typings.azureCoreHttp.typesLatestSrcHttpOperationResponseMod.RestResponse
import typings.azureCoreHttp.typesLatestSrcHttpPipelineLoggerMod.HttpPipelineLogger
import typings.azureCoreHttp.typesLatestSrcOperationOptionsMod.OperationOptions
import typings.azureCoreHttp.typesLatestSrcOperationResponseMod.OperationResponse
import typings.azureCoreHttp.typesLatestSrcPipelineOptionsMod.InternalPipelineOptions
import typings.azureCoreHttp.typesLatestSrcPoliciesDeserializationPolicyMod.DeserializationContentTypes
import typings.azureCoreHttp.typesLatestSrcPoliciesKeepAlivePolicyMod.KeepAliveOptions
import typings.azureCoreHttp.typesLatestSrcPoliciesLogPolicyMod.LogPolicyOptions
import typings.azureCoreHttp.typesLatestSrcPoliciesRequestPolicyMod.RequestPolicy
import typings.azureCoreHttp.typesLatestSrcPoliciesRequestPolicyMod.RequestPolicyFactory
import typings.azureCoreHttp.typesLatestSrcPoliciesRequestPolicyMod.RequestPolicyOptionsLike
import typings.azureCoreHttp.typesLatestSrcPoliciesTracingPolicyMod.TracingPolicyOptions
import typings.azureCoreHttp.typesLatestSrcPoliciesUserAgentPolicyMod.TelemetryInfo
import typings.azureCoreHttp.typesLatestSrcServiceClientMod.ProxySettings
import typings.azureCoreHttp.typesLatestSrcServiceClientMod.ServiceClientOptions
import typings.azureCoreHttp.typesLatestSrcUtilSerializerDotcommonMod.SerializerOptions
import typings.azureCoreHttp.typesLatestSrcUtilUtilsMod.ServiceCallback
import typings.azureCoreHttp.typesLatestSrcWebResourceMod.HttpMethods
import typings.azureCoreHttp.typesLatestSrcWebResourceMod.RequestOptionsBase
import typings.azureCoreHttp.typesLatestSrcWebResourceMod.TransferProgressEvent
import typings.azureCoreHttp.typesLatestSrcWebResourceMod.WebResourceLike
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@azure/core-http", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@azure/core-http", "AccessTokenRefresher")
  @js.native
  open class AccessTokenRefresher protected ()
    extends typings.azureCoreHttp.typesLatestSrcCredentialsAccessTokenRefresherMod.AccessTokenRefresher {
    def this(credential: TokenCredential, scopes: String) = this()
    def this(credential: TokenCredential, scopes: js.Array[String]) = this()
    def this(credential: TokenCredential, scopes: String, requiredMillisecondsBeforeNewRefresh: Double) = this()
    def this(
      credential: TokenCredential,
      scopes: js.Array[String],
      requiredMillisecondsBeforeNewRefresh: Double
    ) = this()
  }
  
  @JSImport("@azure/core-http", "ApiKeyCredentials")
  @js.native
  open class ApiKeyCredentials protected ()
    extends typings.azureCoreHttp.typesLatestSrcCredentialsApiKeyCredentialsMod.ApiKeyCredentials {
    /**
      * @param options - Specifies the options to be provided for auth. Either header or query needs to be provided.
      */
    def this(options: ApiKeyCredentialOptions) = this()
  }
  
  /* note: abstract class */ @JSImport("@azure/core-http", "BaseRequestPolicy")
  @js.native
  open class BaseRequestPolicy protected ()
    extends typings.azureCoreHttp.typesLatestSrcPoliciesRequestPolicyMod.BaseRequestPolicy {
    /**
      * The main method to implement that manipulates a request/response.
      */
    /* protected */ def this(
      /**
      * The next policy in the pipeline. Each policy is responsible for executing the next one if the request is to continue through the pipeline.
      */
    _nextPolicy: RequestPolicy,
      /**
      * The options that can be passed to a given request policy.
      */
    _options: RequestPolicyOptionsLike
    ) = this()
  }
  
  @JSImport("@azure/core-http", "BasicAuthenticationCredentials")
  @js.native
  open class BasicAuthenticationCredentials protected ()
    extends typings.azureCoreHttp.typesLatestSrcCredentialsBasicAuthenticationCredentialsMod.BasicAuthenticationCredentials {
    /**
      * Creates a new BasicAuthenticationCredentials object.
      *
      * @param userName - User name.
      * @param password - Password.
      * @param authorizationScheme - The authorization scheme.
      */
    def this(userName: String, password: String) = this()
    def this(userName: String, password: String, authorizationScheme: String) = this()
  }
  
  object Constants {
    
    @JSImport("@azure/core-http", "Constants")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Specifies ALL Proxy.
      */
    @JSImport("@azure/core-http", "Constants.ALL_PROXY")
    @js.native
    def ALL_PROXY: String = js.native
    inline def ALL_PROXY_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ALL_PROXY")(x.asInstanceOf[js.Any])
    
    /**
      * Specifies HTTP.
      */
    @JSImport("@azure/core-http", "Constants.HTTP")
    @js.native
    def HTTP: String = js.native
    
    /**
      * Specifies HTTPS.
      */
    @JSImport("@azure/core-http", "Constants.HTTPS")
    @js.native
    def HTTPS: String = js.native
    inline def HTTPS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HTTPS")(x.asInstanceOf[js.Any])
    
    /**
      * Specifies HTTPS Proxy.
      */
    @JSImport("@azure/core-http", "Constants.HTTPS_PROXY")
    @js.native
    def HTTPS_PROXY: String = js.native
    inline def HTTPS_PROXY_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HTTPS_PROXY")(x.asInstanceOf[js.Any])
    
    inline def HTTP_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HTTP")(x.asInstanceOf[js.Any])
    
    /**
      * Specifies HTTP Proxy.
      */
    @JSImport("@azure/core-http", "Constants.HTTP_PROXY")
    @js.native
    def HTTP_PROXY: String = js.native
    inline def HTTP_PROXY_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HTTP_PROXY")(x.asInstanceOf[js.Any])
    
    /**
      * Defines constants for use with HTTP headers.
      */
    @JSImport("@azure/core-http", "Constants.HeaderConstants")
    @js.native
    def HeaderConstants: AUTHORIZATION = js.native
    inline def HeaderConstants_=(x: AUTHORIZATION): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HeaderConstants")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/core-http", "Constants.HttpConstants")
    @js.native
    def HttpConstants: HttpVerbs = js.native
    inline def HttpConstants_=(x: HttpVerbs): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HttpConstants")(x.asInstanceOf[js.Any])
    
    /**
      * Specifies NO Proxy.
      */
    @JSImport("@azure/core-http", "Constants.NO_PROXY")
    @js.native
    def NO_PROXY: String = js.native
    inline def NO_PROXY_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NO_PROXY")(x.asInstanceOf[js.Any])
    
    /**
      * The core-http version
      */
    @JSImport("@azure/core-http", "Constants.coreHttpVersion")
    @js.native
    def coreHttpVersion: String = js.native
    inline def coreHttpVersion_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("coreHttpVersion")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@azure/core-http", "ExpiringAccessTokenCache")
  @js.native
  /**
    * Constructs an instance of {@link ExpiringAccessTokenCache} with
    * an optional expiration buffer time.
    */
  open class ExpiringAccessTokenCache ()
    extends typings.azureCoreHttp.typesLatestSrcCredentialsAccessTokenCacheMod.ExpiringAccessTokenCache {
    def this(tokenRefreshBufferMs: Double) = this()
  }
  
  @JSImport("@azure/core-http", "HttpHeaders")
  @js.native
  open class HttpHeaders ()
    extends typings.azureCoreHttp.typesLatestSrcHttpHeadersMod.HttpHeaders {
    def this(rawHeaders: RawHttpHeaders) = this()
  }
  
  @JSImport("@azure/core-http", "HttpPipelineLogLevel")
  @js.native
  object HttpPipelineLogLevel extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.azureCoreHttp.typesLatestSrcHttpPipelineLogLevelMod.HttpPipelineLogLevel & Double
      ] = js.native
    
    /* 1 */ val ERROR: typings.azureCoreHttp.typesLatestSrcHttpPipelineLogLevelMod.HttpPipelineLogLevel.ERROR & Double = js.native
    
    /* 3 */ val INFO: typings.azureCoreHttp.typesLatestSrcHttpPipelineLogLevelMod.HttpPipelineLogLevel.INFO & Double = js.native
    
    /* 0 */ val OFF: typings.azureCoreHttp.typesLatestSrcHttpPipelineLogLevelMod.HttpPipelineLogLevel.OFF & Double = js.native
    
    /* 2 */ val WARNING: typings.azureCoreHttp.typesLatestSrcHttpPipelineLogLevelMod.HttpPipelineLogLevel.WARNING & Double = js.native
  }
  
  object MapperType {
    
    @JSImport("@azure/core-http", "MapperType")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@azure/core-http", "MapperType.Base64Url")
    @js.native
    def Base64Url: typings.azureCoreHttp.azureCoreHttpStrings.Base64Url = js.native
    inline def Base64Url_=(x: Base64Url): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Base64Url")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/core-http", "MapperType.Boolean")
    @js.native
    def Boolean: typings.azureCoreHttp.azureCoreHttpStrings.Boolean = js.native
    inline def Boolean_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Boolean")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/core-http", "MapperType.ByteArray")
    @js.native
    def ByteArray: typings.azureCoreHttp.azureCoreHttpStrings.ByteArray = js.native
    inline def ByteArray_=(x: ByteArray): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ByteArray")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/core-http", "MapperType.Composite")
    @js.native
    def Composite: typings.azureCoreHttp.azureCoreHttpStrings.Composite = js.native
    inline def Composite_=(x: Composite): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Composite")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/core-http", "MapperType.Date")
    @js.native
    def Date: typings.azureCoreHttp.azureCoreHttpStrings.Date = js.native
    
    @JSImport("@azure/core-http", "MapperType.DateTime")
    @js.native
    def DateTime: typings.azureCoreHttp.azureCoreHttpStrings.DateTime = js.native
    
    @JSImport("@azure/core-http", "MapperType.DateTimeRfc1123")
    @js.native
    def DateTimeRfc1123: typings.azureCoreHttp.azureCoreHttpStrings.DateTimeRfc1123 = js.native
    inline def DateTimeRfc1123_=(x: DateTimeRfc1123): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DateTimeRfc1123")(x.asInstanceOf[js.Any])
    
    inline def DateTime_=(x: DateTime): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DateTime")(x.asInstanceOf[js.Any])
    
    inline def Date_=(x: Date): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Date")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/core-http", "MapperType.Dictionary")
    @js.native
    def Dictionary: typings.azureCoreHttp.azureCoreHttpStrings.Dictionary = js.native
    inline def Dictionary_=(x: Dictionary): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Dictionary")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/core-http", "MapperType.Enum")
    @js.native
    def Enum: typings.azureCoreHttp.azureCoreHttpStrings.Enum = js.native
    inline def Enum_=(x: Enum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Enum")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/core-http", "MapperType.Number")
    @js.native
    def Number: typings.azureCoreHttp.azureCoreHttpStrings.Number = js.native
    inline def Number_=(x: Number): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Number")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/core-http", "MapperType.Object")
    @js.native
    def Object: typings.azureCoreHttp.azureCoreHttpStrings.Object = js.native
    inline def Object_=(x: Object): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Object")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/core-http", "MapperType.Sequence")
    @js.native
    def Sequence: typings.azureCoreHttp.azureCoreHttpStrings.Sequence = js.native
    inline def Sequence_=(x: Sequence): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Sequence")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/core-http", "MapperType.Stream")
    @js.native
    def Stream: typings.azureCoreHttp.azureCoreHttpStrings.Stream = js.native
    inline def Stream_=(x: Stream): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Stream")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/core-http", "MapperType.String")
    @js.native
    def String: typings.azureCoreHttp.azureCoreHttpStrings.String = js.native
    inline def String_=(x: typings.azureCoreHttp.azureCoreHttpStrings.String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("String")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/core-http", "MapperType.TimeSpan")
    @js.native
    def TimeSpan: typings.azureCoreHttp.azureCoreHttpStrings.TimeSpan = js.native
    inline def TimeSpan_=(x: TimeSpan): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TimeSpan")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/core-http", "MapperType.UnixTime")
    @js.native
    def UnixTime: typings.azureCoreHttp.azureCoreHttpStrings.UnixTime = js.native
    inline def UnixTime_=(x: UnixTime): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UnixTime")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@azure/core-http", "QueryCollectionFormat")
  @js.native
  object QueryCollectionFormat extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[
        typings.azureCoreHttp.typesLatestSrcQueryCollectionFormatMod.QueryCollectionFormat & String
      ] = js.native
    
    /* "," */ val Csv: typings.azureCoreHttp.typesLatestSrcQueryCollectionFormatMod.QueryCollectionFormat.Csv & String = js.native
    
    /* "Multi" */ val Multi: typings.azureCoreHttp.typesLatestSrcQueryCollectionFormatMod.QueryCollectionFormat.Multi & String = js.native
    
    /* "|" */ val Pipes: typings.azureCoreHttp.typesLatestSrcQueryCollectionFormatMod.QueryCollectionFormat.Pipes & String = js.native
    
    /* " " */ val Ssv: typings.azureCoreHttp.typesLatestSrcQueryCollectionFormatMod.QueryCollectionFormat.Ssv & String = js.native
    
    /* "\t" */ val Tsv: typings.azureCoreHttp.typesLatestSrcQueryCollectionFormatMod.QueryCollectionFormat.Tsv & String = js.native
  }
  
  @JSImport("@azure/core-http", "RequestPolicyOptions")
  @js.native
  open class RequestPolicyOptions ()
    extends typings.azureCoreHttp.typesLatestSrcPoliciesRequestPolicyMod.RequestPolicyOptions {
    def this(_logger: HttpPipelineLogger) = this()
  }
  
  @JSImport("@azure/core-http", "RestError")
  @js.native
  open class RestError protected ()
    extends typings.azureCoreHttp.typesLatestSrcRestErrorMod.RestError {
    def this(message: String) = this()
    def this(message: String, code: String) = this()
    def this(message: String, code: String, statusCode: Double) = this()
    def this(message: String, code: Unit, statusCode: Double) = this()
    def this(message: String, code: String, statusCode: Double, request: WebResourceLike) = this()
    def this(message: String, code: String, statusCode: Unit, request: WebResourceLike) = this()
    def this(message: String, code: Unit, statusCode: Double, request: WebResourceLike) = this()
    def this(message: String, code: Unit, statusCode: Unit, request: WebResourceLike) = this()
    def this(message: String, code: String, statusCode: Double, request: Unit, response: HttpOperationResponse) = this()
    def this(
      message: String,
      code: String,
      statusCode: Double,
      request: WebResourceLike,
      response: HttpOperationResponse
    ) = this()
    def this(message: String, code: String, statusCode: Unit, request: Unit, response: HttpOperationResponse) = this()
    def this(
      message: String,
      code: String,
      statusCode: Unit,
      request: WebResourceLike,
      response: HttpOperationResponse
    ) = this()
    def this(message: String, code: Unit, statusCode: Double, request: Unit, response: HttpOperationResponse) = this()
    def this(
      message: String,
      code: Unit,
      statusCode: Double,
      request: WebResourceLike,
      response: HttpOperationResponse
    ) = this()
    def this(message: String, code: Unit, statusCode: Unit, request: Unit, response: HttpOperationResponse) = this()
    def this(
      message: String,
      code: Unit,
      statusCode: Unit,
      request: WebResourceLike,
      response: HttpOperationResponse
    ) = this()
  }
  /* static members */
  object RestError {
    
    /**
      * A constant string to identify errors that may arise from parsing an incoming HTTP response. Usually indicates a malformed HTTP body, such as an encoded JSON payload that is incomplete.
      */
    @JSImport("@azure/core-http", "RestError.PARSE_ERROR")
    @js.native
    val PARSE_ERROR: String = js.native
    
    /**
      * A constant string to identify errors that may arise when making an HTTP request that indicates an issue with the transport layer (e.g. the hostname of the URL cannot be resolved via DNS.)
      */
    @JSImport("@azure/core-http", "RestError.REQUEST_SEND_ERROR")
    @js.native
    val REQUEST_SEND_ERROR: String = js.native
  }
  
  @JSImport("@azure/core-http", "RetryMode")
  @js.native
  object RetryMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.azureCoreHttp.typesLatestSrcPoliciesExponentialRetryPolicyMod.RetryMode & Double
      ] = js.native
    
    /* 0 */ val Exponential: typings.azureCoreHttp.typesLatestSrcPoliciesExponentialRetryPolicyMod.RetryMode.Exponential & Double = js.native
  }
  
  @JSImport("@azure/core-http", "Serializer")
  @js.native
  open class Serializer ()
    extends typings.azureCoreHttp.typesLatestSrcSerializerMod.Serializer {
    def this(/**
      * The provided model mapper.
      */
    modelMappers: StringDictionary[Any]) = this()
    def this(
      /**
      * The provided model mapper.
      */
    modelMappers: StringDictionary[Any],
      /**
      * Whether the contents are XML or not.
      */
    isXML: scala.Boolean
    ) = this()
    def this(
      /**
      * The provided model mapper.
      */
    modelMappers: Unit,
      /**
      * Whether the contents are XML or not.
      */
    isXML: scala.Boolean
    ) = this()
  }
  
  @JSImport("@azure/core-http", "ServiceClient")
  @js.native
  /**
    * The ServiceClient constructor
    * @param credentials - The credentials used for authentication with the service.
    * @param options - The service client options that govern the behavior of the client.
    */
  open class ServiceClient ()
    extends typings.azureCoreHttp.typesLatestSrcServiceClientMod.ServiceClient {
    def this(credentials: TokenCredential) = this()
    def this(credentials: ServiceClientCredentials) = this()
    def this(credentials: Unit, options: ServiceClientOptions) = this()
    def this(credentials: TokenCredential, options: ServiceClientOptions) = this()
    def this(credentials: ServiceClientCredentials, options: ServiceClientOptions) = this()
  }
  
  @JSImport("@azure/core-http", "TopicCredentials")
  @js.native
  open class TopicCredentials protected ()
    extends typings.azureCoreHttp.typesLatestSrcCredentialsTopicCredentialsMod.TopicCredentials {
    /**
      * Creates a new EventGrid TopicCredentials object.
      *
      * @param topicKey - The EventGrid topic key
      */
    def this(topicKey: String) = this()
  }
  
  @JSImport("@azure/core-http", "URLBuilder")
  @js.native
  open class URLBuilder ()
    extends typings.azureCoreHttp.typesLatestSrcUrlMod.URLBuilder
  /* static members */
  object URLBuilder {
    
    @JSImport("@azure/core-http", "URLBuilder")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Parses a given string URL into a new {@link URLBuilder}.
      */
    inline def parse(text: String): typings.azureCoreHttp.typesLatestSrcUrlMod.URLBuilder = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(text.asInstanceOf[js.Any]).asInstanceOf[typings.azureCoreHttp.typesLatestSrcUrlMod.URLBuilder]
  }
  
  @JSImport("@azure/core-http", "URLQuery")
  @js.native
  open class URLQuery ()
    extends typings.azureCoreHttp.typesLatestSrcUrlMod.URLQuery
  /* static members */
  object URLQuery {
    
    @JSImport("@azure/core-http", "URLQuery")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Parse a URLQuery from the provided text.
      */
    inline def parse(text: String): typings.azureCoreHttp.typesLatestSrcUrlMod.URLQuery = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(text.asInstanceOf[js.Any]).asInstanceOf[typings.azureCoreHttp.typesLatestSrcUrlMod.URLQuery]
  }
  
  @JSImport("@azure/core-http", "WebResource")
  @js.native
  open class WebResource protected ()
    extends typings.azureCoreHttp.typesLatestSrcWebResourceMod.WebResource {
    def this(
      url: js.UndefOr[String],
      method: js.UndefOr[HttpMethods],
      body: js.UndefOr[Any],
      query: js.UndefOr[StringDictionary[Any]],
      headers: js.UndefOr[StringDictionary[Any] | HttpHeadersLike],
      streamResponseBody: js.UndefOr[scala.Boolean],
      withCredentials: js.UndefOr[scala.Boolean],
      abortSignal: js.UndefOr[AbortSignalLike],
      timeout: js.UndefOr[Double],
      onUploadProgress: js.UndefOr[js.Function1[/* progress */ TransferProgressEvent, Unit]],
      onDownloadProgress: js.UndefOr[js.Function1[/* progress */ TransferProgressEvent, Unit]],
      proxySettings: js.UndefOr[ProxySettings],
      keepAlive: js.UndefOr[scala.Boolean],
      decompressResponse: js.UndefOr[scala.Boolean],
      streamResponseStatusCodes: js.UndefOr[Set[Double]]
    ) = this()
  }
  
  @JSImport("@azure/core-http", "XML_ATTRKEY")
  @js.native
  val XML_ATTRKEY: /* "$" */ String = js.native
  
  @JSImport("@azure/core-http", "XML_CHARKEY")
  @js.native
  val XML_CHARKEY: /* "_" */ String = js.native
  
  inline def applyMixins(targetCtorParam: Any, sourceCtors: js.Array[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("applyMixins")(targetCtorParam.asInstanceOf[js.Any], sourceCtors.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def bearerTokenAuthenticationPolicy(credential: TokenCredential, scopes: String): RequestPolicyFactory = (^.asInstanceOf[js.Dynamic].applyDynamic("bearerTokenAuthenticationPolicy")(credential.asInstanceOf[js.Any], scopes.asInstanceOf[js.Any])).asInstanceOf[RequestPolicyFactory]
  inline def bearerTokenAuthenticationPolicy(credential: TokenCredential, scopes: js.Array[String]): RequestPolicyFactory = (^.asInstanceOf[js.Dynamic].applyDynamic("bearerTokenAuthenticationPolicy")(credential.asInstanceOf[js.Any], scopes.asInstanceOf[js.Any])).asInstanceOf[RequestPolicyFactory]
  
  inline def createPipelineFromOptions(pipelineOptions: InternalPipelineOptions): ServiceClientOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("createPipelineFromOptions")(pipelineOptions.asInstanceOf[js.Any]).asInstanceOf[ServiceClientOptions]
  inline def createPipelineFromOptions(pipelineOptions: InternalPipelineOptions, authPolicyFactory: RequestPolicyFactory): ServiceClientOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("createPipelineFromOptions")(pipelineOptions.asInstanceOf[js.Any], authPolicyFactory.asInstanceOf[js.Any])).asInstanceOf[ServiceClientOptions]
  
  inline def createSpanFunction(args: SpanConfig): js.Function2[
    /* operationName */ String, 
    /* operationOptions */ OperationOptions, 
    Span[OperationOptions]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("createSpanFunction")(args.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* operationName */ String, 
    /* operationOptions */ OperationOptions, 
    Span[OperationOptions]
  ]]
  
  inline def delay[T](delayInMs: Double): js.Promise[T | Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("delay")(delayInMs.asInstanceOf[js.Any]).asInstanceOf[js.Promise[T | Unit]]
  inline def delay[T](delayInMs: Double, value: T): js.Promise[T | Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("delay")(delayInMs.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T | Unit]]
  inline def delay[T](delayInMs: Double, value: T, options: AbortErrorMsg): js.Promise[T | Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("delay")(delayInMs.asInstanceOf[js.Any], value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T | Unit]]
  inline def delay[T](delayInMs: Double, value: Unit, options: AbortErrorMsg): js.Promise[T | Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("delay")(delayInMs.asInstanceOf[js.Any], value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T | Unit]]
  
  inline def deserializationPolicy(): RequestPolicyFactory = ^.asInstanceOf[js.Dynamic].applyDynamic("deserializationPolicy")().asInstanceOf[RequestPolicyFactory]
  inline def deserializationPolicy(deserializationContentTypes: Unit, parsingOptions: SerializerOptions): RequestPolicyFactory = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializationPolicy")(deserializationContentTypes.asInstanceOf[js.Any], parsingOptions.asInstanceOf[js.Any])).asInstanceOf[RequestPolicyFactory]
  inline def deserializationPolicy(deserializationContentTypes: DeserializationContentTypes): RequestPolicyFactory = ^.asInstanceOf[js.Dynamic].applyDynamic("deserializationPolicy")(deserializationContentTypes.asInstanceOf[js.Any]).asInstanceOf[RequestPolicyFactory]
  inline def deserializationPolicy(deserializationContentTypes: DeserializationContentTypes, parsingOptions: SerializerOptions): RequestPolicyFactory = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializationPolicy")(deserializationContentTypes.asInstanceOf[js.Any], parsingOptions.asInstanceOf[js.Any])).asInstanceOf[RequestPolicyFactory]
  
  inline def deserializeResponseBody(
    jsonContentTypes: js.Array[String],
    xmlContentTypes: js.Array[String],
    response: HttpOperationResponse
  ): js.Promise[HttpOperationResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeResponseBody")(jsonContentTypes.asInstanceOf[js.Any], xmlContentTypes.asInstanceOf[js.Any], response.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HttpOperationResponse]]
  inline def deserializeResponseBody(
    jsonContentTypes: js.Array[String],
    xmlContentTypes: js.Array[String],
    response: HttpOperationResponse,
    options: SerializerOptions
  ): js.Promise[HttpOperationResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeResponseBody")(jsonContentTypes.asInstanceOf[js.Any], xmlContentTypes.asInstanceOf[js.Any], response.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HttpOperationResponse]]
  
  inline def disableResponseDecompressionPolicy(): RequestPolicyFactory = ^.asInstanceOf[js.Dynamic].applyDynamic("disableResponseDecompressionPolicy")().asInstanceOf[RequestPolicyFactory]
  
  inline def encodeUri(uri: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeUri")(uri.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def executePromisesSequentially(promiseFactories: js.Array[Any], kickstart: Any): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("executePromisesSequentially")(promiseFactories.asInstanceOf[js.Any], kickstart.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  
  inline def exponentialRetryPolicy(): RequestPolicyFactory = ^.asInstanceOf[js.Dynamic].applyDynamic("exponentialRetryPolicy")().asInstanceOf[RequestPolicyFactory]
  inline def exponentialRetryPolicy(retryCount: Double): RequestPolicyFactory = ^.asInstanceOf[js.Dynamic].applyDynamic("exponentialRetryPolicy")(retryCount.asInstanceOf[js.Any]).asInstanceOf[RequestPolicyFactory]
  inline def exponentialRetryPolicy(retryCount: Double, retryInterval: Double): RequestPolicyFactory = (^.asInstanceOf[js.Dynamic].applyDynamic("exponentialRetryPolicy")(retryCount.asInstanceOf[js.Any], retryInterval.asInstanceOf[js.Any])).asInstanceOf[RequestPolicyFactory]
  inline def exponentialRetryPolicy(retryCount: Double, retryInterval: Double, maxRetryInterval: Double): RequestPolicyFactory = (^.asInstanceOf[js.Dynamic].applyDynamic("exponentialRetryPolicy")(retryCount.asInstanceOf[js.Any], retryInterval.asInstanceOf[js.Any], maxRetryInterval.asInstanceOf[js.Any])).asInstanceOf[RequestPolicyFactory]
  inline def exponentialRetryPolicy(retryCount: Double, retryInterval: Unit, maxRetryInterval: Double): RequestPolicyFactory = (^.asInstanceOf[js.Dynamic].applyDynamic("exponentialRetryPolicy")(retryCount.asInstanceOf[js.Any], retryInterval.asInstanceOf[js.Any], maxRetryInterval.asInstanceOf[js.Any])).asInstanceOf[RequestPolicyFactory]
  inline def exponentialRetryPolicy(retryCount: Unit, retryInterval: Double): RequestPolicyFactory = (^.asInstanceOf[js.Dynamic].applyDynamic("exponentialRetryPolicy")(retryCount.asInstanceOf[js.Any], retryInterval.asInstanceOf[js.Any])).asInstanceOf[RequestPolicyFactory]
  inline def exponentialRetryPolicy(retryCount: Unit, retryInterval: Double, maxRetryInterval: Double): RequestPolicyFactory = (^.asInstanceOf[js.Dynamic].applyDynamic("exponentialRetryPolicy")(retryCount.asInstanceOf[js.Any], retryInterval.asInstanceOf[js.Any], maxRetryInterval.asInstanceOf[js.Any])).asInstanceOf[RequestPolicyFactory]
  inline def exponentialRetryPolicy(retryCount: Unit, retryInterval: Unit, maxRetryInterval: Double): RequestPolicyFactory = (^.asInstanceOf[js.Dynamic].applyDynamic("exponentialRetryPolicy")(retryCount.asInstanceOf[js.Any], retryInterval.asInstanceOf[js.Any], maxRetryInterval.asInstanceOf[js.Any])).asInstanceOf[RequestPolicyFactory]
  
  inline def flattenResponse(_response: HttpOperationResponse): RestResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("flattenResponse")(_response.asInstanceOf[js.Any]).asInstanceOf[RestResponse]
  inline def flattenResponse(_response: HttpOperationResponse, responseSpec: OperationResponse): RestResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("flattenResponse")(_response.asInstanceOf[js.Any], responseSpec.asInstanceOf[js.Any])).asInstanceOf[RestResponse]
  
  inline def generateClientRequestIdPolicy(): RequestPolicyFactory = ^.asInstanceOf[js.Dynamic].applyDynamic("generateClientRequestIdPolicy")().asInstanceOf[RequestPolicyFactory]
  inline def generateClientRequestIdPolicy(requestIdHeaderName: String): RequestPolicyFactory = ^.asInstanceOf[js.Dynamic].applyDynamic("generateClientRequestIdPolicy")(requestIdHeaderName.asInstanceOf[js.Any]).asInstanceOf[RequestPolicyFactory]
  
  inline def generateUuid(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("generateUuid")().asInstanceOf[String]
  
  inline def getDefaultProxySettings(): js.UndefOr[ProxySettings] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultProxySettings")().asInstanceOf[js.UndefOr[ProxySettings]]
  inline def getDefaultProxySettings(proxyUrl: String): js.UndefOr[ProxySettings] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultProxySettings")(proxyUrl.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[ProxySettings]]
  
  inline def getDefaultUserAgentValue(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultUserAgentValue")().asInstanceOf[String]
  
  inline def isDuration(value: String): scala.Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDuration")(value.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
  
  @JSImport("@azure/core-http", "isNode")
  @js.native
  val isNode: scala.Boolean = js.native
  
  inline def isTokenCredential(credential: Any): /* is @azure/core-auth.@azure/core-auth.TokenCredential */ scala.Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTokenCredential")(credential.asInstanceOf[js.Any]).asInstanceOf[/* is @azure/core-auth.@azure/core-auth.TokenCredential */ scala.Boolean]
  
  inline def isValidUuid(uuid: String): scala.Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidUuid")(uuid.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
  
  inline def keepAlivePolicy(): RequestPolicyFactory = ^.asInstanceOf[js.Dynamic].applyDynamic("keepAlivePolicy")().asInstanceOf[RequestPolicyFactory]
  inline def keepAlivePolicy(keepAliveOptions: KeepAliveOptions): RequestPolicyFactory = ^.asInstanceOf[js.Dynamic].applyDynamic("keepAlivePolicy")(keepAliveOptions.asInstanceOf[js.Any]).asInstanceOf[RequestPolicyFactory]
  
  inline def logPolicy(): RequestPolicyFactory = ^.asInstanceOf[js.Dynamic].applyDynamic("logPolicy")().asInstanceOf[RequestPolicyFactory]
  inline def logPolicy(loggingOptions: LogPolicyOptions): RequestPolicyFactory = ^.asInstanceOf[js.Dynamic].applyDynamic("logPolicy")(loggingOptions.asInstanceOf[js.Any]).asInstanceOf[RequestPolicyFactory]
  
  inline def operationOptionsToRequestOptionsBase[T /* <: OperationOptions */](opts: T): RequestOptionsBase = ^.asInstanceOf[js.Dynamic].applyDynamic("operationOptionsToRequestOptionsBase")(opts.asInstanceOf[js.Any]).asInstanceOf[RequestOptionsBase]
  
  inline def parseXML(str: String): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseXML")(str.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
  inline def parseXML(str: String, opts: SerializerOptions): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseXML")(str.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  
  inline def promiseToCallback(promise: js.Promise[Any]): js.Function1[/* cb */ js.Function, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("promiseToCallback")(promise.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* cb */ js.Function, Unit]]
  
  inline def promiseToServiceCallback[T](promise: js.Promise[HttpOperationResponse]): js.Function1[/* cb */ ServiceCallback[T], Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("promiseToServiceCallback")(promise.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* cb */ ServiceCallback[T], Unit]]
  
  inline def proxyPolicy(): RequestPolicyFactory = ^.asInstanceOf[js.Dynamic].applyDynamic("proxyPolicy")().asInstanceOf[RequestPolicyFactory]
  inline def proxyPolicy(proxySettings: Unit, options: CustomNoProxyList): RequestPolicyFactory = (^.asInstanceOf[js.Dynamic].applyDynamic("proxyPolicy")(proxySettings.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RequestPolicyFactory]
  inline def proxyPolicy(proxySettings: ProxySettings): RequestPolicyFactory = ^.asInstanceOf[js.Dynamic].applyDynamic("proxyPolicy")(proxySettings.asInstanceOf[js.Any]).asInstanceOf[RequestPolicyFactory]
  inline def proxyPolicy(proxySettings: ProxySettings, options: CustomNoProxyList): RequestPolicyFactory = (^.asInstanceOf[js.Dynamic].applyDynamic("proxyPolicy")(proxySettings.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RequestPolicyFactory]
  
  inline def redirectPolicy(): RequestPolicyFactory = ^.asInstanceOf[js.Dynamic].applyDynamic("redirectPolicy")().asInstanceOf[RequestPolicyFactory]
  inline def redirectPolicy(maximumRetries: Double): RequestPolicyFactory = ^.asInstanceOf[js.Dynamic].applyDynamic("redirectPolicy")(maximumRetries.asInstanceOf[js.Any]).asInstanceOf[RequestPolicyFactory]
  
  inline def serializeObject(toSerialize: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("serializeObject")(toSerialize.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def signingPolicy(authenticationProvider: ServiceClientCredentials): RequestPolicyFactory = ^.asInstanceOf[js.Dynamic].applyDynamic("signingPolicy")(authenticationProvider.asInstanceOf[js.Any]).asInstanceOf[RequestPolicyFactory]
  
  inline def stringifyXML(obj: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringifyXML")(obj.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def stringifyXML(obj: Any, opts: SerializerOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringifyXML")(obj.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def stripRequest(request: WebResourceLike): WebResourceLike = ^.asInstanceOf[js.Dynamic].applyDynamic("stripRequest")(request.asInstanceOf[js.Any]).asInstanceOf[WebResourceLike]
  
  inline def stripResponse(response: HttpOperationResponse): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("stripResponse")(response.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def systemErrorRetryPolicy(): RequestPolicyFactory = ^.asInstanceOf[js.Dynamic].applyDynamic("systemErrorRetryPolicy")().asInstanceOf[RequestPolicyFactory]
  inline def systemErrorRetryPolicy(retryCount: Double): RequestPolicyFactory = ^.asInstanceOf[js.Dynamic].applyDynamic("systemErrorRetryPolicy")(retryCount.asInstanceOf[js.Any]).asInstanceOf[RequestPolicyFactory]
  inline def systemErrorRetryPolicy(retryCount: Double, retryInterval: Double): RequestPolicyFactory = (^.asInstanceOf[js.Dynamic].applyDynamic("systemErrorRetryPolicy")(retryCount.asInstanceOf[js.Any], retryInterval.asInstanceOf[js.Any])).asInstanceOf[RequestPolicyFactory]
  inline def systemErrorRetryPolicy(retryCount: Double, retryInterval: Double, minRetryInterval: Double): RequestPolicyFactory = (^.asInstanceOf[js.Dynamic].applyDynamic("systemErrorRetryPolicy")(retryCount.asInstanceOf[js.Any], retryInterval.asInstanceOf[js.Any], minRetryInterval.asInstanceOf[js.Any])).asInstanceOf[RequestPolicyFactory]
  inline def systemErrorRetryPolicy(retryCount: Double, retryInterval: Double, minRetryInterval: Double, maxRetryInterval: Double): RequestPolicyFactory = (^.asInstanceOf[js.Dynamic].applyDynamic("systemErrorRetryPolicy")(retryCount.asInstanceOf[js.Any], retryInterval.asInstanceOf[js.Any], minRetryInterval.asInstanceOf[js.Any], maxRetryInterval.asInstanceOf[js.Any])).asInstanceOf[RequestPolicyFactory]
  inline def systemErrorRetryPolicy(retryCount: Double, retryInterval: Double, minRetryInterval: Unit, maxRetryInterval: Double): RequestPolicyFactory = (^.asInstanceOf[js.Dynamic].applyDynamic("systemErrorRetryPolicy")(retryCount.asInstanceOf[js.Any], retryInterval.asInstanceOf[js.Any], minRetryInterval.asInstanceOf[js.Any], maxRetryInterval.asInstanceOf[js.Any])).asInstanceOf[RequestPolicyFactory]
  inline def systemErrorRetryPolicy(retryCount: Double, retryInterval: Unit, minRetryInterval: Double): RequestPolicyFactory = (^.asInstanceOf[js.Dynamic].applyDynamic("systemErrorRetryPolicy")(retryCount.asInstanceOf[js.Any], retryInterval.asInstanceOf[js.Any], minRetryInterval.asInstanceOf[js.Any])).asInstanceOf[RequestPolicyFactory]
  inline def systemErrorRetryPolicy(retryCount: Double, retryInterval: Unit, minRetryInterval: Double, maxRetryInterval: Double): RequestPolicyFactory = (^.asInstanceOf[js.Dynamic].applyDynamic("systemErrorRetryPolicy")(retryCount.asInstanceOf[js.Any], retryInterval.asInstanceOf[js.Any], minRetryInterval.asInstanceOf[js.Any], maxRetryInterval.asInstanceOf[js.Any])).asInstanceOf[RequestPolicyFactory]
  inline def systemErrorRetryPolicy(retryCount: Double, retryInterval: Unit, minRetryInterval: Unit, maxRetryInterval: Double): RequestPolicyFactory = (^.asInstanceOf[js.Dynamic].applyDynamic("systemErrorRetryPolicy")(retryCount.asInstanceOf[js.Any], retryInterval.asInstanceOf[js.Any], minRetryInterval.asInstanceOf[js.Any], maxRetryInterval.asInstanceOf[js.Any])).asInstanceOf[RequestPolicyFactory]
  inline def systemErrorRetryPolicy(retryCount: Unit, retryInterval: Double): RequestPolicyFactory = (^.asInstanceOf[js.Dynamic].applyDynamic("systemErrorRetryPolicy")(retryCount.asInstanceOf[js.Any], retryInterval.asInstanceOf[js.Any])).asInstanceOf[RequestPolicyFactory]
  inline def systemErrorRetryPolicy(retryCount: Unit, retryInterval: Double, minRetryInterval: Double): RequestPolicyFactory = (^.asInstanceOf[js.Dynamic].applyDynamic("systemErrorRetryPolicy")(retryCount.asInstanceOf[js.Any], retryInterval.asInstanceOf[js.Any], minRetryInterval.asInstanceOf[js.Any])).asInstanceOf[RequestPolicyFactory]
  inline def systemErrorRetryPolicy(retryCount: Unit, retryInterval: Double, minRetryInterval: Double, maxRetryInterval: Double): RequestPolicyFactory = (^.asInstanceOf[js.Dynamic].applyDynamic("systemErrorRetryPolicy")(retryCount.asInstanceOf[js.Any], retryInterval.asInstanceOf[js.Any], minRetryInterval.asInstanceOf[js.Any], maxRetryInterval.asInstanceOf[js.Any])).asInstanceOf[RequestPolicyFactory]
  inline def systemErrorRetryPolicy(retryCount: Unit, retryInterval: Double, minRetryInterval: Unit, maxRetryInterval: Double): RequestPolicyFactory = (^.asInstanceOf[js.Dynamic].applyDynamic("systemErrorRetryPolicy")(retryCount.asInstanceOf[js.Any], retryInterval.asInstanceOf[js.Any], minRetryInterval.asInstanceOf[js.Any], maxRetryInterval.asInstanceOf[js.Any])).asInstanceOf[RequestPolicyFactory]
  inline def systemErrorRetryPolicy(retryCount: Unit, retryInterval: Unit, minRetryInterval: Double): RequestPolicyFactory = (^.asInstanceOf[js.Dynamic].applyDynamic("systemErrorRetryPolicy")(retryCount.asInstanceOf[js.Any], retryInterval.asInstanceOf[js.Any], minRetryInterval.asInstanceOf[js.Any])).asInstanceOf[RequestPolicyFactory]
  inline def systemErrorRetryPolicy(retryCount: Unit, retryInterval: Unit, minRetryInterval: Double, maxRetryInterval: Double): RequestPolicyFactory = (^.asInstanceOf[js.Dynamic].applyDynamic("systemErrorRetryPolicy")(retryCount.asInstanceOf[js.Any], retryInterval.asInstanceOf[js.Any], minRetryInterval.asInstanceOf[js.Any], maxRetryInterval.asInstanceOf[js.Any])).asInstanceOf[RequestPolicyFactory]
  inline def systemErrorRetryPolicy(retryCount: Unit, retryInterval: Unit, minRetryInterval: Unit, maxRetryInterval: Double): RequestPolicyFactory = (^.asInstanceOf[js.Dynamic].applyDynamic("systemErrorRetryPolicy")(retryCount.asInstanceOf[js.Any], retryInterval.asInstanceOf[js.Any], minRetryInterval.asInstanceOf[js.Any], maxRetryInterval.asInstanceOf[js.Any])).asInstanceOf[RequestPolicyFactory]
  
  inline def throttlingRetryPolicy(): RequestPolicyFactory = ^.asInstanceOf[js.Dynamic].applyDynamic("throttlingRetryPolicy")().asInstanceOf[RequestPolicyFactory]
  
  inline def tracingPolicy(): RequestPolicyFactory = ^.asInstanceOf[js.Dynamic].applyDynamic("tracingPolicy")().asInstanceOf[RequestPolicyFactory]
  inline def tracingPolicy(tracingOptions: TracingPolicyOptions): RequestPolicyFactory = ^.asInstanceOf[js.Dynamic].applyDynamic("tracingPolicy")(tracingOptions.asInstanceOf[js.Any]).asInstanceOf[RequestPolicyFactory]
  
  inline def userAgentPolicy(): RequestPolicyFactory = ^.asInstanceOf[js.Dynamic].applyDynamic("userAgentPolicy")().asInstanceOf[RequestPolicyFactory]
  inline def userAgentPolicy(userAgentData: TelemetryInfo): RequestPolicyFactory = ^.asInstanceOf[js.Dynamic].applyDynamic("userAgentPolicy")(userAgentData.asInstanceOf[js.Any]).asInstanceOf[RequestPolicyFactory]
}
