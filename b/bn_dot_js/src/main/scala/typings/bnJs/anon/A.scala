package typings.bnJs.anon

import typings.bnJs.mod.BN
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait A extends js.Object {
  var a: BN = js.native
  var b: BN = js.native
  var gcd: BN = js.native
}

object A {
  @scala.inline
  def apply(a: BN, b: BN, gcd: BN): A = {
    val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any], gcd = gcd.asInstanceOf[js.Any])
    __obj.asInstanceOf[A]
  }
  @scala.inline
  implicit class AOps[Self <: A] (val x: Self) extends AnyVal {
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
    def setA(value: BN): Self = this.set("a", value.asInstanceOf[js.Any])
    @scala.inline
    def setB(value: BN): Self = this.set("b", value.asInstanceOf[js.Any])
    @scala.inline
    def setGcd(value: BN): Self = this.set("gcd", value.asInstanceOf[js.Any])
  }
  
}

