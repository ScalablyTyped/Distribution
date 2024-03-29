package typings.awsSdkClientDynamodb

import org.scalablytyped.runtime.Instantiable1
import typings.awsSdkClientDynamodb.distTypesCommandsTagResourceCommandMod.TagResourceCommandOutput
import typings.awsSdkClientDynamodb.distTypesCommandsUntagResourceCommandMod.UntagResourceCommandOutput
import typings.awsSdkClientDynamodb.distTypesEndpointEndpointParametersMod.EndpointParameters
import typings.awsSdkEndpointCache.mod.EndpointCache
import typings.awsSdkProtocolHttp.distTypesHttpHandlerMod.HttpHandler
import typings.awsSdkSignatureV4.distTypesSignatureV4Mod.SignatureV4CryptoInit
import typings.awsSdkSignatureV4.distTypesSignatureV4Mod.SignatureV4Init
import typings.awsSdkSmithyClient.distTypesDefaultsModeMod.DefaultsMode
import typings.awsSdkSmithyClient.mod.Client
import typings.awsSdkTypes.anon.ForceRefresh
import typings.awsSdkTypes.distTypesAuthMod.AuthScheme
import typings.awsSdkTypes.distTypesChecksumMod.ChecksumConstructor
import typings.awsSdkTypes.distTypesCredentialsMod.Credentials
import typings.awsSdkTypes.distTypesCryptoMod.HashConstructor
import typings.awsSdkTypes.distTypesEndpointMod.EndpointV2
import typings.awsSdkTypes.distTypesHttpMod.Endpoint
import typings.awsSdkTypes.distTypesHttpMod.HttpHandlerOptions
import typings.awsSdkTypes.distTypesIdentityAwsCredentialIdentityMod.AwsCredentialIdentity
import typings.awsSdkTypes.distTypesLoggerMod.Logger
import typings.awsSdkTypes.distTypesResponseMod.ResponseMetadata
import typings.awsSdkTypes.distTypesRetryMod.RetryStrategyV2
import typings.awsSdkTypes.distTypesSerdeMod.StreamCollector
import typings.awsSdkTypes.distTypesSignatureMod.RequestSigner
import typings.awsSdkTypes.distTypesTransferMod.RequestHandler
import typings.awsSdkTypes.distTypesUtilMod.BodyLengthCalculator
import typings.awsSdkTypes.distTypesUtilMod.Decoder
import typings.awsSdkTypes.distTypesUtilMod.Encoder
import typings.awsSdkTypes.distTypesUtilMod.MemoizedProvider
import typings.awsSdkTypes.distTypesUtilMod.Provider
import typings.awsSdkTypes.distTypesUtilMod.RetryStrategy
import typings.awsSdkTypes.distTypesUtilMod.UrlParser
import typings.awsSdkTypes.distTypesUtilMod.UserAgent
import typings.awsSdkTypes.distTypesUtilMod.UserAgentPair
import typings.std.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesDynamoDBClientMod {
  
  @JSImport("@aws-sdk/client-dynamodb/dist-types/DynamoDBClient", "DynamoDBClient")
  @js.native
  open class DynamoDBClient protected () extends Client[
          HttpHandlerOptions, 
          ServiceInputTypes, 
          ServiceOutputTypes, 
          DynamoDBClientResolvedConfig
        ] {
    def this(configuration: DynamoDBClientConfig) = this()
  }
  
  /* Inlined parent std.Partial<@aws-sdk/smithy-client.@aws-sdk/smithy-client.SmithyResolvedConfiguration<@aws-sdk/types.@aws-sdk/types.HttpHandlerOptions>> */
  trait ClientDefaults extends StObject {
    
    var apiVersion: js.UndefOr[String] = js.undefined
    
    /**
      * The function that will be used to convert a base64-encoded string to a byte array.
      * @internal
      */
    var base64Decoder: js.UndefOr[Decoder] = js.undefined
    
    /**
      * The function that will be used to convert binary data to a base64-encoded string.
      * @internal
      */
    var base64Encoder: js.UndefOr[Encoder] = js.undefined
    
    /**
      * A function that can calculate the length of a request body.
      * @internal
      */
    var bodyLengthChecker: js.UndefOr[BodyLengthCalculator] = js.undefined
    
    /**
      * Default credentials provider; Not available in browser runtime.
      * @internal
      */
    var credentialDefaultProvider: js.UndefOr[js.Function1[/* input */ Any, Provider[Credentials]]] = js.undefined
    
    /**
      * The provider populating default tracking information to be sent with `user-agent`, `x-amz-user-agent` header
      * @internal
      */
    var defaultUserAgentProvider: js.UndefOr[Provider[UserAgent]] = js.undefined
    
    /**
      * The {@link @aws-sdk/smithy-client#DefaultsMode} that will be used to determine how certain default configuration options are resolved in the SDK.
      */
    var defaultsMode: js.UndefOr[DefaultsMode | Provider[DefaultsMode]] = js.undefined
    
    /**
      * Disable dyanamically changing the endpoint of the client based on the hostPrefix
      * trait of an operation.
      */
    var disableHostPrefix: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The provider which populates default for endpointDiscoveryEnabled configuration, if it's
      * not passed during client creation.
      * @internal
      */
    var endpointDiscoveryEnabledProvider: js.UndefOr[Provider[js.UndefOr[Boolean]]] = js.undefined
    
    /**
      * Optional logger for logging debug/info/warn/error.
      */
    var logger: js.UndefOr[Logger] = js.undefined
    
    /**
      * Value for how many times a request will be made at most in case of retry.
      */
    var maxAttempts: js.UndefOr[Double | Provider[Double]] = js.undefined
    
    /**
      * The AWS region to which this client will send requests
      */
    var region: js.UndefOr[String | Provider[String]] = js.undefined
    
    /**
      * The HTTP handler to use. Fetch in browser and Https in Nodejs.
      */
    var requestHandler: js.UndefOr[HttpHandler] = js.undefined
    
    /**
      * Specifies which retry algorithm to use.
      */
    var retryMode: js.UndefOr[String | Provider[String]] = js.undefined
    
    /**
      * The runtime environment.
      * @internal
      */
    var runtime: js.UndefOr[String] = js.undefined
    
    /**
      * Unique service identifier.
      * @internal
      */
    var serviceId: js.UndefOr[String] = js.undefined
    
    /**
      * A constructor for a class implementing the {@link @aws-sdk/types#ChecksumConstructor} interface
      * that computes the SHA-256 HMAC or checksum of a string or binary buffer.
      * @internal
      */
    var sha256: js.UndefOr[ChecksumConstructor | HashConstructor] = js.undefined
    
    /**
      * A function that converts a stream into an array of bytes.
      * @internal
      */
    var streamCollector: js.UndefOr[StreamCollector] = js.undefined
    
    /**
      * The function that will be used to convert strings into HTTP endpoints.
      * @internal
      */
    var urlParser: js.UndefOr[UrlParser] = js.undefined
    
    /**
      * Enables IPv6/IPv4 dualstack endpoint.
      */
    var useDualstackEndpoint: js.UndefOr[Boolean | Provider[Boolean]] = js.undefined
    
    /**
      * Enables FIPS compatible endpoints.
      */
    var useFipsEndpoint: js.UndefOr[Boolean | Provider[Boolean]] = js.undefined
    
    /**
      * The function that will be used to convert a UTF8-encoded string to a byte array.
      * @internal
      */
    var utf8Decoder: js.UndefOr[Decoder] = js.undefined
    
    /**
      * The function that will be used to convert binary data to a UTF-8 encoded string.
      * @internal
      */
    var utf8Encoder: js.UndefOr[Encoder] = js.undefined
  }
  object ClientDefaults {
    
    inline def apply(): ClientDefaults = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClientDefaults]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ClientDefaults] (val x: Self) extends AnyVal {
      
      inline def setApiVersion(value: String): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
      
      inline def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
      
      inline def setBase64Decoder(value: /* input */ String => js.typedarray.Uint8Array): Self = StObject.set(x, "base64Decoder", js.Any.fromFunction1(value))
      
      inline def setBase64DecoderUndefined: Self = StObject.set(x, "base64Decoder", js.undefined)
      
      inline def setBase64Encoder(value: /* input */ js.typedarray.Uint8Array => String): Self = StObject.set(x, "base64Encoder", js.Any.fromFunction1(value))
      
      inline def setBase64EncoderUndefined: Self = StObject.set(x, "base64Encoder", js.undefined)
      
      inline def setBodyLengthChecker(value: /* body */ Any => js.UndefOr[Double]): Self = StObject.set(x, "bodyLengthChecker", js.Any.fromFunction1(value))
      
      inline def setBodyLengthCheckerUndefined: Self = StObject.set(x, "bodyLengthChecker", js.undefined)
      
      inline def setCredentialDefaultProvider(value: /* input */ Any => Provider[Credentials]): Self = StObject.set(x, "credentialDefaultProvider", js.Any.fromFunction1(value))
      
      inline def setCredentialDefaultProviderUndefined: Self = StObject.set(x, "credentialDefaultProvider", js.undefined)
      
      inline def setDefaultUserAgentProvider(value: () => js.Promise[UserAgent]): Self = StObject.set(x, "defaultUserAgentProvider", js.Any.fromFunction0(value))
      
      inline def setDefaultUserAgentProviderUndefined: Self = StObject.set(x, "defaultUserAgentProvider", js.undefined)
      
      inline def setDefaultsMode(value: DefaultsMode | Provider[DefaultsMode]): Self = StObject.set(x, "defaultsMode", value.asInstanceOf[js.Any])
      
      inline def setDefaultsModeFunction0(value: () => js.Promise[DefaultsMode]): Self = StObject.set(x, "defaultsMode", js.Any.fromFunction0(value))
      
      inline def setDefaultsModeUndefined: Self = StObject.set(x, "defaultsMode", js.undefined)
      
      inline def setDisableHostPrefix(value: Boolean): Self = StObject.set(x, "disableHostPrefix", value.asInstanceOf[js.Any])
      
      inline def setDisableHostPrefixUndefined: Self = StObject.set(x, "disableHostPrefix", js.undefined)
      
      inline def setEndpointDiscoveryEnabledProvider(value: () => js.Promise[js.UndefOr[Boolean]]): Self = StObject.set(x, "endpointDiscoveryEnabledProvider", js.Any.fromFunction0(value))
      
      inline def setEndpointDiscoveryEnabledProviderUndefined: Self = StObject.set(x, "endpointDiscoveryEnabledProvider", js.undefined)
      
      inline def setLogger(value: Logger): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
      
      inline def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
      
      inline def setMaxAttempts(value: Double | Provider[Double]): Self = StObject.set(x, "maxAttempts", value.asInstanceOf[js.Any])
      
      inline def setMaxAttemptsFunction0(value: () => js.Promise[Double]): Self = StObject.set(x, "maxAttempts", js.Any.fromFunction0(value))
      
      inline def setMaxAttemptsUndefined: Self = StObject.set(x, "maxAttempts", js.undefined)
      
      inline def setRegion(value: String | Provider[String]): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      inline def setRegionFunction0(value: () => js.Promise[String]): Self = StObject.set(x, "region", js.Any.fromFunction0(value))
      
      inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
      
      inline def setRequestHandler(value: HttpHandler): Self = StObject.set(x, "requestHandler", value.asInstanceOf[js.Any])
      
      inline def setRequestHandlerUndefined: Self = StObject.set(x, "requestHandler", js.undefined)
      
      inline def setRetryMode(value: String | Provider[String]): Self = StObject.set(x, "retryMode", value.asInstanceOf[js.Any])
      
      inline def setRetryModeFunction0(value: () => js.Promise[String]): Self = StObject.set(x, "retryMode", js.Any.fromFunction0(value))
      
      inline def setRetryModeUndefined: Self = StObject.set(x, "retryMode", js.undefined)
      
      inline def setRuntime(value: String): Self = StObject.set(x, "runtime", value.asInstanceOf[js.Any])
      
      inline def setRuntimeUndefined: Self = StObject.set(x, "runtime", js.undefined)
      
      inline def setServiceId(value: String): Self = StObject.set(x, "serviceId", value.asInstanceOf[js.Any])
      
      inline def setServiceIdUndefined: Self = StObject.set(x, "serviceId", js.undefined)
      
      inline def setSha256(value: ChecksumConstructor | HashConstructor): Self = StObject.set(x, "sha256", value.asInstanceOf[js.Any])
      
      inline def setSha256Undefined: Self = StObject.set(x, "sha256", js.undefined)
      
      inline def setStreamCollector(value: /* stream */ Any => js.Promise[js.typedarray.Uint8Array]): Self = StObject.set(x, "streamCollector", js.Any.fromFunction1(value))
      
      inline def setStreamCollectorUndefined: Self = StObject.set(x, "streamCollector", js.undefined)
      
      inline def setUrlParser(value: /* url */ String | URL => Endpoint): Self = StObject.set(x, "urlParser", js.Any.fromFunction1(value))
      
      inline def setUrlParserUndefined: Self = StObject.set(x, "urlParser", js.undefined)
      
      inline def setUseDualstackEndpoint(value: Boolean | Provider[Boolean]): Self = StObject.set(x, "useDualstackEndpoint", value.asInstanceOf[js.Any])
      
      inline def setUseDualstackEndpointFunction0(value: () => js.Promise[Boolean]): Self = StObject.set(x, "useDualstackEndpoint", js.Any.fromFunction0(value))
      
      inline def setUseDualstackEndpointUndefined: Self = StObject.set(x, "useDualstackEndpoint", js.undefined)
      
      inline def setUseFipsEndpoint(value: Boolean | Provider[Boolean]): Self = StObject.set(x, "useFipsEndpoint", value.asInstanceOf[js.Any])
      
      inline def setUseFipsEndpointFunction0(value: () => js.Promise[Boolean]): Self = StObject.set(x, "useFipsEndpoint", js.Any.fromFunction0(value))
      
      inline def setUseFipsEndpointUndefined: Self = StObject.set(x, "useFipsEndpoint", js.undefined)
      
      inline def setUtf8Decoder(value: /* input */ String => js.typedarray.Uint8Array): Self = StObject.set(x, "utf8Decoder", js.Any.fromFunction1(value))
      
      inline def setUtf8DecoderUndefined: Self = StObject.set(x, "utf8Decoder", js.undefined)
      
      inline def setUtf8Encoder(value: /* input */ js.typedarray.Uint8Array => String): Self = StObject.set(x, "utf8Encoder", js.Any.fromFunction1(value))
      
      inline def setUtf8EncoderUndefined: Self = StObject.set(x, "utf8Encoder", js.undefined)
    }
  }
  
  type DynamoDBClientConfig = DynamoDBClientConfigType
  
  /**
    * @public
    */
  /* Inlined std.Partial<@aws-sdk/smithy-client.@aws-sdk/smithy-client.SmithyConfiguration<@aws-sdk/types.@aws-sdk/types.HttpHandlerOptions>> & @aws-sdk/client-dynamodb.@aws-sdk/client-dynamodb/dist-types/DynamoDBClient.ClientDefaults & @aws-sdk/config-resolver.@aws-sdk/config-resolver.RegionInputConfig & @aws-sdk/middleware-endpoint.@aws-sdk/middleware-endpoint.EndpointInputConfig<@aws-sdk/client-dynamodb.@aws-sdk/client-dynamodb/dist-types/endpoint/EndpointParameters.EndpointParameters> & @aws-sdk/middleware-retry.@aws-sdk/middleware-retry.RetryInputConfig & @aws-sdk/middleware-host-header.@aws-sdk/middleware-host-header.HostHeaderInputConfig & @aws-sdk/middleware-signing.@aws-sdk/middleware-signing.AwsAuthInputConfig & @aws-sdk/middleware-user-agent.@aws-sdk/middleware-user-agent.UserAgentInputConfig & @aws-sdk/middleware-endpoint-discovery.@aws-sdk/middleware-endpoint-discovery.EndpointDiscoveryInputConfig & @aws-sdk/client-dynamodb.@aws-sdk/client-dynamodb/dist-types/endpoint/EndpointParameters.ClientInputEndpointParameters */
  trait DynamoDBClientConfigType extends StObject {
    
    var apiVersion: js.UndefOr[String] = js.undefined
    
    /**
      * The function that will be used to convert a base64-encoded string to a byte array.
      * @internal
      */
    var base64Decoder: js.UndefOr[Decoder] = js.undefined
    
    /**
      * The function that will be used to convert binary data to a base64-encoded string.
      * @internal
      */
    var base64Encoder: js.UndefOr[Encoder] = js.undefined
    
    /**
      * A function that can calculate the length of a request body.
      * @internal
      */
    var bodyLengthChecker: js.UndefOr[BodyLengthCalculator] = js.undefined
    
    /**
      * Default credentials provider; Not available in browser runtime.
      * @internal
      */
    var credentialDefaultProvider: js.UndefOr[js.Function1[/* input */ Any, Provider[Credentials]]] = js.undefined
    
    /**
      * The credentials used to sign requests.
      */
    var credentials: js.UndefOr[AwsCredentialIdentity | Provider[AwsCredentialIdentity]] = js.undefined
    
    /**
      * The custom user agent header that would be appended to default one
      */
    var customUserAgent: js.UndefOr[String | UserAgent] = js.undefined
    
    /**
      * The provider populating default tracking information to be sent with `user-agent`, `x-amz-user-agent` header
      * @internal
      */
    var defaultUserAgentProvider: js.UndefOr[Provider[UserAgent]] = js.undefined
    
    /**
      * The {@link @aws-sdk/smithy-client#DefaultsMode} that will be used to determine how certain default configuration options are resolved in the SDK.
      */
    var defaultsMode: js.UndefOr[DefaultsMode | Provider[DefaultsMode]] = js.undefined
    
    /**
      * Disable dyanamically changing the endpoint of the client based on the hostPrefix
      * trait of an operation.
      */
    var disableHostPrefix: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The fully qualified endpoint of the webservice. This is only for using
      * a custom endpoint (for example, when using a local version of S3).
      *
      * Endpoint transformations such as S3 applying a bucket to the hostname are
      * still applicable to this custom endpoint.
      */
    var endpoint: js.UndefOr[String | Endpoint | (Provider[Endpoint | EndpointV2]) | EndpointV2] = js.undefined
    
    /**
      * The size of the client cache storing endpoints from endpoint discovery operations.
      * Defaults to 1000.
      */
    var endpointCacheSize: js.UndefOr[Double] = js.undefined
    
    /**
      * Whether to call operations with endpoints given by service dynamically.
      * Setting this config to `true` will enable endpoint discovery for all applicable operations.
      * Setting it to `false` will explicitly disable endpoint discovery even though operations that
      * require endpoint discovery will presumably fail. Leaving it to undefined means SDK only do
      * endpoint discovery when it's required. Defaults to `undefined`.
      */
    var endpointDiscoveryEnabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The provider which populates default for endpointDiscoveryEnabled configuration, if it's
      * not passed during client creation.
      * @internal
      */
    var endpointDiscoveryEnabledProvider: js.UndefOr[Provider[js.UndefOr[Boolean]]] = js.undefined
    
    /**
      * Providing a custom endpointProvider will override
      * built-in transformations of the endpoint such as S3 adding the bucket
      * name to the hostname, since they are part of the default endpointProvider.
      */
    var endpointProvider: js.UndefOr[
        js.Function2[
          /* params */ EndpointParameters, 
          /* context */ js.UndefOr[typings.awsSdkMiddlewareEndpoint.anon.Logger], 
          EndpointV2
        ]
      ] = js.undefined
    
    /**
      * Optional logger for logging debug/info/warn/error.
      */
    var logger: js.UndefOr[Logger] = js.undefined
    
    /**
      * Value for how many times a request will be made at most in case of retry.
      */
    /**
      * The maximum number of times requests that encounter retryable failures should be attempted.
      */
    var maxAttempts: js.UndefOr[Double | Provider[Double]] = js.undefined
    
    /**
      * The AWS region to which this client will send requests
      */
    var region: js.UndefOr[String | Provider[String]] = js.undefined
    
    /**
      * The HTTP handler to use. Fetch in browser and Https in Nodejs.
      */
    var requestHandler: js.UndefOr[RequestHandler[Any, Any, HttpHandlerOptions]] = js.undefined
    
    /**
      * Specifies which retry algorithm to use.
      */
    var retryMode: js.UndefOr[String | Provider[String]] = js.undefined
    
    /**
      * The strategy to retry the request. Using built-in exponential backoff strategy by default.
      */
    var retryStrategy: js.UndefOr[RetryStrategy | RetryStrategyV2] = js.undefined
    
    /**
      * The runtime environment.
      * @internal
      */
    var runtime: js.UndefOr[String] = js.undefined
    
    /**
      * Unique service identifier.
      * @internal
      */
    var serviceId: js.UndefOr[String] = js.undefined
    
    /**
      * A constructor for a class implementing the {@link @aws-sdk/types#ChecksumConstructor} interface
      * that computes the SHA-256 HMAC or checksum of a string or binary buffer.
      * @internal
      */
    var sha256: js.UndefOr[ChecksumConstructor | HashConstructor] = js.undefined
    
    /**
      * The signer to use when signing requests.
      */
    var signer: js.UndefOr[
        RequestSigner | (js.Function1[/* authScheme */ js.UndefOr[AuthScheme], js.Promise[RequestSigner]])
      ] = js.undefined
    
    /**
      * The injectable SigV4-compatible signer class constructor. If not supplied,
      * regular SignatureV4 constructor will be used.
      * @private
      */
    var signerConstructor: js.UndefOr[
        Instantiable1[/* options */ SignatureV4Init & SignatureV4CryptoInit, RequestSigner]
      ] = js.undefined
    
    /**
      * Whether to escape request path when signing the request.
      */
    var signingEscapePath: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The region where you want to sign your request against. This
      * can be different to the region in the endpoint.
      */
    var signingRegion: js.UndefOr[String] = js.undefined
    
    /**
      * A function that converts a stream into an array of bytes.
      * @internal
      */
    var streamCollector: js.UndefOr[StreamCollector] = js.undefined
    
    /**
      * An offset value in milliseconds to apply to all signing times.
      */
    var systemClockOffset: js.UndefOr[Double] = js.undefined
    
    /**
      * Whether TLS is enabled for requests.
      * @deprecated
      */
    var tls: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The function that will be used to convert strings into HTTP endpoints.
      * @internal
      */
    var urlParser: js.UndefOr[UrlParser] = js.undefined
    
    /**
      * Enables IPv6/IPv4 dualstack endpoint.
      */
    var useDualstackEndpoint: js.UndefOr[Boolean | Provider[Boolean]] = js.undefined
    
    /**
      * Enables FIPS compatible endpoints.
      */
    var useFipsEndpoint: js.UndefOr[Boolean | Provider[Boolean]] = js.undefined
    
    /**
      * The function that will be used to convert a UTF8-encoded string to a byte array.
      * @internal
      */
    var utf8Decoder: js.UndefOr[Decoder] = js.undefined
    
    /**
      * The function that will be used to convert binary data to a UTF-8 encoded string.
      * @internal
      */
    var utf8Encoder: js.UndefOr[Encoder] = js.undefined
  }
  object DynamoDBClientConfigType {
    
    inline def apply(): DynamoDBClientConfigType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DynamoDBClientConfigType]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DynamoDBClientConfigType] (val x: Self) extends AnyVal {
      
      inline def setApiVersion(value: String): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
      
      inline def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
      
      inline def setBase64Decoder(value: /* input */ String => js.typedarray.Uint8Array): Self = StObject.set(x, "base64Decoder", js.Any.fromFunction1(value))
      
      inline def setBase64DecoderUndefined: Self = StObject.set(x, "base64Decoder", js.undefined)
      
      inline def setBase64Encoder(value: /* input */ js.typedarray.Uint8Array => String): Self = StObject.set(x, "base64Encoder", js.Any.fromFunction1(value))
      
      inline def setBase64EncoderUndefined: Self = StObject.set(x, "base64Encoder", js.undefined)
      
      inline def setBodyLengthChecker(value: /* body */ Any => js.UndefOr[Double]): Self = StObject.set(x, "bodyLengthChecker", js.Any.fromFunction1(value))
      
      inline def setBodyLengthCheckerUndefined: Self = StObject.set(x, "bodyLengthChecker", js.undefined)
      
      inline def setCredentialDefaultProvider(value: /* input */ Any => Provider[Credentials]): Self = StObject.set(x, "credentialDefaultProvider", js.Any.fromFunction1(value))
      
      inline def setCredentialDefaultProviderUndefined: Self = StObject.set(x, "credentialDefaultProvider", js.undefined)
      
      inline def setCredentials(value: AwsCredentialIdentity | Provider[AwsCredentialIdentity]): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
      
      inline def setCredentialsFunction0(value: () => js.Promise[AwsCredentialIdentity]): Self = StObject.set(x, "credentials", js.Any.fromFunction0(value))
      
      inline def setCredentialsUndefined: Self = StObject.set(x, "credentials", js.undefined)
      
      inline def setCustomUserAgent(value: String | UserAgent): Self = StObject.set(x, "customUserAgent", value.asInstanceOf[js.Any])
      
      inline def setCustomUserAgentUndefined: Self = StObject.set(x, "customUserAgent", js.undefined)
      
      inline def setCustomUserAgentVarargs(value: UserAgentPair*): Self = StObject.set(x, "customUserAgent", js.Array(value*))
      
      inline def setDefaultUserAgentProvider(value: () => js.Promise[UserAgent]): Self = StObject.set(x, "defaultUserAgentProvider", js.Any.fromFunction0(value))
      
      inline def setDefaultUserAgentProviderUndefined: Self = StObject.set(x, "defaultUserAgentProvider", js.undefined)
      
      inline def setDefaultsMode(value: DefaultsMode | Provider[DefaultsMode]): Self = StObject.set(x, "defaultsMode", value.asInstanceOf[js.Any])
      
      inline def setDefaultsModeFunction0(value: () => js.Promise[DefaultsMode]): Self = StObject.set(x, "defaultsMode", js.Any.fromFunction0(value))
      
      inline def setDefaultsModeUndefined: Self = StObject.set(x, "defaultsMode", js.undefined)
      
      inline def setDisableHostPrefix(value: Boolean): Self = StObject.set(x, "disableHostPrefix", value.asInstanceOf[js.Any])
      
      inline def setDisableHostPrefixUndefined: Self = StObject.set(x, "disableHostPrefix", js.undefined)
      
      inline def setEndpoint(value: String | Endpoint | (Provider[Endpoint | EndpointV2]) | EndpointV2): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
      
      inline def setEndpointCacheSize(value: Double): Self = StObject.set(x, "endpointCacheSize", value.asInstanceOf[js.Any])
      
      inline def setEndpointCacheSizeUndefined: Self = StObject.set(x, "endpointCacheSize", js.undefined)
      
      inline def setEndpointDiscoveryEnabled(value: Boolean): Self = StObject.set(x, "endpointDiscoveryEnabled", value.asInstanceOf[js.Any])
      
      inline def setEndpointDiscoveryEnabledProvider(value: () => js.Promise[js.UndefOr[Boolean]]): Self = StObject.set(x, "endpointDiscoveryEnabledProvider", js.Any.fromFunction0(value))
      
      inline def setEndpointDiscoveryEnabledProviderUndefined: Self = StObject.set(x, "endpointDiscoveryEnabledProvider", js.undefined)
      
      inline def setEndpointDiscoveryEnabledUndefined: Self = StObject.set(x, "endpointDiscoveryEnabled", js.undefined)
      
      inline def setEndpointFunction0(value: () => js.Promise[Endpoint | EndpointV2]): Self = StObject.set(x, "endpoint", js.Any.fromFunction0(value))
      
      inline def setEndpointProvider(
        value: (/* params */ EndpointParameters, /* context */ js.UndefOr[typings.awsSdkMiddlewareEndpoint.anon.Logger]) => EndpointV2
      ): Self = StObject.set(x, "endpointProvider", js.Any.fromFunction2(value))
      
      inline def setEndpointProviderUndefined: Self = StObject.set(x, "endpointProvider", js.undefined)
      
      inline def setEndpointUndefined: Self = StObject.set(x, "endpoint", js.undefined)
      
      inline def setLogger(value: Logger): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
      
      inline def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
      
      inline def setMaxAttempts(value: Double | Provider[Double]): Self = StObject.set(x, "maxAttempts", value.asInstanceOf[js.Any])
      
      inline def setMaxAttemptsFunction0(value: () => js.Promise[Double]): Self = StObject.set(x, "maxAttempts", js.Any.fromFunction0(value))
      
      inline def setMaxAttemptsUndefined: Self = StObject.set(x, "maxAttempts", js.undefined)
      
      inline def setRegion(value: String | Provider[String]): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      inline def setRegionFunction0(value: () => js.Promise[String]): Self = StObject.set(x, "region", js.Any.fromFunction0(value))
      
      inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
      
      inline def setRequestHandler(value: RequestHandler[Any, Any, HttpHandlerOptions]): Self = StObject.set(x, "requestHandler", value.asInstanceOf[js.Any])
      
      inline def setRequestHandlerUndefined: Self = StObject.set(x, "requestHandler", js.undefined)
      
      inline def setRetryMode(value: String | Provider[String]): Self = StObject.set(x, "retryMode", value.asInstanceOf[js.Any])
      
      inline def setRetryModeFunction0(value: () => js.Promise[String]): Self = StObject.set(x, "retryMode", js.Any.fromFunction0(value))
      
      inline def setRetryModeUndefined: Self = StObject.set(x, "retryMode", js.undefined)
      
      inline def setRetryStrategy(value: RetryStrategy | RetryStrategyV2): Self = StObject.set(x, "retryStrategy", value.asInstanceOf[js.Any])
      
      inline def setRetryStrategyUndefined: Self = StObject.set(x, "retryStrategy", js.undefined)
      
      inline def setRuntime(value: String): Self = StObject.set(x, "runtime", value.asInstanceOf[js.Any])
      
      inline def setRuntimeUndefined: Self = StObject.set(x, "runtime", js.undefined)
      
      inline def setServiceId(value: String): Self = StObject.set(x, "serviceId", value.asInstanceOf[js.Any])
      
      inline def setServiceIdUndefined: Self = StObject.set(x, "serviceId", js.undefined)
      
      inline def setSha256(value: ChecksumConstructor | HashConstructor): Self = StObject.set(x, "sha256", value.asInstanceOf[js.Any])
      
      inline def setSha256Undefined: Self = StObject.set(x, "sha256", js.undefined)
      
      inline def setSigner(
        value: RequestSigner | (js.Function1[/* authScheme */ js.UndefOr[AuthScheme], js.Promise[RequestSigner]])
      ): Self = StObject.set(x, "signer", value.asInstanceOf[js.Any])
      
      inline def setSignerConstructor(value: Instantiable1[/* options */ SignatureV4Init & SignatureV4CryptoInit, RequestSigner]): Self = StObject.set(x, "signerConstructor", value.asInstanceOf[js.Any])
      
      inline def setSignerConstructorUndefined: Self = StObject.set(x, "signerConstructor", js.undefined)
      
      inline def setSignerFunction1(value: /* authScheme */ js.UndefOr[AuthScheme] => js.Promise[RequestSigner]): Self = StObject.set(x, "signer", js.Any.fromFunction1(value))
      
      inline def setSignerUndefined: Self = StObject.set(x, "signer", js.undefined)
      
      inline def setSigningEscapePath(value: Boolean): Self = StObject.set(x, "signingEscapePath", value.asInstanceOf[js.Any])
      
      inline def setSigningEscapePathUndefined: Self = StObject.set(x, "signingEscapePath", js.undefined)
      
      inline def setSigningRegion(value: String): Self = StObject.set(x, "signingRegion", value.asInstanceOf[js.Any])
      
      inline def setSigningRegionUndefined: Self = StObject.set(x, "signingRegion", js.undefined)
      
      inline def setStreamCollector(value: /* stream */ Any => js.Promise[js.typedarray.Uint8Array]): Self = StObject.set(x, "streamCollector", js.Any.fromFunction1(value))
      
      inline def setStreamCollectorUndefined: Self = StObject.set(x, "streamCollector", js.undefined)
      
      inline def setSystemClockOffset(value: Double): Self = StObject.set(x, "systemClockOffset", value.asInstanceOf[js.Any])
      
      inline def setSystemClockOffsetUndefined: Self = StObject.set(x, "systemClockOffset", js.undefined)
      
      inline def setTls(value: Boolean): Self = StObject.set(x, "tls", value.asInstanceOf[js.Any])
      
      inline def setTlsUndefined: Self = StObject.set(x, "tls", js.undefined)
      
      inline def setUrlParser(value: /* url */ String | URL => Endpoint): Self = StObject.set(x, "urlParser", js.Any.fromFunction1(value))
      
      inline def setUrlParserUndefined: Self = StObject.set(x, "urlParser", js.undefined)
      
      inline def setUseDualstackEndpoint(value: Boolean | Provider[Boolean]): Self = StObject.set(x, "useDualstackEndpoint", value.asInstanceOf[js.Any])
      
      inline def setUseDualstackEndpointFunction0(value: () => js.Promise[Boolean]): Self = StObject.set(x, "useDualstackEndpoint", js.Any.fromFunction0(value))
      
      inline def setUseDualstackEndpointUndefined: Self = StObject.set(x, "useDualstackEndpoint", js.undefined)
      
      inline def setUseFipsEndpoint(value: Boolean | Provider[Boolean]): Self = StObject.set(x, "useFipsEndpoint", value.asInstanceOf[js.Any])
      
      inline def setUseFipsEndpointFunction0(value: () => js.Promise[Boolean]): Self = StObject.set(x, "useFipsEndpoint", js.Any.fromFunction0(value))
      
      inline def setUseFipsEndpointUndefined: Self = StObject.set(x, "useFipsEndpoint", js.undefined)
      
      inline def setUtf8Decoder(value: /* input */ String => js.typedarray.Uint8Array): Self = StObject.set(x, "utf8Decoder", js.Any.fromFunction1(value))
      
      inline def setUtf8DecoderUndefined: Self = StObject.set(x, "utf8Decoder", js.undefined)
      
      inline def setUtf8Encoder(value: /* input */ js.typedarray.Uint8Array => String): Self = StObject.set(x, "utf8Encoder", js.Any.fromFunction1(value))
      
      inline def setUtf8EncoderUndefined: Self = StObject.set(x, "utf8Encoder", js.undefined)
    }
  }
  
  type DynamoDBClientResolvedConfig = DynamoDBClientResolvedConfigType
  
  /**
    * @public
    */
  /* Inlined @aws-sdk/smithy-client.@aws-sdk/smithy-client.SmithyResolvedConfiguration<@aws-sdk/types.@aws-sdk/types.HttpHandlerOptions> & std.Required<@aws-sdk/client-dynamodb.@aws-sdk/client-dynamodb/dist-types/DynamoDBClient.ClientDefaults> & @aws-sdk/config-resolver.@aws-sdk/config-resolver.RegionResolvedConfig & @aws-sdk/middleware-endpoint.@aws-sdk/middleware-endpoint.EndpointResolvedConfig<@aws-sdk/client-dynamodb.@aws-sdk/client-dynamodb/dist-types/endpoint/EndpointParameters.EndpointParameters> & @aws-sdk/middleware-retry.@aws-sdk/middleware-retry.RetryResolvedConfig & @aws-sdk/middleware-host-header.@aws-sdk/middleware-host-header.HostHeaderResolvedConfig & @aws-sdk/middleware-signing.@aws-sdk/middleware-signing.AwsAuthResolvedConfig & @aws-sdk/middleware-user-agent.@aws-sdk/middleware-user-agent.UserAgentResolvedConfig & @aws-sdk/middleware-endpoint-discovery.@aws-sdk/middleware-endpoint-discovery.EndpointDiscoveryResolvedConfig & @aws-sdk/client-dynamodb.@aws-sdk/client-dynamodb/dist-types/endpoint/EndpointParameters.ClientResolvedEndpointParameters */
  @js.native
  trait DynamoDBClientResolvedConfigType extends StObject {
    
    /**
      * The API version set internally by the SDK, and is
      * not planned to be used by customer code.
      * @internal
      */
    val apiVersion: String = js.native
    
    def base64Decoder(input: String): js.typedarray.Uint8Array = js.native
    @JSName("base64Decoder")
    var base64Decoder_Original: Decoder = js.native
    
    def base64Encoder(input: js.typedarray.Uint8Array): String = js.native
    @JSName("base64Encoder")
    var base64Encoder_Original: Encoder = js.native
    
    def bodyLengthChecker(body: Any): js.UndefOr[Double] = js.native
    @JSName("bodyLengthChecker")
    var bodyLengthChecker_Original: BodyLengthCalculator = js.native
    
    def credentialDefaultProvider(input: Any): Provider[Credentials] = js.native
    @JSName("credentialDefaultProvider")
    var credentialDefaultProvider_Original: js.Function1[/* input */ Any, Provider[Credentials]] = js.native
    
    /**
      * Resolved value for input config {@link AwsAuthInputConfig.credentials}
      * This provider MAY memoize the loaded credentials for certain period.
      * See {@link MemoizedProvider} for more information.
      */
    def credentials(): js.Promise[AwsCredentialIdentity] = js.native
    def credentials(options: ForceRefresh): js.Promise[AwsCredentialIdentity] = js.native
    /**
      * Resolved value for input config {@link AwsAuthInputConfig.credentials}
      * This provider MAY memoize the loaded credentials for certain period.
      * See {@link MemoizedProvider} for more information.
      */
    @JSName("credentials")
    var credentials_Original: MemoizedProvider[AwsCredentialIdentity] = js.native
    
    /**
      * The custom user agent header that would be appended to default one
      */
    var customUserAgent: js.UndefOr[UserAgent] = js.native
    
    var defaultSigningName: String = js.native
    
    def defaultUserAgentProvider(): js.Promise[UserAgent] = js.native
    /**
      * The provider populating default tracking information to be sent with `user-agent`, `x-amz-user-agent` header.
      * @internal
      */
    @JSName("defaultUserAgentProvider")
    var defaultUserAgentProvider_Original: Provider[UserAgent] = js.native
    
    var defaultsMode: DefaultsMode | Provider[DefaultsMode] = js.native
    
    var disableHostPrefix: Boolean = js.native
    
    /**
      * Custom endpoint provided by the user.
      * This is normalized to a single interface from the various acceptable types.
      * This field will be undefined if a custom endpoint is not provided.
      */
    var endpoint: js.UndefOr[Provider[Endpoint]] = js.native
    
    /**
      * LRU Cache which stores endpoints from endpoint discovery operations.
      * The size is either provided by {@link EndpointDiscoveryInputConfig.endpointCacheSize}.
      */
    var endpointCache: EndpointCache = js.native
    
    /**
      * The constructor of the Command used for discovering endpoints.
      * @internal
      */
    var endpointDiscoveryCommandCtor: Instantiable1[/* comandConfig */ Any, Any] = js.native
    
    /**
      * Resolved value for input config {@link EndpointDiscoveryInputConfig.endpointDiscoveryEnabled}.
      */
    def endpointDiscoveryEnabled(): js.Promise[js.UndefOr[Boolean]] = js.native
    
    def endpointDiscoveryEnabledProvider(): js.Promise[js.UndefOr[Boolean]] = js.native
    @JSName("endpointDiscoveryEnabledProvider")
    var endpointDiscoveryEnabledProvider_Original: Provider[js.UndefOr[Boolean]] = js.native
    
    /**
      * Resolved value for input config {@link EndpointDiscoveryInputConfig.endpointDiscoveryEnabled}.
      */
    @JSName("endpointDiscoveryEnabled")
    var endpointDiscoveryEnabled_Original: Provider[js.UndefOr[Boolean]] = js.native
    
    def endpointProvider(params: EndpointParameters): EndpointV2 = js.native
    def endpointProvider(params: EndpointParameters, context: typings.awsSdkMiddlewareEndpoint.anon.Logger): EndpointV2 = js.native
    
    /**
      * Stores whether endpoint discovery configuration is set locally by passing
      * {@link EndpointDiscoveryInputConfig.endpointDiscoveryEnabled} during client creation.
      * @internal
      */
    var isClientEndpointDiscoveryEnabled: Boolean = js.native
    
    /**
      * Whether the endpoint is specified by caller.
      * @internal
      * @deprecated
      */
    var isCustomEndpoint: js.UndefOr[Boolean] = js.native
    
    var logger: Logger = js.native
    
    /**
      * Resolved value for input config {@link RetryInputConfig.maxAttempts}
      */
    def maxAttempts(): js.Promise[Double] = js.native
    /**
      * Resolved value for input config {@link RetryInputConfig.maxAttempts}
      */
    @JSName("maxAttempts")
    var maxAttempts_Original: Double | Provider[Double] = js.native
    
    /**
      * Resolved value for input config {@link RegionInputConfig.region}
      */
    def region(): js.Promise[String] = js.native
    /**
      * Resolved value for input config {@link RegionInputConfig.region}
      */
    @JSName("region")
    var region_Original: String | Provider[String] = js.native
    
    /**
      * The HTTP handler to use. Fetch in browser and Https in Nodejs.
      */
    var requestHandler: RequestHandler[Any, Any, HttpHandlerOptions] = js.native
    
    var retryMode: String | Provider[String] = js.native
    
    /**
      * Resolved value for input config {@link RetryInputConfig.retryStrategy}
      */
    def retryStrategy(): js.Promise[RetryStrategyV2 | RetryStrategy] = js.native
    /**
      * Resolved value for input config {@link RetryInputConfig.retryStrategy}
      */
    @JSName("retryStrategy")
    var retryStrategy_Original: Provider[RetryStrategyV2 | RetryStrategy] = js.native
    
    /**
      * The runtime environment
      */
    var runtime: String = js.native
    
    var serviceId: String = js.native
    
    var sha256: ChecksumConstructor | HashConstructor = js.native
    
    /**
      * Resolved value for input config {@link AwsAuthInputConfig.signer}
      */
    def signer(): js.Promise[RequestSigner] = js.native
    def signer(authScheme: AuthScheme): js.Promise[RequestSigner] = js.native
    
    /**
      * Resolved value for input config {@link AwsAuthInputConfig.signingEscapePath}
      */
    var signingEscapePath: Boolean = js.native
    
    def streamCollector(stream: Any): js.Promise[js.typedarray.Uint8Array] = js.native
    @JSName("streamCollector")
    var streamCollector_Original: StreamCollector = js.native
    
    /**
      * Resolved value for input config {@link AwsAuthInputConfig.systemClockOffset}
      */
    var systemClockOffset: Double = js.native
    
    /**
      * Whether TLS is enabled for requests.
      * @deprecated
      */
    var tls: Boolean = js.native
    
    def urlParser(url: String): Endpoint = js.native
    def urlParser(url: URL): Endpoint = js.native
    @JSName("urlParser")
    var urlParser_Original: UrlParser = js.native
    
    /**
      * Resolved value for input {@link EndpointsInputConfig.useDualstackEndpoint}
      */
    def useDualstackEndpoint(): js.Promise[Boolean] = js.native
    /**
      * Resolved value for input {@link EndpointsInputConfig.useDualstackEndpoint}
      */
    @JSName("useDualstackEndpoint")
    var useDualstackEndpoint_Original: Boolean | Provider[Boolean] = js.native
    
    /**
      * Resolved value for input {@link RegionInputConfig.useFipsEndpoint}
      */
    def useFipsEndpoint(): js.Promise[Boolean] = js.native
    /**
      * Resolved value for input {@link RegionInputConfig.useFipsEndpoint}
      */
    /**
      * Resolved value for input {@link EndpointsInputConfig.useFipsEndpoint}
      */
    @JSName("useFipsEndpoint")
    var useFipsEndpoint_Original: Boolean | Provider[Boolean] = js.native
    
    def utf8Decoder(input: String): js.typedarray.Uint8Array = js.native
    @JSName("utf8Decoder")
    var utf8Decoder_Original: Decoder = js.native
    
    def utf8Encoder(input: js.typedarray.Uint8Array): String = js.native
    @JSName("utf8Encoder")
    var utf8Encoder_Original: Encoder = js.native
  }
  
  type ServiceInputTypes = /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 53, starting with typings.awsSdkClientDynamodb.distTypesCommandsBatchExecuteStatementCommandMod.BatchExecuteStatementCommandInput, typings.awsSdkClientDynamodb.distTypesCommandsBatchGetItemCommandMod.BatchGetItemCommandInput, typings.awsSdkClientDynamodb.distTypesCommandsBatchWriteItemCommandMod.BatchWriteItemCommandInput */ Any
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdkClientDynamodb.distTypesCommandsBatchExecuteStatementCommandMod.BatchExecuteStatementCommandOutput
    - typings.awsSdkClientDynamodb.distTypesCommandsBatchGetItemCommandMod.BatchGetItemCommandOutput
    - typings.awsSdkClientDynamodb.distTypesCommandsBatchWriteItemCommandMod.BatchWriteItemCommandOutput
    - typings.awsSdkClientDynamodb.distTypesCommandsCreateBackupCommandMod.CreateBackupCommandOutput
    - typings.awsSdkClientDynamodb.distTypesCommandsCreateGlobalTableCommandMod.CreateGlobalTableCommandOutput
    - typings.awsSdkClientDynamodb.distTypesCommandsCreateTableCommandMod.CreateTableCommandOutput
    - typings.awsSdkClientDynamodb.distTypesCommandsDeleteBackupCommandMod.DeleteBackupCommandOutput
    - typings.awsSdkClientDynamodb.distTypesCommandsDeleteItemCommandMod.DeleteItemCommandOutput
    - typings.awsSdkClientDynamodb.distTypesCommandsDeleteTableCommandMod.DeleteTableCommandOutput
    - typings.awsSdkClientDynamodb.distTypesCommandsDescribeBackupCommandMod.DescribeBackupCommandOutput
    - typings.awsSdkClientDynamodb.distTypesCommandsDescribeContinuousBackupsCommandMod.DescribeContinuousBackupsCommandOutput
    - typings.awsSdkClientDynamodb.distTypesCommandsDescribeContributorInsightsCommandMod.DescribeContributorInsightsCommandOutput
    - typings.awsSdkClientDynamodb.distTypesCommandsDescribeEndpointsCommandMod.DescribeEndpointsCommandOutput
    - typings.awsSdkClientDynamodb.distTypesCommandsDescribeExportCommandMod.DescribeExportCommandOutput
    - typings.awsSdkClientDynamodb.distTypesCommandsDescribeGlobalTableCommandMod.DescribeGlobalTableCommandOutput
    - typings.awsSdkClientDynamodb.distTypesCommandsDescribeGlobalTableSettingsCommandMod.DescribeGlobalTableSettingsCommandOutput
    - typings.awsSdkClientDynamodb.distTypesCommandsDescribeImportCommandMod.DescribeImportCommandOutput
    - typings.awsSdkClientDynamodb.distTypesCommandsDescribeKinesisStreamingDestinationCommandMod.DescribeKinesisStreamingDestinationCommandOutput
    - typings.awsSdkClientDynamodb.distTypesCommandsDescribeLimitsCommandMod.DescribeLimitsCommandOutput
    - typings.awsSdkClientDynamodb.distTypesCommandsDescribeTableCommandMod.DescribeTableCommandOutput
    - typings.awsSdkClientDynamodb.distTypesCommandsDescribeTableReplicaAutoScalingCommandMod.DescribeTableReplicaAutoScalingCommandOutput
    - typings.awsSdkClientDynamodb.distTypesCommandsDescribeTimeToLiveCommandMod.DescribeTimeToLiveCommandOutput
    - typings.awsSdkClientDynamodb.distTypesCommandsDisableKinesisStreamingDestinationCommandMod.DisableKinesisStreamingDestinationCommandOutput
    - typings.awsSdkClientDynamodb.distTypesCommandsEnableKinesisStreamingDestinationCommandMod.EnableKinesisStreamingDestinationCommandOutput
    - typings.awsSdkClientDynamodb.distTypesCommandsExecuteStatementCommandMod.ExecuteStatementCommandOutput
    - typings.awsSdkClientDynamodb.distTypesCommandsExecuteTransactionCommandMod.ExecuteTransactionCommandOutput
    - typings.awsSdkClientDynamodb.distTypesCommandsExportTableToPointInTimeCommandMod.ExportTableToPointInTimeCommandOutput
    - typings.awsSdkClientDynamodb.distTypesCommandsGetItemCommandMod.GetItemCommandOutput
    - typings.awsSdkClientDynamodb.distTypesCommandsImportTableCommandMod.ImportTableCommandOutput
    - typings.awsSdkClientDynamodb.distTypesCommandsListBackupsCommandMod.ListBackupsCommandOutput
    - typings.awsSdkClientDynamodb.distTypesCommandsListContributorInsightsCommandMod.ListContributorInsightsCommandOutput
    - typings.awsSdkClientDynamodb.distTypesCommandsListExportsCommandMod.ListExportsCommandOutput
    - typings.awsSdkClientDynamodb.distTypesCommandsListGlobalTablesCommandMod.ListGlobalTablesCommandOutput
    - typings.awsSdkClientDynamodb.distTypesCommandsListImportsCommandMod.ListImportsCommandOutput
    - typings.awsSdkClientDynamodb.distTypesCommandsListTablesCommandMod.ListTablesCommandOutput
    - typings.awsSdkClientDynamodb.distTypesCommandsListTagsOfResourceCommandMod.ListTagsOfResourceCommandOutput
    - typings.awsSdkClientDynamodb.distTypesCommandsPutItemCommandMod.PutItemCommandOutput
    - typings.awsSdkClientDynamodb.distTypesCommandsQueryCommandMod.QueryCommandOutput
    - typings.awsSdkClientDynamodb.distTypesCommandsRestoreTableFromBackupCommandMod.RestoreTableFromBackupCommandOutput
    - typings.awsSdkClientDynamodb.distTypesCommandsRestoreTableToPointInTimeCommandMod.RestoreTableToPointInTimeCommandOutput
    - typings.awsSdkClientDynamodb.distTypesCommandsScanCommandMod.ScanCommandOutput
    - typings.awsSdkClientDynamodb.distTypesCommandsTagResourceCommandMod.TagResourceCommandOutput
    - typings.awsSdkClientDynamodb.distTypesCommandsTransactGetItemsCommandMod.TransactGetItemsCommandOutput
    - typings.awsSdkClientDynamodb.distTypesCommandsTransactWriteItemsCommandMod.TransactWriteItemsCommandOutput
    - typings.awsSdkClientDynamodb.distTypesCommandsUntagResourceCommandMod.UntagResourceCommandOutput
    - typings.awsSdkClientDynamodb.distTypesCommandsUpdateContinuousBackupsCommandMod.UpdateContinuousBackupsCommandOutput
    - typings.awsSdkClientDynamodb.distTypesCommandsUpdateContributorInsightsCommandMod.UpdateContributorInsightsCommandOutput
    - typings.awsSdkClientDynamodb.distTypesCommandsUpdateGlobalTableCommandMod.UpdateGlobalTableCommandOutput
    - typings.awsSdkClientDynamodb.distTypesCommandsUpdateGlobalTableSettingsCommandMod.UpdateGlobalTableSettingsCommandOutput
    - typings.awsSdkClientDynamodb.distTypesCommandsUpdateItemCommandMod.UpdateItemCommandOutput
    - typings.awsSdkClientDynamodb.distTypesCommandsUpdateTableCommandMod.UpdateTableCommandOutput
    - typings.awsSdkClientDynamodb.distTypesCommandsUpdateTableReplicaAutoScalingCommandMod.UpdateTableReplicaAutoScalingCommandOutput
    - typings.awsSdkClientDynamodb.distTypesCommandsUpdateTimeToLiveCommandMod.UpdateTimeToLiveCommandOutput
  */
  type ServiceOutputTypes = _ServiceOutputTypes | TagResourceCommandOutput | UntagResourceCommandOutput
  
  trait _ServiceOutputTypes extends StObject
  object _ServiceOutputTypes {
    
    inline def BatchExecuteStatementCommandOutput($metadata: ResponseMetadata): typings.awsSdkClientDynamodb.distTypesCommandsBatchExecuteStatementCommandMod.BatchExecuteStatementCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientDynamodb.distTypesCommandsBatchExecuteStatementCommandMod.BatchExecuteStatementCommandOutput]
    }
    
    inline def BatchGetItemCommandOutput($metadata: ResponseMetadata): typings.awsSdkClientDynamodb.distTypesCommandsBatchGetItemCommandMod.BatchGetItemCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientDynamodb.distTypesCommandsBatchGetItemCommandMod.BatchGetItemCommandOutput]
    }
    
    inline def BatchWriteItemCommandOutput($metadata: ResponseMetadata): typings.awsSdkClientDynamodb.distTypesCommandsBatchWriteItemCommandMod.BatchWriteItemCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientDynamodb.distTypesCommandsBatchWriteItemCommandMod.BatchWriteItemCommandOutput]
    }
    
    inline def CreateBackupCommandOutput($metadata: ResponseMetadata): typings.awsSdkClientDynamodb.distTypesCommandsCreateBackupCommandMod.CreateBackupCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientDynamodb.distTypesCommandsCreateBackupCommandMod.CreateBackupCommandOutput]
    }
    
    inline def CreateGlobalTableCommandOutput($metadata: ResponseMetadata): typings.awsSdkClientDynamodb.distTypesCommandsCreateGlobalTableCommandMod.CreateGlobalTableCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientDynamodb.distTypesCommandsCreateGlobalTableCommandMod.CreateGlobalTableCommandOutput]
    }
    
    inline def CreateTableCommandOutput($metadata: ResponseMetadata): typings.awsSdkClientDynamodb.distTypesCommandsCreateTableCommandMod.CreateTableCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientDynamodb.distTypesCommandsCreateTableCommandMod.CreateTableCommandOutput]
    }
    
    inline def DeleteBackupCommandOutput($metadata: ResponseMetadata): typings.awsSdkClientDynamodb.distTypesCommandsDeleteBackupCommandMod.DeleteBackupCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientDynamodb.distTypesCommandsDeleteBackupCommandMod.DeleteBackupCommandOutput]
    }
    
    inline def DeleteItemCommandOutput($metadata: ResponseMetadata): typings.awsSdkClientDynamodb.distTypesCommandsDeleteItemCommandMod.DeleteItemCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientDynamodb.distTypesCommandsDeleteItemCommandMod.DeleteItemCommandOutput]
    }
    
    inline def DeleteTableCommandOutput($metadata: ResponseMetadata): typings.awsSdkClientDynamodb.distTypesCommandsDeleteTableCommandMod.DeleteTableCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientDynamodb.distTypesCommandsDeleteTableCommandMod.DeleteTableCommandOutput]
    }
    
    inline def DescribeBackupCommandOutput($metadata: ResponseMetadata): typings.awsSdkClientDynamodb.distTypesCommandsDescribeBackupCommandMod.DescribeBackupCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientDynamodb.distTypesCommandsDescribeBackupCommandMod.DescribeBackupCommandOutput]
    }
    
    inline def DescribeContinuousBackupsCommandOutput($metadata: ResponseMetadata): typings.awsSdkClientDynamodb.distTypesCommandsDescribeContinuousBackupsCommandMod.DescribeContinuousBackupsCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientDynamodb.distTypesCommandsDescribeContinuousBackupsCommandMod.DescribeContinuousBackupsCommandOutput]
    }
    
    inline def DescribeContributorInsightsCommandOutput($metadata: ResponseMetadata): typings.awsSdkClientDynamodb.distTypesCommandsDescribeContributorInsightsCommandMod.DescribeContributorInsightsCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientDynamodb.distTypesCommandsDescribeContributorInsightsCommandMod.DescribeContributorInsightsCommandOutput]
    }
    
    inline def DescribeEndpointsCommandOutput($metadata: ResponseMetadata): typings.awsSdkClientDynamodb.distTypesCommandsDescribeEndpointsCommandMod.DescribeEndpointsCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientDynamodb.distTypesCommandsDescribeEndpointsCommandMod.DescribeEndpointsCommandOutput]
    }
    
    inline def DescribeExportCommandOutput($metadata: ResponseMetadata): typings.awsSdkClientDynamodb.distTypesCommandsDescribeExportCommandMod.DescribeExportCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientDynamodb.distTypesCommandsDescribeExportCommandMod.DescribeExportCommandOutput]
    }
    
    inline def DescribeGlobalTableCommandOutput($metadata: ResponseMetadata): typings.awsSdkClientDynamodb.distTypesCommandsDescribeGlobalTableCommandMod.DescribeGlobalTableCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientDynamodb.distTypesCommandsDescribeGlobalTableCommandMod.DescribeGlobalTableCommandOutput]
    }
    
    inline def DescribeGlobalTableSettingsCommandOutput($metadata: ResponseMetadata): typings.awsSdkClientDynamodb.distTypesCommandsDescribeGlobalTableSettingsCommandMod.DescribeGlobalTableSettingsCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientDynamodb.distTypesCommandsDescribeGlobalTableSettingsCommandMod.DescribeGlobalTableSettingsCommandOutput]
    }
    
    inline def DescribeImportCommandOutput($metadata: ResponseMetadata): typings.awsSdkClientDynamodb.distTypesCommandsDescribeImportCommandMod.DescribeImportCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientDynamodb.distTypesCommandsDescribeImportCommandMod.DescribeImportCommandOutput]
    }
    
    inline def DescribeKinesisStreamingDestinationCommandOutput($metadata: ResponseMetadata): typings.awsSdkClientDynamodb.distTypesCommandsDescribeKinesisStreamingDestinationCommandMod.DescribeKinesisStreamingDestinationCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientDynamodb.distTypesCommandsDescribeKinesisStreamingDestinationCommandMod.DescribeKinesisStreamingDestinationCommandOutput]
    }
    
    inline def DescribeLimitsCommandOutput($metadata: ResponseMetadata): typings.awsSdkClientDynamodb.distTypesCommandsDescribeLimitsCommandMod.DescribeLimitsCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientDynamodb.distTypesCommandsDescribeLimitsCommandMod.DescribeLimitsCommandOutput]
    }
    
    inline def DescribeTableCommandOutput($metadata: ResponseMetadata): typings.awsSdkClientDynamodb.distTypesCommandsDescribeTableCommandMod.DescribeTableCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientDynamodb.distTypesCommandsDescribeTableCommandMod.DescribeTableCommandOutput]
    }
    
    inline def DescribeTableReplicaAutoScalingCommandOutput($metadata: ResponseMetadata): typings.awsSdkClientDynamodb.distTypesCommandsDescribeTableReplicaAutoScalingCommandMod.DescribeTableReplicaAutoScalingCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientDynamodb.distTypesCommandsDescribeTableReplicaAutoScalingCommandMod.DescribeTableReplicaAutoScalingCommandOutput]
    }
    
    inline def DescribeTimeToLiveCommandOutput($metadata: ResponseMetadata): typings.awsSdkClientDynamodb.distTypesCommandsDescribeTimeToLiveCommandMod.DescribeTimeToLiveCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientDynamodb.distTypesCommandsDescribeTimeToLiveCommandMod.DescribeTimeToLiveCommandOutput]
    }
    
    inline def DisableKinesisStreamingDestinationCommandOutput($metadata: ResponseMetadata): typings.awsSdkClientDynamodb.distTypesCommandsDisableKinesisStreamingDestinationCommandMod.DisableKinesisStreamingDestinationCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientDynamodb.distTypesCommandsDisableKinesisStreamingDestinationCommandMod.DisableKinesisStreamingDestinationCommandOutput]
    }
    
    inline def EnableKinesisStreamingDestinationCommandOutput($metadata: ResponseMetadata): typings.awsSdkClientDynamodb.distTypesCommandsEnableKinesisStreamingDestinationCommandMod.EnableKinesisStreamingDestinationCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientDynamodb.distTypesCommandsEnableKinesisStreamingDestinationCommandMod.EnableKinesisStreamingDestinationCommandOutput]
    }
    
    inline def ExecuteStatementCommandOutput($metadata: ResponseMetadata): typings.awsSdkClientDynamodb.distTypesCommandsExecuteStatementCommandMod.ExecuteStatementCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientDynamodb.distTypesCommandsExecuteStatementCommandMod.ExecuteStatementCommandOutput]
    }
    
    inline def ExecuteTransactionCommandOutput($metadata: ResponseMetadata): typings.awsSdkClientDynamodb.distTypesCommandsExecuteTransactionCommandMod.ExecuteTransactionCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientDynamodb.distTypesCommandsExecuteTransactionCommandMod.ExecuteTransactionCommandOutput]
    }
    
    inline def ExportTableToPointInTimeCommandOutput($metadata: ResponseMetadata): typings.awsSdkClientDynamodb.distTypesCommandsExportTableToPointInTimeCommandMod.ExportTableToPointInTimeCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientDynamodb.distTypesCommandsExportTableToPointInTimeCommandMod.ExportTableToPointInTimeCommandOutput]
    }
    
    inline def GetItemCommandOutput($metadata: ResponseMetadata): typings.awsSdkClientDynamodb.distTypesCommandsGetItemCommandMod.GetItemCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientDynamodb.distTypesCommandsGetItemCommandMod.GetItemCommandOutput]
    }
    
    inline def ImportTableCommandOutput($metadata: ResponseMetadata): typings.awsSdkClientDynamodb.distTypesCommandsImportTableCommandMod.ImportTableCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientDynamodb.distTypesCommandsImportTableCommandMod.ImportTableCommandOutput]
    }
    
    inline def ListBackupsCommandOutput($metadata: ResponseMetadata): typings.awsSdkClientDynamodb.distTypesCommandsListBackupsCommandMod.ListBackupsCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientDynamodb.distTypesCommandsListBackupsCommandMod.ListBackupsCommandOutput]
    }
    
    inline def ListContributorInsightsCommandOutput($metadata: ResponseMetadata): typings.awsSdkClientDynamodb.distTypesCommandsListContributorInsightsCommandMod.ListContributorInsightsCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientDynamodb.distTypesCommandsListContributorInsightsCommandMod.ListContributorInsightsCommandOutput]
    }
    
    inline def ListExportsCommandOutput($metadata: ResponseMetadata): typings.awsSdkClientDynamodb.distTypesCommandsListExportsCommandMod.ListExportsCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientDynamodb.distTypesCommandsListExportsCommandMod.ListExportsCommandOutput]
    }
    
    inline def ListGlobalTablesCommandOutput($metadata: ResponseMetadata): typings.awsSdkClientDynamodb.distTypesCommandsListGlobalTablesCommandMod.ListGlobalTablesCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientDynamodb.distTypesCommandsListGlobalTablesCommandMod.ListGlobalTablesCommandOutput]
    }
    
    inline def ListImportsCommandOutput($metadata: ResponseMetadata): typings.awsSdkClientDynamodb.distTypesCommandsListImportsCommandMod.ListImportsCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientDynamodb.distTypesCommandsListImportsCommandMod.ListImportsCommandOutput]
    }
    
    inline def ListTablesCommandOutput($metadata: ResponseMetadata): typings.awsSdkClientDynamodb.distTypesCommandsListTablesCommandMod.ListTablesCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientDynamodb.distTypesCommandsListTablesCommandMod.ListTablesCommandOutput]
    }
    
    inline def ListTagsOfResourceCommandOutput($metadata: ResponseMetadata): typings.awsSdkClientDynamodb.distTypesCommandsListTagsOfResourceCommandMod.ListTagsOfResourceCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientDynamodb.distTypesCommandsListTagsOfResourceCommandMod.ListTagsOfResourceCommandOutput]
    }
    
    inline def PutItemCommandOutput($metadata: ResponseMetadata): typings.awsSdkClientDynamodb.distTypesCommandsPutItemCommandMod.PutItemCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientDynamodb.distTypesCommandsPutItemCommandMod.PutItemCommandOutput]
    }
    
    inline def QueryCommandOutput($metadata: ResponseMetadata): typings.awsSdkClientDynamodb.distTypesCommandsQueryCommandMod.QueryCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientDynamodb.distTypesCommandsQueryCommandMod.QueryCommandOutput]
    }
    
    inline def RestoreTableFromBackupCommandOutput($metadata: ResponseMetadata): typings.awsSdkClientDynamodb.distTypesCommandsRestoreTableFromBackupCommandMod.RestoreTableFromBackupCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientDynamodb.distTypesCommandsRestoreTableFromBackupCommandMod.RestoreTableFromBackupCommandOutput]
    }
    
    inline def RestoreTableToPointInTimeCommandOutput($metadata: ResponseMetadata): typings.awsSdkClientDynamodb.distTypesCommandsRestoreTableToPointInTimeCommandMod.RestoreTableToPointInTimeCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientDynamodb.distTypesCommandsRestoreTableToPointInTimeCommandMod.RestoreTableToPointInTimeCommandOutput]
    }
    
    inline def ScanCommandOutput($metadata: ResponseMetadata): typings.awsSdkClientDynamodb.distTypesCommandsScanCommandMod.ScanCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientDynamodb.distTypesCommandsScanCommandMod.ScanCommandOutput]
    }
    
    inline def TransactGetItemsCommandOutput($metadata: ResponseMetadata): typings.awsSdkClientDynamodb.distTypesCommandsTransactGetItemsCommandMod.TransactGetItemsCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientDynamodb.distTypesCommandsTransactGetItemsCommandMod.TransactGetItemsCommandOutput]
    }
    
    inline def TransactWriteItemsCommandOutput($metadata: ResponseMetadata): typings.awsSdkClientDynamodb.distTypesCommandsTransactWriteItemsCommandMod.TransactWriteItemsCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientDynamodb.distTypesCommandsTransactWriteItemsCommandMod.TransactWriteItemsCommandOutput]
    }
    
    inline def UpdateContinuousBackupsCommandOutput($metadata: ResponseMetadata): typings.awsSdkClientDynamodb.distTypesCommandsUpdateContinuousBackupsCommandMod.UpdateContinuousBackupsCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientDynamodb.distTypesCommandsUpdateContinuousBackupsCommandMod.UpdateContinuousBackupsCommandOutput]
    }
    
    inline def UpdateContributorInsightsCommandOutput($metadata: ResponseMetadata): typings.awsSdkClientDynamodb.distTypesCommandsUpdateContributorInsightsCommandMod.UpdateContributorInsightsCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientDynamodb.distTypesCommandsUpdateContributorInsightsCommandMod.UpdateContributorInsightsCommandOutput]
    }
    
    inline def UpdateGlobalTableCommandOutput($metadata: ResponseMetadata): typings.awsSdkClientDynamodb.distTypesCommandsUpdateGlobalTableCommandMod.UpdateGlobalTableCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientDynamodb.distTypesCommandsUpdateGlobalTableCommandMod.UpdateGlobalTableCommandOutput]
    }
    
    inline def UpdateGlobalTableSettingsCommandOutput($metadata: ResponseMetadata): typings.awsSdkClientDynamodb.distTypesCommandsUpdateGlobalTableSettingsCommandMod.UpdateGlobalTableSettingsCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientDynamodb.distTypesCommandsUpdateGlobalTableSettingsCommandMod.UpdateGlobalTableSettingsCommandOutput]
    }
    
    inline def UpdateItemCommandOutput($metadata: ResponseMetadata): typings.awsSdkClientDynamodb.distTypesCommandsUpdateItemCommandMod.UpdateItemCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientDynamodb.distTypesCommandsUpdateItemCommandMod.UpdateItemCommandOutput]
    }
    
    inline def UpdateTableCommandOutput($metadata: ResponseMetadata): typings.awsSdkClientDynamodb.distTypesCommandsUpdateTableCommandMod.UpdateTableCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientDynamodb.distTypesCommandsUpdateTableCommandMod.UpdateTableCommandOutput]
    }
    
    inline def UpdateTableReplicaAutoScalingCommandOutput($metadata: ResponseMetadata): typings.awsSdkClientDynamodb.distTypesCommandsUpdateTableReplicaAutoScalingCommandMod.UpdateTableReplicaAutoScalingCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientDynamodb.distTypesCommandsUpdateTableReplicaAutoScalingCommandMod.UpdateTableReplicaAutoScalingCommandOutput]
    }
    
    inline def UpdateTimeToLiveCommandOutput($metadata: ResponseMetadata): typings.awsSdkClientDynamodb.distTypesCommandsUpdateTimeToLiveCommandMod.UpdateTimeToLiveCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientDynamodb.distTypesCommandsUpdateTimeToLiveCommandMod.UpdateTimeToLiveCommandOutput]
    }
  }
}
