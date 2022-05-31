package typings.babylonjs.indexMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/index", "CSG")
@js.native
class CSG ()
  extends typings.babylonjs.babylonjsIndexMod.CSG
/* static members */
object CSG {
  
  @JSImport("babylonjs/index", "CSG")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Convert the Mesh to CSG
    * @param mesh The Mesh to convert to CSG
    * @returns A new CSG from the Mesh
    */
  inline def FromMesh(mesh: typings.babylonjs.meshMod.Mesh): typings.babylonjs.csgMod.CSG = ^.asInstanceOf[js.Dynamic].applyDynamic("FromMesh")(mesh.asInstanceOf[js.Any]).asInstanceOf[typings.babylonjs.csgMod.CSG]
  
  /**
    * Construct a CSG solid from a list of `CSG.Polygon` instances.
    * @param polygons Polygons used to construct a CSG solid
    */
  @JSImport("babylonjs/index", "CSG.FromPolygons")
  @js.native
  def FromPolygons: js.Any = js.native
  inline def FromPolygons_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FromPolygons")(x.asInstanceOf[js.Any])
}
