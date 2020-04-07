package typings.babylonjs.babylonjsMod

import typings.babylonjs.mathVectorMod.Vector3
import typings.babylonjs.sceneMod.Scene
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Cameras/index", "AnaglyphGamepadCamera")
@js.native
class AnaglyphGamepadCamera protected ()
  extends typings.babylonjs.stereoscopicIndexMod.AnaglyphGamepadCamera {
  /**
    * Creates a new AnaglyphGamepadCamera
    * @param name defines camera name
    * @param position defines initial position
    * @param interaxialDistance defines distance between each color axis
    * @param scene defines the hosting scene
    */
  def this(name: String, position: Vector3, interaxialDistance: Double, scene: Scene) = this()
}

