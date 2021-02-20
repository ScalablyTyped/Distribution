package typings.breeze.breeze

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EntityError extends StObject {
  
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
  implicit class EntityErrorMutableBuilder[Self <: EntityError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntity(value: Entity): Self = StObject.set(x, "entity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorName(value: String): Self = StObject.set(x, "errorName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsServerError(value: Boolean): Self = StObject.set(x, "isServerError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertyName(value: String): Self = StObject.set(x, "propertyName", value.asInstanceOf[js.Any])
  }
}
