package typings.awsSdkEventstreamCodec

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object int64Mod {
  
  @JSImport("@aws-sdk/eventstream-codec/dist-types/Int64", "Int64")
  @js.native
  open class Int64 protected ()
    extends StObject
       with typings.awsSdkTypes.eventStreamMod.Int64 {
    def this(bytes: js.typedarray.Uint8Array) = this()
    
    /* CompleteClass */
    override val bytes: js.typedarray.Uint8Array = js.native
  }
  /* static members */
  object Int64 {
    
    @JSImport("@aws-sdk/eventstream-codec/dist-types/Int64", "Int64")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromNumber(number: Double): Int64 = ^.asInstanceOf[js.Dynamic].applyDynamic("fromNumber")(number.asInstanceOf[js.Any]).asInstanceOf[Int64]
  }
}
