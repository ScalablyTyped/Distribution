package typings.awsSdkClientS3Node.s3ConfigurationMod

import typings.awsSdkClientS3Node.anon.Instantiable
import typings.awsSdkTypes.credentialsMod.Credentials
import typings.awsSdkTypes.cryptoMod.HashConstructor
import typings.awsSdkTypes.cryptoMod.StreamHasher
import typings.awsSdkTypes.httpMod.Endpoint
import typings.awsSdkTypes.middlewareMod.DeserializeHandler
import typings.awsSdkTypes.middlewareMod.HandlerExecutionContext
import typings.awsSdkTypes.middlewareMod.Terminalware
import typings.awsSdkTypes.serdeMod.RequestSerializer
import typings.awsSdkTypes.serdeMod.StreamCollector
import typings.awsSdkTypes.signatureMod.RequestSigner
import typings.awsSdkTypes.utilMod.Decoder
import typings.awsSdkTypes.utilMod.Encoder
import typings.awsSdkTypes.utilMod.Provider
import typings.awsSdkTypes.utilMod.UrlParser
import typings.node.streamMod.Readable
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_types.ClientResolvedConfigurationBase<OutputTypesUnion, _stream.Readable> * / any */ @js.native
trait S3ResolvedConfiguration extends S3Configuration {
  
  var _user_injected_http_handler: Boolean = js.native
  
  @JSName("base64Decoder")
  def base64Decoder_MS3ResolvedConfiguration(input: String): Uint8Array = js.native
  @JSName("base64Decoder")
  var base64Decoder_Original: Decoder = js.native
  
  @JSName("base64Encoder")
  def base64Encoder_MS3ResolvedConfiguration(input: Uint8Array): String = js.native
  @JSName("base64Encoder")
  var base64Encoder_Original: Encoder = js.native
  
  def bodyLengthChecker(body: js.Any): js.UndefOr[Double] = js.native
  
  @JSName("bucketEndpoint")
  var bucketEndpoint_S3ResolvedConfiguration: Boolean = js.native
  
  @JSName("credentials")
  def credentials_MS3ResolvedConfiguration(): js.Promise[Credentials] = js.native
  @JSName("credentials")
  var credentials_Original: Provider[Credentials] = js.native
  
  @JSName("disableBodySigning")
  var disableBodySigning_S3ResolvedConfiguration: Boolean = js.native
  
  @JSName("endpoint")
  def endpoint_MS3ResolvedConfiguration(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_types.HttpEndpoint */ _
  ] = js.native
  @JSName("endpoint")
  var endpoint_Original: Provider[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_types.HttpEndpoint */ _
  ] = js.native
  
  @JSName("forcePathStyle")
  var forcePathStyle_S3ResolvedConfiguration: Boolean = js.native
  
  @JSName("handler")
  def handler_MS3ResolvedConfiguration[Input /* <: js.Object */, Output /* <: js.Object */](context: HandlerExecutionContext): DeserializeHandler[Input, Output] = js.native
  @JSName("handler")
  var handler_Original: Terminalware = js.native
  
  @JSName("maxRedirects")
  var maxRedirects_S3ResolvedConfiguration: Double = js.native
  
  @JSName("maxRetries")
  var maxRetries_S3ResolvedConfiguration: Double = js.native
  
  @JSName("md5")
  var md5_S3ResolvedConfiguration: Instantiable = js.native
  
  var parser: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_types.ResponseParser<_stream.Readable> */ js.Any = js.native
  
  @JSName("region")
  def region_MS3ResolvedConfiguration(): js.Promise[String] = js.native
  @JSName("region")
  var region_Original: Provider[String] = js.native
  
  def serializer(): js.Promise[RequestSerializer[Readable, _]] = js.native
  @JSName("serializer")
  var serializer_Original: Provider[RequestSerializer[Readable, _]] = js.native
  
  @JSName("sha256")
  var sha256_S3ResolvedConfiguration: HashConstructor = js.native
  
  @JSName("signer")
  var signer_S3ResolvedConfiguration: RequestSigner = js.native
  
  @JSName("signingName")
  var signingName_S3ResolvedConfiguration: String = js.native
  
  @JSName("sslEnabled")
  var sslEnabled_S3ResolvedConfiguration: Boolean = js.native
  
  @JSName("streamCollector")
  def streamCollector_MS3ResolvedConfiguration(stream: js.Any): js.Promise[Uint8Array] = js.native
  @JSName("streamCollector")
  var streamCollector_Original: StreamCollector = js.native
  
  @JSName("streamHasher")
  def streamHasher_MS3ResolvedConfiguration(hashCtor: typings.awsSdkTypes.anon.Instantiable, stream: Readable): js.Promise[Uint8Array] = js.native
  @JSName("streamHasher")
  var streamHasher_Original: StreamHasher[Readable] = js.native
  
  @JSName("urlParser")
  def urlParser_MS3ResolvedConfiguration(url: String): Endpoint = js.native
  @JSName("urlParser")
  var urlParser_Original: UrlParser = js.native
  
  @JSName("useAccelerateEndpoint")
  var useAccelerateEndpoint_S3ResolvedConfiguration: Boolean = js.native
  
  @JSName("useDualstackEndpoint")
  var useDualstackEndpoint_S3ResolvedConfiguration: Boolean = js.native
  
  @JSName("utf8Decoder")
  def utf8Decoder_MS3ResolvedConfiguration(input: String): Uint8Array = js.native
  @JSName("utf8Decoder")
  var utf8Decoder_Original: Decoder = js.native
  
  @JSName("utf8Encoder")
  def utf8Encoder_MS3ResolvedConfiguration(input: Uint8Array): String = js.native
  @JSName("utf8Encoder")
  var utf8Encoder_Original: Encoder = js.native
}
