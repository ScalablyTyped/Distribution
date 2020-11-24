package typings.calidation.mod

import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FormContext[T /* <: js.Object */] extends js.Object {
  
  var dirty: Dirty[T] = js.native
  
  var errors: Errors[T] = js.native
  
  var fields: Fields[T] = js.native
  
  var isValid: Boolean = js.native
  
  def register(config: FieldsConfig[T], transforms: Transforms[T], initialValues: T): Unit = js.native
  
  def resetAll(): Unit = js.native
  
  def setError(delta: Errors[T]): Unit = js.native
  
  def setField(delta: Partial[T]): Unit = js.native
  
  def submit(): Unit = js.native
  
  var submitted: Boolean = js.native
  
  def unregister(config: FieldsConfig[T]): Unit = js.native
}
object FormContext {
  
  @scala.inline
  def apply[T /* <: js.Object */](
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
  
  @scala.inline
  implicit class FormContextOps[Self <: FormContext[_], T /* <: js.Object */] (val x: Self with FormContext[T]) extends AnyVal {
    
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
    def setDirty(value: Dirty[T]): Self = this.set("dirty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrors(value: Errors[T]): Self = this.set("errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFields(value: Fields[T]): Self = this.set("fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsValid(value: Boolean): Self = this.set("isValid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegister(value: (FieldsConfig[T], Transforms[T], T) => Unit): Self = this.set("register", js.Any.fromFunction3(value))
    
    @scala.inline
    def setResetAll(value: () => Unit): Self = this.set("resetAll", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetError(value: Errors[T] => Unit): Self = this.set("setError", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetField(value: Partial[T] => Unit): Self = this.set("setField", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSubmit(value: () => Unit): Self = this.set("submit", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSubmitted(value: Boolean): Self = this.set("submitted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnregister(value: FieldsConfig[T] => Unit): Self = this.set("unregister", js.Any.fromFunction1(value))
  }
}
