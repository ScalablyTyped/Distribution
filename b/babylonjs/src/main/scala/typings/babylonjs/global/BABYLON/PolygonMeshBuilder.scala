package typings.babylonjs.global.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.PolygonMeshBuilder")
@js.native
class PolygonMeshBuilder protected ()
  extends typings.babylonjs.BABYLON.PolygonMeshBuilder {
  def this(name: String, contours: js.Any) = this()
  def this(name: String, contours: js.Array[typings.babylonjs.BABYLON.Vector2]) = this()
  /**
    * Creates a PolygonMeshBuilder
    * @param name name of the builder
    * @param contours Path of the polygon
    * @param scene scene to add to when creating the mesh
    * @param earcutInjection can be used to inject your own earcut reference
    */
  def this(name: String, contours: typings.babylonjs.BABYLON.Path2) = this()
  def this(name: String, contours: js.Any, scene: typings.babylonjs.BABYLON.Scene) = this()
  def this(
    name: String,
    contours: js.Array[typings.babylonjs.BABYLON.Vector2],
    scene: typings.babylonjs.BABYLON.Scene
  ) = this()
  def this(name: String, contours: typings.babylonjs.BABYLON.Path2, scene: typings.babylonjs.BABYLON.Scene) = this()
  def this(name: String, contours: js.Any, scene: typings.babylonjs.BABYLON.Scene, earcutInjection: js.Any) = this()
  def this(
    name: String,
    contours: js.Array[typings.babylonjs.BABYLON.Vector2],
    scene: typings.babylonjs.BABYLON.Scene,
    earcutInjection: js.Any
  ) = this()
  def this(
    name: String,
    contours: typings.babylonjs.BABYLON.Path2,
    scene: typings.babylonjs.BABYLON.Scene,
    earcutInjection: js.Any
  ) = this()
}

