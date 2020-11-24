package typings.babylonjs.babylonjsIndexMod

import typings.babylonjs.mathPathMod.Path2
import typings.babylonjs.mathVectorMod.Vector2
import typings.babylonjs.sceneMod.Scene
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Meshes/index", "PolygonMeshBuilder")
@js.native
class PolygonMeshBuilder protected ()
  extends typings.babylonjs.polygonMeshMod.PolygonMeshBuilder {
  def this(name: String, contours: js.Any) = this()
  def this(name: String, contours: js.Array[Vector2]) = this()
  /**
    * Creates a PolygonMeshBuilder
    * @param name name of the builder
    * @param contours Path of the polygon
    * @param scene scene to add to when creating the mesh
    * @param earcutInjection can be used to inject your own earcut reference
    */
  def this(name: String, contours: Path2) = this()
  def this(name: String, contours: js.Any, scene: Scene) = this()
  def this(name: String, contours: js.Array[Vector2], scene: Scene) = this()
  def this(name: String, contours: Path2, scene: Scene) = this()
  def this(name: String, contours: js.Any, scene: js.UndefOr[scala.Nothing], earcutInjection: js.Any) = this()
  def this(name: String, contours: js.Any, scene: Scene, earcutInjection: js.Any) = this()
  def this(
    name: String,
    contours: js.Array[Vector2],
    scene: js.UndefOr[scala.Nothing],
    earcutInjection: js.Any
  ) = this()
  def this(name: String, contours: js.Array[Vector2], scene: Scene, earcutInjection: js.Any) = this()
  def this(name: String, contours: Path2, scene: js.UndefOr[scala.Nothing], earcutInjection: js.Any) = this()
  def this(name: String, contours: Path2, scene: Scene, earcutInjection: js.Any) = this()
}
