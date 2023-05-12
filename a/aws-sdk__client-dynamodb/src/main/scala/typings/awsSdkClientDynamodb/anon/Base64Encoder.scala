package typings.awsSdkClientDynamodb.anon

import org.scalablytyped.runtime.Instantiable1
import typings.awsSdkClientDynamodb.distTypesEndpointEndpointParametersMod.EndpointParameters
import typings.awsSdkFetchHttpHandler.mod.FetchHttpHandler
import typings.awsSdkProtocolHttp.distTypesHttpHandlerMod.HttpHandler
import typings.awsSdkSignatureV4.distTypesSignatureV4Mod.SignatureV4CryptoInit
import typings.awsSdkSignatureV4.distTypesSignatureV4Mod.SignatureV4Init
import typings.awsSdkSmithyClient.distTypesDefaultsModeMod.DefaultsMode
import typings.awsSdkTypes.distTypesAuthMod.AuthScheme
import typings.awsSdkTypes.distTypesCredentialsMod.Credentials
import typings.awsSdkTypes.distTypesCryptoMod.HashConstructor
import typings.awsSdkTypes.distTypesEndpointMod.EndpointV2
import typings.awsSdkTypes.distTypesHttpMod.Endpoint
import typings.awsSdkTypes.distTypesHttpMod.HttpHandlerOptions
import typings.awsSdkTypes.distTypesIdentityAwsCredentialIdentityMod.AwsCredentialIdentity
import typings.awsSdkTypes.distTypesRetryMod.RetryStrategyV2
import typings.awsSdkTypes.distTypesSerdeMod.StreamCollector
import typings.awsSdkTypes.distTypesSignatureMod.RequestSigner
import typings.awsSdkTypes.distTypesTransferMod.RequestHandler
import typings.awsSdkTypes.distTypesUtilMod.BodyLengthCalculator
import typings.awsSdkTypes.distTypesUtilMod.Decoder
import typings.awsSdkTypes.distTypesUtilMod.Encoder
import typings.awsSdkTypes.distTypesUtilMod.Provider
import typings.awsSdkTypes.distTypesUtilMod.RetryStrategy
import typings.awsSdkTypes.distTypesUtilMod.UrlParser
import typings.awsSdkTypes.distTypesUtilMod.UserAgent
import typings.std.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Base64Encoder extends StObject {
  
  var apiVersion: String = js.native
  
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
  
  var credentials: js.UndefOr[AwsCredentialIdentity | Provider[AwsCredentialIdentity]] = js.native
  
  var customUserAgent: js.UndefOr[String | UserAgent] = js.native
  
  def defaultUserAgentProvider(): js.Promise[UserAgent] = js.native
  @JSName("defaultUserAgentProvider")
  var defaultUserAgentProvider_Original: Provider[UserAgent] = js.native
  
  var defaultsMode: DefaultsMode | Provider[DefaultsMode] = js.native
  
  var disableHostPrefix: Boolean = js.native
  
  var endpoint: js.UndefOr[String | Endpoint | (Provider[Endpoint | EndpointV2]) | EndpointV2] = js.native
  
  var endpointCacheSize: js.UndefOr[Double] = js.native
  
  var endpointDiscoveryEnabled: js.UndefOr[Boolean] = js.native
  
  def endpointDiscoveryEnabledProvider(): js.Promise[js.UndefOr[Boolean]] = js.native
  @JSName("endpointDiscoveryEnabledProvider")
  var endpointDiscoveryEnabledProvider_Original: Provider[js.UndefOr[Boolean]] = js.native
  
  def endpointProvider(endpointParams: EndpointParameters): EndpointV2 = js.native
  def endpointProvider(endpointParams: EndpointParameters, context: Logger): EndpointV2 = js.native
  
  var logger: typings.awsSdkTypes.distTypesLoggerMod.Logger = js.native
  
  var maxAttempts: Double | Provider[Double] = js.native
  
  var region: String | Provider[Any] = js.native
  
  var requestHandler: ((RequestHandler[Any, Any, HttpHandlerOptions]) & HttpHandler) | FetchHttpHandler = js.native
  
  var retryMode: String | Provider[String] = js.native
  
  var retryStrategy: js.UndefOr[RetryStrategy | RetryStrategyV2] = js.native
  
  var runtime: String = js.native
  
  var serviceId: String = js.native
  
  var sha256: HashConstructor = js.native
  
  var signer: js.UndefOr[
    RequestSigner | (js.Function1[/* authScheme */ js.UndefOr[AuthScheme], js.Promise[RequestSigner]])
  ] = js.native
  
  var signerConstructor: js.UndefOr[
    Instantiable1[/* options */ SignatureV4Init & SignatureV4CryptoInit, RequestSigner]
  ] = js.native
  
  var signingEscapePath: js.UndefOr[Boolean] = js.native
  
  var signingRegion: js.UndefOr[String] = js.native
  
  def streamCollector(stream: Any): js.Promise[js.typedarray.Uint8Array] = js.native
  @JSName("streamCollector")
  var streamCollector_Original: StreamCollector = js.native
  
  var systemClockOffset: js.UndefOr[Double] = js.native
  
  var tls: js.UndefOr[Boolean] = js.native
  
  def urlParser(url: String): Endpoint = js.native
  def urlParser(url: URL): Endpoint = js.native
  @JSName("urlParser")
  var urlParser_Original: UrlParser = js.native
  
  var useDualstackEndpoint: Boolean | Provider[Boolean] = js.native
  
  var useFipsEndpoint: Boolean | Provider[Boolean] = js.native
  
  def utf8Decoder(input: String): js.typedarray.Uint8Array = js.native
  @JSName("utf8Decoder")
  var utf8Decoder_Original: Decoder = js.native
  
  def utf8Encoder(input: js.typedarray.Uint8Array): String = js.native
  @JSName("utf8Encoder")
  var utf8Encoder_Original: Encoder = js.native
}
