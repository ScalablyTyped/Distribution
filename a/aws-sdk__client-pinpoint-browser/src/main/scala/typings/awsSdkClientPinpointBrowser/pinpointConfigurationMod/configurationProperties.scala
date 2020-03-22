package typings.awsSdkClientPinpointBrowser.pinpointConfigurationMod

import typings.awsSdkTypes.clientMod.ConfigurationPropertyDefinition
import typings.awsSdkTypes.credentialsMod.Credentials
import typings.awsSdkTypes.cryptoMod.HashConstructor
import typings.awsSdkTypes.httpMod.HttpEndpoint
import typings.awsSdkTypes.httpMod.HttpHandler
import typings.awsSdkTypes.httpMod.HttpOptions
import typings.awsSdkTypes.marshallerMod.RequestSerializer
import typings.awsSdkTypes.middlewareMod.Terminalware
import typings.awsSdkTypes.signatureMod.RequestSigner
import typings.awsSdkTypes.unmarshallerMod.ResponseParser
import typings.awsSdkTypes.unmarshallerMod.StreamCollector
import typings.awsSdkTypes.utilMod.Decoder
import typings.awsSdkTypes.utilMod.DelayDecider
import typings.awsSdkTypes.utilMod.Encoder
import typings.awsSdkTypes.utilMod.Provider
import typings.awsSdkTypes.utilMod.RetryDecider
import typings.awsSdkTypes.utilMod.UrlParser
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-pinpoint-browser/PinpointConfiguration", "configurationProperties")
@js.native
object configurationProperties extends js.Object {
  val _user_injected_http_handler: ConfigurationPropertyDefinition[_, Boolean, PinpointResolvableConfiguration, PinpointResolvedConfiguration] = js.native
  val base64Decoder: ConfigurationPropertyDefinition[
    js.UndefOr[Decoder], 
    Decoder, 
    PinpointResolvableConfiguration, 
    PinpointResolvedConfiguration
  ] = js.native
  val base64Encoder: ConfigurationPropertyDefinition[
    js.UndefOr[Encoder], 
    Encoder, 
    PinpointResolvableConfiguration, 
    PinpointResolvedConfiguration
  ] = js.native
  val bodyLengthChecker: ConfigurationPropertyDefinition[
    js.Function1[/* body */ _, js.UndefOr[Double]], 
    js.Function1[/* body */ _, js.UndefOr[Double]], 
    PinpointResolvableConfiguration, 
    PinpointResolvedConfiguration
  ] = js.native
  val credentials: ConfigurationPropertyDefinition[
    Credentials | Provider[Credentials], 
    Provider[Credentials], 
    PinpointResolvableConfiguration, 
    PinpointResolvedConfiguration
  ] = js.native
  val delayDecider: ConfigurationPropertyDefinition[
    js.UndefOr[DelayDecider], 
    js.UndefOr[DelayDecider], 
    PinpointResolvableConfiguration, 
    PinpointResolvedConfiguration
  ] = js.native
  val endpoint: ConfigurationPropertyDefinition[
    js.UndefOr[String | HttpEndpoint | Provider[HttpEndpoint]], 
    Provider[HttpEndpoint], 
    PinpointResolvableConfiguration, 
    PinpointResolvedConfiguration
  ] = js.native
  val endpointProvider: ConfigurationPropertyDefinition[js.UndefOr[_], _, PinpointResolvableConfiguration, PinpointResolvedConfiguration] = js.native
  val handler: ConfigurationPropertyDefinition[
    js.UndefOr[Terminalware[_, Blob]], 
    Terminalware[_, Blob], 
    PinpointResolvableConfiguration, 
    PinpointResolvedConfiguration
  ] = js.native
  val httpHandler: ConfigurationPropertyDefinition[
    js.UndefOr[HttpHandler[Blob, HttpOptions]], 
    HttpHandler[Blob, HttpOptions], 
    PinpointResolvableConfiguration, 
    PinpointResolvedConfiguration
  ] = js.native
  val maxRedirects: ConfigurationPropertyDefinition[
    js.UndefOr[Double], 
    Double, 
    PinpointResolvableConfiguration, 
    PinpointResolvedConfiguration
  ] = js.native
  val maxRetries: ConfigurationPropertyDefinition[
    js.UndefOr[Double], 
    Double, 
    PinpointResolvableConfiguration, 
    PinpointResolvedConfiguration
  ] = js.native
  val parser: ConfigurationPropertyDefinition[
    ResponseParser[Blob], 
    ResponseParser[Blob], 
    PinpointResolvableConfiguration, 
    PinpointResolvedConfiguration
  ] = js.native
  val profile: ConfigurationPropertyDefinition[
    js.UndefOr[String], 
    js.UndefOr[String], 
    PinpointResolvableConfiguration, 
    PinpointResolvedConfiguration
  ] = js.native
  val region: ConfigurationPropertyDefinition[
    String | Provider[String], 
    Provider[String], 
    PinpointResolvableConfiguration, 
    PinpointResolvedConfiguration
  ] = js.native
  val retryDecider: ConfigurationPropertyDefinition[
    js.UndefOr[RetryDecider], 
    js.UndefOr[RetryDecider], 
    PinpointResolvableConfiguration, 
    PinpointResolvedConfiguration
  ] = js.native
  val serializer: ConfigurationPropertyDefinition[
    Provider[RequestSerializer[Blob]], 
    Provider[RequestSerializer[Blob]], 
    PinpointResolvableConfiguration, 
    PinpointResolvedConfiguration
  ] = js.native
  val sha256: ConfigurationPropertyDefinition[
    js.UndefOr[HashConstructor], 
    HashConstructor, 
    PinpointResolvableConfiguration, 
    PinpointResolvedConfiguration
  ] = js.native
  val signer: ConfigurationPropertyDefinition[
    js.UndefOr[RequestSigner], 
    RequestSigner, 
    PinpointResolvableConfiguration, 
    PinpointResolvedConfiguration
  ] = js.native
  val signingName: ConfigurationPropertyDefinition[
    js.UndefOr[String], 
    String, 
    PinpointResolvableConfiguration, 
    PinpointResolvedConfiguration
  ] = js.native
  val sslEnabled: ConfigurationPropertyDefinition[
    js.UndefOr[Boolean], 
    Boolean, 
    PinpointResolvableConfiguration, 
    PinpointResolvedConfiguration
  ] = js.native
  val streamCollector: ConfigurationPropertyDefinition[
    js.UndefOr[StreamCollector[Blob]], 
    StreamCollector[Blob], 
    PinpointResolvableConfiguration, 
    PinpointResolvedConfiguration
  ] = js.native
  val urlParser: ConfigurationPropertyDefinition[
    js.UndefOr[UrlParser], 
    UrlParser, 
    PinpointResolvableConfiguration, 
    PinpointResolvedConfiguration
  ] = js.native
  val utf8Decoder: ConfigurationPropertyDefinition[
    js.UndefOr[Decoder], 
    Decoder, 
    PinpointResolvableConfiguration, 
    PinpointResolvedConfiguration
  ] = js.native
  val utf8Encoder: ConfigurationPropertyDefinition[
    js.UndefOr[Encoder], 
    Encoder, 
    PinpointResolvableConfiguration, 
    PinpointResolvedConfiguration
  ] = js.native
}

