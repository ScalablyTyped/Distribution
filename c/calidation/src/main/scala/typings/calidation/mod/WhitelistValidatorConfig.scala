package typings.calidation.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WhitelistValidatorConfig[T /* <: js.Object */] extends SimpleValidatorConfig[T] {
  var whitelist: js.Array[String] = js.native
}

object WhitelistValidatorConfig {
  @scala.inline
  def apply[/* <: js.Object */ T](message: String, whitelist: js.Array[String]): WhitelistValidatorConfig[T] = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], whitelist = whitelist.asInstanceOf[js.Any])
    __obj.asInstanceOf[WhitelistValidatorConfig[T]]
  }
  @scala.inline
  implicit class WhitelistValidatorConfigOps[Self <: WhitelistValidatorConfig[_], /* <: js.Object */ T] (val x: Self with WhitelistValidatorConfig[T]) extends AnyVal {
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
    def setWhitelistVarargs(value: String*): Self = this.set("whitelist", js.Array(value :_*))
    @scala.inline
    def setWhitelist(value: js.Array[String]): Self = this.set("whitelist", value.asInstanceOf[js.Any])
  }
  
}

