package typings.babylonjs.babylonjsIndexMod

import typings.babylonjs.sceneMod.Scene
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Meshes/index", "GroundMesh")
@js.native
class GroundMesh protected ()
  extends typings.babylonjs.groundMeshMod.GroundMesh {
  def this(name: String, scene: Scene) = this()
}

/* static members */
@JSImport("babylonjs/Meshes/index", "GroundMesh")
@js.native
object GroundMesh extends js.Object {
  /**
    * Parses a serialized ground mesh
    * @param parsedMesh the serialized mesh
    * @param scene the scene to create the ground mesh in
    * @returns the created ground mesh
    */
  def Parse(parsedMesh: js.Any, scene: Scene): typings.babylonjs.groundMeshMod.GroundMesh = js.native
}

