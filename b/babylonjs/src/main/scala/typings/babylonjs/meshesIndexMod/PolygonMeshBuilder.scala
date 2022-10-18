package typings.babylonjs.meshesIndexMod

import typings.babylonjs.mathsMathDotpathMod.Path2
import typings.babylonjs.mathsMathDotvectorMod.Vector2
import typings.babylonjs.sceneMod.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Meshes/index", "PolygonMeshBuilder")
@js.native
open class PolygonMeshBuilder protected ()
  extends typings.babylonjs.meshesPolygonMeshMod.PolygonMeshBuilder {
  def this(name: String, contours: js.Array[Vector2]) = this()
  def this(name: String, contours: Any) = this()
  /**
    * Creates a PolygonMeshBuilder
    * @param name name of the builder
    * @param contours Path of the polygon
    * @param scene scene to add to when creating the mesh
    * @param earcutInjection can be used to inject your own earcut reference
    */
  def this(name: String, contours: Path2) = this()
  def this(name: String, contours: js.Array[Vector2], scene: Scene) = this()
  def this(name: String, contours: Any, scene: Scene) = this()
  def this(name: String, contours: Path2, scene: Scene) = this()
  def this(name: String, contours: js.Array[Vector2], scene: Unit, earcutInjection: Any) = this()
  def this(name: String, contours: js.Array[Vector2], scene: Scene, earcutInjection: Any) = this()
  def this(name: String, contours: Any, scene: Unit, earcutInjection: Any) = this()
  def this(name: String, contours: Any, scene: Scene, earcutInjection: Any) = this()
  def this(name: String, contours: Path2, scene: Unit, earcutInjection: Any) = this()
  def this(name: String, contours: Path2, scene: Scene, earcutInjection: Any) = this()
}
