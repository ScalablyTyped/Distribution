package typings.awsSdkEventstreamMarshaller

import typings.awsSdkTypes.eventStreamMod.MessageHeaders
import typings.awsSdkTypes.utilMod.Decoder
import typings.awsSdkTypes.utilMod.Encoder
import typings.std.DataView
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/eventstream-marshaller/dist/cjs/HeaderMarshaller", JSImport.Namespace)
@js.native
object headerMarshallerMod extends js.Object {
  
  @js.native
  class HeaderMarshaller protected () extends js.Object {
    def this(toUtf8: Encoder, fromUtf8: Decoder) = this()
    
    def format(headers: MessageHeaders): Uint8Array = js.native
    
    var formatHeaderValue: js.Any = js.native
    
    val fromUtf8: js.Any = js.native
    
    def parse(headers: DataView): MessageHeaders = js.native
    
    val toUtf8: js.Any = js.native
  }
}
