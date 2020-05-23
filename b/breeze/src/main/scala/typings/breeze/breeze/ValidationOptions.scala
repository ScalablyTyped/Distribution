package typings.breeze.breeze

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidationOptions extends js.Object {
  var validateOnAttach: Boolean
  var validateOnPropertyChange: Boolean
  var validateOnQuery: Boolean
  var validateOnSave: Boolean
  def setAsDefault(): ValidationOptions
  def using(config: ValidationOptionsConfiguration): ValidationOptions
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
}

