package typings.awsSdkEventstreamMarshaller

import typings.awsSdkTypes.utilMod.Decoder
import typings.awsSdkTypes.utilMod.Encoder
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/eventstream-marshaller", "EventStreamMarshaller")
  @js.native
  class EventStreamMarshaller protected ()
    extends typings.awsSdkEventstreamMarshaller.eventStreamMarshallerMod.EventStreamMarshaller {
    def this(toUtf8: Encoder, fromUtf8: Decoder) = this()
  }
  
  @JSImport("@aws-sdk/eventstream-marshaller", "Int64")
  @js.native
  class Int64 protected ()
    extends typings.awsSdkEventstreamMarshaller.int64Mod.Int64 {
    def this(bytes: Uint8Array) = this()
  }
  /* static members */
  object Int64 {
    
    @JSImport("@aws-sdk/eventstream-marshaller", "Int64")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromNumber(number: Double): typings.awsSdkEventstreamMarshaller.int64Mod.Int64 = ^.asInstanceOf[js.Dynamic].applyDynamic("fromNumber")(number.asInstanceOf[js.Any]).asInstanceOf[typings.awsSdkEventstreamMarshaller.int64Mod.Int64]
  }
}
