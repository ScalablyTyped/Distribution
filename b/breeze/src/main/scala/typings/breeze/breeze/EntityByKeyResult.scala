package typings.breeze.breeze

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EntityByKeyResult extends StObject {
  
  var entity: Entity
  
  var entityKey: EntityKey
  
  var fromCache: Boolean
}
object EntityByKeyResult {
  
  inline def apply(entity: Entity, entityKey: EntityKey, fromCache: Boolean): EntityByKeyResult = {
    val __obj = js.Dynamic.literal(entity = entity.asInstanceOf[js.Any], entityKey = entityKey.asInstanceOf[js.Any], fromCache = fromCache.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntityByKeyResult]
  }
  
  extension [Self <: EntityByKeyResult](x: Self) {
    
    inline def setEntity(value: Entity): Self = StObject.set(x, "entity", value.asInstanceOf[js.Any])
    
    inline def setEntityKey(value: EntityKey): Self = StObject.set(x, "entityKey", value.asInstanceOf[js.Any])
    
    inline def setFromCache(value: Boolean): Self = StObject.set(x, "fromCache", value.asInstanceOf[js.Any])
  }
}
