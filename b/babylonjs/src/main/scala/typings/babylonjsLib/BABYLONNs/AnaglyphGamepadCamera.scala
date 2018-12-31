package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Camera used to simulate anaglyphic rendering (based on GamepadCamera)
  * @see http://doc.babylonjs.com/features/cameras#anaglyph-cameras
  */
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
  def this(name: java.lang.String, position: Vector3, interaxialDistance: scala.Double, scene: Scene) = this()
}

