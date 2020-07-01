package typings.calidation.mod

import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Omit<calidation.calidation.FormContext<T>, 'register' | 'unregister'> */
trait ValidationContext[T /* <: js.Object */] extends js.Object {
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
  @scala.inline
  def apply[/* <: js.Object */ T](
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
}

