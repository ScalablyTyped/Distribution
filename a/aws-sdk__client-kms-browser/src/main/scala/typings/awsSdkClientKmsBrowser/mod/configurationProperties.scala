package typings.awsSdkClientKmsBrowser.mod

import typings.awsSdkClientKmsBrowser.kmsconfigurationMod.KMSResolvableConfiguration
import typings.awsSdkClientKmsBrowser.kmsconfigurationMod.KMSResolvedConfiguration
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

@JSImport("@aws-sdk/client-kms-browser", "configurationProperties")
@js.native
object configurationProperties extends js.Object {
  val _user_injected_http_handler: ConfigurationPropertyDefinition[_, Boolean, KMSResolvableConfiguration, KMSResolvedConfiguration] = js.native
  val base64Decoder: js.UndefOr[
    ConfigurationPropertyDefinition[js.UndefOr[Decoder], Decoder, KMSResolvableConfiguration, KMSResolvedConfiguration]
  ] = js.native
  val base64Encoder: js.UndefOr[
    ConfigurationPropertyDefinition[js.UndefOr[Encoder], Encoder, KMSResolvableConfiguration, KMSResolvedConfiguration]
  ] = js.native
  val bodyLengthChecker: ConfigurationPropertyDefinition[
    js.Function1[/* body */ _, js.UndefOr[Double]], 
    js.Function1[/* body */ _, js.UndefOr[Double]], 
    KMSResolvableConfiguration, 
    KMSResolvedConfiguration
  ] = js.native
  val credentials: ConfigurationPropertyDefinition[
    Credentials | Provider[Credentials], 
    Provider[Credentials], 
    KMSResolvableConfiguration, 
    KMSResolvedConfiguration
  ] = js.native
  val delayDecider: js.UndefOr[
    ConfigurationPropertyDefinition[
      js.UndefOr[DelayDecider], 
      js.UndefOr[DelayDecider], 
      KMSResolvableConfiguration, 
      KMSResolvedConfiguration
    ]
  ] = js.native
  val endpoint: js.UndefOr[
    ConfigurationPropertyDefinition[
      js.UndefOr[String | HttpEndpoint | Provider[HttpEndpoint]], 
      Provider[HttpEndpoint], 
      KMSResolvableConfiguration, 
      KMSResolvedConfiguration
    ]
  ] = js.native
  val endpointProvider: js.UndefOr[
    ConfigurationPropertyDefinition[js.UndefOr[_], _, KMSResolvableConfiguration, KMSResolvedConfiguration]
  ] = js.native
  val handler: js.UndefOr[
    ConfigurationPropertyDefinition[
      js.UndefOr[Terminalware[_, Blob]], 
      Terminalware[_, Blob], 
      KMSResolvableConfiguration, 
      KMSResolvedConfiguration
    ]
  ] = js.native
  val httpHandler: js.UndefOr[
    ConfigurationPropertyDefinition[
      js.UndefOr[HttpHandler[Blob, HttpOptions]], 
      HttpHandler[Blob, HttpOptions], 
      KMSResolvableConfiguration, 
      KMSResolvedConfiguration
    ]
  ] = js.native
  val maxRedirects: js.UndefOr[
    ConfigurationPropertyDefinition[js.UndefOr[Double], Double, KMSResolvableConfiguration, KMSResolvedConfiguration]
  ] = js.native
  val maxRetries: js.UndefOr[
    ConfigurationPropertyDefinition[js.UndefOr[Double], Double, KMSResolvableConfiguration, KMSResolvedConfiguration]
  ] = js.native
  val parser: ConfigurationPropertyDefinition[
    ResponseParser[Blob], 
    ResponseParser[Blob], 
    KMSResolvableConfiguration, 
    KMSResolvedConfiguration
  ] = js.native
  val profile: js.UndefOr[
    ConfigurationPropertyDefinition[
      js.UndefOr[String], 
      js.UndefOr[String], 
      KMSResolvableConfiguration, 
      KMSResolvedConfiguration
    ]
  ] = js.native
  val region: ConfigurationPropertyDefinition[
    String | Provider[String], 
    Provider[String], 
    KMSResolvableConfiguration, 
    KMSResolvedConfiguration
  ] = js.native
  val retryDecider: js.UndefOr[
    ConfigurationPropertyDefinition[
      js.UndefOr[RetryDecider], 
      js.UndefOr[RetryDecider], 
      KMSResolvableConfiguration, 
      KMSResolvedConfiguration
    ]
  ] = js.native
  val serializer: ConfigurationPropertyDefinition[
    Provider[RequestSerializer[Blob]], 
    Provider[RequestSerializer[Blob]], 
    KMSResolvableConfiguration, 
    KMSResolvedConfiguration
  ] = js.native
  val sha256: js.UndefOr[
    ConfigurationPropertyDefinition[
      js.UndefOr[HashConstructor], 
      HashConstructor, 
      KMSResolvableConfiguration, 
      KMSResolvedConfiguration
    ]
  ] = js.native
  val signer: js.UndefOr[
    ConfigurationPropertyDefinition[
      js.UndefOr[RequestSigner], 
      RequestSigner, 
      KMSResolvableConfiguration, 
      KMSResolvedConfiguration
    ]
  ] = js.native
  val signingName: js.UndefOr[
    ConfigurationPropertyDefinition[js.UndefOr[String], String, KMSResolvableConfiguration, KMSResolvedConfiguration]
  ] = js.native
  val sslEnabled: js.UndefOr[
    ConfigurationPropertyDefinition[js.UndefOr[Boolean], Boolean, KMSResolvableConfiguration, KMSResolvedConfiguration]
  ] = js.native
  val streamCollector: js.UndefOr[
    ConfigurationPropertyDefinition[
      js.UndefOr[StreamCollector[Blob]], 
      StreamCollector[Blob], 
      KMSResolvableConfiguration, 
      KMSResolvedConfiguration
    ]
  ] = js.native
  val urlParser: js.UndefOr[
    ConfigurationPropertyDefinition[js.UndefOr[UrlParser], UrlParser, KMSResolvableConfiguration, KMSResolvedConfiguration]
  ] = js.native
  val utf8Decoder: js.UndefOr[
    ConfigurationPropertyDefinition[js.UndefOr[Decoder], Decoder, KMSResolvableConfiguration, KMSResolvedConfiguration]
  ] = js.native
  val utf8Encoder: js.UndefOr[
    ConfigurationPropertyDefinition[js.UndefOr[Encoder], Encoder, KMSResolvableConfiguration, KMSResolvedConfiguration]
  ] = js.native
}

