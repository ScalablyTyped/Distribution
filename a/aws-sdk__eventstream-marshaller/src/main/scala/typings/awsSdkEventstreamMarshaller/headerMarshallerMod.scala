package typings.awsSdkEventstreamMarshaller

import typings.awsSdkTypes.eventStreamMod.MessageHeaders
import typings.awsSdkTypes.utilMod.Decoder
import typings.awsSdkTypes.utilMod.Encoder
import typings.std.DataView
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object headerMarshallerMod {
  
  @JSImport("@aws-sdk/eventstream-marshaller/dist/cjs/HeaderMarshaller", "HeaderMarshaller")
  @js.native
  class HeaderMarshaller protected () extends StObject {
    def this(toUtf8: Encoder, fromUtf8: Decoder) = this()
    
    def format(headers: MessageHeaders): Uint8Array = js.native
    
    var formatHeaderValue: js.Any = js.native
    
    val fromUtf8: js.Any = js.native
    
    def parse(headers: DataView): MessageHeaders = js.native
    
    val toUtf8: js.Any = js.native
  }
}
