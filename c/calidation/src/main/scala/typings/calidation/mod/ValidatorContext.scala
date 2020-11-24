package typings.calidation.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ValidatorContext[T /* <: js.Object */] extends js.Object {
  
  var errors: Errors[T] = js.native
  
  var fields: Fields[T] = js.native
  
  var isDirty: Boolean = js.native
}
object ValidatorContext {
  
  @scala.inline
  def apply[T /* <: js.Object */](errors: Errors[T], fields: Fields[T], isDirty: Boolean): ValidatorContext[T] = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], isDirty = isDirty.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidatorContext[T]]
  }
  
  @scala.inline
  implicit class ValidatorContextOps[Self <: ValidatorContext[_], T /* <: js.Object */] (val x: Self with ValidatorContext[T]) extends AnyVal {
    
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
    def setErrors(value: Errors[T]): Self = this.set("errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFields(value: Fields[T]): Self = this.set("fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDirty(value: Boolean): Self = this.set("isDirty", value.asInstanceOf[js.Any])
  }
}
