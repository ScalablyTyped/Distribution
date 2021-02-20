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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default {
    
    @JSImport("bitwise", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("bitwise", "default.bits")
    @js.native
    def bits: Nand = js.native
    @scala.inline
    def bits_=(x: Nand): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bits")(x.asInstanceOf[js.Any])
    
    @JSImport("bitwise", "default.buffer")
    @js.native
    def buffer: Modify = js.native
    @scala.inline
    def buffer_=(x: Modify): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("buffer")(x.asInstanceOf[js.Any])
    
    @JSImport("bitwise", "default.byte")
    @js.native
    def byte: ReadWrite = js.native
    @scala.inline
    def byte_=(x: ReadWrite): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("byte")(x.asInstanceOf[js.Any])
    
    @JSImport("bitwise", "default.integer")
    @js.native
    def integer: SetBit = js.native
    @scala.inline
    def integer_=(x: SetBit): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("integer")(x.asInstanceOf[js.Any])
    
    @JSImport("bitwise", "default.nibble")
    @js.native
    def nibble: `0` = js.native
    @scala.inline
    def nibble_=(x: `0`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nibble")(x.asInstanceOf[js.Any])
    
    @JSImport("bitwise", "default.string")
    @js.native
    def string: `1` = js.native
    @scala.inline
    def string_=(x: `1`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("string")(x.asInstanceOf[js.Any])
  }
  
  object bits {
    
    @JSImport("bitwise", "bits.and")
    @js.native
    def and(bits1: js.Array[Bit], bits2: js.Array[Bit]): js.Array[Bit] = js.native
    
    @JSImport("bitwise", "bits.nand")
    @js.native
    def nand(bits1: js.Array[Bit], bits2: js.Array[Bit]): js.Array[Bit] = js.native
    
    @JSImport("bitwise", "bits.nor")
    @js.native
    def nor(bits1: js.Array[Bit], bits2: js.Array[Bit]): js.Array[Bit] = js.native
    
    @JSImport("bitwise", "bits.not")
    @js.native
    def not(bits: js.Array[Bit]): js.Array[Bit] = js.native
    
    @JSImport("bitwise", "bits.or")
    @js.native
    def or(bits1: js.Array[Bit], bits2: js.Array[Bit]): js.Array[Bit] = js.native
    
    @JSImport("bitwise", "bits.reduceAnd")
    @js.native
    def reduceAnd(bits: js.Array[Bit]): Bit = js.native
    
    @JSImport("bitwise", "bits.reduceNand")
    @js.native
    def reduceNand(bits: js.Array[Bit]): Bit = js.native
    
    @JSImport("bitwise", "bits.reduceNor")
    @js.native
    def reduceNor(bits: js.Array[Bit]): Bit = js.native
    
    @JSImport("bitwise", "bits.reduceOr")
    @js.native
    def reduceOr(bits: js.Array[Bit]): Bit = js.native
    
    @JSImport("bitwise", "bits.reduceXnor")
    @js.native
    def reduceXnor(bits: js.Array[Bit]): Bit = js.native
    
    @JSImport("bitwise", "bits.reduceXor")
    @js.native
    def reduceXor(bits: js.Array[Bit]): Bit = js.native
    
    @JSImport("bitwise", "bits.toBoolean")
    @js.native
    def toBoolean(bits: js.Array[Bit]): js.Array[Boolean] = js.native
    
    @JSImport("bitwise", "bits.toString")
    @js.native
    def toString_(bits: js.Array[Bit]): String = js.native
    @JSImport("bitwise", "bits.toString")
    @js.native
    def toString_(bits: js.Array[Bit], spacing: js.UndefOr[scala.Nothing], spacer: String): String = js.native
    @JSImport("bitwise", "bits.toString")
    @js.native
    def toString_(bits: js.Array[Bit], spacing: Double): String = js.native
    @JSImport("bitwise", "bits.toString")
    @js.native
    def toString_(bits: js.Array[Bit], spacing: Double, spacer: String): String = js.native
    
    @JSImport("bitwise", "bits.xnor")
    @js.native
    def xnor(bits1: js.Array[Bit], bits2: js.Array[Bit]): js.Array[Bit] = js.native
    
    @JSImport("bitwise", "bits.xor")
    @js.native
    def xor(bits1: js.Array[Bit], bits2: js.Array[Bit]): js.Array[Bit] = js.native
  }
  
  object buffer {
    
    @JSImport("bitwise", "buffer.and")
    @js.native
    def and(a: Buffer, b: Buffer): Buffer = js.native
    @JSImport("bitwise", "buffer.and")
    @js.native
    def and(a: Buffer, b: Buffer, isLooping: Boolean): Buffer = js.native
    
    @JSImport("bitwise", "buffer.create")
    @js.native
    def create(bits: js.Array[Bit]): Buffer = js.native
    
    @JSImport("bitwise", "buffer.modify")
    @js.native
    def modify(buffer: Buffer, bits: js.Array[Bit]): Unit = js.native
    @JSImport("bitwise", "buffer.modify")
    @js.native
    def modify(buffer: Buffer, bits: js.Array[Bit], offset: Double): Unit = js.native
    
    @JSImport("bitwise", "buffer.nand")
    @js.native
    def nand(a: Buffer, b: Buffer): Buffer = js.native
    @JSImport("bitwise", "buffer.nand")
    @js.native
    def nand(a: Buffer, b: Buffer, isLooping: Boolean): Buffer = js.native
    
    @JSImport("bitwise", "buffer.nor")
    @js.native
    def nor(a: Buffer, b: Buffer): Buffer = js.native
    @JSImport("bitwise", "buffer.nor")
    @js.native
    def nor(a: Buffer, b: Buffer, isLooping: Boolean): Buffer = js.native
    
    @JSImport("bitwise", "buffer.not")
    @js.native
    def not(buffer: Buffer): Buffer = js.native
    
    @JSImport("bitwise", "buffer.or")
    @js.native
    def or(a: Buffer, b: Buffer): Buffer = js.native
    @JSImport("bitwise", "buffer.or")
    @js.native
    def or(a: Buffer, b: Buffer, isLooping: Boolean): Buffer = js.native
    
    @JSImport("bitwise", "buffer.read")
    @js.native
    def read(buffer: Buffer): js.Array[Bit] = js.native
    @JSImport("bitwise", "buffer.read")
    @js.native
    def read(buffer: Buffer, offset: js.UndefOr[scala.Nothing], length: Double): js.Array[Bit] = js.native
    @JSImport("bitwise", "buffer.read")
    @js.native
    def read(buffer: Buffer, offset: Double): js.Array[Bit] = js.native
    @JSImport("bitwise", "buffer.read")
    @js.native
    def read(buffer: Buffer, offset: Double, length: Double): js.Array[Bit] = js.native
    
    @JSImport("bitwise", "buffer.readInt")
    @js.native
    def readInt(buffer: Buffer): Double = js.native
    @JSImport("bitwise", "buffer.readInt")
    @js.native
    def readInt(buffer: Buffer, offset: js.UndefOr[scala.Nothing], length: Double): Double = js.native
    @JSImport("bitwise", "buffer.readInt")
    @js.native
    def readInt(buffer: Buffer, offset: Double): Double = js.native
    @JSImport("bitwise", "buffer.readInt")
    @js.native
    def readInt(buffer: Buffer, offset: Double, length: Double): Double = js.native
    
    @JSImport("bitwise", "buffer.readUInt")
    @js.native
    def readUInt(buffer: Buffer): Double = js.native
    @JSImport("bitwise", "buffer.readUInt")
    @js.native
    def readUInt(buffer: Buffer, offset: js.UndefOr[scala.Nothing], length: Double): Double = js.native
    @JSImport("bitwise", "buffer.readUInt")
    @js.native
    def readUInt(buffer: Buffer, offset: Double): Double = js.native
    @JSImport("bitwise", "buffer.readUInt")
    @js.native
    def readUInt(buffer: Buffer, offset: Double, length: Double): Double = js.native
    
    @JSImport("bitwise", "buffer.xnor")
    @js.native
    def xnor(a: Buffer, b: Buffer): Buffer = js.native
    @JSImport("bitwise", "buffer.xnor")
    @js.native
    def xnor(a: Buffer, b: Buffer, isLooping: Boolean): Buffer = js.native
    
    @JSImport("bitwise", "buffer.xor")
    @js.native
    def xor(a: Buffer, b: Buffer): Buffer = js.native
    @JSImport("bitwise", "buffer.xor")
    @js.native
    def xor(a: Buffer, b: Buffer, isLooping: Boolean): Buffer = js.native
  }
  
  object byte {
    
    @JSImport("bitwise", "byte.read")
    @js.native
    def read(byte: UInt8): js.Tuple8[Bit, Bit, Bit, Bit, Bit, Bit, Bit, Bit] = js.native
    
    @JSImport("bitwise", "byte.write")
    @js.native
    def write(byte: js.Tuple8[Bit, Bit, Bit, Bit, Bit, Bit, Bit, Bit]): UInt8 = js.native
  }
  
  object integer {
    
    @JSImport("bitwise", "integer.getBit")
    @js.native
    def getBit(int32: Double, position: Double): Bit = js.native
    
    @JSImport("bitwise", "integer.setBit")
    @js.native
    def setBit(int32: Double, position: Double, value: Bit): Bit = js.native
    
    @JSImport("bitwise", "integer.toggleBit")
    @js.native
    def toggleBit(int32: Double, position: Double): Double = js.native
  }
  
  object nibble {
    
    @JSImport("bitwise", "nibble.read")
    @js.native
    def read(nibble: UInt4): js.Tuple4[Bit, Bit, Bit, Bit] = js.native
    
    @JSImport("bitwise", "nibble.write")
    @js.native
    def write(nibble: js.Tuple4[Bit, Bit, Bit, Bit]): UInt4 = js.native
  }
  
  object string {
    
    @JSImport("bitwise", "string.toBits")
    @js.native
    def toBits(string: String): js.Array[Bit] = js.native
  }
}
