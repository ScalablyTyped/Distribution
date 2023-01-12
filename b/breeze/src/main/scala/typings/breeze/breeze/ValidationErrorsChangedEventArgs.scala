package typings.breeze.breeze

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValidationErrorsChangedEventArgs extends StObject {
  
  var added: js.Array[ValidationError]
  
  var entity: Entity
  
  var removed: js.Array[ValidationError]
}
object ValidationErrorsChangedEventArgs {
  
  inline def apply(added: js.Array[ValidationError], entity: Entity, removed: js.Array[ValidationError]): ValidationErrorsChangedEventArgs = {
    val __obj = js.Dynamic.literal(added = added.asInstanceOf[js.Any], entity = entity.asInstanceOf[js.Any], removed = removed.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidationErrorsChangedEventArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ValidationErrorsChangedEventArgs] (val x: Self) extends AnyVal {
    
    inline def setAdded(value: js.Array[ValidationError]): Self = StObject.set(x, "added", value.asInstanceOf[js.Any])
    
    inline def setAddedVarargs(value: ValidationError*): Self = StObject.set(x, "added", js.Array(value*))
    
    inline def setEntity(value: Entity): Self = StObject.set(x, "entity", value.asInstanceOf[js.Any])
    
    inline def setRemoved(value: js.Array[ValidationError]): Self = StObject.set(x, "removed", value.asInstanceOf[js.Any])
    
    inline def setRemovedVarargs(value: ValidationError*): Self = StObject.set(x, "removed", js.Array(value*))
  }
}
