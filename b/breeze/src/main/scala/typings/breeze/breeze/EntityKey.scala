package typings.breeze.breeze

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EntityKey extends StObject {
  
  var entityType: EntityType
  
  def equals(entityKey: EntityKey): Boolean
  
  var values: js.Array[js.Any]
}
object EntityKey {
  
  @scala.inline
  def apply(entityType: EntityType, equals_ : EntityKey => Boolean, values: js.Array[js.Any]): EntityKey = {
    val __obj = js.Dynamic.literal(entityType = entityType.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
    __obj.asInstanceOf[EntityKey]
  }
  
  @scala.inline
  implicit class EntityKeyMutableBuilder[Self <: EntityKey] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntityType(value: EntityType): Self = StObject.set(x, "entityType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEquals_(value: EntityKey => Boolean): Self = StObject.set(x, "equals", js.Any.fromFunction1(value))
    
    @scala.inline
    def setValues(value: js.Array[js.Any]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesVarargs(value: js.Any*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
