package typings.breeze.breeze

import typings.std.XMLHttpRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SaveResult extends StObject {
  
  var XHR: XMLHttpRequest
  
  var deletedKeys: js.Array[DeletedEntityKey]
  
  var entities: js.Array[Entity]
  
  var keyMappings: js.Array[KeyMapping]
}
object SaveResult {
  
  inline def apply(
    XHR: XMLHttpRequest,
    deletedKeys: js.Array[DeletedEntityKey],
    entities: js.Array[Entity],
    keyMappings: js.Array[KeyMapping]
  ): SaveResult = {
    val __obj = js.Dynamic.literal(XHR = XHR.asInstanceOf[js.Any], deletedKeys = deletedKeys.asInstanceOf[js.Any], entities = entities.asInstanceOf[js.Any], keyMappings = keyMappings.asInstanceOf[js.Any])
    __obj.asInstanceOf[SaveResult]
  }
  
  extension [Self <: SaveResult](x: Self) {
    
    inline def setDeletedKeys(value: js.Array[DeletedEntityKey]): Self = StObject.set(x, "deletedKeys", value.asInstanceOf[js.Any])
    
    inline def setDeletedKeysVarargs(value: DeletedEntityKey*): Self = StObject.set(x, "deletedKeys", js.Array(value*))
    
    inline def setEntities(value: js.Array[Entity]): Self = StObject.set(x, "entities", value.asInstanceOf[js.Any])
    
    inline def setEntitiesVarargs(value: Entity*): Self = StObject.set(x, "entities", js.Array(value*))
    
    inline def setKeyMappings(value: js.Array[KeyMapping]): Self = StObject.set(x, "keyMappings", value.asInstanceOf[js.Any])
    
    inline def setKeyMappingsVarargs(value: KeyMapping*): Self = StObject.set(x, "keyMappings", js.Array(value*))
    
    inline def setXHR(value: XMLHttpRequest): Self = StObject.set(x, "XHR", value.asInstanceOf[js.Any])
  }
}
