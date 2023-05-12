package typings.awsSdkClientDynamodb.anon

import typings.awsSdkClientDynamodb.distTypesEndpointEndpointParametersMod.EndpointParameters
import typings.awsSdkTypes.distTypesEndpointMod.EndpointV2
import typings.awsSdkTypes.distTypesHttpMod.Endpoint
import typings.awsSdkTypes.distTypesUtilMod.Decoder
import typings.awsSdkTypes.distTypesUtilMod.Encoder
import typings.awsSdkTypes.distTypesUtilMod.UrlParser
import typings.std.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisableHostPrefix extends StObject {
  
  var apiVersion: String = js.native
  
  def base64Decoder(input: String): js.typedarray.Uint8Array = js.native
  @JSName("base64Decoder")
  var base64Decoder_Original: Decoder = js.native
  
  def base64Encoder(input: js.typedarray.Uint8Array): String = js.native
  @JSName("base64Encoder")
  var base64Encoder_Original: Encoder = js.native
  
  var disableHostPrefix: Boolean = js.native
  
  def endpointProvider(endpointParams: EndpointParameters): EndpointV2 = js.native
  def endpointProvider(endpointParams: EndpointParameters, context: Logger): EndpointV2 = js.native
  
  var logger: typings.awsSdkTypes.distTypesLoggerMod.Logger = js.native
  
  var serviceId: String = js.native
  
  def urlParser(url: String): Endpoint = js.native
  def urlParser(url: URL): Endpoint = js.native
  @JSName("urlParser")
  var urlParser_Original: UrlParser = js.native
  
  def utf8Decoder(input: String): js.typedarray.Uint8Array = js.native
  @JSName("utf8Decoder")
  var utf8Decoder_Original: Decoder = js.native
  
  def utf8Encoder(input: js.typedarray.Uint8Array): String = js.native
  @JSName("utf8Encoder")
  var utf8Encoder_Original: Encoder = js.native
}
