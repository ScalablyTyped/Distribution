package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MeshLODLevel extends StObject {
  
  /** Either distance from the center of the object to show this level or the screen coverage if `useLODScreenCoverage` is set to `true` on the mesh*/
  var distanceOrScreenCoverage: Double
  
  /** Defines the mesh to use to render this level */
  var mesh: Nullable[Mesh]
}
object MeshLODLevel {
  
  inline def apply(distanceOrScreenCoverage: Double): MeshLODLevel = {
    val __obj = js.Dynamic.literal(distanceOrScreenCoverage = distanceOrScreenCoverage.asInstanceOf[js.Any], mesh = null)
    __obj.asInstanceOf[MeshLODLevel]
  }
  
  extension [Self <: MeshLODLevel](x: Self) {
    
    inline def setDistanceOrScreenCoverage(value: Double): Self = StObject.set(x, "distanceOrScreenCoverage", value.asInstanceOf[js.Any])
    
    inline def setMesh(value: Nullable[Mesh]): Self = StObject.set(x, "mesh", value.asInstanceOf[js.Any])
    
    inline def setMeshNull: Self = StObject.set(x, "mesh", null)
  }
}
