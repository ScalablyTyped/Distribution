package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.AnaglyphGamepadCamera")
@js.native
class AnaglyphGamepadCamera protected () extends GamepadCamera {
  /**
    * Creates a new AnaglyphGamepadCamera
    * @param name defines camera name
    * @param position defines initial position
    * @param interaxialDistance defines distance between each color axis
    * @param scene defines the hosting scene
    */
  def this(name: String, position: Vector3, interaxialDistance: Double, scene: Scene) = this()
}

