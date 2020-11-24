package typings.babylonjs.legacyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "CSG")
@js.native
class CSG ()
  extends typings.babylonjs.indexMod.CSG
/* static members */
@JSImport("babylonjs/Legacy/legacy", "CSG")
@js.native
object CSG extends js.Object {
  
  /**
    * Convert the Mesh to CSG
    * @param mesh The Mesh to convert to CSG
    * @returns A new CSG from the Mesh
    */
  def FromMesh(mesh: typings.babylonjs.meshMod.Mesh): typings.babylonjs.csgMod.CSG = js.native
  
  /**
    * Construct a CSG solid from a list of `CSG.Polygon` instances.
    * @param polygons Polygons used to construct a CSG solid
    */
  var FromPolygons: js.Any = js.native
}
