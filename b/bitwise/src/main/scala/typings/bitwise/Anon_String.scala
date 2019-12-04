package typings.bitwise

import typings.bitwise.esmTypesMod.Bit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_String extends js.Object {
  def toBits(string: String): js.Array[Bit]
}

object Anon_String {
  @scala.inline
  def apply(toBits: String => js.Array[Bit]): Anon_String = {
    val __obj = js.Dynamic.literal(toBits = js.Any.fromFunction1(toBits))
  
    __obj.asInstanceOf[Anon_String]
  }
}

