package typings.awsSdkClientGlacierNode.glacierConfigurationMod

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
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-glacier-node/GlacierConfiguration", "configurationProperties")
@js.native
object configurationProperties extends js.Object {
  val _user_injected_http_handler: ConfigurationPropertyDefinition[_, Boolean, GlacierResolvableConfiguration, GlacierResolvedConfiguration] = js.native
  val base64Decoder: ConfigurationPropertyDefinition[
    js.UndefOr[Decoder], 
    Decoder, 
    GlacierResolvableConfiguration, 
    GlacierResolvedConfiguration
  ] = js.native
  val base64Encoder: ConfigurationPropertyDefinition[
    js.UndefOr[Encoder], 
    Encoder, 
    GlacierResolvableConfiguration, 
    GlacierResolvedConfiguration
  ] = js.native
  val bodyLengthChecker: ConfigurationPropertyDefinition[
    js.Function1[/* body */ _, js.UndefOr[Double]], 
    js.Function1[/* body */ _, js.UndefOr[Double]], 
    GlacierResolvableConfiguration, 
    GlacierResolvedConfiguration
  ] = js.native
  val credentials: ConfigurationPropertyDefinition[
    js.UndefOr[Credentials | Provider[Credentials]], 
    Provider[Credentials], 
    GlacierResolvableConfiguration, 
    GlacierResolvedConfiguration
  ] = js.native
  val delayDecider: ConfigurationPropertyDefinition[
    js.UndefOr[DelayDecider], 
    js.UndefOr[DelayDecider], 
    GlacierResolvableConfiguration, 
    GlacierResolvedConfiguration
  ] = js.native
  val endpoint: ConfigurationPropertyDefinition[
    js.UndefOr[String | HttpEndpoint | Provider[HttpEndpoint]], 
    Provider[HttpEndpoint], 
    GlacierResolvableConfiguration, 
    GlacierResolvedConfiguration
  ] = js.native
  val endpointProvider: ConfigurationPropertyDefinition[js.UndefOr[_], _, GlacierResolvableConfiguration, GlacierResolvedConfiguration] = js.native
  val handler: ConfigurationPropertyDefinition[
    js.UndefOr[Terminalware[_, Readable]], 
    Terminalware[_, Readable], 
    GlacierResolvableConfiguration, 
    GlacierResolvedConfiguration
  ] = js.native
  val httpHandler: ConfigurationPropertyDefinition[
    js.UndefOr[HttpHandler[Readable, HttpOptions]], 
    HttpHandler[Readable, HttpOptions], 
    GlacierResolvableConfiguration, 
    GlacierResolvedConfiguration
  ] = js.native
  val maxRedirects: ConfigurationPropertyDefinition[
    js.UndefOr[Double], 
    Double, 
    GlacierResolvableConfiguration, 
    GlacierResolvedConfiguration
  ] = js.native
  val maxRetries: ConfigurationPropertyDefinition[
    js.UndefOr[Double], 
    Double, 
    GlacierResolvableConfiguration, 
    GlacierResolvedConfiguration
  ] = js.native
  val parser: ConfigurationPropertyDefinition[
    ResponseParser[Readable], 
    ResponseParser[Readable], 
    GlacierResolvableConfiguration, 
    GlacierResolvedConfiguration
  ] = js.native
  val profile: ConfigurationPropertyDefinition[
    js.UndefOr[String], 
    js.UndefOr[String], 
    GlacierResolvableConfiguration, 
    GlacierResolvedConfiguration
  ] = js.native
  val region: ConfigurationPropertyDefinition[
    js.UndefOr[String | Provider[String]], 
    Provider[String], 
    GlacierResolvableConfiguration, 
    GlacierResolvedConfiguration
  ] = js.native
  val retryDecider: ConfigurationPropertyDefinition[
    js.UndefOr[RetryDecider], 
    js.UndefOr[RetryDecider], 
    GlacierResolvableConfiguration, 
    GlacierResolvedConfiguration
  ] = js.native
  val serializer: ConfigurationPropertyDefinition[
    Provider[RequestSerializer[Readable]], 
    Provider[RequestSerializer[Readable]], 
    GlacierResolvableConfiguration, 
    GlacierResolvedConfiguration
  ] = js.native
  val sha256: ConfigurationPropertyDefinition[
    js.UndefOr[HashConstructor], 
    HashConstructor, 
    GlacierResolvableConfiguration, 
    GlacierResolvedConfiguration
  ] = js.native
  val signer: ConfigurationPropertyDefinition[
    js.UndefOr[RequestSigner], 
    RequestSigner, 
    GlacierResolvableConfiguration, 
    GlacierResolvedConfiguration
  ] = js.native
  val signingName: ConfigurationPropertyDefinition[
    js.UndefOr[String], 
    String, 
    GlacierResolvableConfiguration, 
    GlacierResolvedConfiguration
  ] = js.native
  val sslEnabled: ConfigurationPropertyDefinition[
    js.UndefOr[Boolean], 
    Boolean, 
    GlacierResolvableConfiguration, 
    GlacierResolvedConfiguration
  ] = js.native
  val streamCollector: ConfigurationPropertyDefinition[
    js.UndefOr[StreamCollector[Readable]], 
    StreamCollector[Readable], 
    GlacierResolvableConfiguration, 
    GlacierResolvedConfiguration
  ] = js.native
  val urlParser: ConfigurationPropertyDefinition[
    js.UndefOr[UrlParser], 
    UrlParser, 
    GlacierResolvableConfiguration, 
    GlacierResolvedConfiguration
  ] = js.native
  val utf8Decoder: ConfigurationPropertyDefinition[
    js.UndefOr[Decoder], 
    Decoder, 
    GlacierResolvableConfiguration, 
    GlacierResolvedConfiguration
  ] = js.native
  val utf8Encoder: ConfigurationPropertyDefinition[
    js.UndefOr[Encoder], 
    Encoder, 
    GlacierResolvableConfiguration, 
    GlacierResolvedConfiguration
  ] = js.native
}

