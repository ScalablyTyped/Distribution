package typings.atAwsDashSdkEventstreamDashMarshaller

import typings.atAwsDashSdkTypes.buildUtilMod.Decoder
import typings.atAwsDashSdkTypes.buildUtilMod.Encoder
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/eventstream-marshaller", JSImport.Namespace)
@js.native
object atAwsDashSdkEventstreamDashMarshallerMod extends js.Object {
  @js.native
  class EventStreamMarshaller protected ()
    extends typings.atAwsDashSdkEventstreamDashMarshaller.buildEventStreamMarshallerMod.EventStreamMarshaller {
    def this(toUtf8: Encoder, fromUtf8: Decoder) = this()
  }
  
  @js.native
  class Int64 protected ()
    extends typings.atAwsDashSdkEventstreamDashMarshaller.buildInt64Mod.Int64 {
    def this(bytes: Uint8Array) = this()
  }
  
  /* static members */
  @js.native
  object Int64 extends js.Object {
    def fromNumber(number: Double): typings.atAwsDashSdkEventstreamDashMarshaller.buildInt64Mod.Int64 = js.native
  }
  
}

