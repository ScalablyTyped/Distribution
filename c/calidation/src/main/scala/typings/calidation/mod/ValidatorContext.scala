package typings.calidation.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidatorContext extends js.Object {
  var errors: Errors
  var fields: Fields
  var isDirty: Boolean
}

object ValidatorContext {
  @scala.inline
  def apply(errors: Errors, fields: Fields, isDirty: Boolean): ValidatorContext = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], isDirty = isDirty.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidatorContext]
  }
}

