package typings.bigInteger.anon

import typings.bigInteger.mod.BigInteger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Quotient extends js.Object {
  var quotient: BigInteger = js.native
  var remainder: BigInteger = js.native
}

object Quotient {
  @scala.inline
  def apply(quotient: BigInteger, remainder: BigInteger): Quotient = {
    val __obj = js.Dynamic.literal(quotient = quotient.asInstanceOf[js.Any], remainder = remainder.asInstanceOf[js.Any])
    __obj.asInstanceOf[Quotient]
  }
  @scala.inline
  implicit class QuotientOps[Self <: Quotient] (val x: Self) extends AnyVal {
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
    def setQuotient(value: BigInteger): Self = this.set("quotient", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemainder(value: BigInteger): Self = this.set("remainder", value.asInstanceOf[js.Any])
  }
  
}

