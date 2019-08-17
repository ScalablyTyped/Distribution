package typings.atAwsDashSdkSsecDashMiddleware.atAwsDashSdkSsecDashMiddlewareMod

import typings.atAwsDashSdkSsecDashMiddleware.Anon_Hash
import typings.atAwsDashSdkTypes.buildUtilMod.Decoder
import typings.atAwsDashSdkTypes.buildUtilMod.Encoder
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SsecMiddlewareConfiguration[Input /* <: js.Object */] extends js.Object {
  @JSName("base64Encoder")
  var base64Encoder_Original: Encoder = js.native
  var hashConstructor: Anon_Hash = js.native
  var ssecProperties: SsecPropertiesConfiguration[Input] = js.native
  @JSName("utf8Decoder")
  var utf8Decoder_Original: Decoder = js.native
  def base64Encoder(input: Uint8Array): String = js.native
  def utf8Decoder(input: String): Uint8Array = js.native
}

