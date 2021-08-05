package typings.bitwise

import typings.bitwise.anon.And
import typings.bitwise.anon.Create
import typings.bitwise.anon.GetBit
import typings.bitwise.anon.Read
import typings.bitwise.anon.ToBits
import typings.bitwise.anon.Write
import typings.bitwise.typesMod.Bit
import typings.bitwise.typesMod.UInt4
import typings.bitwise.typesMod.UInt8
import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmMod {
  
  object default {
    
    @JSImport("bitwise/esm", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("bitwise/esm", "default.bits")
    @js.native
    def bits: And = js.native
    inline def bits_=(x: And): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bits")(x.asInstanceOf[js.Any])
    
    @JSImport("bitwise/esm", "default.buffer")
    @js.native
    def buffer: Create = js.native
    inline def buffer_=(x: Create): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("buffer")(x.asInstanceOf[js.Any])
    
    @JSImport("bitwise/esm", "default.byte")
    @js.native
    def byte: Read = js.native
    inline def byte_=(x: Read): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("byte")(x.asInstanceOf[js.Any])
    
    @JSImport("bitwise/esm", "default.integer")
    @js.native
    def integer: GetBit = js.native
    inline def integer_=(x: GetBit): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("integer")(x.asInstanceOf[js.Any])
    
    @JSImport("bitwise/esm", "default.nibble")
    @js.native
    def nibble: Write = js.native
    inline def nibble_=(x: Write): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nibble")(x.asInstanceOf[js.Any])
    
    @JSImport("bitwise/esm", "default.string")
    @js.native
    def string: ToBits = js.native
    inline def string_=(x: ToBits): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("string")(x.asInstanceOf[js.Any])
  }
  
  object bits {
    
    @JSImport("bitwise/esm", "bits")
    @js.native
    val ^ : js.Any = js.native
    
    inline def and(bits1: js.Array[Bit], bits2: js.Array[Bit]): js.Array[Bit] = (^.asInstanceOf[js.Dynamic].applyDynamic("and")(bits1.asInstanceOf[js.Any], bits2.asInstanceOf[js.Any])).asInstanceOf[js.Array[Bit]]
    
    inline def nand(bits1: js.Array[Bit], bits2: js.Array[Bit]): js.Array[Bit] = (^.asInstanceOf[js.Dynamic].applyDynamic("nand")(bits1.asInstanceOf[js.Any], bits2.asInstanceOf[js.Any])).asInstanceOf[js.Array[Bit]]
    
    inline def nor(bits1: js.Array[Bit], bits2: js.Array[Bit]): js.Array[Bit] = (^.asInstanceOf[js.Dynamic].applyDynamic("nor")(bits1.asInstanceOf[js.Any], bits2.asInstanceOf[js.Any])).asInstanceOf[js.Array[Bit]]
    
    inline def not(bits: js.Array[Bit]): js.Array[Bit] = ^.asInstanceOf[js.Dynamic].applyDynamic("not")(bits.asInstanceOf[js.Any]).asInstanceOf[js.Array[Bit]]
    
    inline def or(bits1: js.Array[Bit], bits2: js.Array[Bit]): js.Array[Bit] = (^.asInstanceOf[js.Dynamic].applyDynamic("or")(bits1.asInstanceOf[js.Any], bits2.asInstanceOf[js.Any])).asInstanceOf[js.Array[Bit]]
    
    inline def reduceAnd(bits: js.Array[Bit]): Bit = ^.asInstanceOf[js.Dynamic].applyDynamic("reduceAnd")(bits.asInstanceOf[js.Any]).asInstanceOf[Bit]
    
    inline def reduceNand(bits: js.Array[Bit]): Bit = ^.asInstanceOf[js.Dynamic].applyDynamic("reduceNand")(bits.asInstanceOf[js.Any]).asInstanceOf[Bit]
    
    inline def reduceNor(bits: js.Array[Bit]): Bit = ^.asInstanceOf[js.Dynamic].applyDynamic("reduceNor")(bits.asInstanceOf[js.Any]).asInstanceOf[Bit]
    
    inline def reduceOr(bits: js.Array[Bit]): Bit = ^.asInstanceOf[js.Dynamic].applyDynamic("reduceOr")(bits.asInstanceOf[js.Any]).asInstanceOf[Bit]
    
    inline def reduceXnor(bits: js.Array[Bit]): Bit = ^.asInstanceOf[js.Dynamic].applyDynamic("reduceXnor")(bits.asInstanceOf[js.Any]).asInstanceOf[Bit]
    
    inline def reduceXor(bits: js.Array[Bit]): Bit = ^.asInstanceOf[js.Dynamic].applyDynamic("reduceXor")(bits.asInstanceOf[js.Any]).asInstanceOf[Bit]
    
    inline def toBoolean(bits: js.Array[Bit]): js.Array[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("toBoolean")(bits.asInstanceOf[js.Any]).asInstanceOf[js.Array[Boolean]]
    
    inline def toString_(bits: js.Array[Bit]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toString")(bits.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def toString_(bits: js.Array[Bit], spacing: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toString")(bits.asInstanceOf[js.Any], spacing.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def toString_(bits: js.Array[Bit], spacing: Double, spacer: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toString")(bits.asInstanceOf[js.Any], spacing.asInstanceOf[js.Any], spacer.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def toString_(bits: js.Array[Bit], spacing: Unit, spacer: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toString")(bits.asInstanceOf[js.Any], spacing.asInstanceOf[js.Any], spacer.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def xnor(bits1: js.Array[Bit], bits2: js.Array[Bit]): js.Array[Bit] = (^.asInstanceOf[js.Dynamic].applyDynamic("xnor")(bits1.asInstanceOf[js.Any], bits2.asInstanceOf[js.Any])).asInstanceOf[js.Array[Bit]]
    
    inline def xor(bits1: js.Array[Bit], bits2: js.Array[Bit]): js.Array[Bit] = (^.asInstanceOf[js.Dynamic].applyDynamic("xor")(bits1.asInstanceOf[js.Any], bits2.asInstanceOf[js.Any])).asInstanceOf[js.Array[Bit]]
  }
  
  object buffer {
    
    @JSImport("bitwise/esm", "buffer")
    @js.native
    val ^ : js.Any = js.native
    
    inline def and(a: Buffer, b: Buffer): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("and")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Buffer]
    inline def and(a: Buffer, b: Buffer, isLooping: Boolean): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("and")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], isLooping.asInstanceOf[js.Any])).asInstanceOf[Buffer]
    
    inline def create(bits: js.Array[Bit]): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(bits.asInstanceOf[js.Any]).asInstanceOf[Buffer]
    
    inline def modify(buffer: Buffer, bits: js.Array[Bit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("modify")(buffer.asInstanceOf[js.Any], bits.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def modify(buffer: Buffer, bits: js.Array[Bit], offset: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("modify")(buffer.asInstanceOf[js.Any], bits.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def nand(a: Buffer, b: Buffer): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("nand")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Buffer]
    inline def nand(a: Buffer, b: Buffer, isLooping: Boolean): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("nand")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], isLooping.asInstanceOf[js.Any])).asInstanceOf[Buffer]
    
    inline def nor(a: Buffer, b: Buffer): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("nor")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Buffer]
    inline def nor(a: Buffer, b: Buffer, isLooping: Boolean): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("nor")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], isLooping.asInstanceOf[js.Any])).asInstanceOf[Buffer]
    
    inline def not(buffer: Buffer): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("not")(buffer.asInstanceOf[js.Any]).asInstanceOf[Buffer]
    
    inline def or(a: Buffer, b: Buffer): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("or")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Buffer]
    inline def or(a: Buffer, b: Buffer, isLooping: Boolean): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("or")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], isLooping.asInstanceOf[js.Any])).asInstanceOf[Buffer]
    
    inline def read(buffer: Buffer): js.Array[Bit] = ^.asInstanceOf[js.Dynamic].applyDynamic("read")(buffer.asInstanceOf[js.Any]).asInstanceOf[js.Array[Bit]]
    inline def read(buffer: Buffer, offset: Double): js.Array[Bit] = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[js.Array[Bit]]
    inline def read(buffer: Buffer, offset: Double, length: Double): js.Array[Bit] = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[js.Array[Bit]]
    inline def read(buffer: Buffer, offset: Unit, length: Double): js.Array[Bit] = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[js.Array[Bit]]
    
    inline def readInt(buffer: Buffer): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("readInt")(buffer.asInstanceOf[js.Any]).asInstanceOf[Double]
    inline def readInt(buffer: Buffer, offset: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("readInt")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def readInt(buffer: Buffer, offset: Double, length: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("readInt")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def readInt(buffer: Buffer, offset: Unit, length: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("readInt")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def readUInt(buffer: Buffer): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("readUInt")(buffer.asInstanceOf[js.Any]).asInstanceOf[Double]
    inline def readUInt(buffer: Buffer, offset: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("readUInt")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def readUInt(buffer: Buffer, offset: Double, length: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("readUInt")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def readUInt(buffer: Buffer, offset: Unit, length: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("readUInt")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def xnor(a: Buffer, b: Buffer): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("xnor")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Buffer]
    inline def xnor(a: Buffer, b: Buffer, isLooping: Boolean): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("xnor")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], isLooping.asInstanceOf[js.Any])).asInstanceOf[Buffer]
    
    inline def xor(a: Buffer, b: Buffer): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("xor")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Buffer]
    inline def xor(a: Buffer, b: Buffer, isLooping: Boolean): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("xor")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], isLooping.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  }
  
  object byte {
    
    @JSImport("bitwise/esm", "byte")
    @js.native
    val ^ : js.Any = js.native
    
    inline def read(byte: UInt8): js.Tuple8[Bit, Bit, Bit, Bit, Bit, Bit, Bit, Bit] = ^.asInstanceOf[js.Dynamic].applyDynamic("read")(byte.asInstanceOf[js.Any]).asInstanceOf[js.Tuple8[Bit, Bit, Bit, Bit, Bit, Bit, Bit, Bit]]
    
    inline def write(byte: js.Tuple8[Bit, Bit, Bit, Bit, Bit, Bit, Bit, Bit]): UInt8 = ^.asInstanceOf[js.Dynamic].applyDynamic("write")(byte.asInstanceOf[js.Any]).asInstanceOf[UInt8]
  }
  
  object integer {
    
    @JSImport("bitwise/esm", "integer")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getBit(int32: Double, position: Double): Bit = (^.asInstanceOf[js.Dynamic].applyDynamic("getBit")(int32.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Bit]
    
    inline def setBit(int32: Double, position: Double, value: Bit): Bit = (^.asInstanceOf[js.Dynamic].applyDynamic("setBit")(int32.asInstanceOf[js.Any], position.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Bit]
    
    inline def toggleBit(int32: Double, position: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("toggleBit")(int32.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Double]
  }
  
  object nibble {
    
    @JSImport("bitwise/esm", "nibble")
    @js.native
    val ^ : js.Any = js.native
    
    inline def read(nibble: UInt4): js.Tuple4[Bit, Bit, Bit, Bit] = ^.asInstanceOf[js.Dynamic].applyDynamic("read")(nibble.asInstanceOf[js.Any]).asInstanceOf[js.Tuple4[Bit, Bit, Bit, Bit]]
    
    inline def write(nibble: js.Tuple4[Bit, Bit, Bit, Bit]): UInt4 = ^.asInstanceOf[js.Dynamic].applyDynamic("write")(nibble.asInstanceOf[js.Any]).asInstanceOf[UInt4]
  }
  
  object string {
    
    @JSImport("bitwise/esm", "string")
    @js.native
    val ^ : js.Any = js.native
    
    inline def toBits(string: String): js.Array[Bit] = ^.asInstanceOf[js.Dynamic].applyDynamic("toBits")(string.asInstanceOf[js.Any]).asInstanceOf[js.Array[Bit]]
  }
}
