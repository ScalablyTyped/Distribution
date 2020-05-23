package typings.babylonjs.global.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.CSG")
@js.native
class CSG ()
  extends typings.babylonjs.BABYLON.CSG

/* static members */
@JSGlobal("BABYLON.CSG")
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
  def FromMesh(mesh: typings.babylonjs.BABYLON.Mesh): typings.babylonjs.BABYLON.CSG = js.native
}

