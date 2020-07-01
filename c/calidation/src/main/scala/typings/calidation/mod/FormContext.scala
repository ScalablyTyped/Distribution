package typings.calidation.mod

import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormContext[T /* <: js.Object */] extends js.Object {
  var dirty: Dirty[T]
  var errors: Errors[T]
  var fields: Fields[T]
  var isValid: Boolean
  var submitted: Boolean
  def register(config: FieldsConfig[T], transforms: Transforms[T], initialValues: T): Unit
  def resetAll(): Unit
  def setError(delta: Errors[T]): Unit
  def setField(delta: Partial[T]): Unit
  def submit(): Unit
  def unregister(config: FieldsConfig[T]): Unit
}

object FormContext {
  @scala.inline
  def apply[/* <: js.Object */ T](
    dirty: Dirty[T],
    errors: Errors[T],
    fields: Fields[T],
    isValid: Boolean,
    register: (FieldsConfig[T], Transforms[T], T) => Unit,
    resetAll: () => Unit,
    setError: Errors[T] => Unit,
    setField: Partial[T] => Unit,
    submit: () => Unit,
    submitted: Boolean,
    unregister: FieldsConfig[T] => Unit
  ): FormContext[T] = {
    val __obj = js.Dynamic.literal(dirty = dirty.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], isValid = isValid.asInstanceOf[js.Any], register = js.Any.fromFunction3(register), resetAll = js.Any.fromFunction0(resetAll), setError = js.Any.fromFunction1(setError), setField = js.Any.fromFunction1(setField), submit = js.Any.fromFunction0(submit), submitted = submitted.asInstanceOf[js.Any], unregister = js.Any.fromFunction1(unregister))
    __obj.asInstanceOf[FormContext[T]]
  }
}

