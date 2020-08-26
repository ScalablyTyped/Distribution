package typings.calidation.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValueValidatorConfig[P, T /* <: js.Object */] extends SimpleValidatorConfig[T] {
  var value: P = js.native
}

object ValueValidatorConfig {
  @scala.inline
  def apply[P, /* <: js.Object */ T](message: String, value: P): ValueValidatorConfig[P, T] = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueValidatorConfig[P, T]]
  }
  @scala.inline
  implicit class ValueValidatorConfigOps[Self <: ValueValidatorConfig[_, _], P, /* <: js.Object */ T] (val x: Self with (ValueValidatorConfig[P, T])) extends AnyVal {
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
    def setValue(value: P): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

