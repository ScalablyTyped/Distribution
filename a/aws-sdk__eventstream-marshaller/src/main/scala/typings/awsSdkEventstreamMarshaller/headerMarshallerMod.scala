package typings.awsSdkEventstreamMarshaller

import typings.awsSdkEventstreamMarshaller.messageMod.MessageHeaders
import typings.awsSdkTypes.utilMod.Decoder
import typings.awsSdkTypes.utilMod.Encoder
import typings.std.DataView
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/eventstream-marshaller/build/HeaderMarshaller", JSImport.Namespace)
@js.native
object headerMarshallerMod extends js.Object {
  @js.native
  class HeaderMarshaller protected () extends js.Object {
    def this(toUtf8: Encoder, fromUtf8: Decoder) = this()
    var formatHeaderValue: js.Any = js.native
    val fromUtf8: js.Any = js.native
    val toUtf8: js.Any = js.native
    def format(headers: MessageHeaders): Uint8Array = js.native
    def parse(headers: DataView): MessageHeaders = js.native
  }
  
}

