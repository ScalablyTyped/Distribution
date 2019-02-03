package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Class for building Constructive Solid Geometry
  */
@JSImport("babylonjs", "CSG")
@js.native
class CSG ()
  extends babylonjsLib.BABYLONNs.CSG

/* static members */
@JSImport("babylonjs", "CSG")
@js.native
object CSG extends js.Object {
  /**
    * Construct a BABYLON.CSG solid from a list of `BABYLON.CSG.Polygon` instances.
    * @param polygons Polygons used to construct a BABYLON.CSG solid
    */
  var FromPolygons: js.Any = js.native
  /**
    * Convert the BABYLON.Mesh to BABYLON.CSG
    * @param mesh The BABYLON.Mesh to convert to BABYLON.CSG
    * @returns A new BABYLON.CSG from the BABYLON.Mesh
    */
  def FromMesh(mesh: babylonjsLib.BABYLONNs.Mesh): babylonjsLib.BABYLONNs.CSG = js.native
}

