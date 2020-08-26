package typings.chance.Chance

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreditCardType extends js.Object {
  var length: Double = js.native
  var name: String = js.native
  var prefix: String = js.native
  var short_name: String = js.native
}

object CreditCardType {
  @scala.inline
  def apply(length: Double, name: String, prefix: String, short_name: String): CreditCardType = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], short_name = short_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreditCardType]
  }
  @scala.inline
  implicit class CreditCardTypeOps[Self <: CreditCardType] (val x: Self) extends AnyVal {
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
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrefix(value: String): Self = this.set("prefix", value.asInstanceOf[js.Any])
    @scala.inline
    def setShort_name(value: String): Self = this.set("short_name", value.asInstanceOf[js.Any])
  }
  
}

