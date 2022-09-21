package typings.awsSdkEventstreamMarshaller

import typings.awsSdkTypes.eventStreamMod.Message
import typings.awsSdkTypes.eventStreamMod.MessageHeaders
import typings.awsSdkTypes.utilMod.Decoder
import typings.awsSdkTypes.utilMod.Encoder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eventStreamMarshallerMod {
  
  @JSImport("@aws-sdk/eventstream-marshaller/dist-types/EventStreamMarshaller", "EventStreamMarshaller")
  @js.native
  open class EventStreamMarshaller protected () extends StObject {
    def this(toUtf8: Encoder, fromUtf8: Decoder) = this()
    
    /* private */ val codec: Any = js.native
    
    def formatHeaders(rawHeaders: MessageHeaders): js.typedarray.Uint8Array = js.native
    
    def marshall(message: Message): js.typedarray.Uint8Array = js.native
    
    def unmarshall(message: js.typedarray.ArrayBufferView): Message = js.native
  }
}
