package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MeshLODLevel extends StObject {
  
  /** Defines the distance where this level should start being displayed */
  var distance: Double
  
  /** Defines the mesh to use to render this level */
  var mesh: Nullable[Mesh]
}
object MeshLODLevel {
  
  inline def apply(distance: Double): MeshLODLevel = {
    val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any], mesh = null)
    __obj.asInstanceOf[MeshLODLevel]
  }
  
  extension [Self <: MeshLODLevel](x: Self) {
    
    inline def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
    
    inline def setMesh(value: Nullable[Mesh]): Self = StObject.set(x, "mesh", value.asInstanceOf[js.Any])
    
    inline def setMeshNull: Self = StObject.set(x, "mesh", null)
  }
}
