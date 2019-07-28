package typings.bitwise

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bitwise", JSImport.Namespace)
@js.native
object bitwiseMod extends js.Object {
  @js.native
  object bits extends js.Object {
    def and(
      bits1: js.Array[
          /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_bitwise/types.Bit */ _
        ],
      bits2: js.Array[
          /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_bitwise/types.Bit */ _
        ]
    ): js.Array[
        /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_bitwise/types.Bit */ _
      ] = js.native
    def nand(
      bits1: js.Array[
          /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_bitwise/types.Bit */ _
        ],
      bits2: js.Array[
          /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_bitwise/types.Bit */ _
        ]
    ): js.Array[
        /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_bitwise/types.Bit */ _
      ] = js.native
    def nor(
      bits1: js.Array[
          /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_bitwise/types.Bit */ _
        ],
      bits2: js.Array[
          /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_bitwise/types.Bit */ _
        ]
    ): js.Array[
        /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_bitwise/types.Bit */ _
      ] = js.native
    def not(
      bits: js.Array[
          /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_bitwise/types.Bit */ _
        ]
    ): js.Array[
        /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_bitwise/types.Bit */ _
      ] = js.native
    def or(
      bits1: js.Array[
          /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_bitwise/types.Bit */ _
        ],
      bits2: js.Array[
          /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_bitwise/types.Bit */ _
        ]
    ): js.Array[
        /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_bitwise/types.Bit */ _
      ] = js.native
    def reduceAnd(
      bits: js.Array[
          /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_bitwise/types.Bit */ _
        ]
    ): js.Any = js.native
    def reduceNand(
      bits: js.Array[
          /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_bitwise/types.Bit */ _
        ]
    ): js.Any = js.native
    def reduceNor(
      bits: js.Array[
          /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_bitwise/types.Bit */ _
        ]
    ): js.Any = js.native
    def reduceOr(
      bits: js.Array[
          /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_bitwise/types.Bit */ _
        ]
    ): js.Any = js.native
    def reduceXnor(
      bits: js.Array[
          /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_bitwise/types.Bit */ _
        ]
    ): js.Any = js.native
    def reduceXor(
      bits: js.Array[
          /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_bitwise/types.Bit */ _
        ]
    ): js.Any = js.native
    def toBoolean(
      bits: js.Array[
          /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_bitwise/types.Bit */ _
        ]
    ): js.Array[Boolean] = js.native
    def toString(
      bits: js.Array[
          /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_bitwise/types.Bit */ _
        ]
    ): String = js.native
    def toString(
      bits: js.Array[
          /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_bitwise/types.Bit */ _
        ],
      spacing: Double
    ): String = js.native
    def toString(
      bits: js.Array[
          /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_bitwise/types.Bit */ _
        ],
      spacing: Double,
      spacer: String
    ): String = js.native
    def xnor(
      bits1: js.Array[
          /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_bitwise/types.Bit */ _
        ],
      bits2: js.Array[
          /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_bitwise/types.Bit */ _
        ]
    ): js.Array[
        /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_bitwise/types.Bit */ _
      ] = js.native
    def xor(
      bits1: js.Array[
          /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_bitwise/types.Bit */ _
        ],
      bits2: js.Array[
          /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_bitwise/types.Bit */ _
        ]
    ): js.Array[
        /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_bitwise/types.Bit */ _
      ] = js.native
  }
  
  @js.native
  object buffer extends js.Object {
    def and(a: Buffer, b: Buffer): Buffer = js.native
    def and(a: Buffer, b: Buffer, isLooping: Boolean): Buffer = js.native
    def create(
      bits: js.Array[
          /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_bitwise/types.Bit */ _
        ]
    ): Buffer = js.native
    def modify(
      buffer: Buffer,
      bits: js.Array[
          /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_bitwise/types.Bit */ _
        ]
    ): Unit = js.native
    def modify(
      buffer: Buffer,
      bits: js.Array[
          /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_bitwise/types.Bit */ _
        ],
      offset: Double
    ): Unit = js.native
    def nand(a: Buffer, b: Buffer): Buffer = js.native
    def nand(a: Buffer, b: Buffer, isLooping: Boolean): Buffer = js.native
    def nor(a: Buffer, b: Buffer): Buffer = js.native
    def nor(a: Buffer, b: Buffer, isLooping: Boolean): Buffer = js.native
    def not(buffer: Buffer): Buffer = js.native
    def or(a: Buffer, b: Buffer): Buffer = js.native
    def or(a: Buffer, b: Buffer, isLooping: Boolean): Buffer = js.native
    def read(buffer: Buffer): js.Array[
        /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_bitwise/types.Bit */ _
      ] = js.native
    def read(buffer: Buffer, offset: Double): js.Array[
        /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_bitwise/types.Bit */ _
      ] = js.native
    def read(buffer: Buffer, offset: Double, length: Double): js.Array[
        /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_bitwise/types.Bit */ _
      ] = js.native
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
    def read(
      byte: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_bitwise/types.UInt8 */ js.Any
    ): js.Tuple8[
        /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_bitwise/types.Bit */ _, 
        /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_bitwise/types.Bit */ _, 
        /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_bitwise/types.Bit */ _, 
        /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_bitwise/types.Bit */ _, 
        /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_bitwise/types.Bit */ _, 
        /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_bitwise/types.Bit */ _, 
        /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_bitwise/types.Bit */ _, 
        /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_bitwise/types.Bit */ _
      ] = js.native
    def write(
      byte: js.Tuple8[
          /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_bitwise/types.Bit */ _, 
          /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_bitwise/types.Bit */ _, 
          /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_bitwise/types.Bit */ _, 
          /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_bitwise/types.Bit */ _, 
          /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_bitwise/types.Bit */ _, 
          /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_bitwise/types.Bit */ _, 
          /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_bitwise/types.Bit */ _, 
          /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_bitwise/types.Bit */ _
        ]
    ): js.Any = js.native
  }
  
  @js.native
  object default extends js.Object {
    var bits: Anon_And = js.native
    var buffer: Anon_A = js.native
    var byte: Anon_Byte = js.native
    var integer: Anon_GetBit = js.native
    var nibble: Anon_Nibble = js.native
    var string: Anon_String = js.native
  }
  
  @js.native
  object integer extends js.Object {
    def getBit(int32: Double, position: Double): js.Any = js.native
    def setBit(
      int32: Double,
      position: Double,
      value: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_bitwise/types.Bit */ js.Any
    ): js.Any = js.native
    def toggleBit(int32: Double, position: Double): Double = js.native
  }
  
  @js.native
  object nibble extends js.Object {
    def read(
      nibble: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_bitwise/types.UInt4 */ js.Any
    ): js.Tuple4[
        /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_bitwise/types.Bit */ _, 
        /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_bitwise/types.Bit */ _, 
        /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_bitwise/types.Bit */ _, 
        /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_bitwise/types.Bit */ _
      ] = js.native
    def write(
      nibble: js.Tuple4[
          /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_bitwise/types.Bit */ _, 
          /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_bitwise/types.Bit */ _, 
          /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_bitwise/types.Bit */ _, 
          /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_bitwise/types.Bit */ _
        ]
    ): js.Any = js.native
  }
  
  @js.native
  object string extends js.Object {
    def toBits(string: String): js.Array[
        /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_bitwise/types.Bit */ _
      ] = js.native
  }
  
}

