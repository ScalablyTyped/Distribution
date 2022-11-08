package typings.biguintbe

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("biguintbe", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object decode {
    
    inline def apply(buffer: js.typedarray.Uint8Array): js.BigInt = ^.asInstanceOf[js.Dynamic].apply(buffer.asInstanceOf[js.Any]).asInstanceOf[js.BigInt]
    inline def apply(buffer: js.typedarray.Uint8Array, byteOffset: Double): js.BigInt = (^.asInstanceOf[js.Dynamic].apply(buffer.asInstanceOf[js.Any], byteOffset.asInstanceOf[js.Any])).asInstanceOf[js.BigInt]
    inline def apply(buffer: js.typedarray.Uint8Array, byteOffset: Double, byteLength: Double): js.BigInt = (^.asInstanceOf[js.Dynamic].apply(buffer.asInstanceOf[js.Any], byteOffset.asInstanceOf[js.Any], byteLength.asInstanceOf[js.Any])).asInstanceOf[js.BigInt]
    inline def apply(buffer: js.typedarray.Uint8Array, byteOffset: Unit, byteLength: Double): js.BigInt = (^.asInstanceOf[js.Dynamic].apply(buffer.asInstanceOf[js.Any], byteOffset.asInstanceOf[js.Any], byteLength.asInstanceOf[js.Any])).asInstanceOf[js.BigInt]
    
    @JSImport("biguintbe", "decode")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Number of bytes last decoded.
      */
    @JSImport("biguintbe", "decode.bytes")
    @js.native
    val bytes: Double = js.native
  }
  
  object encode {
    
    inline def apply[TBuf /* <: js.typedarray.Uint8Array */](value: js.BigInt): TBuf = ^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any]).asInstanceOf[TBuf]
    inline def apply[TBuf /* <: js.typedarray.Uint8Array */](value: js.BigInt, buffer: TBuf): TBuf = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[TBuf]
    inline def apply[TBuf /* <: js.typedarray.Uint8Array */](value: js.BigInt, buffer: TBuf, byteOffset: Double): TBuf = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], byteOffset.asInstanceOf[js.Any])).asInstanceOf[TBuf]
    inline def apply[TBuf /* <: js.typedarray.Uint8Array */](value: js.BigInt, buffer: Unit, byteOffset: Double): TBuf = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], byteOffset.asInstanceOf[js.Any])).asInstanceOf[TBuf]
    
    @JSImport("biguintbe", "encode")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Number of bytes last encoded.
      */
    @JSImport("biguintbe", "encode.bytes")
    @js.native
    val bytes: Double = js.native
  }
  
  inline def encodingLength(value: js.BigInt): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("encodingLength")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
}
