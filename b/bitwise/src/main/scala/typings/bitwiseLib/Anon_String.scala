package typings
package bitwiseLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_String extends js.Object {
  def toBits(string: java.lang.String): js.Array[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_bitwise/types.Bit */ _
  ]
}

object Anon_String {
  @scala.inline
  def apply(
    toBits: js.Function1[
      java.lang.String, 
      js.Array[
        /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_bitwise/types.Bit */ _
      ]
    ]
  ): Anon_String = {
    val __obj = js.Dynamic.literal(toBits = toBits)
  
    __obj.asInstanceOf[Anon_String]
  }
}

