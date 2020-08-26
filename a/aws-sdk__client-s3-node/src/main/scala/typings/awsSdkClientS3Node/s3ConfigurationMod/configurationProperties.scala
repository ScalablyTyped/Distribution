package typings.awsSdkClientS3Node.s3ConfigurationMod

import typings.awsSdkClientS3Node.anon.Instantiable
import typings.awsSdkTypes.clientMod.ConfigurationPropertyDefinition
import typings.awsSdkTypes.credentialsMod.Credentials
import typings.awsSdkTypes.cryptoMod.HashConstructor
import typings.awsSdkTypes.cryptoMod.StreamHasher
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

@JSImport("@aws-sdk/client-s3-node/S3Configuration", "configurationProperties")
@js.native
object configurationProperties extends js.Object {
  val _user_injected_http_handler: ConfigurationPropertyDefinition[_, js.UndefOr[_], S3ResolvableConfiguration, S3ResolvedConfiguration] = js.native
  val base64Decoder: js.UndefOr[
    ConfigurationPropertyDefinition[js.UndefOr[Decoder], js.UndefOr[_], S3ResolvableConfiguration, S3ResolvedConfiguration]
  ] = js.native
  val base64Encoder: js.UndefOr[
    ConfigurationPropertyDefinition[js.UndefOr[Encoder], js.UndefOr[_], S3ResolvableConfiguration, S3ResolvedConfiguration]
  ] = js.native
  val bodyLengthChecker: ConfigurationPropertyDefinition[
    js.Function1[/* body */ _, js.UndefOr[Double]], 
    js.UndefOr[_], 
    S3ResolvableConfiguration, 
    S3ResolvedConfiguration
  ] = js.native
  val bucketEndpoint: js.UndefOr[
    ConfigurationPropertyDefinition[js.UndefOr[Boolean], js.UndefOr[_], S3ResolvableConfiguration, S3ResolvedConfiguration]
  ] = js.native
  val credentials: js.UndefOr[
    ConfigurationPropertyDefinition[
      js.UndefOr[Credentials | Provider[Credentials]], 
      js.UndefOr[_], 
      S3ResolvableConfiguration, 
      S3ResolvedConfiguration
    ]
  ] = js.native
  val delayDecider: js.UndefOr[
    ConfigurationPropertyDefinition[
      js.UndefOr[DelayDecider], 
      js.UndefOr[_], 
      S3ResolvableConfiguration, 
      S3ResolvedConfiguration
    ]
  ] = js.native
  val disableBodySigning: js.UndefOr[
    ConfigurationPropertyDefinition[js.UndefOr[Boolean], js.UndefOr[_], S3ResolvableConfiguration, S3ResolvedConfiguration]
  ] = js.native
  val endpoint: js.UndefOr[
    ConfigurationPropertyDefinition[
      js.UndefOr[String | HttpEndpoint | Provider[HttpEndpoint]], 
      js.UndefOr[_], 
      S3ResolvableConfiguration, 
      S3ResolvedConfiguration
    ]
  ] = js.native
  val endpointProvider: js.UndefOr[
    ConfigurationPropertyDefinition[js.UndefOr[_], js.UndefOr[_], S3ResolvableConfiguration, S3ResolvedConfiguration]
  ] = js.native
  val forcePathStyle: js.UndefOr[
    ConfigurationPropertyDefinition[js.UndefOr[Boolean], js.UndefOr[_], S3ResolvableConfiguration, S3ResolvedConfiguration]
  ] = js.native
  val handler: js.UndefOr[
    ConfigurationPropertyDefinition[
      js.UndefOr[Terminalware[_, Readable]], 
      js.UndefOr[_], 
      S3ResolvableConfiguration, 
      S3ResolvedConfiguration
    ]
  ] = js.native
  val httpHandler: js.UndefOr[
    ConfigurationPropertyDefinition[
      js.UndefOr[HttpHandler[Readable, HttpOptions]], 
      js.UndefOr[_], 
      S3ResolvableConfiguration, 
      S3ResolvedConfiguration
    ]
  ] = js.native
  val maxRedirects: js.UndefOr[
    ConfigurationPropertyDefinition[js.UndefOr[Double], js.UndefOr[_], S3ResolvableConfiguration, S3ResolvedConfiguration]
  ] = js.native
  val maxRetries: js.UndefOr[
    ConfigurationPropertyDefinition[js.UndefOr[Double], js.UndefOr[_], S3ResolvableConfiguration, S3ResolvedConfiguration]
  ] = js.native
  val md5: js.UndefOr[
    ConfigurationPropertyDefinition[
      js.UndefOr[Instantiable], 
      js.UndefOr[_], 
      S3ResolvableConfiguration, 
      S3ResolvedConfiguration
    ]
  ] = js.native
  val parser: ConfigurationPropertyDefinition[
    ResponseParser[Readable], 
    js.UndefOr[_], 
    S3ResolvableConfiguration, 
    S3ResolvedConfiguration
  ] = js.native
  val profile: js.UndefOr[
    ConfigurationPropertyDefinition[js.UndefOr[String], js.UndefOr[_], S3ResolvableConfiguration, S3ResolvedConfiguration]
  ] = js.native
  val region: js.UndefOr[
    ConfigurationPropertyDefinition[
      js.UndefOr[String | Provider[String]], 
      js.UndefOr[_], 
      S3ResolvableConfiguration, 
      S3ResolvedConfiguration
    ]
  ] = js.native
  val retryDecider: js.UndefOr[
    ConfigurationPropertyDefinition[
      js.UndefOr[RetryDecider], 
      js.UndefOr[_], 
      S3ResolvableConfiguration, 
      S3ResolvedConfiguration
    ]
  ] = js.native
  val serializer: ConfigurationPropertyDefinition[
    Provider[RequestSerializer[Readable]], 
    js.UndefOr[_], 
    S3ResolvableConfiguration, 
    S3ResolvedConfiguration
  ] = js.native
  val sha256: js.UndefOr[
    ConfigurationPropertyDefinition[
      js.UndefOr[HashConstructor], 
      js.UndefOr[_], 
      S3ResolvableConfiguration, 
      S3ResolvedConfiguration
    ]
  ] = js.native
  val signer: js.UndefOr[
    ConfigurationPropertyDefinition[
      js.UndefOr[RequestSigner], 
      js.UndefOr[_], 
      S3ResolvableConfiguration, 
      S3ResolvedConfiguration
    ]
  ] = js.native
  val signingName: js.UndefOr[
    ConfigurationPropertyDefinition[js.UndefOr[String], js.UndefOr[_], S3ResolvableConfiguration, S3ResolvedConfiguration]
  ] = js.native
  val sslEnabled: js.UndefOr[
    ConfigurationPropertyDefinition[js.UndefOr[Boolean], js.UndefOr[_], S3ResolvableConfiguration, S3ResolvedConfiguration]
  ] = js.native
  val streamCollector: js.UndefOr[
    ConfigurationPropertyDefinition[
      js.UndefOr[StreamCollector[Readable]], 
      js.UndefOr[_], 
      S3ResolvableConfiguration, 
      S3ResolvedConfiguration
    ]
  ] = js.native
  val streamHasher: js.UndefOr[
    ConfigurationPropertyDefinition[
      js.UndefOr[StreamHasher[Readable]], 
      js.UndefOr[_], 
      S3ResolvableConfiguration, 
      S3ResolvedConfiguration
    ]
  ] = js.native
  val urlParser: js.UndefOr[
    ConfigurationPropertyDefinition[
      js.UndefOr[UrlParser], 
      js.UndefOr[_], 
      S3ResolvableConfiguration, 
      S3ResolvedConfiguration
    ]
  ] = js.native
  val useAccelerateEndpoint: js.UndefOr[
    ConfigurationPropertyDefinition[js.UndefOr[Boolean], js.UndefOr[_], S3ResolvableConfiguration, S3ResolvedConfiguration]
  ] = js.native
  val useDualstackEndpoint: js.UndefOr[
    ConfigurationPropertyDefinition[js.UndefOr[Boolean], js.UndefOr[_], S3ResolvableConfiguration, S3ResolvedConfiguration]
  ] = js.native
  val utf8Decoder: js.UndefOr[
    ConfigurationPropertyDefinition[js.UndefOr[Decoder], js.UndefOr[_], S3ResolvableConfiguration, S3ResolvedConfiguration]
  ] = js.native
  val utf8Encoder: js.UndefOr[
    ConfigurationPropertyDefinition[js.UndefOr[Encoder], js.UndefOr[_], S3ResolvableConfiguration, S3ResolvedConfiguration]
  ] = js.native
}

