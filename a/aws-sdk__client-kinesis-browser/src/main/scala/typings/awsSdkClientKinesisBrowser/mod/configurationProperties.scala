package typings.awsSdkClientKinesisBrowser.mod

import typings.awsSdkClientKinesisBrowser.kinesisConfigurationMod.KinesisResolvableConfiguration
import typings.awsSdkClientKinesisBrowser.kinesisConfigurationMod.KinesisResolvedConfiguration
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

@JSImport("@aws-sdk/client-kinesis-browser", "configurationProperties")
@js.native
object configurationProperties extends js.Object {
  val _user_injected_http_handler: ConfigurationPropertyDefinition[_, Boolean, KinesisResolvableConfiguration, KinesisResolvedConfiguration] = js.native
  val base64Decoder: ConfigurationPropertyDefinition[
    js.UndefOr[Decoder], 
    Decoder, 
    KinesisResolvableConfiguration, 
    KinesisResolvedConfiguration
  ] = js.native
  val base64Encoder: ConfigurationPropertyDefinition[
    js.UndefOr[Encoder], 
    Encoder, 
    KinesisResolvableConfiguration, 
    KinesisResolvedConfiguration
  ] = js.native
  val bodyLengthChecker: ConfigurationPropertyDefinition[
    js.Function1[/* body */ _, js.UndefOr[Double]], 
    js.Function1[/* body */ _, js.UndefOr[Double]], 
    KinesisResolvableConfiguration, 
    KinesisResolvedConfiguration
  ] = js.native
  val credentials: ConfigurationPropertyDefinition[
    Credentials | Provider[Credentials], 
    Provider[Credentials], 
    KinesisResolvableConfiguration, 
    KinesisResolvedConfiguration
  ] = js.native
  val delayDecider: ConfigurationPropertyDefinition[
    js.UndefOr[DelayDecider], 
    js.UndefOr[DelayDecider], 
    KinesisResolvableConfiguration, 
    KinesisResolvedConfiguration
  ] = js.native
  val endpoint: ConfigurationPropertyDefinition[
    js.UndefOr[String | HttpEndpoint | Provider[HttpEndpoint]], 
    Provider[HttpEndpoint], 
    KinesisResolvableConfiguration, 
    KinesisResolvedConfiguration
  ] = js.native
  val endpointProvider: ConfigurationPropertyDefinition[js.UndefOr[_], _, KinesisResolvableConfiguration, KinesisResolvedConfiguration] = js.native
  val handler: ConfigurationPropertyDefinition[
    js.UndefOr[Terminalware[_, Blob]], 
    Terminalware[_, Blob], 
    KinesisResolvableConfiguration, 
    KinesisResolvedConfiguration
  ] = js.native
  val httpHandler: ConfigurationPropertyDefinition[
    js.UndefOr[HttpHandler[Blob, HttpOptions]], 
    HttpHandler[Blob, HttpOptions], 
    KinesisResolvableConfiguration, 
    KinesisResolvedConfiguration
  ] = js.native
  val maxRedirects: ConfigurationPropertyDefinition[
    js.UndefOr[Double], 
    Double, 
    KinesisResolvableConfiguration, 
    KinesisResolvedConfiguration
  ] = js.native
  val maxRetries: ConfigurationPropertyDefinition[
    js.UndefOr[Double], 
    Double, 
    KinesisResolvableConfiguration, 
    KinesisResolvedConfiguration
  ] = js.native
  val parser: ConfigurationPropertyDefinition[
    ResponseParser[Blob], 
    ResponseParser[Blob], 
    KinesisResolvableConfiguration, 
    KinesisResolvedConfiguration
  ] = js.native
  val profile: ConfigurationPropertyDefinition[
    js.UndefOr[String], 
    js.UndefOr[String], 
    KinesisResolvableConfiguration, 
    KinesisResolvedConfiguration
  ] = js.native
  val region: ConfigurationPropertyDefinition[
    String | Provider[String], 
    Provider[String], 
    KinesisResolvableConfiguration, 
    KinesisResolvedConfiguration
  ] = js.native
  val retryDecider: ConfigurationPropertyDefinition[
    js.UndefOr[RetryDecider], 
    js.UndefOr[RetryDecider], 
    KinesisResolvableConfiguration, 
    KinesisResolvedConfiguration
  ] = js.native
  val serializer: ConfigurationPropertyDefinition[
    Provider[RequestSerializer[Blob]], 
    Provider[RequestSerializer[Blob]], 
    KinesisResolvableConfiguration, 
    KinesisResolvedConfiguration
  ] = js.native
  val sha256: ConfigurationPropertyDefinition[
    js.UndefOr[HashConstructor], 
    HashConstructor, 
    KinesisResolvableConfiguration, 
    KinesisResolvedConfiguration
  ] = js.native
  val signer: ConfigurationPropertyDefinition[
    js.UndefOr[RequestSigner], 
    RequestSigner, 
    KinesisResolvableConfiguration, 
    KinesisResolvedConfiguration
  ] = js.native
  val signingName: ConfigurationPropertyDefinition[
    js.UndefOr[String], 
    String, 
    KinesisResolvableConfiguration, 
    KinesisResolvedConfiguration
  ] = js.native
  val sslEnabled: ConfigurationPropertyDefinition[
    js.UndefOr[Boolean], 
    Boolean, 
    KinesisResolvableConfiguration, 
    KinesisResolvedConfiguration
  ] = js.native
  val streamCollector: ConfigurationPropertyDefinition[
    js.UndefOr[StreamCollector[Blob]], 
    StreamCollector[Blob], 
    KinesisResolvableConfiguration, 
    KinesisResolvedConfiguration
  ] = js.native
  val urlParser: ConfigurationPropertyDefinition[
    js.UndefOr[UrlParser], 
    UrlParser, 
    KinesisResolvableConfiguration, 
    KinesisResolvedConfiguration
  ] = js.native
  val utf8Decoder: ConfigurationPropertyDefinition[
    js.UndefOr[Decoder], 
    Decoder, 
    KinesisResolvableConfiguration, 
    KinesisResolvedConfiguration
  ] = js.native
  val utf8Encoder: ConfigurationPropertyDefinition[
    js.UndefOr[Encoder], 
    Encoder, 
    KinesisResolvableConfiguration, 
    KinesisResolvedConfiguration
  ] = js.native
}

