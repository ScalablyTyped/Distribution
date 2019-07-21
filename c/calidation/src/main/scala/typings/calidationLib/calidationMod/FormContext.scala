package typings
package calidationLib.calidationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormContext extends js.Object {
  var dirty: Dirty
  var errors: Errors
  var fields: Fields
  var isValid: scala.Boolean
  var submitted: scala.Boolean
  def register(config: FieldsConfig, transforms: Transforms, initialValues: Dictionary[_]): scala.Unit
  def resetAll(): scala.Unit
  def setError(delta: Errors): scala.Unit
  def setField(delta: Fields): scala.Unit
  def submit(): scala.Unit
  def unregister(config: FieldsConfig): scala.Unit
}

object FormContext {
  @scala.inline
  def apply(
    dirty: Dirty,
    errors: Errors,
    fields: Fields,
    isValid: scala.Boolean,
    register: (FieldsConfig, Transforms, Dictionary[_]) => scala.Unit,
    resetAll: () => scala.Unit,
    setError: Errors => scala.Unit,
    setField: Fields => scala.Unit,
    submit: () => scala.Unit,
    submitted: scala.Boolean,
    unregister: FieldsConfig => scala.Unit
  ): FormContext = {
    val __obj = js.Dynamic.literal(dirty = dirty, errors = errors, fields = fields, isValid = isValid, register = js.Any.fromFunction3(register), resetAll = js.Any.fromFunction0(resetAll), setError = js.Any.fromFunction1(setError), setField = js.Any.fromFunction1(setField), submit = js.Any.fromFunction0(submit), submitted = submitted, unregister = js.Any.fromFunction1(unregister))
  
    __obj.asInstanceOf[FormContext]
  }
}

