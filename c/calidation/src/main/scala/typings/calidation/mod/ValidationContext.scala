package typings.calidation.mod

import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<calidation.calidation.FormContext<T>, 'register' | 'unregister'> */
trait ValidationContext[T /* <: js.Object */] extends StObject {
  
  var dirty: Dirty[T]
  
  var errors: Errors[T]
  
  var fields: Fields[T]
  
  var isValid: Boolean
  
  var resetAll: js.Function0[Unit]
  
  var setError: js.Function1[/* delta */ Errors[T], Unit]
  
  var setField: js.Function1[/* delta */ Partial[T], Unit]
  
  var submit: js.Function0[Unit]
  
  var submitted: Boolean
}
object ValidationContext {
  
  inline def apply[T /* <: js.Object */](
    dirty: Dirty[T],
    errors: Errors[T],
    fields: Fields[T],
    isValid: Boolean,
    resetAll: () => Unit,
    setError: /* delta */ Errors[T] => Unit,
    setField: /* delta */ Partial[T] => Unit,
    submit: () => Unit,
    submitted: Boolean
  ): ValidationContext[T] = {
    val __obj = js.Dynamic.literal(dirty = dirty.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], isValid = isValid.asInstanceOf[js.Any], resetAll = js.Any.fromFunction0(resetAll), setError = js.Any.fromFunction1(setError), setField = js.Any.fromFunction1(setField), submit = js.Any.fromFunction0(submit), submitted = submitted.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidationContext[T]]
  }
  
  extension [Self <: ValidationContext[?], T /* <: js.Object */](x: Self & ValidationContext[T]) {
    
    inline def setDirty(value: Dirty[T]): Self = StObject.set(x, "dirty", value.asInstanceOf[js.Any])
    
    inline def setErrors(value: Errors[T]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setFields(value: Fields[T]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setIsValid(value: Boolean): Self = StObject.set(x, "isValid", value.asInstanceOf[js.Any])
    
    inline def setResetAll(value: () => Unit): Self = StObject.set(x, "resetAll", js.Any.fromFunction0(value))
    
    inline def setSetError(value: /* delta */ Errors[T] => Unit): Self = StObject.set(x, "setError", js.Any.fromFunction1(value))
    
    inline def setSetField(value: /* delta */ Partial[T] => Unit): Self = StObject.set(x, "setField", js.Any.fromFunction1(value))
    
    inline def setSubmit(value: () => Unit): Self = StObject.set(x, "submit", js.Any.fromFunction0(value))
    
    inline def setSubmitted(value: Boolean): Self = StObject.set(x, "submitted", value.asInstanceOf[js.Any])
  }
}
