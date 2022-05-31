package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PositionNormalVertex extends StObject {
  
  /** the normal of the vertex (defaut: 0,1,0) */
  var normal: Vector3
  
  /** the position of the vertex (defaut: 0,0,0) */
  var position: Vector3
}
object PositionNormalVertex {
  
  inline def apply(normal: Vector3, position: Vector3): PositionNormalVertex = {
    val __obj = js.Dynamic.literal(normal = normal.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[PositionNormalVertex]
  }
  
  extension [Self <: PositionNormalVertex](x: Self) {
    
    inline def setNormal(value: Vector3): Self = StObject.set(x, "normal", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: Vector3): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
  }
}
