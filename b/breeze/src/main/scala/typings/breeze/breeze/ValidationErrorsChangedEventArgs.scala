package typings.breeze.breeze

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValidationErrorsChangedEventArgs extends js.Object {
  var added: js.Array[ValidationError] = js.native
  var entity: Entity = js.native
  var removed: js.Array[ValidationError] = js.native
}

object ValidationErrorsChangedEventArgs {
  @scala.inline
  def apply(added: js.Array[ValidationError], entity: Entity, removed: js.Array[ValidationError]): ValidationErrorsChangedEventArgs = {
    val __obj = js.Dynamic.literal(added = added.asInstanceOf[js.Any], entity = entity.asInstanceOf[js.Any], removed = removed.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidationErrorsChangedEventArgs]
  }
  @scala.inline
  implicit class ValidationErrorsChangedEventArgsOps[Self <: ValidationErrorsChangedEventArgs] (val x: Self) extends AnyVal {
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
    def setAddedVarargs(value: ValidationError*): Self = this.set("added", js.Array(value :_*))
    @scala.inline
    def setAdded(value: js.Array[ValidationError]): Self = this.set("added", value.asInstanceOf[js.Any])
    @scala.inline
    def setEntity(value: Entity): Self = this.set("entity", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemovedVarargs(value: ValidationError*): Self = this.set("removed", js.Array(value :_*))
    @scala.inline
    def setRemoved(value: js.Array[ValidationError]): Self = this.set("removed", value.asInstanceOf[js.Any])
  }
  
}

