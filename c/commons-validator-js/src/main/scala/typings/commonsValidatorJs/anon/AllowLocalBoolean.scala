package typings.commonsValidatorJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AllowLocalBoolean extends js.Object {
  var allowLocal: Boolean = js.native
}

object AllowLocalBoolean {
  @scala.inline
  def apply(allowLocal: Boolean): AllowLocalBoolean = {
    val __obj = js.Dynamic.literal(allowLocal = allowLocal.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllowLocalBoolean]
  }
  @scala.inline
  implicit class AllowLocalBooleanOps[Self <: AllowLocalBoolean] (val x: Self) extends AnyVal {
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
    def setAllowLocal(value: Boolean): Self = this.set("allowLocal", value.asInstanceOf[js.Any])
  }
  
}

