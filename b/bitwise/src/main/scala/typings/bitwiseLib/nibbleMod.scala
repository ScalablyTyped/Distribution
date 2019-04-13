package typings
package bitwiseLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bitwise/nibble", JSImport.Namespace)
@js.native
object nibbleMod extends js.Object {
  def read(nibble: bitwiseLib.typesMod.UInt4): js.Tuple4[
    bitwiseLib.typesMod.Bit, 
    bitwiseLib.typesMod.Bit, 
    bitwiseLib.typesMod.Bit, 
    bitwiseLib.typesMod.Bit
  ] = js.native
  def write(
    nibble: js.Tuple4[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_bitwise/types.Bit */ _, 
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_bitwise/types.Bit */ _, 
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_bitwise/types.Bit */ _, 
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_bitwise/types.Bit */ _
    ]
  ): bitwiseLib.typesMod.UInt4 = js.native
  @js.native
  object default extends js.Object {
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
  
}

