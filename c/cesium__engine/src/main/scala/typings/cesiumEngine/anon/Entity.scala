package typings.cesiumEngine.anon

import typings.cesiumEngine.mod.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Entity extends StObject {
  
  var entity: typings.cesiumEngine.mod.Entity
  
  var geometryOptions: Any
  
  var geometryPropertyName: String
  
  var observedPropertyNames: js.Array[String]
  
  var scene: Scene
}
object Entity {
  
  inline def apply(
    entity: typings.cesiumEngine.mod.Entity,
    geometryOptions: Any,
    geometryPropertyName: String,
    observedPropertyNames: js.Array[String],
    scene: Scene
  ): Entity = {
    val __obj = js.Dynamic.literal(entity = entity.asInstanceOf[js.Any], geometryOptions = geometryOptions.asInstanceOf[js.Any], geometryPropertyName = geometryPropertyName.asInstanceOf[js.Any], observedPropertyNames = observedPropertyNames.asInstanceOf[js.Any], scene = scene.asInstanceOf[js.Any])
    __obj.asInstanceOf[Entity]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Entity] (val x: Self) extends AnyVal {
    
    inline def setEntity(value: typings.cesiumEngine.mod.Entity): Self = StObject.set(x, "entity", value.asInstanceOf[js.Any])
    
    inline def setGeometryOptions(value: Any): Self = StObject.set(x, "geometryOptions", value.asInstanceOf[js.Any])
    
    inline def setGeometryPropertyName(value: String): Self = StObject.set(x, "geometryPropertyName", value.asInstanceOf[js.Any])
    
    inline def setObservedPropertyNames(value: js.Array[String]): Self = StObject.set(x, "observedPropertyNames", value.asInstanceOf[js.Any])
    
    inline def setObservedPropertyNamesVarargs(value: String*): Self = StObject.set(x, "observedPropertyNames", js.Array(value*))
    
    inline def setScene(value: Scene): Self = StObject.set(x, "scene", value.asInstanceOf[js.Any])
  }
}
