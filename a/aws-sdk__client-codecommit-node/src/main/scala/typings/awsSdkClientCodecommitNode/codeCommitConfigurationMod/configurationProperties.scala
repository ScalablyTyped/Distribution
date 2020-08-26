package typings.awsSdkClientCodecommitNode.codeCommitConfigurationMod

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

@JSImport("@aws-sdk/client-codecommit-node/CodeCommitConfiguration", "configurationProperties")
@js.native
object configurationProperties extends js.Object {
  val _user_injected_http_handler: ConfigurationPropertyDefinition[_, Boolean, CodeCommitResolvableConfiguration, CodeCommitResolvedConfiguration] = js.native
  val base64Decoder: js.UndefOr[
    ConfigurationPropertyDefinition[
      js.UndefOr[Decoder], 
      Decoder, 
      CodeCommitResolvableConfiguration, 
      CodeCommitResolvedConfiguration
    ]
  ] = js.native
  val base64Encoder: js.UndefOr[
    ConfigurationPropertyDefinition[
      js.UndefOr[Encoder], 
      Encoder, 
      CodeCommitResolvableConfiguration, 
      CodeCommitResolvedConfiguration
    ]
  ] = js.native
  val bodyLengthChecker: ConfigurationPropertyDefinition[
    js.Function1[/* body */ _, js.UndefOr[Double]], 
    js.Function1[/* body */ _, js.UndefOr[Double]], 
    CodeCommitResolvableConfiguration, 
    CodeCommitResolvedConfiguration
  ] = js.native
  val credentials: js.UndefOr[
    ConfigurationPropertyDefinition[
      js.UndefOr[Credentials | Provider[Credentials]], 
      Provider[Credentials], 
      CodeCommitResolvableConfiguration, 
      CodeCommitResolvedConfiguration
    ]
  ] = js.native
  val delayDecider: js.UndefOr[
    ConfigurationPropertyDefinition[
      js.UndefOr[DelayDecider], 
      js.UndefOr[DelayDecider], 
      CodeCommitResolvableConfiguration, 
      CodeCommitResolvedConfiguration
    ]
  ] = js.native
  val endpoint: js.UndefOr[
    ConfigurationPropertyDefinition[
      js.UndefOr[String | HttpEndpoint | Provider[HttpEndpoint]], 
      Provider[HttpEndpoint], 
      CodeCommitResolvableConfiguration, 
      CodeCommitResolvedConfiguration
    ]
  ] = js.native
  val endpointProvider: js.UndefOr[
    ConfigurationPropertyDefinition[js.UndefOr[_], _, CodeCommitResolvableConfiguration, CodeCommitResolvedConfiguration]
  ] = js.native
  val handler: js.UndefOr[
    ConfigurationPropertyDefinition[
      js.UndefOr[Terminalware[_, Readable]], 
      Terminalware[_, Readable], 
      CodeCommitResolvableConfiguration, 
      CodeCommitResolvedConfiguration
    ]
  ] = js.native
  val httpHandler: js.UndefOr[
    ConfigurationPropertyDefinition[
      js.UndefOr[HttpHandler[Readable, HttpOptions]], 
      HttpHandler[Readable, HttpOptions], 
      CodeCommitResolvableConfiguration, 
      CodeCommitResolvedConfiguration
    ]
  ] = js.native
  val maxRedirects: js.UndefOr[
    ConfigurationPropertyDefinition[
      js.UndefOr[Double], 
      Double, 
      CodeCommitResolvableConfiguration, 
      CodeCommitResolvedConfiguration
    ]
  ] = js.native
  val maxRetries: js.UndefOr[
    ConfigurationPropertyDefinition[
      js.UndefOr[Double], 
      Double, 
      CodeCommitResolvableConfiguration, 
      CodeCommitResolvedConfiguration
    ]
  ] = js.native
  val parser: ConfigurationPropertyDefinition[
    ResponseParser[Readable], 
    ResponseParser[Readable], 
    CodeCommitResolvableConfiguration, 
    CodeCommitResolvedConfiguration
  ] = js.native
  val profile: js.UndefOr[
    ConfigurationPropertyDefinition[
      js.UndefOr[String], 
      js.UndefOr[String], 
      CodeCommitResolvableConfiguration, 
      CodeCommitResolvedConfiguration
    ]
  ] = js.native
  val region: js.UndefOr[
    ConfigurationPropertyDefinition[
      js.UndefOr[String | Provider[String]], 
      Provider[String], 
      CodeCommitResolvableConfiguration, 
      CodeCommitResolvedConfiguration
    ]
  ] = js.native
  val retryDecider: js.UndefOr[
    ConfigurationPropertyDefinition[
      js.UndefOr[RetryDecider], 
      js.UndefOr[RetryDecider], 
      CodeCommitResolvableConfiguration, 
      CodeCommitResolvedConfiguration
    ]
  ] = js.native
  val serializer: ConfigurationPropertyDefinition[
    Provider[RequestSerializer[Readable]], 
    Provider[RequestSerializer[Readable]], 
    CodeCommitResolvableConfiguration, 
    CodeCommitResolvedConfiguration
  ] = js.native
  val sha256: js.UndefOr[
    ConfigurationPropertyDefinition[
      js.UndefOr[HashConstructor], 
      HashConstructor, 
      CodeCommitResolvableConfiguration, 
      CodeCommitResolvedConfiguration
    ]
  ] = js.native
  val signer: js.UndefOr[
    ConfigurationPropertyDefinition[
      js.UndefOr[RequestSigner], 
      RequestSigner, 
      CodeCommitResolvableConfiguration, 
      CodeCommitResolvedConfiguration
    ]
  ] = js.native
  val signingName: js.UndefOr[
    ConfigurationPropertyDefinition[
      js.UndefOr[String], 
      String, 
      CodeCommitResolvableConfiguration, 
      CodeCommitResolvedConfiguration
    ]
  ] = js.native
  val sslEnabled: js.UndefOr[
    ConfigurationPropertyDefinition[
      js.UndefOr[Boolean], 
      Boolean, 
      CodeCommitResolvableConfiguration, 
      CodeCommitResolvedConfiguration
    ]
  ] = js.native
  val streamCollector: js.UndefOr[
    ConfigurationPropertyDefinition[
      js.UndefOr[StreamCollector[Readable]], 
      StreamCollector[Readable], 
      CodeCommitResolvableConfiguration, 
      CodeCommitResolvedConfiguration
    ]
  ] = js.native
  val urlParser: js.UndefOr[
    ConfigurationPropertyDefinition[
      js.UndefOr[UrlParser], 
      UrlParser, 
      CodeCommitResolvableConfiguration, 
      CodeCommitResolvedConfiguration
    ]
  ] = js.native
  val utf8Decoder: js.UndefOr[
    ConfigurationPropertyDefinition[
      js.UndefOr[Decoder], 
      Decoder, 
      CodeCommitResolvableConfiguration, 
      CodeCommitResolvedConfiguration
    ]
  ] = js.native
  val utf8Encoder: js.UndefOr[
    ConfigurationPropertyDefinition[
      js.UndefOr[Encoder], 
      Encoder, 
      CodeCommitResolvableConfiguration, 
      CodeCommitResolvedConfiguration
    ]
  ] = js.native
}

