package typings.calidation.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidatorContext[T /* <: js.Object */] extends js.Object {
  var errors: Errors[T]
  var fields: Fields[T]
  var isDirty: Boolean
}

object ValidatorContext {
  @scala.inline
  def apply[/* <: js.Object */ T](errors: Errors[T], fields: Fields[T], isDirty: Boolean): ValidatorContext[T] = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], isDirty = isDirty.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidatorContext[T]]
  }
}

