package typings.breeze.breeze

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SaveBundle extends StObject {
  
  var entities: js.Array[Entity]
  
  var saveOptions: SaveOptions
}
object SaveBundle {
  
  inline def apply(entities: js.Array[Entity], saveOptions: SaveOptions): SaveBundle = {
    val __obj = js.Dynamic.literal(entities = entities.asInstanceOf[js.Any], saveOptions = saveOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[SaveBundle]
  }
  
  extension [Self <: SaveBundle](x: Self) {
    
    inline def setEntities(value: js.Array[Entity]): Self = StObject.set(x, "entities", value.asInstanceOf[js.Any])
    
    inline def setEntitiesVarargs(value: Entity*): Self = StObject.set(x, "entities", js.Array(value*))
    
    inline def setSaveOptions(value: SaveOptions): Self = StObject.set(x, "saveOptions", value.asInstanceOf[js.Any])
  }
}
