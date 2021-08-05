package typings.bitwise

import typings.bitwise.anon.Modify
import typings.bitwise.anon.Nand
import typings.bitwise.anon.ReadWrite
import typings.bitwise.anon.SetBit
import typings.bitwise.anon.`0`
import typings.bitwise.anon.`1`
import typings.bitwise.bitwiseTypesMod.Bit
import typings.bitwise.bitwiseTypesMod.UInt4
import typings.bitwise.bitwiseTypesMod.UInt8
import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default {
    
    @JSImport("bitwise", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("bitwise", "default.bits")
    @js.native
    def bits: Nand = js.native
    inline def bits_=(x: Nand): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bits")(x.asInstanceOf[js.Any])
    
    @JSImport("bitwise", "default.buffer")
    @js.native
    def buffer: Modify = js.native
    inline def buffer_=(x: Modify): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("buffer")(x.asInstanceOf[js.Any])
    
    @JSImport("bitwise", "default.byte")
    @js.native
    def byte: ReadWrite = js.native
    inline def byte_=(x: ReadWrite): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("byte")(x.asInstanceOf[js.Any])
    
    @JSImport("bitwise", "default.integer")
    @js.native
    def integer: SetBit = js.native
    inline def integer_=(x: SetBit): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("integer")(x.asInstanceOf[js.Any])
    
    @JSImport("bitwise", "default.nibble")
    @js.native
    def nibble: `0` = js.native
    inline def nibble_=(x: `0`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nibble")(x.asInstanceOf[js.Any])
    
    @JSImport("bitwise", "default.string")
    @js.native
    def string: `1` = js.native
    inline def string_=(x: `1`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("string")(x.asInstanceOf[js.Any])
  }
  
  object bits {
    
    @JSImport("bitwise", "bits")
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
    
    @JSImport("bitwise", "buffer")
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
    
    @JSImport("bitwise", "byte")
    @js.native
    val ^ : js.Any = js.native
    
    inline def read(byte: UInt8): js.Tuple8[Bit, Bit, Bit, Bit, Bit, Bit, Bit, Bit] = ^.asInstanceOf[js.Dynamic].applyDynamic("read")(byte.asInstanceOf[js.Any]).asInstanceOf[js.Tuple8[Bit, Bit, Bit, Bit, Bit, Bit, Bit, Bit]]
    
    inline def write(byte: js.Tuple8[Bit, Bit, Bit, Bit, Bit, Bit, Bit, Bit]): UInt8 = ^.asInstanceOf[js.Dynamic].applyDynamic("write")(byte.asInstanceOf[js.Any]).asInstanceOf[UInt8]
  }
  
  object integer {
    
    @JSImport("bitwise", "integer")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getBit(int32: Double, position: Double): Bit = (^.asInstanceOf[js.Dynamic].applyDynamic("getBit")(int32.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Bit]
    
    inline def setBit(int32: Double, position: Double, value: Bit): Bit = (^.asInstanceOf[js.Dynamic].applyDynamic("setBit")(int32.asInstanceOf[js.Any], position.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Bit]
    
    inline def toggleBit(int32: Double, position: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("toggleBit")(int32.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Double]
  }
  
  object nibble {
    
    @JSImport("bitwise", "nibble")
    @js.native
    val ^ : js.Any = js.native
    
    inline def read(nibble: UInt4): js.Tuple4[Bit, Bit, Bit, Bit] = ^.asInstanceOf[js.Dynamic].applyDynamic("read")(nibble.asInstanceOf[js.Any]).asInstanceOf[js.Tuple4[Bit, Bit, Bit, Bit]]
    
    inline def write(nibble: js.Tuple4[Bit, Bit, Bit, Bit]): UInt4 = ^.asInstanceOf[js.Dynamic].applyDynamic("write")(nibble.asInstanceOf[js.Any]).asInstanceOf[UInt4]
  }
  
  object string {
    
    @JSImport("bitwise", "string")
    @js.native
    val ^ : js.Any = js.native
    
    inline def toBits(string: String): js.Array[Bit] = ^.asInstanceOf[js.Dynamic].applyDynamic("toBits")(string.asInstanceOf[js.Any]).asInstanceOf[js.Array[Bit]]
  }
}
