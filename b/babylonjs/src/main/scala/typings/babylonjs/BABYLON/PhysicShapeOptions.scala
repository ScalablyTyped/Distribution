package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PhysicShapeOptions extends StObject {
  
  /**
    * The parameters of the shape. Varies depending of the shape type.
    */
  var parameters: js.UndefOr[PhysicsShapeParameters] = js.undefined
  
  /**
    * Reference to an already existing physics shape in the plugin.
    */
  var pluginData: js.UndefOr[Any] = js.undefined
  
  /**
    * The type of the shape. This can be one of the following: SPHERE, BOX, CAPSULE, CYLINDER, CONVEX_HULL, MESH, HEIGHTFIELD, CONTAINER
    */
  var `type`: js.UndefOr[PhysicsShapeType] = js.undefined
}
object PhysicShapeOptions {
  
  inline def apply(): PhysicShapeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PhysicShapeOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PhysicShapeOptions] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PhysicsShapeParameters): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    inline def setPluginData(value: Any): Self = StObject.set(x, "pluginData", value.asInstanceOf[js.Any])
    
    inline def setPluginDataUndefined: Self = StObject.set(x, "pluginData", js.undefined)
    
    inline def setType(value: PhysicsShapeType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
