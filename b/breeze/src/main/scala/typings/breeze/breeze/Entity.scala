package typings.breeze.breeze

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Entity extends StObject {
  
  var entityAspect: EntityAspect
  
  var entityType: EntityType
}
object Entity {
  
  inline def apply(entityAspect: EntityAspect, entityType: EntityType): Entity = {
    val __obj = js.Dynamic.literal(entityAspect = entityAspect.asInstanceOf[js.Any], entityType = entityType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Entity]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Entity] (val x: Self) extends AnyVal {
    
    inline def setEntityAspect(value: EntityAspect): Self = StObject.set(x, "entityAspect", value.asInstanceOf[js.Any])
    
    inline def setEntityType(value: EntityType): Self = StObject.set(x, "entityType", value.asInstanceOf[js.Any])
  }
}
