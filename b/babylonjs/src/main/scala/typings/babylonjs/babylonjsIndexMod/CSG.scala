package typings.babylonjs.babylonjsIndexMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Meshes/index", "CSG")
@js.native
class CSG ()
  extends typings.babylonjs.csgMod.CSG
/* static members */
object CSG {
  
  @JSImport("babylonjs/Meshes/index", "CSG")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Convert the Mesh to CSG
    * @param mesh The Mesh to convert to CSG
    * @returns A new CSG from the Mesh
    */
  @JSImport("babylonjs/Meshes/index", "CSG.FromMesh")
  @js.native
  def FromMesh(mesh: typings.babylonjs.meshMod.Mesh): typings.babylonjs.csgMod.CSG = js.native
  
  /**
    * Construct a CSG solid from a list of `CSG.Polygon` instances.
    * @param polygons Polygons used to construct a CSG solid
    */
  @JSImport("babylonjs/Meshes/index", "CSG.FromPolygons")
  @js.native
  def FromPolygons: js.Any = js.native
  @scala.inline
  def FromPolygons_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FromPolygons")(x.asInstanceOf[js.Any])
}
