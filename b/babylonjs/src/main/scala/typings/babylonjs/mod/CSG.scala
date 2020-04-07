package typings.babylonjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs", "CSG")
@js.native
class CSG ()
  extends typings.babylonjs.legacyMod.CSG

/* static members */
@JSImport("babylonjs", "CSG")
@js.native
object CSG extends js.Object {
  /**
    * Construct a CSG solid from a list of `CSG.Polygon` instances.
    * @param polygons Polygons used to construct a CSG solid
    */
  var FromPolygons: js.Any = js.native
  /**
    * Convert the Mesh to CSG
    * @param mesh The Mesh to convert to CSG
    * @returns A new CSG from the Mesh
    */
  def FromMesh(mesh: typings.babylonjs.meshMod.Mesh): typings.babylonjs.csgMod.CSG = js.native
}

