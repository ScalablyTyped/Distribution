package typings.bitfieldRle

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Decode extends StObject {
    
    def decode(buffer: Buffer): Buffer
    def decode(buffer: Buffer, offset: Double): Buffer
    @JSName("decode")
    var decode_Original: js.Function2[/* buffer */ Buffer, /* offset */ js.UndefOr[Double], Buffer]
    
    def decodingLength(buffer: Buffer): Double
    def decodingLength(buffer: Buffer, offset: Double): Double
    @JSName("decodingLength")
    var decodingLength_Original: js.Function2[/* buffer */ Buffer, /* offset */ js.UndefOr[Double], Double]
    
    def encode(bitfield: Buffer): Buffer
    def encode(bitfield: Buffer, buffer: Unit, offset: Double): Buffer
    def encode(bitfield: Buffer, buffer: Buffer): Buffer
    def encode(bitfield: Buffer, buffer: Buffer, offset: Double): Buffer
    @JSName("encode")
    var encode_Original: js.Function3[
        /* bitfield */ Buffer, 
        /* buffer */ js.UndefOr[Buffer], 
        /* offset */ js.UndefOr[Double], 
        Buffer
      ]
    
    def encodingLength(bitfield: Buffer): Double
    @JSName("encodingLength")
    var encodingLength_Original: js.Function1[/* bitfield */ Buffer, Double]
  }
  object Decode {
    
    inline def apply(
      decode: (/* buffer */ Buffer, /* offset */ js.UndefOr[Double]) => Buffer,
      decodingLength: (/* buffer */ Buffer, /* offset */ js.UndefOr[Double]) => Double,
      encode: (/* bitfield */ Buffer, /* buffer */ js.UndefOr[Buffer], /* offset */ js.UndefOr[Double]) => Buffer,
      encodingLength: /* bitfield */ Buffer => Double
    ): Decode = {
      val __obj = js.Dynamic.literal(decode = js.Any.fromFunction2(decode), decodingLength = js.Any.fromFunction2(decodingLength), encode = js.Any.fromFunction3(encode), encodingLength = js.Any.fromFunction1(encodingLength))
      __obj.asInstanceOf[Decode]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Decode] (val x: Self) extends AnyVal {
      
      inline def setDecode(value: (/* buffer */ Buffer, /* offset */ js.UndefOr[Double]) => Buffer): Self = StObject.set(x, "decode", js.Any.fromFunction2(value))
      
      inline def setDecodingLength(value: (/* buffer */ Buffer, /* offset */ js.UndefOr[Double]) => Double): Self = StObject.set(x, "decodingLength", js.Any.fromFunction2(value))
      
      inline def setEncode(
        value: (/* bitfield */ Buffer, /* buffer */ js.UndefOr[Buffer], /* offset */ js.UndefOr[Double]) => Buffer
      ): Self = StObject.set(x, "encode", js.Any.fromFunction3(value))
      
      inline def setEncodingLength(value: /* bitfield */ Buffer => Double): Self = StObject.set(x, "encodingLength", js.Any.fromFunction1(value))
    }
  }
}
