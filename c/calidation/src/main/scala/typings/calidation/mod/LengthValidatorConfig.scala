package typings.calidation.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LengthValidatorConfig[T /* <: js.Object */] extends SimpleValidatorConfig[T] {
  var length: Double = js.native
}

object LengthValidatorConfig {
  @scala.inline
  def apply[/* <: js.Object */ T](length: Double, message: String): LengthValidatorConfig[T] = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[LengthValidatorConfig[T]]
  }
  @scala.inline
  implicit class LengthValidatorConfigOps[Self <: LengthValidatorConfig[_], /* <: js.Object */ T] (val x: Self with LengthValidatorConfig[T]) extends AnyVal {
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
  }
  
}

