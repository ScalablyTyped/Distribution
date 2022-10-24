package typings.awsSdkEventstreamCodec

import typings.awsSdkTypes.distTypesEventStreamMod.Message
import typings.awsSdkTypes.distTypesEventStreamMod.MessageHeaders
import typings.awsSdkTypes.distTypesUtilMod.Decoder
import typings.awsSdkTypes.distTypesUtilMod.Encoder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesEventStreamCodecMod {
  
  @JSImport("@aws-sdk/eventstream-codec/dist-types/EventStreamCodec", "EventStreamCodec")
  @js.native
  open class EventStreamCodec protected () extends StObject {
    def this(toUtf8: Encoder, fromUtf8: Decoder) = this()
    
    /**
      * Convert a binary event stream message into a JavaScript object with an
      * opaque, binary body and tagged, parsed headers.
      */
    def decode(message: js.typedarray.ArrayBufferView): Message = js.native
    
    /**
      * Convert a structured JavaScript object with tagged headers into a binary
      * event stream message.
      */
    def encode(param0: Message): js.typedarray.Uint8Array = js.native
    
    /**
      * Convert a structured JavaScript object with tagged headers into a binary
      * event stream message header.
      */
    def formatHeaders(rawHeaders: MessageHeaders): js.typedarray.Uint8Array = js.native
    
    /* private */ val headerMarshaller: Any = js.native
  }
}
