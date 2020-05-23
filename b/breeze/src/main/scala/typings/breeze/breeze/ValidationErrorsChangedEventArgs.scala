package typings.breeze.breeze

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidationErrorsChangedEventArgs extends js.Object {
  var added: js.Array[ValidationError]
  var entity: Entity
  var removed: js.Array[ValidationError]
}

object ValidationErrorsChangedEventArgs {
  @scala.inline
  def apply(added: js.Array[ValidationError], entity: Entity, removed: js.Array[ValidationError]): ValidationErrorsChangedEventArgs = {
    val __obj = js.Dynamic.literal(added = added.asInstanceOf[js.Any], entity = entity.asInstanceOf[js.Any], removed = removed.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidationErrorsChangedEventArgs]
  }
}

