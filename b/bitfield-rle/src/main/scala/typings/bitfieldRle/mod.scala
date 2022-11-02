package typings.bitfieldRle

import typings.bitfieldRle.anon.Decode
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("bitfield-rle", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def align(n: Double): Decode = ^.asInstanceOf[js.Dynamic].applyDynamic("align")(n.asInstanceOf[js.Any]).asInstanceOf[Decode]
  
  object decode {
    
    inline def apply(buffer: Buffer): Buffer = ^.asInstanceOf[js.Dynamic].apply(buffer.asInstanceOf[js.Any]).asInstanceOf[Buffer]
    inline def apply(buffer: Buffer, offset: Double): Buffer = (^.asInstanceOf[js.Dynamic].apply(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Buffer]
    
    @JSImport("bitfield-rle", "decode")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("bitfield-rle", "decode.bytes")
    @js.native
    val bytes: Double = js.native
  }
  
  inline def decodingLength(buffer: Buffer): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("decodingLength")(buffer.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def decodingLength(buffer: Buffer, offset: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("decodingLength")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  object encode {
    
    inline def apply(bitfield: Buffer): Buffer = ^.asInstanceOf[js.Dynamic].apply(bitfield.asInstanceOf[js.Any]).asInstanceOf[Buffer]
    inline def apply(bitfield: Buffer, buffer: Unit, offset: Double): Buffer = (^.asInstanceOf[js.Dynamic].apply(bitfield.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Buffer]
    inline def apply(bitfield: Buffer, buffer: Buffer): Buffer = (^.asInstanceOf[js.Dynamic].apply(bitfield.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[Buffer]
    inline def apply(bitfield: Buffer, buffer: Buffer, offset: Double): Buffer = (^.asInstanceOf[js.Dynamic].apply(bitfield.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Buffer]
    
    @JSImport("bitfield-rle", "encode")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("bitfield-rle", "encode.bytes")
    @js.native
    val bytes: Double = js.native
  }
  
  inline def encodingLength(bitfield: Buffer): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("encodingLength")(bitfield.asInstanceOf[js.Any]).asInstanceOf[Double]
}
