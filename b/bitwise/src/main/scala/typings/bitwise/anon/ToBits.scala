package typings.bitwise.anon

import typings.bitwise.typesMod.Bit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ToBits extends js.Object {
  def toBits(string: String): js.Array[Bit] = js.native
}

object ToBits {
  @scala.inline
  def apply(toBits: String => js.Array[Bit]): ToBits = {
    val __obj = js.Dynamic.literal(toBits = js.Any.fromFunction1(toBits))
    __obj.asInstanceOf[ToBits]
  }
  @scala.inline
  implicit class ToBitsOps[Self <: ToBits] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setToBits(value: String => js.Array[Bit]): Self = this.set("toBits", js.Any.fromFunction1(value))
  }
  
}

