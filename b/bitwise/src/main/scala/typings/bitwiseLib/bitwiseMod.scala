package typings
package bitwiseLib

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
    ): js.Array[scala.Boolean] = js.native
    def toString(
      bits: js.Array[
          /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_bitwise/types.Bit */ _
        ]
    ): java.lang.String = js.native
    def toString(
      bits: js.Array[
          /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_bitwise/types.Bit */ _
        ],
      spacing: scala.Double
    ): java.lang.String = js.native
    def toString(
      bits: js.Array[
          /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_bitwise/types.Bit */ _
        ],
      spacing: scala.Double,
      spacer: java.lang.String
    ): java.lang.String = js.native
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
    def and(a: nodeLib.Buffer, b: nodeLib.Buffer): nodeLib.Buffer = js.native
    def and(a: nodeLib.Buffer, b: nodeLib.Buffer, isLooping: scala.Boolean): nodeLib.Buffer = js.native
    def create(
      bits: js.Array[
          /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_bitwise/types.Bit */ _
        ]
    ): nodeLib.Buffer = js.native
    def modify(
      buffer: nodeLib.Buffer,
      bits: js.Array[
          /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_bitwise/types.Bit */ _
        ]
    ): scala.Unit = js.native
    def modify(
      buffer: nodeLib.Buffer,
      bits: js.Array[
          /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_bitwise/types.Bit */ _
        ],
      offset: scala.Double
    ): scala.Unit = js.native
    def nand(a: nodeLib.Buffer, b: nodeLib.Buffer): nodeLib.Buffer = js.native
    def nand(a: nodeLib.Buffer, b: nodeLib.Buffer, isLooping: scala.Boolean): nodeLib.Buffer = js.native
    def nor(a: nodeLib.Buffer, b: nodeLib.Buffer): nodeLib.Buffer = js.native
    def nor(a: nodeLib.Buffer, b: nodeLib.Buffer, isLooping: scala.Boolean): nodeLib.Buffer = js.native
    def not(buffer: nodeLib.Buffer): nodeLib.Buffer = js.native
    def or(a: nodeLib.Buffer, b: nodeLib.Buffer): nodeLib.Buffer = js.native
    def or(a: nodeLib.Buffer, b: nodeLib.Buffer, isLooping: scala.Boolean): nodeLib.Buffer = js.native
    def read(buffer: nodeLib.Buffer): js.Array[
        /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_bitwise/types.Bit */ _
      ] = js.native
    def read(buffer: nodeLib.Buffer, offset: scala.Double): js.Array[
        /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_bitwise/types.Bit */ _
      ] = js.native
    def read(buffer: nodeLib.Buffer, offset: scala.Double, length: scala.Double): js.Array[
        /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_bitwise/types.Bit */ _
      ] = js.native
    def readInt(buffer: nodeLib.Buffer): scala.Double = js.native
    def readInt(buffer: nodeLib.Buffer, offset: scala.Double): scala.Double = js.native
    def readInt(buffer: nodeLib.Buffer, offset: scala.Double, length: scala.Double): scala.Double = js.native
    def readUInt(buffer: nodeLib.Buffer): scala.Double = js.native
    def readUInt(buffer: nodeLib.Buffer, offset: scala.Double): scala.Double = js.native
    def readUInt(buffer: nodeLib.Buffer, offset: scala.Double, length: scala.Double): scala.Double = js.native
    def xnor(a: nodeLib.Buffer, b: nodeLib.Buffer): nodeLib.Buffer = js.native
    def xnor(a: nodeLib.Buffer, b: nodeLib.Buffer, isLooping: scala.Boolean): nodeLib.Buffer = js.native
    def xor(a: nodeLib.Buffer, b: nodeLib.Buffer): nodeLib.Buffer = js.native
    def xor(a: nodeLib.Buffer, b: nodeLib.Buffer, isLooping: scala.Boolean): nodeLib.Buffer = js.native
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
    var bits: bitwiseLib.Anon_And = js.native
    var buffer: bitwiseLib.Anon_A = js.native
    var byte: bitwiseLib.Anon_Byte = js.native
    var integer: bitwiseLib.Anon_GetBit = js.native
    var nibble: bitwiseLib.Anon_Nibble = js.native
    var string: bitwiseLib.Anon_String = js.native
  }
  
  @js.native
  object integer extends js.Object {
    def getBit(int32: scala.Double, position: scala.Double): js.Any = js.native
    def setBit(
      int32: scala.Double,
      position: scala.Double,
      value: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_bitwise/types.Bit */ js.Any
    ): js.Any = js.native
    def toggleBit(int32: scala.Double, position: scala.Double): scala.Double = js.native
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
    def toBits(string: java.lang.String): js.Array[
        /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_bitwise/types.Bit */ _
      ] = js.native
  }
  
}

