package typings.currencyFormatter.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Neg extends js.Object {
  var neg: String = js.native
  var pos: String = js.native
  var zero: String = js.native
}

object Neg {
  @scala.inline
  def apply(neg: String, pos: String, zero: String): Neg = {
    val __obj = js.Dynamic.literal(neg = neg.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any], zero = zero.asInstanceOf[js.Any])
    __obj.asInstanceOf[Neg]
  }
  @scala.inline
  implicit class NegOps[Self <: Neg] (val x: Self) extends AnyVal {
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
    def setNeg(value: String): Self = this.set("neg", value.asInstanceOf[js.Any])
    @scala.inline
    def setPos(value: String): Self = this.set("pos", value.asInstanceOf[js.Any])
    @scala.inline
    def setZero(value: String): Self = this.set("zero", value.asInstanceOf[js.Any])
  }
  
}

