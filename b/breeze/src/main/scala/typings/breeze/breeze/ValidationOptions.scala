package typings.breeze.breeze

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValidationOptions extends js.Object {
  var validateOnAttach: Boolean = js.native
  var validateOnPropertyChange: Boolean = js.native
  var validateOnQuery: Boolean = js.native
  var validateOnSave: Boolean = js.native
  def setAsDefault(): ValidationOptions = js.native
  def using(config: ValidationOptionsConfiguration): ValidationOptions = js.native
}

object ValidationOptions {
  @scala.inline
  def apply(
    setAsDefault: () => ValidationOptions,
    using: ValidationOptionsConfiguration => ValidationOptions,
    validateOnAttach: Boolean,
    validateOnPropertyChange: Boolean,
    validateOnQuery: Boolean,
    validateOnSave: Boolean
  ): ValidationOptions = {
    val __obj = js.Dynamic.literal(setAsDefault = js.Any.fromFunction0(setAsDefault), using = js.Any.fromFunction1(using), validateOnAttach = validateOnAttach.asInstanceOf[js.Any], validateOnPropertyChange = validateOnPropertyChange.asInstanceOf[js.Any], validateOnQuery = validateOnQuery.asInstanceOf[js.Any], validateOnSave = validateOnSave.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidationOptions]
  }
  @scala.inline
  implicit class ValidationOptionsOps[Self <: ValidationOptions] (val x: Self) extends AnyVal {
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
    def setSetAsDefault(value: () => ValidationOptions): Self = this.set("setAsDefault", js.Any.fromFunction0(value))
    @scala.inline
    def setUsing(value: ValidationOptionsConfiguration => ValidationOptions): Self = this.set("using", js.Any.fromFunction1(value))
    @scala.inline
    def setValidateOnAttach(value: Boolean): Self = this.set("validateOnAttach", value.asInstanceOf[js.Any])
    @scala.inline
    def setValidateOnPropertyChange(value: Boolean): Self = this.set("validateOnPropertyChange", value.asInstanceOf[js.Any])
    @scala.inline
    def setValidateOnQuery(value: Boolean): Self = this.set("validateOnQuery", value.asInstanceOf[js.Any])
    @scala.inline
    def setValidateOnSave(value: Boolean): Self = this.set("validateOnSave", value.asInstanceOf[js.Any])
  }
  
}

