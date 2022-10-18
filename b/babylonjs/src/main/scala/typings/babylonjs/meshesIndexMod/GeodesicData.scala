package typings.babylonjs.meshesIndexMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Meshes/index", "GeodesicData")
@js.native
open class GeodesicData protected ()
  extends typings.babylonjs.meshesGeodesicMeshMod.GeodesicData {
  def this(
    name: String,
    category: String,
    vertex: js.Array[js.Array[Double]],
    face: js.Array[js.Array[Double]]
  ) = this()
}
/* static members */
object GeodesicData {
  
  @JSImport("babylonjs/Meshes/index", "GeodesicData")
  @js.native
  val ^ : js.Any = js.native
  
  /**Builds the data for a Geodesic Polyhedron from a primary triangle
    * @param primTri the primary triangle
    * @internal
    */
  inline def BuildGeodesicData(primTri: typings.babylonjs.meshesGeodesicMeshMod.PrimaryIsoTriangle): typings.babylonjs.meshesGeodesicMeshMod.GeodesicData = ^.asInstanceOf[js.Dynamic].applyDynamic("BuildGeodesicData")(primTri.asInstanceOf[js.Any]).asInstanceOf[typings.babylonjs.meshesGeodesicMeshMod.GeodesicData]
}
