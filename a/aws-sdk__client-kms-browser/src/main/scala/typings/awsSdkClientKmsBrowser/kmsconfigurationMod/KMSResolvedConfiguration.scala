package typings.awsSdkClientKmsBrowser.kmsconfigurationMod

import typings.awsSdkTypes.credentialsMod.Credentials
import typings.awsSdkTypes.cryptoMod.HashConstructor
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
import typings.std.Blob
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KMSResolvedConfiguration extends KMSConfiguration {
  
  var _user_injected_http_handler: Boolean = js.native
  
  @JSName("base64Decoder")
  def base64Decoder_MKMSResolvedConfiguration(input: String): Uint8Array = js.native
  @JSName("base64Decoder")
  var base64Decoder_Original: Decoder = js.native
  
  @JSName("base64Encoder")
  def base64Encoder_MKMSResolvedConfiguration(input: Uint8Array): String = js.native
  @JSName("base64Encoder")
  var base64Encoder_Original: Encoder = js.native
  
  def bodyLengthChecker(body: js.Any): js.UndefOr[Double] = js.native
  
  @JSName("credentials")
  def credentials_MKMSResolvedConfiguration(): js.Promise[Credentials] = js.native
  @JSName("credentials")
  var credentials_Original: Provider[Credentials] = js.native
  
  @JSName("endpoint")
  def endpoint_MKMSResolvedConfiguration(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_types.HttpEndpoint */ _
  ] = js.native
  @JSName("endpoint")
  var endpoint_Original: Provider[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_types.HttpEndpoint */ _
  ] = js.native
  
  @JSName("handler")
  def handler_MKMSResolvedConfiguration[Input /* <: js.Object */, Output /* <: js.Object */](context: HandlerExecutionContext): DeserializeHandler[Input, Output] = js.native
  @JSName("handler")
  var handler_Original: Terminalware = js.native
  
  @JSName("maxRedirects")
  var maxRedirects_KMSResolvedConfiguration: Double = js.native
  
  @JSName("maxRetries")
  var maxRetries_KMSResolvedConfiguration: Double = js.native
  
  var parser: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_types.ResponseParser<Blob> */ js.Any = js.native
  
  @JSName("region")
  def region_MKMSResolvedConfiguration(): js.Promise[String] = js.native
  @JSName("region")
  var region_Original: Provider[String] = js.native
  
  def serializer(): js.Promise[RequestSerializer[Blob, _]] = js.native
  @JSName("serializer")
  var serializer_Original: Provider[RequestSerializer[Blob, _]] = js.native
  
  @JSName("sha256")
  var sha256_KMSResolvedConfiguration: HashConstructor = js.native
  
  @JSName("signer")
  var signer_KMSResolvedConfiguration: RequestSigner = js.native
  
  @JSName("signingName")
  var signingName_KMSResolvedConfiguration: String = js.native
  
  @JSName("sslEnabled")
  var sslEnabled_KMSResolvedConfiguration: Boolean = js.native
  
  @JSName("streamCollector")
  def streamCollector_MKMSResolvedConfiguration(stream: js.Any): js.Promise[Uint8Array] = js.native
  @JSName("streamCollector")
  var streamCollector_Original: StreamCollector = js.native
  
  @JSName("urlParser")
  def urlParser_MKMSResolvedConfiguration(url: String): Endpoint = js.native
  @JSName("urlParser")
  var urlParser_Original: UrlParser = js.native
  
  @JSName("utf8Decoder")
  def utf8Decoder_MKMSResolvedConfiguration(input: String): Uint8Array = js.native
  @JSName("utf8Decoder")
  var utf8Decoder_Original: Decoder = js.native
  
  @JSName("utf8Encoder")
  def utf8Encoder_MKMSResolvedConfiguration(input: Uint8Array): String = js.native
  @JSName("utf8Encoder")
  var utf8Encoder_Original: Encoder = js.native
}
