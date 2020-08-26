package typings.chartmogulNode.anon

import typings.chartmogulNode.mod.Customer.NewCustomAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Custom extends js.Object {
  var custom: js.Array[NewCustomAttributes] = js.native
  var email: String = js.native
}

object Custom {
  @scala.inline
  def apply(custom: js.Array[NewCustomAttributes], email: String): Custom = {
    val __obj = js.Dynamic.literal(custom = custom.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any])
    __obj.asInstanceOf[Custom]
  }
  @scala.inline
  implicit class CustomOps[Self <: Custom] (val x: Self) extends AnyVal {
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
    def setCustomVarargs(value: NewCustomAttributes*): Self = this.set("custom", js.Array(value :_*))
    @scala.inline
    def setCustom(value: js.Array[NewCustomAttributes]): Self = this.set("custom", value.asInstanceOf[js.Any])
    @scala.inline
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
  }
  
}

