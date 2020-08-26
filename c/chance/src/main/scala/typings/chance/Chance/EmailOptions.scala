package typings.chance.Chance

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EmailOptions extends js.Object {
  var domain: String = js.native
  var length: Double = js.native
}

object EmailOptions {
  @scala.inline
  def apply(domain: String, length: Double): EmailOptions = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmailOptions]
  }
  @scala.inline
  implicit class EmailOptionsOps[Self <: EmailOptions] (val x: Self) extends AnyVal {
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
    def setDomain(value: String): Self = this.set("domain", value.asInstanceOf[js.Any])
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
  }
  
}

