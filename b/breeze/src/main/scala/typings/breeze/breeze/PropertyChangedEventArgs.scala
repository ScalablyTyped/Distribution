package typings.breeze.breeze

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PropertyChangedEventArgs extends StObject {
  
  var entity: Entity
  
  var newValue: js.Any
  
  var oldValue: js.Any
  
  var parent: js.Any
  
  var property: IProperty
  
  var propertyName: String
}
object PropertyChangedEventArgs {
  
  @scala.inline
  def apply(
    entity: Entity,
    newValue: js.Any,
    oldValue: js.Any,
    parent: js.Any,
    property: IProperty,
    propertyName: String
  ): PropertyChangedEventArgs = {
    val __obj = js.Dynamic.literal(entity = entity.asInstanceOf[js.Any], newValue = newValue.asInstanceOf[js.Any], oldValue = oldValue.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any], propertyName = propertyName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertyChangedEventArgs]
  }
  
  @scala.inline
  implicit class PropertyChangedEventArgsMutableBuilder[Self <: PropertyChangedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntity(value: Entity): Self = StObject.set(x, "entity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewValue(value: js.Any): Self = StObject.set(x, "newValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldValue(value: js.Any): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProperty(value: IProperty): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertyName(value: String): Self = StObject.set(x, "propertyName", value.asInstanceOf[js.Any])
  }
}
