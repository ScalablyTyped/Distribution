package typings.babylonjs.global.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.AnaglyphGamepadCamera")
@js.native
class AnaglyphGamepadCamera protected ()
  extends typings.babylonjs.BABYLON.AnaglyphGamepadCamera {
  /**
    * Creates a new AnaglyphGamepadCamera
    * @param name defines camera name
    * @param position defines initial position
    * @param interaxialDistance defines distance between each color axis
    * @param scene defines the hosting scene
    */
  def this(
    name: String,
    position: typings.babylonjs.BABYLON.Vector3,
    interaxialDistance: Double,
    scene: typings.babylonjs.BABYLON.Scene
  ) = this()
}
