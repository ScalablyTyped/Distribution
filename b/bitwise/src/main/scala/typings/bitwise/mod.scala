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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bitwise", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  object bits extends js.Object {
    def and(bits1: js.Array[Bit], bits2: js.Array[Bit]): js.Array[Bit] = js.native
    def nand(bits1: js.Array[Bit], bits2: js.Array[Bit]): js.Array[Bit] = js.native
    def nor(bits1: js.Array[Bit], bits2: js.Array[Bit]): js.Array[Bit] = js.native
    def not(bits: js.Array[Bit]): js.Array[Bit] = js.native
    def or(bits1: js.Array[Bit], bits2: js.Array[Bit]): js.Array[Bit] = js.native
    def reduceAnd(bits: js.Array[Bit]): Bit = js.native
    def reduceNand(bits: js.Array[Bit]): Bit = js.native
    def reduceNor(bits: js.Array[Bit]): Bit = js.native
    def reduceOr(bits: js.Array[Bit]): Bit = js.native
    def reduceXnor(bits: js.Array[Bit]): Bit = js.native
    def reduceXor(bits: js.Array[Bit]): Bit = js.native
    def toBoolean(bits: js.Array[Bit]): js.Array[Boolean] = js.native
    def toString(bits: js.Array[Bit]): String = js.native
    def toString(bits: js.Array[Bit], spacing: Double): String = js.native
    def toString(bits: js.Array[Bit], spacing: Double, spacer: String): String = js.native
    def xnor(bits1: js.Array[Bit], bits2: js.Array[Bit]): js.Array[Bit] = js.native
    def xor(bits1: js.Array[Bit], bits2: js.Array[Bit]): js.Array[Bit] = js.native
  }
  
  @js.native
  object buffer extends js.Object {
    def and(a: Buffer, b: Buffer): Buffer = js.native
    def and(a: Buffer, b: Buffer, isLooping: Boolean): Buffer = js.native
    def create(bits: js.Array[Bit]): Buffer = js.native
    def modify(buffer: Buffer, bits: js.Array[Bit]): Unit = js.native
    def modify(buffer: Buffer, bits: js.Array[Bit], offset: Double): Unit = js.native
    def nand(a: Buffer, b: Buffer): Buffer = js.native
    def nand(a: Buffer, b: Buffer, isLooping: Boolean): Buffer = js.native
    def nor(a: Buffer, b: Buffer): Buffer = js.native
    def nor(a: Buffer, b: Buffer, isLooping: Boolean): Buffer = js.native
    def not(buffer: Buffer): Buffer = js.native
    def or(a: Buffer, b: Buffer): Buffer = js.native
    def or(a: Buffer, b: Buffer, isLooping: Boolean): Buffer = js.native
    def read(buffer: Buffer): js.Array[Bit] = js.native
    def read(buffer: Buffer, offset: Double): js.Array[Bit] = js.native
    def read(buffer: Buffer, offset: Double, length: Double): js.Array[Bit] = js.native
    def readInt(buffer: Buffer): Double = js.native
    def readInt(buffer: Buffer, offset: Double): Double = js.native
    def readInt(buffer: Buffer, offset: Double, length: Double): Double = js.native
    def readUInt(buffer: Buffer): Double = js.native
    def readUInt(buffer: Buffer, offset: Double): Double = js.native
    def readUInt(buffer: Buffer, offset: Double, length: Double): Double = js.native
    def xnor(a: Buffer, b: Buffer): Buffer = js.native
    def xnor(a: Buffer, b: Buffer, isLooping: Boolean): Buffer = js.native
    def xor(a: Buffer, b: Buffer): Buffer = js.native
    def xor(a: Buffer, b: Buffer, isLooping: Boolean): Buffer = js.native
  }
  
  @js.native
  object byte extends js.Object {
    def read(byte: UInt8): js.Tuple8[Bit, Bit, Bit, Bit, Bit, Bit, Bit, Bit] = js.native
    def write(byte: js.Tuple8[Bit, Bit, Bit, Bit, Bit, Bit, Bit, Bit]): UInt8 = js.native
  }
  
  @js.native
  object default extends js.Object {
    var bits: Nand = js.native
    var buffer: Modify = js.native
    var byte: ReadWrite = js.native
    var integer: SetBit = js.native
    var nibble: `0` = js.native
    var string: `1` = js.native
  }
  
  @js.native
  object integer extends js.Object {
    def getBit(int32: Double, position: Double): Bit = js.native
    def setBit(int32: Double, position: Double, value: Bit): Bit = js.native
    def toggleBit(int32: Double, position: Double): Double = js.native
  }
  
  @js.native
  object nibble extends js.Object {
    def read(nibble: UInt4): js.Tuple4[Bit, Bit, Bit, Bit] = js.native
    def write(nibble: js.Tuple4[Bit, Bit, Bit, Bit]): UInt4 = js.native
  }
  
  @js.native
  object string extends js.Object {
    def toBits(string: String): js.Array[Bit] = js.native
  }
  
}

