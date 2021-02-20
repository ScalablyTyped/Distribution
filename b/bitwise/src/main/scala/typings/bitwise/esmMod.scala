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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmMod {
  
  object default {
    
    @JSImport("bitwise/esm", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("bitwise/esm", "default.bits")
    @js.native
    def bits: And = js.native
    @scala.inline
    def bits_=(x: And): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bits")(x.asInstanceOf[js.Any])
    
    @JSImport("bitwise/esm", "default.buffer")
    @js.native
    def buffer: Create = js.native
    @scala.inline
    def buffer_=(x: Create): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("buffer")(x.asInstanceOf[js.Any])
    
    @JSImport("bitwise/esm", "default.byte")
    @js.native
    def byte: Read = js.native
    @scala.inline
    def byte_=(x: Read): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("byte")(x.asInstanceOf[js.Any])
    
    @JSImport("bitwise/esm", "default.integer")
    @js.native
    def integer: GetBit = js.native
    @scala.inline
    def integer_=(x: GetBit): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("integer")(x.asInstanceOf[js.Any])
    
    @JSImport("bitwise/esm", "default.nibble")
    @js.native
    def nibble: Write = js.native
    @scala.inline
    def nibble_=(x: Write): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nibble")(x.asInstanceOf[js.Any])
    
    @JSImport("bitwise/esm", "default.string")
    @js.native
    def string: ToBits = js.native
    @scala.inline
    def string_=(x: ToBits): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("string")(x.asInstanceOf[js.Any])
  }
  
  object bits {
    
    @JSImport("bitwise/esm", "bits.and")
    @js.native
    def and(bits1: js.Array[Bit], bits2: js.Array[Bit]): js.Array[Bit] = js.native
    
    @JSImport("bitwise/esm", "bits.nand")
    @js.native
    def nand(bits1: js.Array[Bit], bits2: js.Array[Bit]): js.Array[Bit] = js.native
    
    @JSImport("bitwise/esm", "bits.nor")
    @js.native
    def nor(bits1: js.Array[Bit], bits2: js.Array[Bit]): js.Array[Bit] = js.native
    
    @JSImport("bitwise/esm", "bits.not")
    @js.native
    def not(bits: js.Array[Bit]): js.Array[Bit] = js.native
    
    @JSImport("bitwise/esm", "bits.or")
    @js.native
    def or(bits1: js.Array[Bit], bits2: js.Array[Bit]): js.Array[Bit] = js.native
    
    @JSImport("bitwise/esm", "bits.reduceAnd")
    @js.native
    def reduceAnd(bits: js.Array[Bit]): Bit = js.native
    
    @JSImport("bitwise/esm", "bits.reduceNand")
    @js.native
    def reduceNand(bits: js.Array[Bit]): Bit = js.native
    
    @JSImport("bitwise/esm", "bits.reduceNor")
    @js.native
    def reduceNor(bits: js.Array[Bit]): Bit = js.native
    
    @JSImport("bitwise/esm", "bits.reduceOr")
    @js.native
    def reduceOr(bits: js.Array[Bit]): Bit = js.native
    
    @JSImport("bitwise/esm", "bits.reduceXnor")
    @js.native
    def reduceXnor(bits: js.Array[Bit]): Bit = js.native
    
    @JSImport("bitwise/esm", "bits.reduceXor")
    @js.native
    def reduceXor(bits: js.Array[Bit]): Bit = js.native
    
    @JSImport("bitwise/esm", "bits.toBoolean")
    @js.native
    def toBoolean(bits: js.Array[Bit]): js.Array[Boolean] = js.native
    
    @JSImport("bitwise/esm", "bits.toString")
    @js.native
    def toString_(bits: js.Array[Bit]): String = js.native
    @JSImport("bitwise/esm", "bits.toString")
    @js.native
    def toString_(bits: js.Array[Bit], spacing: js.UndefOr[scala.Nothing], spacer: String): String = js.native
    @JSImport("bitwise/esm", "bits.toString")
    @js.native
    def toString_(bits: js.Array[Bit], spacing: Double): String = js.native
    @JSImport("bitwise/esm", "bits.toString")
    @js.native
    def toString_(bits: js.Array[Bit], spacing: Double, spacer: String): String = js.native
    
    @JSImport("bitwise/esm", "bits.xnor")
    @js.native
    def xnor(bits1: js.Array[Bit], bits2: js.Array[Bit]): js.Array[Bit] = js.native
    
    @JSImport("bitwise/esm", "bits.xor")
    @js.native
    def xor(bits1: js.Array[Bit], bits2: js.Array[Bit]): js.Array[Bit] = js.native
  }
  
  object buffer {
    
    @JSImport("bitwise/esm", "buffer.and")
    @js.native
    def and(a: Buffer, b: Buffer): Buffer = js.native
    @JSImport("bitwise/esm", "buffer.and")
    @js.native
    def and(a: Buffer, b: Buffer, isLooping: Boolean): Buffer = js.native
    
    @JSImport("bitwise/esm", "buffer.create")
    @js.native
    def create(bits: js.Array[Bit]): Buffer = js.native
    
    @JSImport("bitwise/esm", "buffer.modify")
    @js.native
    def modify(buffer: Buffer, bits: js.Array[Bit]): Unit = js.native
    @JSImport("bitwise/esm", "buffer.modify")
    @js.native
    def modify(buffer: Buffer, bits: js.Array[Bit], offset: Double): Unit = js.native
    
    @JSImport("bitwise/esm", "buffer.nand")
    @js.native
    def nand(a: Buffer, b: Buffer): Buffer = js.native
    @JSImport("bitwise/esm", "buffer.nand")
    @js.native
    def nand(a: Buffer, b: Buffer, isLooping: Boolean): Buffer = js.native
    
    @JSImport("bitwise/esm", "buffer.nor")
    @js.native
    def nor(a: Buffer, b: Buffer): Buffer = js.native
    @JSImport("bitwise/esm", "buffer.nor")
    @js.native
    def nor(a: Buffer, b: Buffer, isLooping: Boolean): Buffer = js.native
    
    @JSImport("bitwise/esm", "buffer.not")
    @js.native
    def not(buffer: Buffer): Buffer = js.native
    
    @JSImport("bitwise/esm", "buffer.or")
    @js.native
    def or(a: Buffer, b: Buffer): Buffer = js.native
    @JSImport("bitwise/esm", "buffer.or")
    @js.native
    def or(a: Buffer, b: Buffer, isLooping: Boolean): Buffer = js.native
    
    @JSImport("bitwise/esm", "buffer.read")
    @js.native
    def read(buffer: Buffer): js.Array[Bit] = js.native
    @JSImport("bitwise/esm", "buffer.read")
    @js.native
    def read(buffer: Buffer, offset: js.UndefOr[scala.Nothing], length: Double): js.Array[Bit] = js.native
    @JSImport("bitwise/esm", "buffer.read")
    @js.native
    def read(buffer: Buffer, offset: Double): js.Array[Bit] = js.native
    @JSImport("bitwise/esm", "buffer.read")
    @js.native
    def read(buffer: Buffer, offset: Double, length: Double): js.Array[Bit] = js.native
    
    @JSImport("bitwise/esm", "buffer.readInt")
    @js.native
    def readInt(buffer: Buffer): Double = js.native
    @JSImport("bitwise/esm", "buffer.readInt")
    @js.native
    def readInt(buffer: Buffer, offset: js.UndefOr[scala.Nothing], length: Double): Double = js.native
    @JSImport("bitwise/esm", "buffer.readInt")
    @js.native
    def readInt(buffer: Buffer, offset: Double): Double = js.native
    @JSImport("bitwise/esm", "buffer.readInt")
    @js.native
    def readInt(buffer: Buffer, offset: Double, length: Double): Double = js.native
    
    @JSImport("bitwise/esm", "buffer.readUInt")
    @js.native
    def readUInt(buffer: Buffer): Double = js.native
    @JSImport("bitwise/esm", "buffer.readUInt")
    @js.native
    def readUInt(buffer: Buffer, offset: js.UndefOr[scala.Nothing], length: Double): Double = js.native
    @JSImport("bitwise/esm", "buffer.readUInt")
    @js.native
    def readUInt(buffer: Buffer, offset: Double): Double = js.native
    @JSImport("bitwise/esm", "buffer.readUInt")
    @js.native
    def readUInt(buffer: Buffer, offset: Double, length: Double): Double = js.native
    
    @JSImport("bitwise/esm", "buffer.xnor")
    @js.native
    def xnor(a: Buffer, b: Buffer): Buffer = js.native
    @JSImport("bitwise/esm", "buffer.xnor")
    @js.native
    def xnor(a: Buffer, b: Buffer, isLooping: Boolean): Buffer = js.native
    
    @JSImport("bitwise/esm", "buffer.xor")
    @js.native
    def xor(a: Buffer, b: Buffer): Buffer = js.native
    @JSImport("bitwise/esm", "buffer.xor")
    @js.native
    def xor(a: Buffer, b: Buffer, isLooping: Boolean): Buffer = js.native
  }
  
  object byte {
    
    @JSImport("bitwise/esm", "byte.read")
    @js.native
    def read(byte: UInt8): js.Tuple8[Bit, Bit, Bit, Bit, Bit, Bit, Bit, Bit] = js.native
    
    @JSImport("bitwise/esm", "byte.write")
    @js.native
    def write(byte: js.Tuple8[Bit, Bit, Bit, Bit, Bit, Bit, Bit, Bit]): UInt8 = js.native
  }
  
  object integer {
    
    @JSImport("bitwise/esm", "integer.getBit")
    @js.native
    def getBit(int32: Double, position: Double): Bit = js.native
    
    @JSImport("bitwise/esm", "integer.setBit")
    @js.native
    def setBit(int32: Double, position: Double, value: Bit): Bit = js.native
    
    @JSImport("bitwise/esm", "integer.toggleBit")
    @js.native
    def toggleBit(int32: Double, position: Double): Double = js.native
  }
  
  object nibble {
    
    @JSImport("bitwise/esm", "nibble.read")
    @js.native
    def read(nibble: UInt4): js.Tuple4[Bit, Bit, Bit, Bit] = js.native
    
    @JSImport("bitwise/esm", "nibble.write")
    @js.native
    def write(nibble: js.Tuple4[Bit, Bit, Bit, Bit]): UInt4 = js.native
  }
  
  object string {
    
    @JSImport("bitwise/esm", "string.toBits")
    @js.native
    def toBits(string: String): js.Array[Bit] = js.native
  }
}
