package typings.awsSdkClientCognitoIdentity

import org.scalablytyped.runtime.Instantiable1
import typings.awsSdkClientCognitoIdentity.distTypesCommandsCreateIdentityPoolCommandMod.CreateIdentityPoolCommandInput
import typings.awsSdkClientCognitoIdentity.distTypesCommandsDeleteIdentitiesCommandMod.DeleteIdentitiesCommandInput
import typings.awsSdkClientCognitoIdentity.distTypesCommandsDeleteIdentityPoolCommandMod.DeleteIdentityPoolCommandInput
import typings.awsSdkClientCognitoIdentity.distTypesCommandsDeleteIdentityPoolCommandMod.DeleteIdentityPoolCommandOutput
import typings.awsSdkClientCognitoIdentity.distTypesCommandsDescribeIdentityCommandMod.DescribeIdentityCommandInput
import typings.awsSdkClientCognitoIdentity.distTypesCommandsDescribeIdentityPoolCommandMod.DescribeIdentityPoolCommandInput
import typings.awsSdkClientCognitoIdentity.distTypesCommandsGetCredentialsForIdentityCommandMod.GetCredentialsForIdentityCommandInput
import typings.awsSdkClientCognitoIdentity.distTypesCommandsGetIdCommandMod.GetIdCommandInput
import typings.awsSdkClientCognitoIdentity.distTypesCommandsGetIdentityPoolRolesCommandMod.GetIdentityPoolRolesCommandInput
import typings.awsSdkClientCognitoIdentity.distTypesCommandsGetOpenIdTokenCommandMod.GetOpenIdTokenCommandInput
import typings.awsSdkClientCognitoIdentity.distTypesCommandsGetOpenIdTokenForDeveloperIdentityCommandMod.GetOpenIdTokenForDeveloperIdentityCommandInput
import typings.awsSdkClientCognitoIdentity.distTypesCommandsGetPrincipalTagAttributeMapCommandMod.GetPrincipalTagAttributeMapCommandInput
import typings.awsSdkClientCognitoIdentity.distTypesCommandsListIdentitiesCommandMod.ListIdentitiesCommandInput
import typings.awsSdkClientCognitoIdentity.distTypesCommandsListIdentityPoolsCommandMod.ListIdentityPoolsCommandInput
import typings.awsSdkClientCognitoIdentity.distTypesCommandsListTagsForResourceCommandMod.ListTagsForResourceCommandInput
import typings.awsSdkClientCognitoIdentity.distTypesCommandsLookupDeveloperIdentityCommandMod.LookupDeveloperIdentityCommandInput
import typings.awsSdkClientCognitoIdentity.distTypesCommandsMergeDeveloperIdentitiesCommandMod.MergeDeveloperIdentitiesCommandInput
import typings.awsSdkClientCognitoIdentity.distTypesCommandsSetIdentityPoolRolesCommandMod.SetIdentityPoolRolesCommandInput
import typings.awsSdkClientCognitoIdentity.distTypesCommandsSetIdentityPoolRolesCommandMod.SetIdentityPoolRolesCommandOutput
import typings.awsSdkClientCognitoIdentity.distTypesCommandsSetPrincipalTagAttributeMapCommandMod.SetPrincipalTagAttributeMapCommandInput
import typings.awsSdkClientCognitoIdentity.distTypesCommandsTagResourceCommandMod.TagResourceCommandInput
import typings.awsSdkClientCognitoIdentity.distTypesCommandsUnlinkDeveloperIdentityCommandMod.UnlinkDeveloperIdentityCommandInput
import typings.awsSdkClientCognitoIdentity.distTypesCommandsUnlinkDeveloperIdentityCommandMod.UnlinkDeveloperIdentityCommandOutput
import typings.awsSdkClientCognitoIdentity.distTypesCommandsUnlinkIdentityCommandMod.UnlinkIdentityCommandInput
import typings.awsSdkClientCognitoIdentity.distTypesCommandsUnlinkIdentityCommandMod.UnlinkIdentityCommandOutput
import typings.awsSdkClientCognitoIdentity.distTypesCommandsUntagResourceCommandMod.UntagResourceCommandInput
import typings.awsSdkClientCognitoIdentity.distTypesCommandsUpdateIdentityPoolCommandMod.UpdateIdentityPoolCommandInput
import typings.awsSdkClientCognitoIdentity.distTypesEndpointEndpointParametersMod.EndpointParameters
import typings.awsSdkProtocolHttp.distTypesHttpHandlerMod.HttpHandler
import typings.awsSdkSignatureV4.distTypesSignatureV4Mod.SignatureV4CryptoInit
import typings.awsSdkSignatureV4.distTypesSignatureV4Mod.SignatureV4Init
import typings.awsSdkSmithyClient.distTypesDefaultsModeMod.DefaultsMode
import typings.awsSdkSmithyClient.mod.Client
import typings.awsSdkTypes.anon.ForceRefresh
import typings.awsSdkTypes.distTypesAuthMod.AuthScheme
import typings.awsSdkTypes.distTypesCredentialsMod.Credentials
import typings.awsSdkTypes.distTypesCryptoMod.HashConstructor
import typings.awsSdkTypes.distTypesEndpointMod.EndpointV2
import typings.awsSdkTypes.distTypesHttpMod.Endpoint
import typings.awsSdkTypes.distTypesHttpMod.HttpHandlerOptions
import typings.awsSdkTypes.distTypesLoggerMod.Logger
import typings.awsSdkTypes.distTypesResponseMod.ResponseMetadata
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

object distTypesCognitoIdentityClientMod {
  
  @JSImport("@aws-sdk/client-cognito-identity/dist-types/CognitoIdentityClient", "CognitoIdentityClient")
  @js.native
  open class CognitoIdentityClient protected () extends Client[
          HttpHandlerOptions, 
          ServiceInputTypes, 
          ServiceOutputTypes, 
          CognitoIdentityClientResolvedConfig
        ] {
    def this(configuration: CognitoIdentityClientConfig) = this()
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
      * The {@link DefaultsMode} that will be used to determine how certain default configuration options are resolved in the SDK.
      */
    var defaultsMode: js.UndefOr[DefaultsMode | Provider[DefaultsMode]] = js.undefined
    
    /**
      * Disable dyanamically changing the endpoint of the client based on the hostPrefix
      * trait of an operation.
      */
    var disableHostPrefix: js.UndefOr[Boolean] = js.undefined
    
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
      * A constructor for a class implementing the {@link __Hash} interface
      * that computes the SHA-256 HMAC or checksum of a string or binary buffer.
      * @internal
      */
    var sha256: js.UndefOr[HashConstructor] = js.undefined
    
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
    
    extension [Self <: ClientDefaults](x: Self) {
      
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
      
      inline def setSha256(value: HashConstructor): Self = StObject.set(x, "sha256", value.asInstanceOf[js.Any])
      
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
  
  type CognitoIdentityClientConfig = CognitoIdentityClientConfigType
  
  /* Inlined std.Partial<@aws-sdk/smithy-client.@aws-sdk/smithy-client.SmithyConfiguration<@aws-sdk/types.@aws-sdk/types.HttpHandlerOptions>> & @aws-sdk/client-cognito-identity.@aws-sdk/client-cognito-identity/dist-types/CognitoIdentityClient.ClientDefaults & @aws-sdk/config-resolver.@aws-sdk/config-resolver.RegionInputConfig & @aws-sdk/middleware-endpoint.@aws-sdk/middleware-endpoint.EndpointInputConfig<@aws-sdk/client-cognito-identity.@aws-sdk/client-cognito-identity/dist-types/endpoint/EndpointParameters.EndpointParameters> & @aws-sdk/middleware-retry.@aws-sdk/middleware-retry.RetryInputConfig & @aws-sdk/middleware-host-header.@aws-sdk/middleware-host-header.HostHeaderInputConfig & @aws-sdk/middleware-signing.@aws-sdk/middleware-signing.AwsAuthInputConfig & @aws-sdk/middleware-user-agent.@aws-sdk/middleware-user-agent.UserAgentInputConfig & @aws-sdk/client-cognito-identity.@aws-sdk/client-cognito-identity/dist-types/endpoint/EndpointParameters.ClientInputEndpointParameters */
  trait CognitoIdentityClientConfigType extends StObject {
    
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
    var credentials: js.UndefOr[Credentials | Provider[Credentials]] = js.undefined
    
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
      * The {@link DefaultsMode} that will be used to determine how certain default configuration options are resolved in the SDK.
      */
    var defaultsMode: js.UndefOr[DefaultsMode | Provider[DefaultsMode]] = js.undefined
    
    /**
      * Disable dyanamically changing the endpoint of the client based on the hostPrefix
      * trait of an operation.
      */
    var disableHostPrefix: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The fully qualified endpoint of the webservice. This is only required when using
      * a custom endpoint (for example, when using a local version of S3).
      */
    var endpoint: (js.UndefOr[String | Endpoint | (Provider[Endpoint | EndpointV2]) | EndpointV2]) & (js.UndefOr[String | (Provider[Endpoint | EndpointV2 | String]) | Endpoint | EndpointV2])
    
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
    var requestHandler: (js.UndefOr[RequestHandler[Any, Any, HttpHandlerOptions]]) & js.UndefOr[HttpHandler]
    
    /**
      * Specifies which retry algorithm to use.
      */
    var retryMode: js.UndefOr[String | Provider[String]] = js.undefined
    
    /**
      * The strategy to retry the request. Using built-in exponential backoff strategy by default.
      */
    var retryStrategy: js.UndefOr[RetryStrategy] = js.undefined
    
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
      * A constructor for a class implementing the {@link __Hash} interface
      * that computes the SHA-256 HMAC or checksum of a string or binary buffer.
      * @internal
      */
    var sha256: js.UndefOr[HashConstructor] = js.undefined
    
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
  object CognitoIdentityClientConfigType {
    
    inline def apply(
      endpoint: (js.UndefOr[String | Endpoint | (Provider[Endpoint | EndpointV2]) | EndpointV2]) & (js.UndefOr[String | (Provider[Endpoint | EndpointV2 | String]) | Endpoint | EndpointV2]),
      requestHandler: (js.UndefOr[RequestHandler[Any, Any, HttpHandlerOptions]]) & js.UndefOr[HttpHandler]
    ): CognitoIdentityClientConfigType = {
      val __obj = js.Dynamic.literal(endpoint = endpoint.asInstanceOf[js.Any], requestHandler = requestHandler.asInstanceOf[js.Any])
      __obj.asInstanceOf[CognitoIdentityClientConfigType]
    }
    
    extension [Self <: CognitoIdentityClientConfigType](x: Self) {
      
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
      
      inline def setCredentials(value: Credentials | Provider[Credentials]): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
      
      inline def setCredentialsFunction0(value: () => js.Promise[Credentials]): Self = StObject.set(x, "credentials", js.Any.fromFunction0(value))
      
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
      
      inline def setEndpoint(
        value: (js.UndefOr[String | Endpoint | (Provider[Endpoint | EndpointV2]) | EndpointV2]) & (js.UndefOr[String | (Provider[Endpoint | EndpointV2 | String]) | Endpoint | EndpointV2])
      ): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
      
      inline def setEndpointProvider(
        value: (/* params */ EndpointParameters, /* context */ js.UndefOr[typings.awsSdkMiddlewareEndpoint.anon.Logger]) => EndpointV2
      ): Self = StObject.set(x, "endpointProvider", js.Any.fromFunction2(value))
      
      inline def setEndpointProviderUndefined: Self = StObject.set(x, "endpointProvider", js.undefined)
      
      inline def setLogger(value: Logger): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
      
      inline def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
      
      inline def setMaxAttempts(value: Double | Provider[Double]): Self = StObject.set(x, "maxAttempts", value.asInstanceOf[js.Any])
      
      inline def setMaxAttemptsFunction0(value: () => js.Promise[Double]): Self = StObject.set(x, "maxAttempts", js.Any.fromFunction0(value))
      
      inline def setMaxAttemptsUndefined: Self = StObject.set(x, "maxAttempts", js.undefined)
      
      inline def setRegion(value: String | Provider[String]): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      inline def setRegionFunction0(value: () => js.Promise[String]): Self = StObject.set(x, "region", js.Any.fromFunction0(value))
      
      inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
      
      inline def setRequestHandler(value: (js.UndefOr[RequestHandler[Any, Any, HttpHandlerOptions]]) & js.UndefOr[HttpHandler]): Self = StObject.set(x, "requestHandler", value.asInstanceOf[js.Any])
      
      inline def setRetryMode(value: String | Provider[String]): Self = StObject.set(x, "retryMode", value.asInstanceOf[js.Any])
      
      inline def setRetryModeFunction0(value: () => js.Promise[String]): Self = StObject.set(x, "retryMode", js.Any.fromFunction0(value))
      
      inline def setRetryModeUndefined: Self = StObject.set(x, "retryMode", js.undefined)
      
      inline def setRetryStrategy(value: RetryStrategy): Self = StObject.set(x, "retryStrategy", value.asInstanceOf[js.Any])
      
      inline def setRetryStrategyUndefined: Self = StObject.set(x, "retryStrategy", js.undefined)
      
      inline def setRuntime(value: String): Self = StObject.set(x, "runtime", value.asInstanceOf[js.Any])
      
      inline def setRuntimeUndefined: Self = StObject.set(x, "runtime", js.undefined)
      
      inline def setServiceId(value: String): Self = StObject.set(x, "serviceId", value.asInstanceOf[js.Any])
      
      inline def setServiceIdUndefined: Self = StObject.set(x, "serviceId", js.undefined)
      
      inline def setSha256(value: HashConstructor): Self = StObject.set(x, "sha256", value.asInstanceOf[js.Any])
      
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
  
  type CognitoIdentityClientResolvedConfig = CognitoIdentityClientResolvedConfigType
  
  /* Inlined @aws-sdk/smithy-client.@aws-sdk/smithy-client.SmithyResolvedConfiguration<@aws-sdk/types.@aws-sdk/types.HttpHandlerOptions> & std.Required<@aws-sdk/client-cognito-identity.@aws-sdk/client-cognito-identity/dist-types/CognitoIdentityClient.ClientDefaults> & @aws-sdk/config-resolver.@aws-sdk/config-resolver.RegionResolvedConfig & @aws-sdk/middleware-endpoint.@aws-sdk/middleware-endpoint.EndpointResolvedConfig<@aws-sdk/client-cognito-identity.@aws-sdk/client-cognito-identity/dist-types/endpoint/EndpointParameters.EndpointParameters> & @aws-sdk/middleware-retry.@aws-sdk/middleware-retry.RetryResolvedConfig & @aws-sdk/middleware-host-header.@aws-sdk/middleware-host-header.HostHeaderResolvedConfig & @aws-sdk/middleware-signing.@aws-sdk/middleware-signing.AwsAuthResolvedConfig & @aws-sdk/middleware-user-agent.@aws-sdk/middleware-user-agent.UserAgentResolvedConfig & @aws-sdk/client-cognito-identity.@aws-sdk/client-cognito-identity/dist-types/endpoint/EndpointParameters.ClientResolvedEndpointParameters */
  @js.native
  trait CognitoIdentityClientResolvedConfigType extends StObject {
    
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
    def credentials(): js.Promise[Credentials] = js.native
    def credentials(options: ForceRefresh): js.Promise[Credentials] = js.native
    /**
      * Resolved value for input config {@link AwsAuthInputConfig.credentials}
      * This provider MAY memoize the loaded credentials for certain period.
      * See {@link MemoizedProvider} for more information.
      */
    @JSName("credentials")
    var credentials_Original: MemoizedProvider[Credentials] = js.native
    
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
      *
      * As of endpoints 2.0, this config method can not be used to resolve
      * the endpoint for a service and region.
      *
      * @see https://github.com/aws/aws-sdk-js-v3/issues/4122
      * @deprecated Use {@link EndpointResolvedConfig.endpointProvider} instead.
      */
    var endpoint: js.UndefOr[Provider[Endpoint]] & (js.UndefOr[String | (Provider[Endpoint | EndpointV2 | String]) | Endpoint | EndpointV2]) = js.native
    
    def endpointProvider(params: EndpointParameters): EndpointV2 = js.native
    def endpointProvider(params: EndpointParameters, context: typings.awsSdkMiddlewareEndpoint.anon.Logger): EndpointV2 = js.native
    
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
    var maxAttempts_Original: (Double | Provider[Double]) & Provider[Double] = js.native
    
    /**
      * Resolved value for input config {@link RegionInputConfig.region}
      */
    def region(): js.Promise[String] = js.native
    /**
      * Resolved value for input config {@link RegionInputConfig.region}
      */
    @JSName("region")
    var region_Original: (String | Provider[String]) & Provider[String] & (js.UndefOr[String | Provider[String]]) = js.native
    
    /**
      * The HTTP handler to use. Fetch in browser and Https in Nodejs.
      */
    var requestHandler: (RequestHandler[Any, Any, HttpHandlerOptions]) & HttpHandler & (RequestHandler[Any, Any, js.Object]) = js.native
    
    var retryMode: String | Provider[String] = js.native
    
    /**
      * Resolved value for input config {@link RetryInputConfig.retryStrategy}
      */
    def retryStrategy(): js.Promise[RetryStrategy] = js.native
    /**
      * Resolved value for input config {@link RetryInputConfig.retryStrategy}
      */
    @JSName("retryStrategy")
    var retryStrategy_Original: Provider[RetryStrategy] = js.native
    
    /**
      * The runtime environment
      */
    var runtime: String = js.native
    
    var serviceId: String = js.native
    
    var sha256: HashConstructor = js.native
    
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
    var useDualstackEndpoint_Original: (Boolean | Provider[Boolean]) & Provider[Boolean] & (js.UndefOr[Boolean | Provider[Boolean]]) = js.native
    
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
    var useFipsEndpoint_Original: (Boolean | Provider[Boolean]) & Provider[Boolean] & (js.UndefOr[Boolean | Provider[Boolean]]) = js.native
    
    def utf8Decoder(input: String): js.typedarray.Uint8Array = js.native
    @JSName("utf8Decoder")
    var utf8Decoder_Original: Decoder = js.native
    
    def utf8Encoder(input: js.typedarray.Uint8Array): String = js.native
    @JSName("utf8Encoder")
    var utf8Encoder_Original: Encoder = js.native
  }
  
  type ServiceInputTypes = CreateIdentityPoolCommandInput | DeleteIdentitiesCommandInput | DeleteIdentityPoolCommandInput | DescribeIdentityCommandInput | DescribeIdentityPoolCommandInput | GetCredentialsForIdentityCommandInput | GetIdCommandInput | GetIdentityPoolRolesCommandInput | GetOpenIdTokenCommandInput | GetOpenIdTokenForDeveloperIdentityCommandInput | GetPrincipalTagAttributeMapCommandInput | ListIdentitiesCommandInput | ListIdentityPoolsCommandInput | ListTagsForResourceCommandInput | LookupDeveloperIdentityCommandInput | MergeDeveloperIdentitiesCommandInput | SetIdentityPoolRolesCommandInput | SetPrincipalTagAttributeMapCommandInput | TagResourceCommandInput | UnlinkDeveloperIdentityCommandInput | UnlinkIdentityCommandInput | UntagResourceCommandInput | UpdateIdentityPoolCommandInput
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdkClientCognitoIdentity.distTypesCommandsCreateIdentityPoolCommandMod.CreateIdentityPoolCommandOutput
    - typings.awsSdkClientCognitoIdentity.distTypesCommandsDeleteIdentitiesCommandMod.DeleteIdentitiesCommandOutput
    - typings.awsSdkClientCognitoIdentity.distTypesCommandsDeleteIdentityPoolCommandMod.DeleteIdentityPoolCommandOutput
    - typings.awsSdkClientCognitoIdentity.distTypesCommandsDescribeIdentityCommandMod.DescribeIdentityCommandOutput
    - typings.awsSdkClientCognitoIdentity.distTypesCommandsDescribeIdentityPoolCommandMod.DescribeIdentityPoolCommandOutput
    - typings.awsSdkClientCognitoIdentity.distTypesCommandsGetCredentialsForIdentityCommandMod.GetCredentialsForIdentityCommandOutput
    - typings.awsSdkClientCognitoIdentity.distTypesCommandsGetIdCommandMod.GetIdCommandOutput
    - typings.awsSdkClientCognitoIdentity.distTypesCommandsGetIdentityPoolRolesCommandMod.GetIdentityPoolRolesCommandOutput
    - typings.awsSdkClientCognitoIdentity.distTypesCommandsGetOpenIdTokenCommandMod.GetOpenIdTokenCommandOutput
    - typings.awsSdkClientCognitoIdentity.distTypesCommandsGetOpenIdTokenForDeveloperIdentityCommandMod.GetOpenIdTokenForDeveloperIdentityCommandOutput
    - typings.awsSdkClientCognitoIdentity.distTypesCommandsGetPrincipalTagAttributeMapCommandMod.GetPrincipalTagAttributeMapCommandOutput
    - typings.awsSdkClientCognitoIdentity.distTypesCommandsListIdentitiesCommandMod.ListIdentitiesCommandOutput
    - typings.awsSdkClientCognitoIdentity.distTypesCommandsListIdentityPoolsCommandMod.ListIdentityPoolsCommandOutput
    - typings.awsSdkClientCognitoIdentity.distTypesCommandsListTagsForResourceCommandMod.ListTagsForResourceCommandOutput
    - typings.awsSdkClientCognitoIdentity.distTypesCommandsLookupDeveloperIdentityCommandMod.LookupDeveloperIdentityCommandOutput
    - typings.awsSdkClientCognitoIdentity.distTypesCommandsMergeDeveloperIdentitiesCommandMod.MergeDeveloperIdentitiesCommandOutput
    - typings.awsSdkClientCognitoIdentity.distTypesCommandsSetIdentityPoolRolesCommandMod.SetIdentityPoolRolesCommandOutput
    - typings.awsSdkClientCognitoIdentity.distTypesCommandsSetPrincipalTagAttributeMapCommandMod.SetPrincipalTagAttributeMapCommandOutput
    - typings.awsSdkClientCognitoIdentity.distTypesCommandsTagResourceCommandMod.TagResourceCommandOutput
    - typings.awsSdkClientCognitoIdentity.distTypesCommandsUnlinkDeveloperIdentityCommandMod.UnlinkDeveloperIdentityCommandOutput
    - typings.awsSdkClientCognitoIdentity.distTypesCommandsUnlinkIdentityCommandMod.UnlinkIdentityCommandOutput
    - typings.awsSdkClientCognitoIdentity.distTypesCommandsUntagResourceCommandMod.UntagResourceCommandOutput
    - typings.awsSdkClientCognitoIdentity.distTypesCommandsUpdateIdentityPoolCommandMod.UpdateIdentityPoolCommandOutput
  */
  type ServiceOutputTypes = _ServiceOutputTypes | DeleteIdentityPoolCommandOutput | SetIdentityPoolRolesCommandOutput | UnlinkDeveloperIdentityCommandOutput | UnlinkIdentityCommandOutput
  
  trait _ServiceOutputTypes extends StObject
  object _ServiceOutputTypes {
    
    inline def CreateIdentityPoolCommandOutput($metadata: ResponseMetadata): typings.awsSdkClientCognitoIdentity.distTypesCommandsCreateIdentityPoolCommandMod.CreateIdentityPoolCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientCognitoIdentity.distTypesCommandsCreateIdentityPoolCommandMod.CreateIdentityPoolCommandOutput]
    }
    
    inline def DeleteIdentitiesCommandOutput($metadata: ResponseMetadata): typings.awsSdkClientCognitoIdentity.distTypesCommandsDeleteIdentitiesCommandMod.DeleteIdentitiesCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientCognitoIdentity.distTypesCommandsDeleteIdentitiesCommandMod.DeleteIdentitiesCommandOutput]
    }
    
    inline def DescribeIdentityCommandOutput($metadata: ResponseMetadata): typings.awsSdkClientCognitoIdentity.distTypesCommandsDescribeIdentityCommandMod.DescribeIdentityCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientCognitoIdentity.distTypesCommandsDescribeIdentityCommandMod.DescribeIdentityCommandOutput]
    }
    
    inline def DescribeIdentityPoolCommandOutput($metadata: ResponseMetadata): typings.awsSdkClientCognitoIdentity.distTypesCommandsDescribeIdentityPoolCommandMod.DescribeIdentityPoolCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientCognitoIdentity.distTypesCommandsDescribeIdentityPoolCommandMod.DescribeIdentityPoolCommandOutput]
    }
    
    inline def GetCredentialsForIdentityCommandOutput($metadata: ResponseMetadata): typings.awsSdkClientCognitoIdentity.distTypesCommandsGetCredentialsForIdentityCommandMod.GetCredentialsForIdentityCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientCognitoIdentity.distTypesCommandsGetCredentialsForIdentityCommandMod.GetCredentialsForIdentityCommandOutput]
    }
    
    inline def GetIdCommandOutput($metadata: ResponseMetadata): typings.awsSdkClientCognitoIdentity.distTypesCommandsGetIdCommandMod.GetIdCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientCognitoIdentity.distTypesCommandsGetIdCommandMod.GetIdCommandOutput]
    }
    
    inline def GetIdentityPoolRolesCommandOutput($metadata: ResponseMetadata): typings.awsSdkClientCognitoIdentity.distTypesCommandsGetIdentityPoolRolesCommandMod.GetIdentityPoolRolesCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientCognitoIdentity.distTypesCommandsGetIdentityPoolRolesCommandMod.GetIdentityPoolRolesCommandOutput]
    }
    
    inline def GetOpenIdTokenCommandOutput($metadata: ResponseMetadata): typings.awsSdkClientCognitoIdentity.distTypesCommandsGetOpenIdTokenCommandMod.GetOpenIdTokenCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientCognitoIdentity.distTypesCommandsGetOpenIdTokenCommandMod.GetOpenIdTokenCommandOutput]
    }
    
    inline def GetOpenIdTokenForDeveloperIdentityCommandOutput($metadata: ResponseMetadata): typings.awsSdkClientCognitoIdentity.distTypesCommandsGetOpenIdTokenForDeveloperIdentityCommandMod.GetOpenIdTokenForDeveloperIdentityCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientCognitoIdentity.distTypesCommandsGetOpenIdTokenForDeveloperIdentityCommandMod.GetOpenIdTokenForDeveloperIdentityCommandOutput]
    }
    
    inline def GetPrincipalTagAttributeMapCommandOutput($metadata: ResponseMetadata): typings.awsSdkClientCognitoIdentity.distTypesCommandsGetPrincipalTagAttributeMapCommandMod.GetPrincipalTagAttributeMapCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientCognitoIdentity.distTypesCommandsGetPrincipalTagAttributeMapCommandMod.GetPrincipalTagAttributeMapCommandOutput]
    }
    
    inline def ListIdentitiesCommandOutput($metadata: ResponseMetadata): typings.awsSdkClientCognitoIdentity.distTypesCommandsListIdentitiesCommandMod.ListIdentitiesCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientCognitoIdentity.distTypesCommandsListIdentitiesCommandMod.ListIdentitiesCommandOutput]
    }
    
    inline def ListIdentityPoolsCommandOutput($metadata: ResponseMetadata): typings.awsSdkClientCognitoIdentity.distTypesCommandsListIdentityPoolsCommandMod.ListIdentityPoolsCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientCognitoIdentity.distTypesCommandsListIdentityPoolsCommandMod.ListIdentityPoolsCommandOutput]
    }
    
    inline def ListTagsForResourceCommandOutput($metadata: ResponseMetadata): typings.awsSdkClientCognitoIdentity.distTypesCommandsListTagsForResourceCommandMod.ListTagsForResourceCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientCognitoIdentity.distTypesCommandsListTagsForResourceCommandMod.ListTagsForResourceCommandOutput]
    }
    
    inline def LookupDeveloperIdentityCommandOutput($metadata: ResponseMetadata): typings.awsSdkClientCognitoIdentity.distTypesCommandsLookupDeveloperIdentityCommandMod.LookupDeveloperIdentityCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientCognitoIdentity.distTypesCommandsLookupDeveloperIdentityCommandMod.LookupDeveloperIdentityCommandOutput]
    }
    
    inline def MergeDeveloperIdentitiesCommandOutput($metadata: ResponseMetadata): typings.awsSdkClientCognitoIdentity.distTypesCommandsMergeDeveloperIdentitiesCommandMod.MergeDeveloperIdentitiesCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientCognitoIdentity.distTypesCommandsMergeDeveloperIdentitiesCommandMod.MergeDeveloperIdentitiesCommandOutput]
    }
    
    inline def SetPrincipalTagAttributeMapCommandOutput($metadata: ResponseMetadata): typings.awsSdkClientCognitoIdentity.distTypesCommandsSetPrincipalTagAttributeMapCommandMod.SetPrincipalTagAttributeMapCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientCognitoIdentity.distTypesCommandsSetPrincipalTagAttributeMapCommandMod.SetPrincipalTagAttributeMapCommandOutput]
    }
    
    inline def TagResourceCommandOutput($metadata: ResponseMetadata): typings.awsSdkClientCognitoIdentity.distTypesCommandsTagResourceCommandMod.TagResourceCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientCognitoIdentity.distTypesCommandsTagResourceCommandMod.TagResourceCommandOutput]
    }
    
    inline def UntagResourceCommandOutput($metadata: ResponseMetadata): typings.awsSdkClientCognitoIdentity.distTypesCommandsUntagResourceCommandMod.UntagResourceCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientCognitoIdentity.distTypesCommandsUntagResourceCommandMod.UntagResourceCommandOutput]
    }
    
    inline def UpdateIdentityPoolCommandOutput($metadata: ResponseMetadata): typings.awsSdkClientCognitoIdentity.distTypesCommandsUpdateIdentityPoolCommandMod.UpdateIdentityPoolCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientCognitoIdentity.distTypesCommandsUpdateIdentityPoolCommandMod.UpdateIdentityPoolCommandOutput]
    }
  }
}
