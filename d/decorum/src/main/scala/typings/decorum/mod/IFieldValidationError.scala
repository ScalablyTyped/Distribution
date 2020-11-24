package typings.decorum.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IFieldValidationError extends js.Object {
  
  /**
    * One or more field validation errors. Empty if no errors.
    */
  var errors: js.Array[String] = js.native
  
  /**
    * The property name of the field on the model.
    */
  var field: String = js.native
  
  /**
    * The "friendly" name of the field. If not set on the model via @FieldName(...), it will default to "Field".
    */
  var fieldName: String = js.native
}
object IFieldValidationError {
  
  @scala.inline
  def apply(errors: js.Array[String], field: String, fieldName: String): IFieldValidationError = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any], fieldName = fieldName.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFieldValidationError]
  }
  
  @scala.inline
  implicit class IFieldValidationErrorOps[Self <: IFieldValidationError] (val x: Self) extends AnyVal {
    
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
    def setErrorsVarargs(value: String*): Self = this.set("errors", js.Array(value :_*))
    
    @scala.inline
    def setErrors(value: js.Array[String]): Self = this.set("errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setField(value: String): Self = this.set("field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldName(value: String): Self = this.set("fieldName", value.asInstanceOf[js.Any])
  }
}
