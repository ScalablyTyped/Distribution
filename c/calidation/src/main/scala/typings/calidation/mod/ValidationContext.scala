package typings.calidation.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Omit<calidation.calidation.FormContext, 'register' | 'unregister'> */
trait ValidationContext extends js.Object {
  var dirty: Dirty
  var errors: Errors
  var fields: Fields
  var isValid: Boolean
  var resetAll: js.Function0[Unit]
  var setError: js.Function1[/* delta */ Errors, Unit]
  var setField: js.Function1[/* delta */ Fields, Unit]
  var submit: js.Function0[Unit]
  var submitted: Boolean
}

object ValidationContext {
  @scala.inline
  def apply(
    dirty: Dirty,
    errors: Errors,
    fields: Fields,
    isValid: Boolean,
    resetAll: () => Unit,
    setError: /* delta */ Errors => Unit,
    setField: /* delta */ Fields => Unit,
    submit: () => Unit,
    submitted: Boolean
  ): ValidationContext = {
    val __obj = js.Dynamic.literal(dirty = dirty.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], isValid = isValid.asInstanceOf[js.Any], resetAll = js.Any.fromFunction0(resetAll), setError = js.Any.fromFunction1(setError), setField = js.Any.fromFunction1(setField), submit = js.Any.fromFunction0(submit), submitted = submitted.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidationContext]
  }
}

