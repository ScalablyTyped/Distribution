package typings.awsSdkClientCognitoIdentity

import typings.awsSdkClientCognitoIdentity.createIdentityPoolCommandMod.CreateIdentityPoolCommandInput
import typings.awsSdkClientCognitoIdentity.createIdentityPoolCommandMod.CreateIdentityPoolCommandOutput
import typings.awsSdkClientCognitoIdentity.deleteIdentitiesCommandMod.DeleteIdentitiesCommandInput
import typings.awsSdkClientCognitoIdentity.deleteIdentitiesCommandMod.DeleteIdentitiesCommandOutput
import typings.awsSdkClientCognitoIdentity.deleteIdentityPoolCommandMod.DeleteIdentityPoolCommandInput
import typings.awsSdkClientCognitoIdentity.deleteIdentityPoolCommandMod.DeleteIdentityPoolCommandOutput
import typings.awsSdkClientCognitoIdentity.describeIdentityCommandMod.DescribeIdentityCommandInput
import typings.awsSdkClientCognitoIdentity.describeIdentityCommandMod.DescribeIdentityCommandOutput
import typings.awsSdkClientCognitoIdentity.describeIdentityPoolCommandMod.DescribeIdentityPoolCommandInput
import typings.awsSdkClientCognitoIdentity.describeIdentityPoolCommandMod.DescribeIdentityPoolCommandOutput
import typings.awsSdkClientCognitoIdentity.getCredentialsForIdentityCommandMod.GetCredentialsForIdentityCommandInput
import typings.awsSdkClientCognitoIdentity.getCredentialsForIdentityCommandMod.GetCredentialsForIdentityCommandOutput
import typings.awsSdkClientCognitoIdentity.getIdCommandMod.GetIdCommandInput
import typings.awsSdkClientCognitoIdentity.getIdCommandMod.GetIdCommandOutput
import typings.awsSdkClientCognitoIdentity.getIdentityPoolRolesCommandMod.GetIdentityPoolRolesCommandInput
import typings.awsSdkClientCognitoIdentity.getIdentityPoolRolesCommandMod.GetIdentityPoolRolesCommandOutput
import typings.awsSdkClientCognitoIdentity.getOpenIdTokenCommandMod.GetOpenIdTokenCommandInput
import typings.awsSdkClientCognitoIdentity.getOpenIdTokenCommandMod.GetOpenIdTokenCommandOutput
import typings.awsSdkClientCognitoIdentity.getOpenIdTokenForDeveloperIdentityCommandMod.GetOpenIdTokenForDeveloperIdentityCommandInput
import typings.awsSdkClientCognitoIdentity.getOpenIdTokenForDeveloperIdentityCommandMod.GetOpenIdTokenForDeveloperIdentityCommandOutput
import typings.awsSdkClientCognitoIdentity.listIdentitiesCommandMod.ListIdentitiesCommandInput
import typings.awsSdkClientCognitoIdentity.listIdentitiesCommandMod.ListIdentitiesCommandOutput
import typings.awsSdkClientCognitoIdentity.listIdentityPoolsCommandMod.ListIdentityPoolsCommandInput
import typings.awsSdkClientCognitoIdentity.listIdentityPoolsCommandMod.ListIdentityPoolsCommandOutput
import typings.awsSdkClientCognitoIdentity.listTagsForResourceCommandMod.ListTagsForResourceCommandInput
import typings.awsSdkClientCognitoIdentity.listTagsForResourceCommandMod.ListTagsForResourceCommandOutput
import typings.awsSdkClientCognitoIdentity.lookupDeveloperIdentityCommandMod.LookupDeveloperIdentityCommandInput
import typings.awsSdkClientCognitoIdentity.lookupDeveloperIdentityCommandMod.LookupDeveloperIdentityCommandOutput
import typings.awsSdkClientCognitoIdentity.mergeDeveloperIdentitiesCommandMod.MergeDeveloperIdentitiesCommandInput
import typings.awsSdkClientCognitoIdentity.mergeDeveloperIdentitiesCommandMod.MergeDeveloperIdentitiesCommandOutput
import typings.awsSdkClientCognitoIdentity.setIdentityPoolRolesCommandMod.SetIdentityPoolRolesCommandInput
import typings.awsSdkClientCognitoIdentity.setIdentityPoolRolesCommandMod.SetIdentityPoolRolesCommandOutput
import typings.awsSdkClientCognitoIdentity.tagResourceCommandMod.TagResourceCommandInput
import typings.awsSdkClientCognitoIdentity.tagResourceCommandMod.TagResourceCommandOutput
import typings.awsSdkClientCognitoIdentity.unlinkDeveloperIdentityCommandMod.UnlinkDeveloperIdentityCommandInput
import typings.awsSdkClientCognitoIdentity.unlinkDeveloperIdentityCommandMod.UnlinkDeveloperIdentityCommandOutput
import typings.awsSdkClientCognitoIdentity.unlinkIdentityCommandMod.UnlinkIdentityCommandInput
import typings.awsSdkClientCognitoIdentity.unlinkIdentityCommandMod.UnlinkIdentityCommandOutput
import typings.awsSdkClientCognitoIdentity.untagResourceCommandMod.UntagResourceCommandInput
import typings.awsSdkClientCognitoIdentity.untagResourceCommandMod.UntagResourceCommandOutput
import typings.awsSdkClientCognitoIdentity.updateIdentityPoolCommandMod.UpdateIdentityPoolCommandInput
import typings.awsSdkClientCognitoIdentity.updateIdentityPoolCommandMod.UpdateIdentityPoolCommandOutput
import typings.awsSdkProtocolHttp.httpHandlerMod.HttpHandler
import typings.awsSdkSmithyClient.mod.Client
import typings.awsSdkTypes.credentialsMod.Credentials
import typings.awsSdkTypes.cryptoMod.HashConstructor
import typings.awsSdkTypes.httpMod.Endpoint
import typings.awsSdkTypes.httpMod.HttpHandlerOptions
import typings.awsSdkTypes.loggerMod.Logger
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
import scala.scalajs.js.`|`
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
  @js.native
  trait ClientDefaults extends StObject {
    
    var apiVersion: js.UndefOr[String] = js.native
    
    /**
      * The function that will be used to convert a base64-encoded string to a byte array
      */
    var base64Decoder: js.UndefOr[Decoder] = js.native
    
    /**
      * The function that will be used to convert binary data to a base64-encoded string
      */
    var base64Encoder: js.UndefOr[Encoder] = js.native
    
    /**
      * A function that can calculate the length of a request body.
      */
    var bodyLengthChecker: js.UndefOr[js.Function1[/* body */ js.Any, js.UndefOr[Double]]] = js.native
    
    /**
      * Default credentials provider; Not available in browser runtime
      */
    var credentialDefaultProvider: js.UndefOr[js.Function1[/* input */ js.Any, Provider[Credentials]]] = js.native
    
    /**
      * The string that will be used to populate default value in 'User-Agent' header
      */
    var defaultUserAgent: js.UndefOr[String] = js.native
    
    /**
      * Disable dyanamically changing the endpoint of the client based on the hostPrefix
      * trait of an operation.
      */
    var disableHostPrefix: js.UndefOr[Boolean] = js.native
    
    /**
      * Optional logger for logging debug/info/warn/error.
      */
    var logger: js.UndefOr[Logger] = js.native
    
    /**
      * Value for how many times a request will be made at most in case of retry.
      */
    var maxAttempts: js.UndefOr[Double | Provider[Double]] = js.native
    
    /**
      * The AWS region to which this client will send requests
      */
    var region: js.UndefOr[String | Provider[String]] = js.native
    
    /**
      * Fetch related hostname, signing name or signing region with given region.
      */
    var regionInfoProvider: js.UndefOr[RegionInfoProvider] = js.native
    
    /**
      * The HTTP handler to use. Fetch in browser and Https in Nodejs.
      */
    var requestHandler: js.UndefOr[HttpHandler] = js.native
    
    /**
      * The runtime environment
      */
    var runtime: js.UndefOr[String] = js.native
    
    /**
      * A constructor for a class implementing the @aws-sdk/types.Hash interface
      * that computes the SHA-256 HMAC or checksum of a string or binary buffer.
      */
    var sha256: js.UndefOr[HashConstructor] = js.native
    
    /**
      * The service name with which to sign requests.
      */
    var signingName: js.UndefOr[String] = js.native
    
    /**
      * A function that converts a stream into an array of bytes.
      */
    var streamCollector: js.UndefOr[StreamCollector] = js.native
    
    /**
      * The function that will be used to convert strings into HTTP endpoints.
      */
    var urlParser: js.UndefOr[UrlParser] = js.native
    
    /**
      * The function that will be used to convert a UTF8-encoded string to a byte array
      */
    var utf8Decoder: js.UndefOr[Decoder] = js.native
    
    /**
      * The function that will be used to convert binary data to a UTF-8 encoded string
      */
    var utf8Encoder: js.UndefOr[Encoder] = js.native
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
  @js.native
  trait CognitoIdentityClientConfig extends StObject {
    
    var apiVersion: js.UndefOr[String] = js.native
    
    /**
      * The function that will be used to convert a base64-encoded string to a byte array
      */
    var base64Decoder: js.UndefOr[Decoder] = js.native
    
    /**
      * The function that will be used to convert binary data to a base64-encoded string
      */
    var base64Encoder: js.UndefOr[Encoder] = js.native
    
    /**
      * A function that can calculate the length of a request body.
      */
    var bodyLengthChecker: js.UndefOr[js.Function1[/* body */ js.Any, js.UndefOr[Double]]] = js.native
    
    /**
      * Default credentials provider; Not available in browser runtime
      */
    var credentialDefaultProvider: js.UndefOr[js.Function1[/* input */ js.Any, Provider[Credentials]]] = js.native
    
    /**
      * The credentials used to sign requests.
      */
    var credentials: js.UndefOr[Credentials | Provider[Credentials]] = js.native
    
    /**
      * The custom user agent header that would be appended to default one
      */
    var customUserAgent: js.UndefOr[String] = js.native
    
    /**
      * The string that will be used to populate default value in 'User-Agent' header
      */
    var defaultUserAgent: js.UndefOr[String] = js.native
    
    /**
      * Disable dyanamically changing the endpoint of the client based on the hostPrefix
      * trait of an operation.
      */
    var disableHostPrefix: js.UndefOr[Boolean] = js.native
    
    /**
      * The fully qualified endpoint of the webservice. This is only required when using a custom endpoint (for example, when using a local version of S3).
      */
    var endpoint: js.UndefOr[String | Endpoint | Provider[Endpoint]] = js.native
    
    /**
      * Optional logger for logging debug/info/warn/error.
      */
    var logger: js.UndefOr[Logger] = js.native
    
    /**
      * Value for how many times a request will be made at most in case of retry.
      */
    /**
      * The maximum number of times requests that encounter retryable failures should be attempted.
      */
    var maxAttempts: js.UndefOr[Double | Provider[Double]] = js.native
    
    /**
      * The AWS region to which this client will send requests
      */
    var region: js.UndefOr[String | Provider[String]] = js.native
    
    /**
      * Fetch related hostname, signing name or signing region with given region.
      */
    var regionInfoProvider: js.UndefOr[RegionInfoProvider] = js.native
    
    /**
      * The HTTP handler to use. Fetch in browser and Https in Nodejs.
      */
    var requestHandler: (js.UndefOr[RequestHandler[_, _, HttpHandlerOptions]]) with js.UndefOr[HttpHandler] = js.native
    
    /**
      * The strategy to retry the request. Using built-in exponential backoff strategy by default.
      */
    var retryStrategy: js.UndefOr[RetryStrategy] = js.native
    
    /**
      * The runtime environment
      */
    var runtime: js.UndefOr[String] = js.native
    
    /**
      * A constructor for a class implementing the @aws-sdk/types.Hash interface
      * that computes the SHA-256 HMAC or checksum of a string or binary buffer.
      */
    var sha256: js.UndefOr[HashConstructor] = js.native
    
    /**
      * The signer to use when signing requests.
      */
    var signer: js.UndefOr[RequestSigner | Provider[RequestSigner]] = js.native
    
    /**
      * Whether to escape request path when signing the request.
      */
    var signingEscapePath: js.UndefOr[Boolean] = js.native
    
    /**
      * The service name with which to sign requests.
      */
    var signingName: js.UndefOr[String] = js.native
    
    /**
      * The region where you want to sign your request against. This
      * can be different to the region in the endpoint.
      */
    var signingRegion: js.UndefOr[String] = js.native
    
    /**
      * A function that converts a stream into an array of bytes.
      */
    var streamCollector: js.UndefOr[StreamCollector] = js.native
    
    /**
      * An offset value in milliseconds to apply to all signing times.
      */
    var systemClockOffset: js.UndefOr[Double] = js.native
    
    /**
      * Whether TLS is enabled for requests.
      */
    var tls: js.UndefOr[Boolean] = js.native
    
    /**
      * The function that will be used to convert strings into HTTP endpoints.
      */
    var urlParser: js.UndefOr[UrlParser] = js.native
    
    /**
      * The function that will be used to convert a UTF8-encoded string to a byte array
      */
    var utf8Decoder: js.UndefOr[Decoder] = js.native
    
    /**
      * The function that will be used to convert binary data to a UTF-8 encoded string
      */
    var utf8Encoder: js.UndefOr[Encoder] = js.native
  }
  object CognitoIdentityClientConfig {
    
    @scala.inline
    def apply(
      requestHandler: (js.UndefOr[RequestHandler[_, _, HttpHandlerOptions]]) with js.UndefOr[HttpHandler]
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
      def setRequestHandler(value: (js.UndefOr[RequestHandler[_, _, HttpHandlerOptions]]) with js.UndefOr[HttpHandler]): Self = StObject.set(x, "requestHandler", value.asInstanceOf[js.Any])
      
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
  @js.native
  trait CognitoIdentityClientResolvedConfig extends StObject {
    
    val apiVersion: String = js.native
    
    def base64Decoder(input: String): Uint8Array = js.native
    @JSName("base64Decoder")
    var base64Decoder_Original: Decoder = js.native
    
    def base64Encoder(input: Uint8Array): String = js.native
    @JSName("base64Encoder")
    var base64Encoder_Original: Encoder = js.native
    
    def bodyLengthChecker(body: js.Any): js.UndefOr[Double] = js.native
    @JSName("bodyLengthChecker")
    var bodyLengthChecker_Original: js.Function1[/* body */ js.Any, js.UndefOr[Double]] = js.native
    
    def credentialDefaultProvider(input: js.Any): Provider[Credentials] = js.native
    @JSName("credentialDefaultProvider")
    var credentialDefaultProvider_Original: js.Function1[/* input */ js.Any, Provider[Credentials]] = js.native
    
    def credentials(): js.Promise[Credentials] = js.native
    @JSName("credentials")
    var credentials_Original: Provider[Credentials] = js.native
    
    var customUserAgent: js.UndefOr[String] = js.native
    
    var defaultUserAgent: String = js.native
    
    var disableHostPrefix: Boolean = js.native
    
    def endpoint(): js.Promise[Endpoint] = js.native
    @JSName("endpoint")
    var endpoint_Original: Provider[Endpoint] = js.native
    
    var isCustomEndpoint: Boolean = js.native
    
    var logger: Logger = js.native
    
    def maxAttempts(): js.Promise[Double] = js.native
    @JSName("maxAttempts")
    var maxAttempts_Original: (Double | Provider[Double]) with Provider[Double] = js.native
    
    def region(): js.Promise[String] = js.native
    
    def regionInfoProvider(region: String): js.Promise[js.UndefOr[RegionInfo]] = js.native
    def regionInfoProvider(region: String, options: js.Any): js.Promise[js.UndefOr[RegionInfo]] = js.native
    @JSName("regionInfoProvider")
    var regionInfoProvider_Original: RegionInfoProvider = js.native
    
    @JSName("region")
    var region_Original: (String | Provider[String]) with Provider[String] = js.native
    
    var requestHandler: (RequestHandler[_, _, HttpHandlerOptions]) with HttpHandler with (RequestHandler[_, _, js.Object]) = js.native
    
    var retryStrategy: RetryStrategy = js.native
    
    var runtime: String = js.native
    
    var sha256: HashConstructor = js.native
    
    def signer(): js.Promise[RequestSigner] = js.native
    @JSName("signer")
    var signer_Original: Provider[RequestSigner] = js.native
    
    var signingEscapePath: Boolean = js.native
    
    var signingName: String = js.native
    
    def streamCollector(stream: js.Any): js.Promise[Uint8Array] = js.native
    @JSName("streamCollector")
    var streamCollector_Original: StreamCollector = js.native
    
    var systemClockOffset: Double = js.native
    
    var tls: Boolean = js.native
    
    def urlParser(url: String): Endpoint = js.native
    @JSName("urlParser")
    var urlParser_Original: UrlParser = js.native
    
    def utf8Decoder(input: String): Uint8Array = js.native
    @JSName("utf8Decoder")
    var utf8Decoder_Original: Decoder = js.native
    
    def utf8Encoder(input: Uint8Array): String = js.native
    @JSName("utf8Encoder")
    var utf8Encoder_Original: Encoder = js.native
  }
  
  type ServiceInputTypes = CreateIdentityPoolCommandInput | DeleteIdentitiesCommandInput | DeleteIdentityPoolCommandInput | DescribeIdentityCommandInput | DescribeIdentityPoolCommandInput | GetCredentialsForIdentityCommandInput | GetIdCommandInput | GetIdentityPoolRolesCommandInput | GetOpenIdTokenCommandInput | GetOpenIdTokenForDeveloperIdentityCommandInput | ListIdentitiesCommandInput | ListIdentityPoolsCommandInput | ListTagsForResourceCommandInput | LookupDeveloperIdentityCommandInput | MergeDeveloperIdentitiesCommandInput | SetIdentityPoolRolesCommandInput | TagResourceCommandInput | UnlinkDeveloperIdentityCommandInput | UnlinkIdentityCommandInput | UntagResourceCommandInput | UpdateIdentityPoolCommandInput
  
  type ServiceOutputTypes = CreateIdentityPoolCommandOutput | DeleteIdentitiesCommandOutput | DeleteIdentityPoolCommandOutput | DescribeIdentityCommandOutput | DescribeIdentityPoolCommandOutput | GetCredentialsForIdentityCommandOutput | GetIdCommandOutput | GetIdentityPoolRolesCommandOutput | GetOpenIdTokenCommandOutput | GetOpenIdTokenForDeveloperIdentityCommandOutput | ListIdentitiesCommandOutput | ListIdentityPoolsCommandOutput | ListTagsForResourceCommandOutput | LookupDeveloperIdentityCommandOutput | MergeDeveloperIdentitiesCommandOutput | SetIdentityPoolRolesCommandOutput | TagResourceCommandOutput | UnlinkDeveloperIdentityCommandOutput | UnlinkIdentityCommandOutput | UntagResourceCommandOutput | UpdateIdentityPoolCommandOutput
}
