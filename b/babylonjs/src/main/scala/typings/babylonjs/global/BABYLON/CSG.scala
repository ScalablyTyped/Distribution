package typings.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.CSG")
@js.native
class CSG ()
  extends StObject
     with typings.babylonjs.BABYLON.CSG
/* static members */
object CSG {
  
  @JSGlobal("BABYLON.CSG")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Convert the Mesh to CSG
    * @param mesh The Mesh to convert to CSG
    * @returns A new CSG from the Mesh
    */
  inline def FromMesh(mesh: typings.babylonjs.BABYLON.Mesh): typings.babylonjs.BABYLON.CSG = ^.asInstanceOf[js.Dynamic].applyDynamic("FromMesh")(mesh.asInstanceOf[js.Any]).asInstanceOf[typings.babylonjs.BABYLON.CSG]
  
  /**
    * Construct a CSG solid from a list of `CSG.Polygon` instances.
    * @param polygons Polygons used to construct a CSG solid
    */
  @JSGlobal("BABYLON.CSG.FromPolygons")
  @js.native
  def FromPolygons: js.Any = js.native
  inline def FromPolygons_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FromPolygons")(x.asInstanceOf[js.Any])
}
