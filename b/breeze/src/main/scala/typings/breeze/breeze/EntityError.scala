package typings.breeze.breeze

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EntityError extends js.Object {
  
  var entity: Entity = js.native
  
  var errorMessage: String = js.native
  
  var errorName: String = js.native
  
  var isServerError: Boolean = js.native
  
  var propertyName: String = js.native
}
object EntityError {
  
  @scala.inline
  def apply(
    entity: Entity,
    errorMessage: String,
    errorName: String,
    isServerError: Boolean,
    propertyName: String
  ): EntityError = {
    val __obj = js.Dynamic.literal(entity = entity.asInstanceOf[js.Any], errorMessage = errorMessage.asInstanceOf[js.Any], errorName = errorName.asInstanceOf[js.Any], isServerError = isServerError.asInstanceOf[js.Any], propertyName = propertyName.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntityError]
  }
  
  @scala.inline
  implicit class EntityErrorOps[Self <: EntityError] (val x: Self) extends AnyVal {
    
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
    def setEntity(value: Entity): Self = this.set("entity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorMessage(value: String): Self = this.set("errorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorName(value: String): Self = this.set("errorName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsServerError(value: Boolean): Self = this.set("isServerError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertyName(value: String): Self = this.set("propertyName", value.asInstanceOf[js.Any])
  }
}
