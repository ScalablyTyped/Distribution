package typings.commonsValidatorJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AllowLocal extends js.Object {
  var allowLocal: Boolean = js.native
  var allowTld: Boolean = js.native
}

object AllowLocal {
  @scala.inline
  def apply(allowLocal: Boolean, allowTld: Boolean): AllowLocal = {
    val __obj = js.Dynamic.literal(allowLocal = allowLocal.asInstanceOf[js.Any], allowTld = allowTld.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllowLocal]
  }
  @scala.inline
  implicit class AllowLocalOps[Self <: AllowLocal] (val x: Self) extends AnyVal {
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
    @scala.inline
    def setAllowTld(value: Boolean): Self = this.set("allowTld", value.asInstanceOf[js.Any])
  }
  
}

