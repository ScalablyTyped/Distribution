package typings.calidation.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BlacklistValidatorConfig[T /* <: js.Object */] extends SimpleValidatorConfig[T] {
  var blacklist: js.Array[String] = js.native
}

object BlacklistValidatorConfig {
  @scala.inline
  def apply[/* <: js.Object */ T](blacklist: js.Array[String], message: String): BlacklistValidatorConfig[T] = {
    val __obj = js.Dynamic.literal(blacklist = blacklist.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlacklistValidatorConfig[T]]
  }
  @scala.inline
  implicit class BlacklistValidatorConfigOps[Self <: BlacklistValidatorConfig[_], /* <: js.Object */ T] (val x: Self with BlacklistValidatorConfig[T]) extends AnyVal {
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
    def setBlacklistVarargs(value: String*): Self = this.set("blacklist", js.Array(value :_*))
    @scala.inline
    def setBlacklist(value: js.Array[String]): Self = this.set("blacklist", value.asInstanceOf[js.Any])
  }
  
}

