package typings.crossStorage.mod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubDomain extends js.Object {
  var allow: js.Array[CrossStorageMethod] = js.native
  var origin: RegExp = js.native
}

object SubDomain {
  @scala.inline
  def apply(allow: js.Array[CrossStorageMethod], origin: RegExp): SubDomain = {
    val __obj = js.Dynamic.literal(allow = allow.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubDomain]
  }
  @scala.inline
  implicit class SubDomainOps[Self <: SubDomain] (val x: Self) extends AnyVal {
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
    def setAllowVarargs(value: CrossStorageMethod*): Self = this.set("allow", js.Array(value :_*))
    @scala.inline
    def setAllow(value: js.Array[CrossStorageMethod]): Self = this.set("allow", value.asInstanceOf[js.Any])
    @scala.inline
    def setOrigin(value: RegExp): Self = this.set("origin", value.asInstanceOf[js.Any])
  }
  
}

