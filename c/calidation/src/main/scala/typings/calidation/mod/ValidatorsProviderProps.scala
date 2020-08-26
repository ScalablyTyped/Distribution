package typings.calidation.mod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValidatorsProviderProps[T /* <: js.Object */] extends js.Object {
  var validators: Record[String, CustomValidatorFunction[T]] = js.native
}

object ValidatorsProviderProps {
  @scala.inline
  def apply[/* <: js.Object */ T](validators: Record[String, CustomValidatorFunction[T]]): ValidatorsProviderProps[T] = {
    val __obj = js.Dynamic.literal(validators = validators.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidatorsProviderProps[T]]
  }
  @scala.inline
  implicit class ValidatorsProviderPropsOps[Self <: ValidatorsProviderProps[_], /* <: js.Object */ T] (val x: Self with ValidatorsProviderProps[T]) extends AnyVal {
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
    def setValidators(value: Record[String, CustomValidatorFunction[T]]): Self = this.set("validators", value.asInstanceOf[js.Any])
  }
  
}

