package typings.bitwise

import typings.bitwise.typesMod.Bit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bitwise/esm/string", JSImport.Namespace)
@js.native
object stringMod extends js.Object {
  def toBits(string: String): js.Array[Bit] = js.native
  @js.native
  object default extends js.Object {
    def toBits(string: String): js.Array[Bit] = js.native
  }
  
}

