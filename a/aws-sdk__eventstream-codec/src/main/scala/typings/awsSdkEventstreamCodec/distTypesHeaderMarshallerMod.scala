package typings.awsSdkEventstreamCodec

import typings.awsSdkTypes.distTypesEventStreamMod.MessageHeaders
import typings.awsSdkTypes.distTypesUtilMod.Decoder
import typings.awsSdkTypes.distTypesUtilMod.Encoder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesHeaderMarshallerMod {
  
  @JSImport("@aws-sdk/eventstream-codec/dist-types/HeaderMarshaller", "HeaderMarshaller")
  @js.native
  open class HeaderMarshaller protected () extends StObject {
    def this(toUtf8: Encoder, fromUtf8: Decoder) = this()
    
    def format(headers: MessageHeaders): js.typedarray.Uint8Array = js.native
    
    /* private */ var formatHeaderValue: Any = js.native
    
    /* private */ val fromUtf8: Any = js.native
    
    def parse(headers: js.typedarray.DataView): MessageHeaders = js.native
    
    /* private */ val toUtf8: Any = js.native
  }
}
