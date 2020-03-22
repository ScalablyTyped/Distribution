package typings.awsSdkClientDynamodbBrowser.dynamoDBConfigurationMod

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

@JSImport("@aws-sdk/client-dynamodb-browser/DynamoDBConfiguration", "configurationProperties")
@js.native
object configurationProperties extends js.Object {
  val _user_injected_http_handler: ConfigurationPropertyDefinition[_, Boolean, DynamoDBResolvableConfiguration, DynamoDBResolvedConfiguration] = js.native
  val base64Decoder: ConfigurationPropertyDefinition[
    js.UndefOr[Decoder], 
    Decoder, 
    DynamoDBResolvableConfiguration, 
    DynamoDBResolvedConfiguration
  ] = js.native
  val base64Encoder: ConfigurationPropertyDefinition[
    js.UndefOr[Encoder], 
    Encoder, 
    DynamoDBResolvableConfiguration, 
    DynamoDBResolvedConfiguration
  ] = js.native
  val bodyLengthChecker: ConfigurationPropertyDefinition[
    js.Function1[/* body */ _, js.UndefOr[Double]], 
    js.Function1[/* body */ _, js.UndefOr[Double]], 
    DynamoDBResolvableConfiguration, 
    DynamoDBResolvedConfiguration
  ] = js.native
  val credentials: ConfigurationPropertyDefinition[
    Credentials | Provider[Credentials], 
    Provider[Credentials], 
    DynamoDBResolvableConfiguration, 
    DynamoDBResolvedConfiguration
  ] = js.native
  val delayDecider: ConfigurationPropertyDefinition[
    js.UndefOr[DelayDecider], 
    js.UndefOr[DelayDecider], 
    DynamoDBResolvableConfiguration, 
    DynamoDBResolvedConfiguration
  ] = js.native
  val endpoint: ConfigurationPropertyDefinition[
    js.UndefOr[String | HttpEndpoint | Provider[HttpEndpoint]], 
    Provider[HttpEndpoint], 
    DynamoDBResolvableConfiguration, 
    DynamoDBResolvedConfiguration
  ] = js.native
  val endpointProvider: ConfigurationPropertyDefinition[js.UndefOr[_], _, DynamoDBResolvableConfiguration, DynamoDBResolvedConfiguration] = js.native
  val handler: ConfigurationPropertyDefinition[
    js.UndefOr[Terminalware[_, Blob]], 
    Terminalware[_, Blob], 
    DynamoDBResolvableConfiguration, 
    DynamoDBResolvedConfiguration
  ] = js.native
  val httpHandler: ConfigurationPropertyDefinition[
    js.UndefOr[HttpHandler[Blob, HttpOptions]], 
    HttpHandler[Blob, HttpOptions], 
    DynamoDBResolvableConfiguration, 
    DynamoDBResolvedConfiguration
  ] = js.native
  val maxRedirects: ConfigurationPropertyDefinition[
    js.UndefOr[Double], 
    Double, 
    DynamoDBResolvableConfiguration, 
    DynamoDBResolvedConfiguration
  ] = js.native
  val maxRetries: ConfigurationPropertyDefinition[
    js.UndefOr[Double], 
    Double, 
    DynamoDBResolvableConfiguration, 
    DynamoDBResolvedConfiguration
  ] = js.native
  val parser: ConfigurationPropertyDefinition[
    ResponseParser[Blob], 
    ResponseParser[Blob], 
    DynamoDBResolvableConfiguration, 
    DynamoDBResolvedConfiguration
  ] = js.native
  val profile: ConfigurationPropertyDefinition[
    js.UndefOr[String], 
    js.UndefOr[String], 
    DynamoDBResolvableConfiguration, 
    DynamoDBResolvedConfiguration
  ] = js.native
  val region: ConfigurationPropertyDefinition[
    String | Provider[String], 
    Provider[String], 
    DynamoDBResolvableConfiguration, 
    DynamoDBResolvedConfiguration
  ] = js.native
  val retryDecider: ConfigurationPropertyDefinition[
    js.UndefOr[RetryDecider], 
    js.UndefOr[RetryDecider], 
    DynamoDBResolvableConfiguration, 
    DynamoDBResolvedConfiguration
  ] = js.native
  val serializer: ConfigurationPropertyDefinition[
    Provider[RequestSerializer[Blob]], 
    Provider[RequestSerializer[Blob]], 
    DynamoDBResolvableConfiguration, 
    DynamoDBResolvedConfiguration
  ] = js.native
  val sha256: ConfigurationPropertyDefinition[
    js.UndefOr[HashConstructor], 
    HashConstructor, 
    DynamoDBResolvableConfiguration, 
    DynamoDBResolvedConfiguration
  ] = js.native
  val signer: ConfigurationPropertyDefinition[
    js.UndefOr[RequestSigner], 
    RequestSigner, 
    DynamoDBResolvableConfiguration, 
    DynamoDBResolvedConfiguration
  ] = js.native
  val signingName: ConfigurationPropertyDefinition[
    js.UndefOr[String], 
    String, 
    DynamoDBResolvableConfiguration, 
    DynamoDBResolvedConfiguration
  ] = js.native
  val sslEnabled: ConfigurationPropertyDefinition[
    js.UndefOr[Boolean], 
    Boolean, 
    DynamoDBResolvableConfiguration, 
    DynamoDBResolvedConfiguration
  ] = js.native
  val streamCollector: ConfigurationPropertyDefinition[
    js.UndefOr[StreamCollector[Blob]], 
    StreamCollector[Blob], 
    DynamoDBResolvableConfiguration, 
    DynamoDBResolvedConfiguration
  ] = js.native
  val urlParser: ConfigurationPropertyDefinition[
    js.UndefOr[UrlParser], 
    UrlParser, 
    DynamoDBResolvableConfiguration, 
    DynamoDBResolvedConfiguration
  ] = js.native
  val utf8Decoder: ConfigurationPropertyDefinition[
    js.UndefOr[Decoder], 
    Decoder, 
    DynamoDBResolvableConfiguration, 
    DynamoDBResolvedConfiguration
  ] = js.native
  val utf8Encoder: ConfigurationPropertyDefinition[
    js.UndefOr[Encoder], 
    Encoder, 
    DynamoDBResolvableConfiguration, 
    DynamoDBResolvedConfiguration
  ] = js.native
}

