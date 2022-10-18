package typings.awsSdkEventstreamCodec

import typings.awsSdkTypes.distTypesUtilMod.Decoder
import typings.awsSdkTypes.distTypesUtilMod.Encoder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/eventstream-codec", "EventStreamCodec")
  @js.native
  open class EventStreamCodec protected ()
    extends typings.awsSdkEventstreamCodec.distTypesEventStreamCodecMod.EventStreamCodec {
    def this(toUtf8: Encoder, fromUtf8: Decoder) = this()
  }
  
  @JSImport("@aws-sdk/eventstream-codec", "Int64")
  @js.native
  open class Int64 protected ()
    extends typings.awsSdkEventstreamCodec.distTypesInt64Mod.Int64 {
    def this(bytes: js.typedarray.Uint8Array) = this()
  }
  /* static members */
  object Int64 {
    
    @JSImport("@aws-sdk/eventstream-codec", "Int64")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromNumber(number: Double): typings.awsSdkEventstreamCodec.distTypesInt64Mod.Int64 = ^.asInstanceOf[js.Dynamic].applyDynamic("fromNumber")(number.asInstanceOf[js.Any]).asInstanceOf[typings.awsSdkEventstreamCodec.distTypesInt64Mod.Int64]
  }
}
