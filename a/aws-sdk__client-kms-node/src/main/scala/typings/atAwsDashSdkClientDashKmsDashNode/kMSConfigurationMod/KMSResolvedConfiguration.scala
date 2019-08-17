package typings.atAwsDashSdkClientDashKmsDashNode.kMSConfigurationMod

import typings.atAwsDashSdkTypes.buildCredentialsMod.Credentials
import typings.atAwsDashSdkTypes.buildCryptoMod.HashConstructor
import typings.atAwsDashSdkTypes.buildHttpMod.HttpEndpoint
import typings.atAwsDashSdkTypes.buildHttpMod.HttpHandler
import typings.atAwsDashSdkTypes.buildHttpMod.HttpOptions
import typings.atAwsDashSdkTypes.buildMarshallerMod.RequestSerializer
import typings.atAwsDashSdkTypes.buildMiddlewareMod.FinalizeHandler
import typings.atAwsDashSdkTypes.buildMiddlewareMod.HandlerExecutionContext
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Terminalware
import typings.atAwsDashSdkTypes.buildSignatureMod.RequestSigner
import typings.atAwsDashSdkTypes.buildUnmarshallerMod.ResponseParser
import typings.atAwsDashSdkTypes.buildUnmarshallerMod.StreamCollector
import typings.atAwsDashSdkTypes.buildUtilMod.Decoder
import typings.atAwsDashSdkTypes.buildUtilMod.Encoder
import typings.atAwsDashSdkTypes.buildUtilMod.Provider
import typings.atAwsDashSdkTypes.buildUtilMod.UrlParser
import typings.node.streamMod.Readable
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KMSResolvedConfiguration extends KMSConfiguration {
  var _user_injected_http_handler: Boolean = js.native
  @JSName("base64Decoder")
  var base64Decoder_Original: Decoder = js.native
  @JSName("base64Encoder")
  var base64Encoder_Original: Encoder = js.native
  @JSName("credentials")
  var credentials_Original: Provider[Credentials] = js.native
  @JSName("endpoint")
  var endpoint_Original: Provider[HttpEndpoint] = js.native
  @JSName("handler")
  var handler_Original: Terminalware[_, Readable] = js.native
  @JSName("httpHandler")
  var httpHandler_KMSResolvedConfiguration: HttpHandler[Readable, HttpOptions] = js.native
  @JSName("maxRedirects")
  var maxRedirects_KMSResolvedConfiguration: Double = js.native
  @JSName("maxRetries")
  var maxRetries_KMSResolvedConfiguration: Double = js.native
  var parser: ResponseParser[Readable] = js.native
  @JSName("region")
  var region_Original: Provider[String] = js.native
  @JSName("serializer")
  var serializer_Original: Provider[RequestSerializer[Readable]] = js.native
  @JSName("sha256")
  var sha256_KMSResolvedConfiguration: HashConstructor = js.native
  @JSName("signer")
  var signer_KMSResolvedConfiguration: RequestSigner = js.native
  @JSName("signingName")
  var signingName_KMSResolvedConfiguration: String = js.native
  @JSName("sslEnabled")
  var sslEnabled_KMSResolvedConfiguration: Boolean = js.native
  @JSName("streamCollector")
  var streamCollector_Original: StreamCollector[Readable] = js.native
  @JSName("urlParser")
  var urlParser_Original: UrlParser = js.native
  @JSName("utf8Decoder")
  var utf8Decoder_Original: Decoder = js.native
  @JSName("utf8Encoder")
  var utf8Encoder_Original: Encoder = js.native
  @JSName("base64Decoder")
  def base64Decoder_MKMSResolvedConfiguration(input: String): Uint8Array = js.native
  @JSName("base64Encoder")
  def base64Encoder_MKMSResolvedConfiguration(input: Uint8Array): String = js.native
  def bodyLengthChecker(body: js.Any): js.UndefOr[Double] = js.native
  @JSName("credentials")
  def credentials_MKMSResolvedConfiguration(): js.Promise[Credentials] = js.native
  @JSName("endpoint")
  def endpoint_MKMSResolvedConfiguration(): js.Promise[HttpEndpoint] = js.native
  @JSName("handler")
  def handler_MKMSResolvedConfiguration[Input /* <: js.Object */, Output /* <: js.Any */](context: HandlerExecutionContext): FinalizeHandler[Input, Output, Readable] = js.native
  @JSName("region")
  def region_MKMSResolvedConfiguration(): js.Promise[String] = js.native
  def serializer(): js.Promise[RequestSerializer[Readable]] = js.native
  @JSName("streamCollector")
  def streamCollector_MKMSResolvedConfiguration(stream: Readable): js.Promise[Uint8Array] = js.native
  @JSName("urlParser")
  def urlParser_MKMSResolvedConfiguration(url: String): HttpEndpoint = js.native
  @JSName("utf8Decoder")
  def utf8Decoder_MKMSResolvedConfiguration(input: String): Uint8Array = js.native
  @JSName("utf8Encoder")
  def utf8Encoder_MKMSResolvedConfiguration(input: Uint8Array): String = js.native
}

