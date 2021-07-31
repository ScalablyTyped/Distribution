package typings.bitwise

import typings.bitwise.bitwiseTypesMod.Bit
import typings.bitwise.bitwiseTypesMod.UInt4
import typings.bitwise.typesMod.UInt8
import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait `0` extends StObject {
    
    def read(nibble: UInt4): js.Tuple4[Bit, Bit, Bit, Bit]
    
    def write(nibble: js.Tuple4[Bit, Bit, Bit, Bit]): UInt4
  }
  object `0` {
    
    @scala.inline
    def apply(read: UInt4 => js.Tuple4[Bit, Bit, Bit, Bit], write: js.Tuple4[Bit, Bit, Bit, Bit] => UInt4): `0` = {
      val __obj = js.Dynamic.literal(read = js.Any.fromFunction1(read), write = js.Any.fromFunction1(write))
      __obj.asInstanceOf[`0`]
    }
    
    @scala.inline
    implicit class `0MutableBuilder`[Self <: `0`] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRead(value: UInt4 => js.Tuple4[Bit, Bit, Bit, Bit]): Self = StObject.set(x, "read", js.Any.fromFunction1(value))
      
      @scala.inline
      def setWrite(value: js.Tuple4[Bit, Bit, Bit, Bit] => UInt4): Self = StObject.set(x, "write", js.Any.fromFunction1(value))
    }
  }
  
  trait `1` extends StObject {
    
    def toBits(string: String): js.Array[Bit]
  }
  object `1` {
    
    @scala.inline
    def apply(toBits: String => js.Array[Bit]): `1` = {
      val __obj = js.Dynamic.literal(toBits = js.Any.fromFunction1(toBits))
      __obj.asInstanceOf[`1`]
    }
    
    @scala.inline
    implicit class `1MutableBuilder`[Self <: `1`] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setToBits(value: String => js.Array[Bit]): Self = StObject.set(x, "toBits", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait And extends StObject {
    
    def and(bits1: js.Array[typings.bitwise.typesMod.Bit], bits2: js.Array[typings.bitwise.typesMod.Bit]): js.Array[typings.bitwise.typesMod.Bit] = js.native
    
    def nand(bits1: js.Array[typings.bitwise.typesMod.Bit], bits2: js.Array[typings.bitwise.typesMod.Bit]): js.Array[typings.bitwise.typesMod.Bit] = js.native
    
    def nor(bits1: js.Array[typings.bitwise.typesMod.Bit], bits2: js.Array[typings.bitwise.typesMod.Bit]): js.Array[typings.bitwise.typesMod.Bit] = js.native
    
    def not(bits: js.Array[typings.bitwise.typesMod.Bit]): js.Array[typings.bitwise.typesMod.Bit] = js.native
    
    def or(bits1: js.Array[typings.bitwise.typesMod.Bit], bits2: js.Array[typings.bitwise.typesMod.Bit]): js.Array[typings.bitwise.typesMod.Bit] = js.native
    
    def reduceAnd(bits: js.Array[typings.bitwise.typesMod.Bit]): typings.bitwise.typesMod.Bit = js.native
    
    def reduceNand(bits: js.Array[typings.bitwise.typesMod.Bit]): typings.bitwise.typesMod.Bit = js.native
    
    def reduceNor(bits: js.Array[typings.bitwise.typesMod.Bit]): typings.bitwise.typesMod.Bit = js.native
    
    def reduceOr(bits: js.Array[typings.bitwise.typesMod.Bit]): typings.bitwise.typesMod.Bit = js.native
    
    def reduceXnor(bits: js.Array[typings.bitwise.typesMod.Bit]): typings.bitwise.typesMod.Bit = js.native
    
    def reduceXor(bits: js.Array[typings.bitwise.typesMod.Bit]): typings.bitwise.typesMod.Bit = js.native
    
    def toBoolean(bits: js.Array[typings.bitwise.typesMod.Bit]): js.Array[Boolean] = js.native
    
    def toString(bits: js.Array[typings.bitwise.typesMod.Bit]): String = js.native
    def toString(bits: js.Array[typings.bitwise.typesMod.Bit], spacing: Double): String = js.native
    def toString(bits: js.Array[typings.bitwise.typesMod.Bit], spacing: Double, spacer: String): String = js.native
    def toString(bits: js.Array[typings.bitwise.typesMod.Bit], spacing: Unit, spacer: String): String = js.native
    
    def xnor(bits1: js.Array[typings.bitwise.typesMod.Bit], bits2: js.Array[typings.bitwise.typesMod.Bit]): js.Array[typings.bitwise.typesMod.Bit] = js.native
    
    def xor(bits1: js.Array[typings.bitwise.typesMod.Bit], bits2: js.Array[typings.bitwise.typesMod.Bit]): js.Array[typings.bitwise.typesMod.Bit] = js.native
  }
  
  @js.native
  trait Create extends StObject {
    
    def and(a: Buffer, b: Buffer): Buffer = js.native
    def and(a: Buffer, b: Buffer, isLooping: Boolean): Buffer = js.native
    
    def create(bits: js.Array[typings.bitwise.typesMod.Bit]): Buffer = js.native
    
    def modify(buffer: Buffer, bits: js.Array[typings.bitwise.typesMod.Bit]): Unit = js.native
    def modify(buffer: Buffer, bits: js.Array[typings.bitwise.typesMod.Bit], offset: Double): Unit = js.native
    
    def nand(a: Buffer, b: Buffer): Buffer = js.native
    def nand(a: Buffer, b: Buffer, isLooping: Boolean): Buffer = js.native
    
    def nor(a: Buffer, b: Buffer): Buffer = js.native
    def nor(a: Buffer, b: Buffer, isLooping: Boolean): Buffer = js.native
    
    def not(buffer: Buffer): Buffer = js.native
    
    def or(a: Buffer, b: Buffer): Buffer = js.native
    def or(a: Buffer, b: Buffer, isLooping: Boolean): Buffer = js.native
    
    def read(buffer: Buffer): js.Array[typings.bitwise.typesMod.Bit] = js.native
    def read(buffer: Buffer, offset: Double): js.Array[typings.bitwise.typesMod.Bit] = js.native
    def read(buffer: Buffer, offset: Double, length: Double): js.Array[typings.bitwise.typesMod.Bit] = js.native
    def read(buffer: Buffer, offset: Unit, length: Double): js.Array[typings.bitwise.typesMod.Bit] = js.native
    
    def readInt(buffer: Buffer): Double = js.native
    def readInt(buffer: Buffer, offset: Double): Double = js.native
    def readInt(buffer: Buffer, offset: Double, length: Double): Double = js.native
    def readInt(buffer: Buffer, offset: Unit, length: Double): Double = js.native
    
    def readUInt(buffer: Buffer): Double = js.native
    def readUInt(buffer: Buffer, offset: Double): Double = js.native
    def readUInt(buffer: Buffer, offset: Double, length: Double): Double = js.native
    def readUInt(buffer: Buffer, offset: Unit, length: Double): Double = js.native
    
    def xnor(a: Buffer, b: Buffer): Buffer = js.native
    def xnor(a: Buffer, b: Buffer, isLooping: Boolean): Buffer = js.native
    
    def xor(a: Buffer, b: Buffer): Buffer = js.native
    def xor(a: Buffer, b: Buffer, isLooping: Boolean): Buffer = js.native
  }
  
  trait GetBit extends StObject {
    
    def getBit(int32: Double, position: Double): typings.bitwise.typesMod.Bit
    
    def setBit(int32: Double, position: Double, value: typings.bitwise.typesMod.Bit): typings.bitwise.typesMod.Bit
    
    def toggleBit(int32: Double, position: Double): Double
  }
  object GetBit {
    
    @scala.inline
    def apply(
      getBit: (Double, Double) => typings.bitwise.typesMod.Bit,
      setBit: (Double, Double, typings.bitwise.typesMod.Bit) => typings.bitwise.typesMod.Bit,
      toggleBit: (Double, Double) => Double
    ): GetBit = {
      val __obj = js.Dynamic.literal(getBit = js.Any.fromFunction2(getBit), setBit = js.Any.fromFunction3(setBit), toggleBit = js.Any.fromFunction2(toggleBit))
      __obj.asInstanceOf[GetBit]
    }
    
    @scala.inline
    implicit class GetBitMutableBuilder[Self <: GetBit] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetBit(value: (Double, Double) => typings.bitwise.typesMod.Bit): Self = StObject.set(x, "getBit", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSetBit(value: (Double, Double, typings.bitwise.typesMod.Bit) => typings.bitwise.typesMod.Bit): Self = StObject.set(x, "setBit", js.Any.fromFunction3(value))
      
      @scala.inline
      def setToggleBit(value: (Double, Double) => Double): Self = StObject.set(x, "toggleBit", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait Modify extends StObject {
    
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
    def read(buffer: Buffer, offset: Unit, length: Double): js.Array[Bit] = js.native
    
    def readInt(buffer: Buffer): Double = js.native
    def readInt(buffer: Buffer, offset: Double): Double = js.native
    def readInt(buffer: Buffer, offset: Double, length: Double): Double = js.native
    def readInt(buffer: Buffer, offset: Unit, length: Double): Double = js.native
    
    def readUInt(buffer: Buffer): Double = js.native
    def readUInt(buffer: Buffer, offset: Double): Double = js.native
    def readUInt(buffer: Buffer, offset: Double, length: Double): Double = js.native
    def readUInt(buffer: Buffer, offset: Unit, length: Double): Double = js.native
    
    def xnor(a: Buffer, b: Buffer): Buffer = js.native
    def xnor(a: Buffer, b: Buffer, isLooping: Boolean): Buffer = js.native
    
    def xor(a: Buffer, b: Buffer): Buffer = js.native
    def xor(a: Buffer, b: Buffer, isLooping: Boolean): Buffer = js.native
  }
  
  @js.native
  trait Nand extends StObject {
    
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
    def toString(bits: js.Array[Bit], spacing: Unit, spacer: String): String = js.native
    
    def xnor(bits1: js.Array[Bit], bits2: js.Array[Bit]): js.Array[Bit] = js.native
    
    def xor(bits1: js.Array[Bit], bits2: js.Array[Bit]): js.Array[Bit] = js.native
  }
  
  trait Read extends StObject {
    
    def read(byte: UInt8): js.Tuple8[
        typings.bitwise.typesMod.Bit, 
        typings.bitwise.typesMod.Bit, 
        typings.bitwise.typesMod.Bit, 
        typings.bitwise.typesMod.Bit, 
        typings.bitwise.typesMod.Bit, 
        typings.bitwise.typesMod.Bit, 
        typings.bitwise.typesMod.Bit, 
        typings.bitwise.typesMod.Bit
      ]
    
    def write(
      byte: js.Tuple8[
          typings.bitwise.typesMod.Bit, 
          typings.bitwise.typesMod.Bit, 
          typings.bitwise.typesMod.Bit, 
          typings.bitwise.typesMod.Bit, 
          typings.bitwise.typesMod.Bit, 
          typings.bitwise.typesMod.Bit, 
          typings.bitwise.typesMod.Bit, 
          typings.bitwise.typesMod.Bit
        ]
    ): UInt8
  }
  object Read {
    
    @scala.inline
    def apply(
      read: UInt8 => js.Tuple8[
          typings.bitwise.typesMod.Bit, 
          typings.bitwise.typesMod.Bit, 
          typings.bitwise.typesMod.Bit, 
          typings.bitwise.typesMod.Bit, 
          typings.bitwise.typesMod.Bit, 
          typings.bitwise.typesMod.Bit, 
          typings.bitwise.typesMod.Bit, 
          typings.bitwise.typesMod.Bit
        ],
      write: js.Tuple8[
          typings.bitwise.typesMod.Bit, 
          typings.bitwise.typesMod.Bit, 
          typings.bitwise.typesMod.Bit, 
          typings.bitwise.typesMod.Bit, 
          typings.bitwise.typesMod.Bit, 
          typings.bitwise.typesMod.Bit, 
          typings.bitwise.typesMod.Bit, 
          typings.bitwise.typesMod.Bit
        ] => UInt8
    ): Read = {
      val __obj = js.Dynamic.literal(read = js.Any.fromFunction1(read), write = js.Any.fromFunction1(write))
      __obj.asInstanceOf[Read]
    }
    
    @scala.inline
    implicit class ReadMutableBuilder[Self <: Read] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRead(
        value: UInt8 => js.Tuple8[
              typings.bitwise.typesMod.Bit, 
              typings.bitwise.typesMod.Bit, 
              typings.bitwise.typesMod.Bit, 
              typings.bitwise.typesMod.Bit, 
              typings.bitwise.typesMod.Bit, 
              typings.bitwise.typesMod.Bit, 
              typings.bitwise.typesMod.Bit, 
              typings.bitwise.typesMod.Bit
            ]
      ): Self = StObject.set(x, "read", js.Any.fromFunction1(value))
      
      @scala.inline
      def setWrite(
        value: js.Tuple8[
              typings.bitwise.typesMod.Bit, 
              typings.bitwise.typesMod.Bit, 
              typings.bitwise.typesMod.Bit, 
              typings.bitwise.typesMod.Bit, 
              typings.bitwise.typesMod.Bit, 
              typings.bitwise.typesMod.Bit, 
              typings.bitwise.typesMod.Bit, 
              typings.bitwise.typesMod.Bit
            ] => UInt8
      ): Self = StObject.set(x, "write", js.Any.fromFunction1(value))
    }
  }
  
  trait ReadWrite extends StObject {
    
    def read(byte: typings.bitwise.bitwiseTypesMod.UInt8): js.Tuple8[Bit, Bit, Bit, Bit, Bit, Bit, Bit, Bit]
    
    def write(byte: js.Tuple8[Bit, Bit, Bit, Bit, Bit, Bit, Bit, Bit]): typings.bitwise.bitwiseTypesMod.UInt8
  }
  object ReadWrite {
    
    @scala.inline
    def apply(
      read: typings.bitwise.bitwiseTypesMod.UInt8 => js.Tuple8[Bit, Bit, Bit, Bit, Bit, Bit, Bit, Bit],
      write: js.Tuple8[Bit, Bit, Bit, Bit, Bit, Bit, Bit, Bit] => typings.bitwise.bitwiseTypesMod.UInt8
    ): ReadWrite = {
      val __obj = js.Dynamic.literal(read = js.Any.fromFunction1(read), write = js.Any.fromFunction1(write))
      __obj.asInstanceOf[ReadWrite]
    }
    
    @scala.inline
    implicit class ReadWriteMutableBuilder[Self <: ReadWrite] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRead(value: typings.bitwise.bitwiseTypesMod.UInt8 => js.Tuple8[Bit, Bit, Bit, Bit, Bit, Bit, Bit, Bit]): Self = StObject.set(x, "read", js.Any.fromFunction1(value))
      
      @scala.inline
      def setWrite(value: js.Tuple8[Bit, Bit, Bit, Bit, Bit, Bit, Bit, Bit] => typings.bitwise.bitwiseTypesMod.UInt8): Self = StObject.set(x, "write", js.Any.fromFunction1(value))
    }
  }
  
  trait SetBit extends StObject {
    
    def getBit(int32: Double, position: Double): Bit
    
    def setBit(int32: Double, position: Double, value: Bit): Bit
    
    def toggleBit(int32: Double, position: Double): Double
  }
  object SetBit {
    
    @scala.inline
    def apply(
      getBit: (Double, Double) => Bit,
      setBit: (Double, Double, Bit) => Bit,
      toggleBit: (Double, Double) => Double
    ): SetBit = {
      val __obj = js.Dynamic.literal(getBit = js.Any.fromFunction2(getBit), setBit = js.Any.fromFunction3(setBit), toggleBit = js.Any.fromFunction2(toggleBit))
      __obj.asInstanceOf[SetBit]
    }
    
    @scala.inline
    implicit class SetBitMutableBuilder[Self <: SetBit] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetBit(value: (Double, Double) => Bit): Self = StObject.set(x, "getBit", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSetBit(value: (Double, Double, Bit) => Bit): Self = StObject.set(x, "setBit", js.Any.fromFunction3(value))
      
      @scala.inline
      def setToggleBit(value: (Double, Double) => Double): Self = StObject.set(x, "toggleBit", js.Any.fromFunction2(value))
    }
  }
  
  trait ToBits extends StObject {
    
    def toBits(string: String): js.Array[typings.bitwise.typesMod.Bit]
  }
  object ToBits {
    
    @scala.inline
    def apply(toBits: String => js.Array[typings.bitwise.typesMod.Bit]): ToBits = {
      val __obj = js.Dynamic.literal(toBits = js.Any.fromFunction1(toBits))
      __obj.asInstanceOf[ToBits]
    }
    
    @scala.inline
    implicit class ToBitsMutableBuilder[Self <: ToBits] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setToBits(value: String => js.Array[typings.bitwise.typesMod.Bit]): Self = StObject.set(x, "toBits", js.Any.fromFunction1(value))
    }
  }
  
  trait Write extends StObject {
    
    def read(nibble: typings.bitwise.typesMod.UInt4): js.Tuple4[
        typings.bitwise.typesMod.Bit, 
        typings.bitwise.typesMod.Bit, 
        typings.bitwise.typesMod.Bit, 
        typings.bitwise.typesMod.Bit
      ]
    
    def write(
      nibble: js.Tuple4[
          typings.bitwise.typesMod.Bit, 
          typings.bitwise.typesMod.Bit, 
          typings.bitwise.typesMod.Bit, 
          typings.bitwise.typesMod.Bit
        ]
    ): typings.bitwise.typesMod.UInt4
  }
  object Write {
    
    @scala.inline
    def apply(
      read: typings.bitwise.typesMod.UInt4 => js.Tuple4[
          typings.bitwise.typesMod.Bit, 
          typings.bitwise.typesMod.Bit, 
          typings.bitwise.typesMod.Bit, 
          typings.bitwise.typesMod.Bit
        ],
      write: js.Tuple4[
          typings.bitwise.typesMod.Bit, 
          typings.bitwise.typesMod.Bit, 
          typings.bitwise.typesMod.Bit, 
          typings.bitwise.typesMod.Bit
        ] => typings.bitwise.typesMod.UInt4
    ): Write = {
      val __obj = js.Dynamic.literal(read = js.Any.fromFunction1(read), write = js.Any.fromFunction1(write))
      __obj.asInstanceOf[Write]
    }
    
    @scala.inline
    implicit class WriteMutableBuilder[Self <: Write] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRead(
        value: typings.bitwise.typesMod.UInt4 => js.Tuple4[
              typings.bitwise.typesMod.Bit, 
              typings.bitwise.typesMod.Bit, 
              typings.bitwise.typesMod.Bit, 
              typings.bitwise.typesMod.Bit
            ]
      ): Self = StObject.set(x, "read", js.Any.fromFunction1(value))
      
      @scala.inline
      def setWrite(
        value: js.Tuple4[
              typings.bitwise.typesMod.Bit, 
              typings.bitwise.typesMod.Bit, 
              typings.bitwise.typesMod.Bit, 
              typings.bitwise.typesMod.Bit
            ] => typings.bitwise.typesMod.UInt4
      ): Self = StObject.set(x, "write", js.Any.fromFunction1(value))
    }
  }
}
