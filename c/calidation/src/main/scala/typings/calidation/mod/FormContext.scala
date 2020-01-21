package typings.calidation.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormContext extends js.Object {
  var dirty: Dirty
  var errors: Errors
  var fields: Fields
  var isValid: Boolean
  var submitted: Boolean
  def register(config: FieldsConfig, transforms: Transforms, initialValues: Dictionary[_]): Unit
  def resetAll(): Unit
  def setError(delta: Errors): Unit
  def setField(delta: Fields): Unit
  def submit(): Unit
  def unregister(config: FieldsConfig): Unit
}

object FormContext {
  @scala.inline
  def apply(
    dirty: Dirty,
    errors: Errors,
    fields: Fields,
    isValid: Boolean,
    register: (FieldsConfig, Transforms, Dictionary[_]) => Unit,
    resetAll: () => Unit,
    setError: Errors => Unit,
    setField: Fields => Unit,
    submit: () => Unit,
    submitted: Boolean,
    unregister: FieldsConfig => Unit
  ): FormContext = {
    val __obj = js.Dynamic.literal(dirty = dirty.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], isValid = isValid.asInstanceOf[js.Any], register = js.Any.fromFunction3(register), resetAll = js.Any.fromFunction0(resetAll), setError = js.Any.fromFunction1(setError), setField = js.Any.fromFunction1(setField), submit = js.Any.fromFunction0(submit), submitted = submitted.asInstanceOf[js.Any], unregister = js.Any.fromFunction1(unregister))
  
    __obj.asInstanceOf[FormContext]
  }
}

