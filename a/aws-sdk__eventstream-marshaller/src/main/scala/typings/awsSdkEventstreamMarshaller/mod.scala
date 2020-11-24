package typings.awsSdkEventstreamMarshaller

import typings.awsSdkTypes.utilMod.Decoder
import typings.awsSdkTypes.utilMod.Encoder
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/eventstream-marshaller", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  @js.native
  class EventStreamMarshaller protected ()
    extends typings.awsSdkEventstreamMarshaller.eventStreamMarshallerMod.EventStreamMarshaller {
    def this(toUtf8: Encoder, fromUtf8: Decoder) = this()
  }
  
  @js.native
  class Int64 protected ()
    extends typings.awsSdkEventstreamMarshaller.int64Mod.Int64 {
    def this(bytes: Uint8Array) = this()
  }
  /* static members */
  @js.native
  object Int64 extends js.Object {
    
    def fromNumber(number: Double): typings.awsSdkEventstreamMarshaller.int64Mod.Int64 = js.native
  }
}
