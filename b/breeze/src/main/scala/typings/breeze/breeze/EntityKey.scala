package typings.breeze.breeze

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EntityKey extends StObject {
  
  var entityType: EntityType
  
  def equals(entityKey: EntityKey): Boolean
  
  var values: js.Array[Any]
}
object EntityKey {
  
  inline def apply(entityType: EntityType, equals_ : EntityKey => Boolean, values: js.Array[Any]): EntityKey = {
    val __obj = js.Dynamic.literal(entityType = entityType.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
    __obj.asInstanceOf[EntityKey]
  }
  
  extension [Self <: EntityKey](x: Self) {
    
    inline def setEntityType(value: EntityType): Self = StObject.set(x, "entityType", value.asInstanceOf[js.Any])
    
    inline def setEquals_(value: EntityKey => Boolean): Self = StObject.set(x, "equals", js.Any.fromFunction1(value))
    
    inline def setValues(value: js.Array[Any]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesVarargs(value: Any*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
