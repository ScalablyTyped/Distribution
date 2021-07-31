package typings.awsSdkClientCognitoIdentity

import typings.awsSdkClientCognitoIdentity.createIdentityPoolCommandMod.CreateIdentityPoolCommandInput
import typings.awsSdkClientCognitoIdentity.deleteIdentitiesCommandMod.DeleteIdentitiesCommandInput
import typings.awsSdkClientCognitoIdentity.deleteIdentityPoolCommandMod.DeleteIdentityPoolCommandInput
import typings.awsSdkClientCognitoIdentity.deleteIdentityPoolCommandMod.DeleteIdentityPoolCommandOutput
import typings.awsSdkClientCognitoIdentity.describeIdentityCommandMod.DescribeIdentityCommandInput
import typings.awsSdkClientCognitoIdentity.describeIdentityPoolCommandMod.DescribeIdentityPoolCommandInput
import typings.awsSdkClientCognitoIdentity.getCredentialsForIdentityCommandMod.GetCredentialsForIdentityCommandInput
import typings.awsSdkClientCognitoIdentity.getIdCommandMod.GetIdCommandInput
import typings.awsSdkClientCognitoIdentity.getIdentityPoolRolesCommandMod.GetIdentityPoolRolesCommandInput
import typings.awsSdkClientCognitoIdentity.getOpenIdTokenCommandMod.GetOpenIdTokenCommandInput
import typings.awsSdkClientCognitoIdentity.getOpenIdTokenForDeveloperIdentityCommandMod.GetOpenIdTokenForDeveloperIdentityCommandInput
import typings.awsSdkClientCognitoIdentity.listIdentitiesCommandMod.ListIdentitiesCommandInput
import typings.awsSdkClientCognitoIdentity.listIdentityPoolsCommandMod.ListIdentityPoolsCommandInput
import typings.awsSdkClientCognitoIdentity.listTagsForResourceCommandMod.ListTagsForResourceCommandInput
import typings.awsSdkClientCognitoIdentity.lookupDeveloperIdentityCommandMod.LookupDeveloperIdentityCommandInput
import typings.awsSdkClientCognitoIdentity.mergeDeveloperIdentitiesCommandMod.MergeDeveloperIdentitiesCommandInput
import typings.awsSdkClientCognitoIdentity.setIdentityPoolRolesCommandMod.SetIdentityPoolRolesCommandInput
import typings.awsSdkClientCognitoIdentity.setIdentityPoolRolesCommandMod.SetIdentityPoolRolesCommandOutput
import typings.awsSdkClientCognitoIdentity.tagResourceCommandMod.TagResourceCommandInput
import typings.awsSdkClientCognitoIdentity.unlinkDeveloperIdentityCommandMod.UnlinkDeveloperIdentityCommandInput
import typings.awsSdkClientCognitoIdentity.unlinkDeveloperIdentityCommandMod.UnlinkDeveloperIdentityCommandOutput
import typings.awsSdkClientCognitoIdentity.unlinkIdentityCommandMod.UnlinkIdentityCommandInput
import typings.awsSdkClientCognitoIdentity.unlinkIdentityCommandMod.UnlinkIdentityCommandOutput
import typings.awsSdkClientCognitoIdentity.untagResourceCommandMod.UntagResourceCommandInput
import typings.awsSdkClientCognitoIdentity.updateIdentityPoolCommandMod.UpdateIdentityPoolCommandInput
import typings.awsSdkProtocolHttp.httpHandlerMod.HttpHandler
import typings.awsSdkSmithyClient.mod.Client
import typings.awsSdkTypes.credentialsMod.Credentials
import typings.awsSdkTypes.cryptoMod.HashConstructor
import typings.awsSdkTypes.httpMod.Endpoint
import typings.awsSdkTypes.httpMod.HttpHandlerOptions
import typings.awsSdkTypes.loggerMod.Logger
import typings.awsSdkTypes.responseMod.ResponseMetadata
import typings.awsSdkTypes.serdeMod.StreamCollector
import typings.awsSdkTypes.signatureMod.RequestSigner
import typings.awsSdkTypes.transferMod.RequestHandler
import typings.awsSdkTypes.utilMod.Decoder
import typings.awsSdkTypes.utilMod.Encoder
import typings.awsSdkTypes.utilMod.Provider
import typings.awsSdkTypes.utilMod.RegionInfo
import typings.awsSdkTypes.utilMod.RegionInfoProvider
import typings.awsSdkTypes.utilMod.RetryStrategy
import typings.awsSdkTypes.utilMod.UrlParser
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cognitoIdentityClientMod {
  
  @JSImport("@aws-sdk/client-cognito-identity/types/CognitoIdentityClient", "CognitoIdentityClient")
  @js.native
  class CognitoIdentityClient protected () extends Client[
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
      * The function that will be used to convert a base64-encoded string to a byte array
      */
    var base64Decoder: js.UndefOr[Decoder] = js.undefined
    
    /**
      * The function that will be used to convert binary data to a base64-encoded string
      */
    var base64Encoder: js.UndefOr[Encoder] = js.undefined
    
    /**
      * A function that can calculate the length of a request body.
      */
    var bodyLengthChecker: js.UndefOr[js.Function1[/* body */ js.Any, js.UndefOr[Double]]] = js.undefined
    
    /**
      * Default credentials provider; Not available in browser runtime
      */
    var credentialDefaultProvider: js.UndefOr[js.Function1[/* input */ js.Any, Provider[Credentials]]] = js.undefined
    
    /**
      * The string that will be used to populate default value in 'User-Agent' header
      */
    var defaultUserAgent: js.UndefOr[String] = js.undefined
    
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
      * Fetch related hostname, signing name or signing region with given region.
      */
    var regionInfoProvider: js.UndefOr[RegionInfoProvider] = js.undefined
    
    /**
      * The HTTP handler to use. Fetch in browser and Https in Nodejs.
      */
    var requestHandler: js.UndefOr[HttpHandler] = js.undefined
    
    /**
      * The runtime environment
      */
    var runtime: js.UndefOr[String] = js.undefined
    
    /**
      * A constructor for a class implementing the @aws-sdk/types.Hash interface
      * that computes the SHA-256 HMAC or checksum of a string or binary buffer.
      */
    var sha256: js.UndefOr[HashConstructor] = js.undefined
    
    /**
      * The service name with which to sign requests.
      */
    var signingName: js.UndefOr[String] = js.undefined
    
    /**
      * A function that converts a stream into an array of bytes.
      */
    var streamCollector: js.UndefOr[StreamCollector] = js.undefined
    
    /**
      * The function that will be used to convert strings into HTTP endpoints.
      */
    var urlParser: js.UndefOr[UrlParser] = js.undefined
    
    /**
      * The function that will be used to convert a UTF8-encoded string to a byte array
      */
    var utf8Decoder: js.UndefOr[Decoder] = js.undefined
    
    /**
      * The function that will be used to convert binary data to a UTF-8 encoded string
      */
    var utf8Encoder: js.UndefOr[Encoder] = js.undefined
  }
  object ClientDefaults {
    
    @scala.inline
    def apply(): ClientDefaults = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClientDefaults]
    }
    
    @scala.inline
    implicit class ClientDefaultsMutableBuilder[Self <: ClientDefaults] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApiVersion(value: String): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
      
      @scala.inline
      def setBase64Decoder(value: /* input */ String => Uint8Array): Self = StObject.set(x, "base64Decoder", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBase64DecoderUndefined: Self = StObject.set(x, "base64Decoder", js.undefined)
      
      @scala.inline
      def setBase64Encoder(value: /* input */ Uint8Array => String): Self = StObject.set(x, "base64Encoder", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBase64EncoderUndefined: Self = StObject.set(x, "base64Encoder", js.undefined)
      
      @scala.inline
      def setBodyLengthChecker(value: /* body */ js.Any => js.UndefOr[Double]): Self = StObject.set(x, "bodyLengthChecker", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBodyLengthCheckerUndefined: Self = StObject.set(x, "bodyLengthChecker", js.undefined)
      
      @scala.inline
      def setCredentialDefaultProvider(value: /* input */ js.Any => Provider[Credentials]): Self = StObject.set(x, "credentialDefaultProvider", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCredentialDefaultProviderUndefined: Self = StObject.set(x, "credentialDefaultProvider", js.undefined)
      
      @scala.inline
      def setDefaultUserAgent(value: String): Self = StObject.set(x, "defaultUserAgent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultUserAgentUndefined: Self = StObject.set(x, "defaultUserAgent", js.undefined)
      
      @scala.inline
      def setDisableHostPrefix(value: Boolean): Self = StObject.set(x, "disableHostPrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableHostPrefixUndefined: Self = StObject.set(x, "disableHostPrefix", js.undefined)
      
      @scala.inline
      def setLogger(value: Logger): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
      
      @scala.inline
      def setMaxAttempts(value: Double | Provider[Double]): Self = StObject.set(x, "maxAttempts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxAttemptsFunction0(value: () => js.Promise[Double]): Self = StObject.set(x, "maxAttempts", js.Any.fromFunction0(value))
      
      @scala.inline
      def setMaxAttemptsUndefined: Self = StObject.set(x, "maxAttempts", js.undefined)
      
      @scala.inline
      def setRegion(value: String | Provider[String]): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegionFunction0(value: () => js.Promise[String]): Self = StObject.set(x, "region", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRegionInfoProvider(
        value: (/* region */ String, /* options */ js.UndefOr[js.Any]) => js.Promise[js.UndefOr[RegionInfo]]
      ): Self = StObject.set(x, "regionInfoProvider", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRegionInfoProviderUndefined: Self = StObject.set(x, "regionInfoProvider", js.undefined)
      
      @scala.inline
      def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
      
      @scala.inline
      def setRequestHandler(value: HttpHandler): Self = StObject.set(x, "requestHandler", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestHandlerUndefined: Self = StObject.set(x, "requestHandler", js.undefined)
      
      @scala.inline
      def setRuntime(value: String): Self = StObject.set(x, "runtime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRuntimeUndefined: Self = StObject.set(x, "runtime", js.undefined)
      
      @scala.inline
      def setSha256(value: HashConstructor): Self = StObject.set(x, "sha256", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSha256Undefined: Self = StObject.set(x, "sha256", js.undefined)
      
      @scala.inline
      def setSigningName(value: String): Self = StObject.set(x, "signingName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSigningNameUndefined: Self = StObject.set(x, "signingName", js.undefined)
      
      @scala.inline
      def setStreamCollector(value: /* stream */ js.Any => js.Promise[Uint8Array]): Self = StObject.set(x, "streamCollector", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStreamCollectorUndefined: Self = StObject.set(x, "streamCollector", js.undefined)
      
      @scala.inline
      def setUrlParser(value: /* url */ String => Endpoint): Self = StObject.set(x, "urlParser", js.Any.fromFunction1(value))
      
      @scala.inline
      def setUrlParserUndefined: Self = StObject.set(x, "urlParser", js.undefined)
      
      @scala.inline
      def setUtf8Decoder(value: /* input */ String => Uint8Array): Self = StObject.set(x, "utf8Decoder", js.Any.fromFunction1(value))
      
      @scala.inline
      def setUtf8DecoderUndefined: Self = StObject.set(x, "utf8Decoder", js.undefined)
      
      @scala.inline
      def setUtf8Encoder(value: /* input */ Uint8Array => String): Self = StObject.set(x, "utf8Encoder", js.Any.fromFunction1(value))
      
      @scala.inline
      def setUtf8EncoderUndefined: Self = StObject.set(x, "utf8Encoder", js.undefined)
    }
  }
  
  /* Inlined std.Partial<@aws-sdk/smithy-client.@aws-sdk/smithy-client.SmithyConfiguration<@aws-sdk/types.@aws-sdk/types.HttpHandlerOptions>> & @aws-sdk/client-cognito-identity.@aws-sdk/client-cognito-identity/types/CognitoIdentityClient.ClientDefaults & @aws-sdk/config-resolver.@aws-sdk/config-resolver.RegionInputConfig & @aws-sdk/config-resolver.@aws-sdk/config-resolver.EndpointsInputConfig & @aws-sdk/middleware-signing.@aws-sdk/middleware-signing.AwsAuthInputConfig & @aws-sdk/middleware-retry.@aws-sdk/middleware-retry.RetryInputConfig & @aws-sdk/middleware-user-agent.@aws-sdk/middleware-user-agent.UserAgentInputConfig & @aws-sdk/middleware-host-header.@aws-sdk/middleware-host-header.HostHeaderInputConfig */
  trait CognitoIdentityClientConfig extends StObject {
    
    var apiVersion: js.UndefOr[String] = js.undefined
    
    /**
      * The function that will be used to convert a base64-encoded string to a byte array
      */
    var base64Decoder: js.UndefOr[Decoder] = js.undefined
    
    /**
      * The function that will be used to convert binary data to a base64-encoded string
      */
    var base64Encoder: js.UndefOr[Encoder] = js.undefined
    
    /**
      * A function that can calculate the length of a request body.
      */
    var bodyLengthChecker: js.UndefOr[js.Function1[/* body */ js.Any, js.UndefOr[Double]]] = js.undefined
    
    /**
      * Default credentials provider; Not available in browser runtime
      */
    var credentialDefaultProvider: js.UndefOr[js.Function1[/* input */ js.Any, Provider[Credentials]]] = js.undefined
    
    /**
      * The credentials used to sign requests.
      */
    var credentials: js.UndefOr[Credentials | Provider[Credentials]] = js.undefined
    
    /**
      * The custom user agent header that would be appended to default one
      */
    var customUserAgent: js.UndefOr[String] = js.undefined
    
    /**
      * The string that will be used to populate default value in 'User-Agent' header
      */
    var defaultUserAgent: js.UndefOr[String] = js.undefined
    
    /**
      * Disable dyanamically changing the endpoint of the client based on the hostPrefix
      * trait of an operation.
      */
    var disableHostPrefix: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The fully qualified endpoint of the webservice. This is only required when using a custom endpoint (for example, when using a local version of S3).
      */
    var endpoint: js.UndefOr[String | Endpoint | Provider[Endpoint]] = js.undefined
    
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
      * Fetch related hostname, signing name or signing region with given region.
      */
    var regionInfoProvider: js.UndefOr[RegionInfoProvider] = js.undefined
    
    /**
      * The HTTP handler to use. Fetch in browser and Https in Nodejs.
      */
    var requestHandler: (js.UndefOr[RequestHandler[js.Any, js.Any, HttpHandlerOptions]]) & js.UndefOr[HttpHandler]
    
    /**
      * The strategy to retry the request. Using built-in exponential backoff strategy by default.
      */
    var retryStrategy: js.UndefOr[RetryStrategy] = js.undefined
    
    /**
      * The runtime environment
      */
    var runtime: js.UndefOr[String] = js.undefined
    
    /**
      * A constructor for a class implementing the @aws-sdk/types.Hash interface
      * that computes the SHA-256 HMAC or checksum of a string or binary buffer.
      */
    var sha256: js.UndefOr[HashConstructor] = js.undefined
    
    /**
      * The signer to use when signing requests.
      */
    var signer: js.UndefOr[RequestSigner | Provider[RequestSigner]] = js.undefined
    
    /**
      * Whether to escape request path when signing the request.
      */
    var signingEscapePath: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The service name with which to sign requests.
      */
    var signingName: js.UndefOr[String] = js.undefined
    
    /**
      * The region where you want to sign your request against. This
      * can be different to the region in the endpoint.
      */
    var signingRegion: js.UndefOr[String] = js.undefined
    
    /**
      * A function that converts a stream into an array of bytes.
      */
    var streamCollector: js.UndefOr[StreamCollector] = js.undefined
    
    /**
      * An offset value in milliseconds to apply to all signing times.
      */
    var systemClockOffset: js.UndefOr[Double] = js.undefined
    
    /**
      * Whether TLS is enabled for requests.
      */
    var tls: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The function that will be used to convert strings into HTTP endpoints.
      */
    var urlParser: js.UndefOr[UrlParser] = js.undefined
    
    /**
      * The function that will be used to convert a UTF8-encoded string to a byte array
      */
    var utf8Decoder: js.UndefOr[Decoder] = js.undefined
    
    /**
      * The function that will be used to convert binary data to a UTF-8 encoded string
      */
    var utf8Encoder: js.UndefOr[Encoder] = js.undefined
  }
  object CognitoIdentityClientConfig {
    
    @scala.inline
    def apply(
      requestHandler: (js.UndefOr[RequestHandler[js.Any, js.Any, HttpHandlerOptions]]) & js.UndefOr[HttpHandler]
    ): CognitoIdentityClientConfig = {
      val __obj = js.Dynamic.literal(requestHandler = requestHandler.asInstanceOf[js.Any])
      __obj.asInstanceOf[CognitoIdentityClientConfig]
    }
    
    @scala.inline
    implicit class CognitoIdentityClientConfigMutableBuilder[Self <: CognitoIdentityClientConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApiVersion(value: String): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
      
      @scala.inline
      def setBase64Decoder(value: /* input */ String => Uint8Array): Self = StObject.set(x, "base64Decoder", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBase64DecoderUndefined: Self = StObject.set(x, "base64Decoder", js.undefined)
      
      @scala.inline
      def setBase64Encoder(value: /* input */ Uint8Array => String): Self = StObject.set(x, "base64Encoder", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBase64EncoderUndefined: Self = StObject.set(x, "base64Encoder", js.undefined)
      
      @scala.inline
      def setBodyLengthChecker(value: /* body */ js.Any => js.UndefOr[Double]): Self = StObject.set(x, "bodyLengthChecker", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBodyLengthCheckerUndefined: Self = StObject.set(x, "bodyLengthChecker", js.undefined)
      
      @scala.inline
      def setCredentialDefaultProvider(value: /* input */ js.Any => Provider[Credentials]): Self = StObject.set(x, "credentialDefaultProvider", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCredentialDefaultProviderUndefined: Self = StObject.set(x, "credentialDefaultProvider", js.undefined)
      
      @scala.inline
      def setCredentials(value: Credentials | Provider[Credentials]): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCredentialsFunction0(value: () => js.Promise[Credentials]): Self = StObject.set(x, "credentials", js.Any.fromFunction0(value))
      
      @scala.inline
      def setCredentialsUndefined: Self = StObject.set(x, "credentials", js.undefined)
      
      @scala.inline
      def setCustomUserAgent(value: String): Self = StObject.set(x, "customUserAgent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomUserAgentUndefined: Self = StObject.set(x, "customUserAgent", js.undefined)
      
      @scala.inline
      def setDefaultUserAgent(value: String): Self = StObject.set(x, "defaultUserAgent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultUserAgentUndefined: Self = StObject.set(x, "defaultUserAgent", js.undefined)
      
      @scala.inline
      def setDisableHostPrefix(value: Boolean): Self = StObject.set(x, "disableHostPrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableHostPrefixUndefined: Self = StObject.set(x, "disableHostPrefix", js.undefined)
      
      @scala.inline
      def setEndpoint(value: String | Endpoint | Provider[Endpoint]): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndpointFunction0(value: () => js.Promise[Endpoint]): Self = StObject.set(x, "endpoint", js.Any.fromFunction0(value))
      
      @scala.inline
      def setEndpointUndefined: Self = StObject.set(x, "endpoint", js.undefined)
      
      @scala.inline
      def setLogger(value: Logger): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
      
      @scala.inline
      def setMaxAttempts(value: Double | Provider[Double]): Self = StObject.set(x, "maxAttempts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxAttemptsFunction0(value: () => js.Promise[Double]): Self = StObject.set(x, "maxAttempts", js.Any.fromFunction0(value))
      
      @scala.inline
      def setMaxAttemptsUndefined: Self = StObject.set(x, "maxAttempts", js.undefined)
      
      @scala.inline
      def setRegion(value: String | Provider[String]): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegionFunction0(value: () => js.Promise[String]): Self = StObject.set(x, "region", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRegionInfoProvider(
        value: (/* region */ String, /* options */ js.UndefOr[js.Any]) => js.Promise[js.UndefOr[RegionInfo]]
      ): Self = StObject.set(x, "regionInfoProvider", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRegionInfoProviderUndefined: Self = StObject.set(x, "regionInfoProvider", js.undefined)
      
      @scala.inline
      def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
      
      @scala.inline
      def setRequestHandler(value: (js.UndefOr[RequestHandler[js.Any, js.Any, HttpHandlerOptions]]) & js.UndefOr[HttpHandler]): Self = StObject.set(x, "requestHandler", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRetryStrategy(value: RetryStrategy): Self = StObject.set(x, "retryStrategy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRetryStrategyUndefined: Self = StObject.set(x, "retryStrategy", js.undefined)
      
      @scala.inline
      def setRuntime(value: String): Self = StObject.set(x, "runtime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRuntimeUndefined: Self = StObject.set(x, "runtime", js.undefined)
      
      @scala.inline
      def setSha256(value: HashConstructor): Self = StObject.set(x, "sha256", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSha256Undefined: Self = StObject.set(x, "sha256", js.undefined)
      
      @scala.inline
      def setSigner(value: RequestSigner | Provider[RequestSigner]): Self = StObject.set(x, "signer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSignerFunction0(value: () => js.Promise[RequestSigner]): Self = StObject.set(x, "signer", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSignerUndefined: Self = StObject.set(x, "signer", js.undefined)
      
      @scala.inline
      def setSigningEscapePath(value: Boolean): Self = StObject.set(x, "signingEscapePath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSigningEscapePathUndefined: Self = StObject.set(x, "signingEscapePath", js.undefined)
      
      @scala.inline
      def setSigningName(value: String): Self = StObject.set(x, "signingName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSigningNameUndefined: Self = StObject.set(x, "signingName", js.undefined)
      
      @scala.inline
      def setSigningRegion(value: String): Self = StObject.set(x, "signingRegion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSigningRegionUndefined: Self = StObject.set(x, "signingRegion", js.undefined)
      
      @scala.inline
      def setStreamCollector(value: /* stream */ js.Any => js.Promise[Uint8Array]): Self = StObject.set(x, "streamCollector", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStreamCollectorUndefined: Self = StObject.set(x, "streamCollector", js.undefined)
      
      @scala.inline
      def setSystemClockOffset(value: Double): Self = StObject.set(x, "systemClockOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSystemClockOffsetUndefined: Self = StObject.set(x, "systemClockOffset", js.undefined)
      
      @scala.inline
      def setTls(value: Boolean): Self = StObject.set(x, "tls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTlsUndefined: Self = StObject.set(x, "tls", js.undefined)
      
      @scala.inline
      def setUrlParser(value: /* url */ String => Endpoint): Self = StObject.set(x, "urlParser", js.Any.fromFunction1(value))
      
      @scala.inline
      def setUrlParserUndefined: Self = StObject.set(x, "urlParser", js.undefined)
      
      @scala.inline
      def setUtf8Decoder(value: /* input */ String => Uint8Array): Self = StObject.set(x, "utf8Decoder", js.Any.fromFunction1(value))
      
      @scala.inline
      def setUtf8DecoderUndefined: Self = StObject.set(x, "utf8Decoder", js.undefined)
      
      @scala.inline
      def setUtf8Encoder(value: /* input */ Uint8Array => String): Self = StObject.set(x, "utf8Encoder", js.Any.fromFunction1(value))
      
      @scala.inline
      def setUtf8EncoderUndefined: Self = StObject.set(x, "utf8Encoder", js.undefined)
    }
  }
  
  /* Inlined @aws-sdk/smithy-client.@aws-sdk/smithy-client.SmithyResolvedConfiguration<@aws-sdk/types.@aws-sdk/types.HttpHandlerOptions> & std.Required<@aws-sdk/client-cognito-identity.@aws-sdk/client-cognito-identity/types/CognitoIdentityClient.ClientDefaults> & @aws-sdk/config-resolver.@aws-sdk/config-resolver.RegionResolvedConfig & @aws-sdk/config-resolver.@aws-sdk/config-resolver.EndpointsResolvedConfig & @aws-sdk/middleware-signing.@aws-sdk/middleware-signing.AwsAuthResolvedConfig & @aws-sdk/middleware-retry.@aws-sdk/middleware-retry.RetryResolvedConfig & @aws-sdk/middleware-user-agent.@aws-sdk/middleware-user-agent.UserAgentResolvedConfig & @aws-sdk/middleware-host-header.@aws-sdk/middleware-host-header.HostHeaderResolvedConfig */
  trait CognitoIdentityClientResolvedConfig extends StObject {
    
    val apiVersion: String
    
    def base64Decoder(input: String): Uint8Array
    @JSName("base64Decoder")
    var base64Decoder_Original: Decoder
    
    def base64Encoder(input: Uint8Array): String
    @JSName("base64Encoder")
    var base64Encoder_Original: Encoder
    
    def bodyLengthChecker(body: js.Any): js.UndefOr[Double]
    @JSName("bodyLengthChecker")
    var bodyLengthChecker_Original: js.Function1[/* body */ js.Any, js.UndefOr[Double]]
    
    def credentialDefaultProvider(input: js.Any): Provider[Credentials]
    @JSName("credentialDefaultProvider")
    var credentialDefaultProvider_Original: js.Function1[/* input */ js.Any, Provider[Credentials]]
    
    def credentials(): js.Promise[Credentials]
    @JSName("credentials")
    var credentials_Original: Provider[Credentials]
    
    var customUserAgent: js.UndefOr[String] = js.undefined
    
    var defaultUserAgent: String
    
    var disableHostPrefix: Boolean
    
    def endpoint(): js.Promise[Endpoint]
    @JSName("endpoint")
    var endpoint_Original: Provider[Endpoint]
    
    var isCustomEndpoint: Boolean
    
    var logger: Logger
    
    def maxAttempts(): js.Promise[Double]
    @JSName("maxAttempts")
    var maxAttempts_Original: (Double | Provider[Double]) & Provider[Double]
    
    def region(): js.Promise[String]
    
    def regionInfoProvider(region: String): js.Promise[js.UndefOr[RegionInfo]]
    def regionInfoProvider(region: String, options: js.Any): js.Promise[js.UndefOr[RegionInfo]]
    @JSName("regionInfoProvider")
    var regionInfoProvider_Original: RegionInfoProvider
    
    @JSName("region")
    var region_Original: (String | Provider[String]) & Provider[String]
    
    var requestHandler: (RequestHandler[js.Any, js.Any, HttpHandlerOptions]) & HttpHandler & (RequestHandler[js.Any, js.Any, js.Object])
    
    var retryStrategy: RetryStrategy
    
    var runtime: String
    
    var sha256: HashConstructor
    
    def signer(): js.Promise[RequestSigner]
    @JSName("signer")
    var signer_Original: Provider[RequestSigner]
    
    var signingEscapePath: Boolean
    
    var signingName: String
    
    def streamCollector(stream: js.Any): js.Promise[Uint8Array]
    @JSName("streamCollector")
    var streamCollector_Original: StreamCollector
    
    var systemClockOffset: Double
    
    var tls: Boolean
    
    def urlParser(url: String): Endpoint
    @JSName("urlParser")
    var urlParser_Original: UrlParser
    
    def utf8Decoder(input: String): Uint8Array
    @JSName("utf8Decoder")
    var utf8Decoder_Original: Decoder
    
    def utf8Encoder(input: Uint8Array): String
    @JSName("utf8Encoder")
    var utf8Encoder_Original: Encoder
  }
  object CognitoIdentityClientResolvedConfig {
    
    @scala.inline
    def apply(
      apiVersion: String,
      base64Decoder: /* input */ String => Uint8Array,
      base64Encoder: /* input */ Uint8Array => String,
      bodyLengthChecker: /* body */ js.Any => js.UndefOr[Double],
      credentialDefaultProvider: /* input */ js.Any => Provider[Credentials],
      credentials: () => js.Promise[Credentials],
      defaultUserAgent: String,
      disableHostPrefix: Boolean,
      endpoint: () => js.Promise[Endpoint],
      isCustomEndpoint: Boolean,
      logger: Logger,
      maxAttempts: (Double | Provider[Double]) & Provider[Double],
      region: (String | Provider[String]) & Provider[String],
      regionInfoProvider: (/* region */ String, /* options */ js.UndefOr[js.Any]) => js.Promise[js.UndefOr[RegionInfo]],
      requestHandler: (RequestHandler[js.Any, js.Any, HttpHandlerOptions]) & HttpHandler & (RequestHandler[js.Any, js.Any, js.Object]),
      retryStrategy: RetryStrategy,
      runtime: String,
      sha256: HashConstructor,
      signer: () => js.Promise[RequestSigner],
      signingEscapePath: Boolean,
      signingName: String,
      streamCollector: /* stream */ js.Any => js.Promise[Uint8Array],
      systemClockOffset: Double,
      tls: Boolean,
      urlParser: /* url */ String => Endpoint,
      utf8Decoder: /* input */ String => Uint8Array,
      utf8Encoder: /* input */ Uint8Array => String
    ): CognitoIdentityClientResolvedConfig = {
      val __obj = js.Dynamic.literal(apiVersion = apiVersion.asInstanceOf[js.Any], base64Decoder = js.Any.fromFunction1(base64Decoder), base64Encoder = js.Any.fromFunction1(base64Encoder), bodyLengthChecker = js.Any.fromFunction1(bodyLengthChecker), credentialDefaultProvider = js.Any.fromFunction1(credentialDefaultProvider), credentials = js.Any.fromFunction0(credentials), defaultUserAgent = defaultUserAgent.asInstanceOf[js.Any], disableHostPrefix = disableHostPrefix.asInstanceOf[js.Any], endpoint = js.Any.fromFunction0(endpoint), isCustomEndpoint = isCustomEndpoint.asInstanceOf[js.Any], logger = logger.asInstanceOf[js.Any], maxAttempts = maxAttempts.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], regionInfoProvider = js.Any.fromFunction2(regionInfoProvider), requestHandler = requestHandler.asInstanceOf[js.Any], retryStrategy = retryStrategy.asInstanceOf[js.Any], runtime = runtime.asInstanceOf[js.Any], sha256 = sha256.asInstanceOf[js.Any], signer = js.Any.fromFunction0(signer), signingEscapePath = signingEscapePath.asInstanceOf[js.Any], signingName = signingName.asInstanceOf[js.Any], streamCollector = js.Any.fromFunction1(streamCollector), systemClockOffset = systemClockOffset.asInstanceOf[js.Any], tls = tls.asInstanceOf[js.Any], urlParser = js.Any.fromFunction1(urlParser), utf8Decoder = js.Any.fromFunction1(utf8Decoder), utf8Encoder = js.Any.fromFunction1(utf8Encoder))
      __obj.asInstanceOf[CognitoIdentityClientResolvedConfig]
    }
    
    @scala.inline
    implicit class CognitoIdentityClientResolvedConfigMutableBuilder[Self <: CognitoIdentityClientResolvedConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApiVersion(value: String): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBase64Decoder(value: /* input */ String => Uint8Array): Self = StObject.set(x, "base64Decoder", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBase64Encoder(value: /* input */ Uint8Array => String): Self = StObject.set(x, "base64Encoder", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBodyLengthChecker(value: /* body */ js.Any => js.UndefOr[Double]): Self = StObject.set(x, "bodyLengthChecker", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCredentialDefaultProvider(value: /* input */ js.Any => Provider[Credentials]): Self = StObject.set(x, "credentialDefaultProvider", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCredentials(value: () => js.Promise[Credentials]): Self = StObject.set(x, "credentials", js.Any.fromFunction0(value))
      
      @scala.inline
      def setCustomUserAgent(value: String): Self = StObject.set(x, "customUserAgent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomUserAgentUndefined: Self = StObject.set(x, "customUserAgent", js.undefined)
      
      @scala.inline
      def setDefaultUserAgent(value: String): Self = StObject.set(x, "defaultUserAgent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableHostPrefix(value: Boolean): Self = StObject.set(x, "disableHostPrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndpoint(value: () => js.Promise[Endpoint]): Self = StObject.set(x, "endpoint", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsCustomEndpoint(value: Boolean): Self = StObject.set(x, "isCustomEndpoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogger(value: Logger): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxAttempts(value: (Double | Provider[Double]) & Provider[Double]): Self = StObject.set(x, "maxAttempts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegion(value: (String | Provider[String]) & Provider[String]): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegionInfoProvider(
        value: (/* region */ String, /* options */ js.UndefOr[js.Any]) => js.Promise[js.UndefOr[RegionInfo]]
      ): Self = StObject.set(x, "regionInfoProvider", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRequestHandler(
        value: (RequestHandler[js.Any, js.Any, HttpHandlerOptions]) & HttpHandler & (RequestHandler[js.Any, js.Any, js.Object])
      ): Self = StObject.set(x, "requestHandler", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRetryStrategy(value: RetryStrategy): Self = StObject.set(x, "retryStrategy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRuntime(value: String): Self = StObject.set(x, "runtime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSha256(value: HashConstructor): Self = StObject.set(x, "sha256", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSigner(value: () => js.Promise[RequestSigner]): Self = StObject.set(x, "signer", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSigningEscapePath(value: Boolean): Self = StObject.set(x, "signingEscapePath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSigningName(value: String): Self = StObject.set(x, "signingName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStreamCollector(value: /* stream */ js.Any => js.Promise[Uint8Array]): Self = StObject.set(x, "streamCollector", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSystemClockOffset(value: Double): Self = StObject.set(x, "systemClockOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTls(value: Boolean): Self = StObject.set(x, "tls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlParser(value: /* url */ String => Endpoint): Self = StObject.set(x, "urlParser", js.Any.fromFunction1(value))
      
      @scala.inline
      def setUtf8Decoder(value: /* input */ String => Uint8Array): Self = StObject.set(x, "utf8Decoder", js.Any.fromFunction1(value))
      
      @scala.inline
      def setUtf8Encoder(value: /* input */ Uint8Array => String): Self = StObject.set(x, "utf8Encoder", js.Any.fromFunction1(value))
    }
  }
  
  type ServiceInputTypes = CreateIdentityPoolCommandInput | DeleteIdentitiesCommandInput | DeleteIdentityPoolCommandInput | DescribeIdentityCommandInput | DescribeIdentityPoolCommandInput | GetCredentialsForIdentityCommandInput | GetIdCommandInput | GetIdentityPoolRolesCommandInput | GetOpenIdTokenCommandInput | GetOpenIdTokenForDeveloperIdentityCommandInput | ListIdentitiesCommandInput | ListIdentityPoolsCommandInput | ListTagsForResourceCommandInput | LookupDeveloperIdentityCommandInput | MergeDeveloperIdentitiesCommandInput | SetIdentityPoolRolesCommandInput | TagResourceCommandInput | UnlinkDeveloperIdentityCommandInput | UnlinkIdentityCommandInput | UntagResourceCommandInput | UpdateIdentityPoolCommandInput
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdkClientCognitoIdentity.createIdentityPoolCommandMod.CreateIdentityPoolCommandOutput
    - typings.awsSdkClientCognitoIdentity.deleteIdentitiesCommandMod.DeleteIdentitiesCommandOutput
    - typings.awsSdkClientCognitoIdentity.deleteIdentityPoolCommandMod.DeleteIdentityPoolCommandOutput
    - typings.awsSdkClientCognitoIdentity.describeIdentityCommandMod.DescribeIdentityCommandOutput
    - typings.awsSdkClientCognitoIdentity.describeIdentityPoolCommandMod.DescribeIdentityPoolCommandOutput
    - typings.awsSdkClientCognitoIdentity.getCredentialsForIdentityCommandMod.GetCredentialsForIdentityCommandOutput
    - typings.awsSdkClientCognitoIdentity.getIdCommandMod.GetIdCommandOutput
    - typings.awsSdkClientCognitoIdentity.getIdentityPoolRolesCommandMod.GetIdentityPoolRolesCommandOutput
    - typings.awsSdkClientCognitoIdentity.getOpenIdTokenCommandMod.GetOpenIdTokenCommandOutput
    - typings.awsSdkClientCognitoIdentity.getOpenIdTokenForDeveloperIdentityCommandMod.GetOpenIdTokenForDeveloperIdentityCommandOutput
    - typings.awsSdkClientCognitoIdentity.listIdentitiesCommandMod.ListIdentitiesCommandOutput
    - typings.awsSdkClientCognitoIdentity.listIdentityPoolsCommandMod.ListIdentityPoolsCommandOutput
    - typings.awsSdkClientCognitoIdentity.listTagsForResourceCommandMod.ListTagsForResourceCommandOutput
    - typings.awsSdkClientCognitoIdentity.lookupDeveloperIdentityCommandMod.LookupDeveloperIdentityCommandOutput
    - typings.awsSdkClientCognitoIdentity.mergeDeveloperIdentitiesCommandMod.MergeDeveloperIdentitiesCommandOutput
    - typings.awsSdkClientCognitoIdentity.setIdentityPoolRolesCommandMod.SetIdentityPoolRolesCommandOutput
    - typings.awsSdkClientCognitoIdentity.tagResourceCommandMod.TagResourceCommandOutput
    - typings.awsSdkClientCognitoIdentity.unlinkDeveloperIdentityCommandMod.UnlinkDeveloperIdentityCommandOutput
    - typings.awsSdkClientCognitoIdentity.unlinkIdentityCommandMod.UnlinkIdentityCommandOutput
    - typings.awsSdkClientCognitoIdentity.untagResourceCommandMod.UntagResourceCommandOutput
    - typings.awsSdkClientCognitoIdentity.updateIdentityPoolCommandMod.UpdateIdentityPoolCommandOutput
  */
  type ServiceOutputTypes = _ServiceOutputTypes | DeleteIdentityPoolCommandOutput | SetIdentityPoolRolesCommandOutput | UnlinkDeveloperIdentityCommandOutput | UnlinkIdentityCommandOutput
  
  trait _ServiceOutputTypes extends StObject
  object _ServiceOutputTypes {
    
    @scala.inline
    def CreateIdentityPoolCommandOutput($metadata: ResponseMetadata): typings.awsSdkClientCognitoIdentity.createIdentityPoolCommandMod.CreateIdentityPoolCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientCognitoIdentity.createIdentityPoolCommandMod.CreateIdentityPoolCommandOutput]
    }
    
    @scala.inline
    def DeleteIdentitiesCommandOutput($metadata: ResponseMetadata): typings.awsSdkClientCognitoIdentity.deleteIdentitiesCommandMod.DeleteIdentitiesCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientCognitoIdentity.deleteIdentitiesCommandMod.DeleteIdentitiesCommandOutput]
    }
    
    @scala.inline
    def DescribeIdentityCommandOutput($metadata: ResponseMetadata): typings.awsSdkClientCognitoIdentity.describeIdentityCommandMod.DescribeIdentityCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientCognitoIdentity.describeIdentityCommandMod.DescribeIdentityCommandOutput]
    }
    
    @scala.inline
    def DescribeIdentityPoolCommandOutput($metadata: ResponseMetadata): typings.awsSdkClientCognitoIdentity.describeIdentityPoolCommandMod.DescribeIdentityPoolCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientCognitoIdentity.describeIdentityPoolCommandMod.DescribeIdentityPoolCommandOutput]
    }
    
    @scala.inline
    def GetCredentialsForIdentityCommandOutput($metadata: ResponseMetadata): typings.awsSdkClientCognitoIdentity.getCredentialsForIdentityCommandMod.GetCredentialsForIdentityCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientCognitoIdentity.getCredentialsForIdentityCommandMod.GetCredentialsForIdentityCommandOutput]
    }
    
    @scala.inline
    def GetIdCommandOutput($metadata: ResponseMetadata): typings.awsSdkClientCognitoIdentity.getIdCommandMod.GetIdCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientCognitoIdentity.getIdCommandMod.GetIdCommandOutput]
    }
    
    @scala.inline
    def GetIdentityPoolRolesCommandOutput($metadata: ResponseMetadata): typings.awsSdkClientCognitoIdentity.getIdentityPoolRolesCommandMod.GetIdentityPoolRolesCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientCognitoIdentity.getIdentityPoolRolesCommandMod.GetIdentityPoolRolesCommandOutput]
    }
    
    @scala.inline
    def GetOpenIdTokenCommandOutput($metadata: ResponseMetadata): typings.awsSdkClientCognitoIdentity.getOpenIdTokenCommandMod.GetOpenIdTokenCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientCognitoIdentity.getOpenIdTokenCommandMod.GetOpenIdTokenCommandOutput]
    }
    
    @scala.inline
    def GetOpenIdTokenForDeveloperIdentityCommandOutput($metadata: ResponseMetadata): typings.awsSdkClientCognitoIdentity.getOpenIdTokenForDeveloperIdentityCommandMod.GetOpenIdTokenForDeveloperIdentityCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientCognitoIdentity.getOpenIdTokenForDeveloperIdentityCommandMod.GetOpenIdTokenForDeveloperIdentityCommandOutput]
    }
    
    @scala.inline
    def ListIdentitiesCommandOutput($metadata: ResponseMetadata): typings.awsSdkClientCognitoIdentity.listIdentitiesCommandMod.ListIdentitiesCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientCognitoIdentity.listIdentitiesCommandMod.ListIdentitiesCommandOutput]
    }
    
    @scala.inline
    def ListIdentityPoolsCommandOutput($metadata: ResponseMetadata): typings.awsSdkClientCognitoIdentity.listIdentityPoolsCommandMod.ListIdentityPoolsCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientCognitoIdentity.listIdentityPoolsCommandMod.ListIdentityPoolsCommandOutput]
    }
    
    @scala.inline
    def ListTagsForResourceCommandOutput($metadata: ResponseMetadata): typings.awsSdkClientCognitoIdentity.listTagsForResourceCommandMod.ListTagsForResourceCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientCognitoIdentity.listTagsForResourceCommandMod.ListTagsForResourceCommandOutput]
    }
    
    @scala.inline
    def LookupDeveloperIdentityCommandOutput($metadata: ResponseMetadata): typings.awsSdkClientCognitoIdentity.lookupDeveloperIdentityCommandMod.LookupDeveloperIdentityCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientCognitoIdentity.lookupDeveloperIdentityCommandMod.LookupDeveloperIdentityCommandOutput]
    }
    
    @scala.inline
    def MergeDeveloperIdentitiesCommandOutput($metadata: ResponseMetadata): typings.awsSdkClientCognitoIdentity.mergeDeveloperIdentitiesCommandMod.MergeDeveloperIdentitiesCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientCognitoIdentity.mergeDeveloperIdentitiesCommandMod.MergeDeveloperIdentitiesCommandOutput]
    }
    
    @scala.inline
    def TagResourceCommandOutput($metadata: ResponseMetadata): typings.awsSdkClientCognitoIdentity.tagResourceCommandMod.TagResourceCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientCognitoIdentity.tagResourceCommandMod.TagResourceCommandOutput]
    }
    
    @scala.inline
    def UntagResourceCommandOutput($metadata: ResponseMetadata): typings.awsSdkClientCognitoIdentity.untagResourceCommandMod.UntagResourceCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientCognitoIdentity.untagResourceCommandMod.UntagResourceCommandOutput]
    }
    
    @scala.inline
    def UpdateIdentityPoolCommandOutput($metadata: ResponseMetadata): typings.awsSdkClientCognitoIdentity.updateIdentityPoolCommandMod.UpdateIdentityPoolCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientCognitoIdentity.updateIdentityPoolCommandMod.UpdateIdentityPoolCommandOutput]
    }
  }
}
