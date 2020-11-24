package typings.awsSdkClientCognitoIdentity.cognitoIdentityClientMod

import typings.awsSdkProtocolHttp.httpHandlerMod.HttpHandler
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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@aws-sdk/smithy-client.@aws-sdk/smithy-client.SmithyConfiguration<@aws-sdk/types.@aws-sdk/types.HttpHandlerOptions>> & @aws-sdk/client-cognito-identity.@aws-sdk/client-cognito-identity/types/CognitoIdentityClient.ClientDefaults & @aws-sdk/config-resolver.@aws-sdk/config-resolver.RegionInputConfig & @aws-sdk/config-resolver.@aws-sdk/config-resolver.EndpointsInputConfig & @aws-sdk/middleware-signing.@aws-sdk/middleware-signing.AwsAuthInputConfig & @aws-sdk/middleware-retry.@aws-sdk/middleware-retry.RetryInputConfig & @aws-sdk/middleware-user-agent.@aws-sdk/middleware-user-agent.UserAgentInputConfig & @aws-sdk/middleware-host-header.@aws-sdk/middleware-host-header.HostHeaderInputConfig */
@js.native
trait CognitoIdentityClientConfig extends js.Object {
  
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
  implicit class CognitoIdentityClientConfigOps[Self <: CognitoIdentityClientConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setRequestHandler(value: (js.UndefOr[RequestHandler[_, _, HttpHandlerOptions]]) with js.UndefOr[HttpHandler]): Self = this.set("requestHandler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApiVersion(value: String): Self = this.set("apiVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApiVersion: Self = this.set("apiVersion", js.undefined)
    
    @scala.inline
    def setBase64Decoder(value: /* input */ String => Uint8Array): Self = this.set("base64Decoder", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteBase64Decoder: Self = this.set("base64Decoder", js.undefined)
    
    @scala.inline
    def setBase64Encoder(value: /* input */ Uint8Array => String): Self = this.set("base64Encoder", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteBase64Encoder: Self = this.set("base64Encoder", js.undefined)
    
    @scala.inline
    def setBodyLengthChecker(value: /* body */ js.Any => js.UndefOr[Double]): Self = this.set("bodyLengthChecker", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteBodyLengthChecker: Self = this.set("bodyLengthChecker", js.undefined)
    
    @scala.inline
    def setCredentialDefaultProvider(value: /* input */ js.Any => Provider[Credentials]): Self = this.set("credentialDefaultProvider", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCredentialDefaultProvider: Self = this.set("credentialDefaultProvider", js.undefined)
    
    @scala.inline
    def setCredentialsFunction0(value: () => js.Promise[Credentials]): Self = this.set("credentials", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCredentials(value: Credentials | Provider[Credentials]): Self = this.set("credentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCredentials: Self = this.set("credentials", js.undefined)
    
    @scala.inline
    def setCustomUserAgent(value: String): Self = this.set("customUserAgent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomUserAgent: Self = this.set("customUserAgent", js.undefined)
    
    @scala.inline
    def setDefaultUserAgent(value: String): Self = this.set("defaultUserAgent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultUserAgent: Self = this.set("defaultUserAgent", js.undefined)
    
    @scala.inline
    def setDisableHostPrefix(value: Boolean): Self = this.set("disableHostPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableHostPrefix: Self = this.set("disableHostPrefix", js.undefined)
    
    @scala.inline
    def setEndpointFunction0(value: () => js.Promise[Endpoint]): Self = this.set("endpoint", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEndpoint(value: String | Endpoint | Provider[Endpoint]): Self = this.set("endpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndpoint: Self = this.set("endpoint", js.undefined)
    
    @scala.inline
    def setLogger(value: Logger): Self = this.set("logger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogger: Self = this.set("logger", js.undefined)
    
    @scala.inline
    def setMaxAttemptsFunction0(value: () => js.Promise[Double]): Self = this.set("maxAttempts", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMaxAttempts(value: Double | Provider[Double]): Self = this.set("maxAttempts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxAttempts: Self = this.set("maxAttempts", js.undefined)
    
    @scala.inline
    def setRegionFunction0(value: () => js.Promise[String]): Self = this.set("region", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRegion(value: String | Provider[String]): Self = this.set("region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegion: Self = this.set("region", js.undefined)
    
    @scala.inline
    def setRegionInfoProvider(
      value: (/* region */ String, /* options */ js.UndefOr[js.Any]) => js.Promise[js.UndefOr[RegionInfo]]
    ): Self = this.set("regionInfoProvider", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteRegionInfoProvider: Self = this.set("regionInfoProvider", js.undefined)
    
    @scala.inline
    def setRetryStrategy(value: RetryStrategy): Self = this.set("retryStrategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRetryStrategy: Self = this.set("retryStrategy", js.undefined)
    
    @scala.inline
    def setRuntime(value: String): Self = this.set("runtime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRuntime: Self = this.set("runtime", js.undefined)
    
    @scala.inline
    def setSha256(value: HashConstructor): Self = this.set("sha256", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSha256: Self = this.set("sha256", js.undefined)
    
    @scala.inline
    def setSignerFunction0(value: () => js.Promise[RequestSigner]): Self = this.set("signer", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSigner(value: RequestSigner | Provider[RequestSigner]): Self = this.set("signer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSigner: Self = this.set("signer", js.undefined)
    
    @scala.inline
    def setSigningEscapePath(value: Boolean): Self = this.set("signingEscapePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSigningEscapePath: Self = this.set("signingEscapePath", js.undefined)
    
    @scala.inline
    def setSigningName(value: String): Self = this.set("signingName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSigningName: Self = this.set("signingName", js.undefined)
    
    @scala.inline
    def setSigningRegion(value: String): Self = this.set("signingRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSigningRegion: Self = this.set("signingRegion", js.undefined)
    
    @scala.inline
    def setStreamCollector(value: /* stream */ js.Any => js.Promise[Uint8Array]): Self = this.set("streamCollector", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteStreamCollector: Self = this.set("streamCollector", js.undefined)
    
    @scala.inline
    def setSystemClockOffset(value: Double): Self = this.set("systemClockOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSystemClockOffset: Self = this.set("systemClockOffset", js.undefined)
    
    @scala.inline
    def setTls(value: Boolean): Self = this.set("tls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTls: Self = this.set("tls", js.undefined)
    
    @scala.inline
    def setUrlParser(value: /* url */ String => Endpoint): Self = this.set("urlParser", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteUrlParser: Self = this.set("urlParser", js.undefined)
    
    @scala.inline
    def setUtf8Decoder(value: /* input */ String => Uint8Array): Self = this.set("utf8Decoder", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteUtf8Decoder: Self = this.set("utf8Decoder", js.undefined)
    
    @scala.inline
    def setUtf8Encoder(value: /* input */ Uint8Array => String): Self = this.set("utf8Encoder", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteUtf8Encoder: Self = this.set("utf8Encoder", js.undefined)
  }
}
