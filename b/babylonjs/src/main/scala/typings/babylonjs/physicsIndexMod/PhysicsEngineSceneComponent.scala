package typings.babylonjs.physicsIndexMod

import typings.babylonjs.sceneMod.Scene
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Physics/index", "PhysicsEngineSceneComponent")
@js.native
class PhysicsEngineSceneComponent protected ()
  extends typings.babylonjs.physicsEngineComponentMod.PhysicsEngineSceneComponent {
  /**
    * Creates a new instance of the component for the given scene
    * @param scene Defines the scene to register the component in
    */
  def this(scene: Scene) = this()
}

