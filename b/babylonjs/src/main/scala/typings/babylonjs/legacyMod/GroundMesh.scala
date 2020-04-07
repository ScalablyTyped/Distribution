package typings.babylonjs.legacyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Legacy/legacy", "GroundMesh")
@js.native
class GroundMesh protected ()
  extends typings.babylonjs.indexMod.GroundMesh {
  def this(name: String, scene: typings.babylonjs.sceneMod.Scene) = this()
}

/* static members */
@JSImport("babylonjs/Legacy/legacy", "GroundMesh")
@js.native
object GroundMesh extends js.Object {
  /**
    * Parses a serialized ground mesh
    * @param parsedMesh the serialized mesh
    * @param scene the scene to create the ground mesh in
    * @returns the created ground mesh
    */
  def Parse(parsedMesh: js.Any, scene: typings.babylonjs.sceneMod.Scene): typings.babylonjs.groundMeshMod.GroundMesh = js.native
}

