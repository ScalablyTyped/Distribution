package typings.calidation.mod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegexValidatorConfig[T /* <: js.Object */] extends SimpleValidatorConfig[T] {
  var regex: RegExp = js.native
}

object RegexValidatorConfig {
  @scala.inline
  def apply[/* <: js.Object */ T](message: String, regex: RegExp): RegexValidatorConfig[T] = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], regex = regex.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegexValidatorConfig[T]]
  }
  @scala.inline
  implicit class RegexValidatorConfigOps[Self <: RegexValidatorConfig[_], /* <: js.Object */ T] (val x: Self with RegexValidatorConfig[T]) extends AnyVal {
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
    def setRegex(value: RegExp): Self = this.set("regex", value.asInstanceOf[js.Any])
  }
  
}

