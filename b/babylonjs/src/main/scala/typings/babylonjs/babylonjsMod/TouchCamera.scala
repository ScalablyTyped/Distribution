package typings.babylonjs.babylonjsMod

import typings.babylonjs.mathVectorMod.Vector3
import typings.babylonjs.sceneMod.Scene
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Cameras/index", "TouchCamera")
@js.native
class TouchCamera protected ()
  extends typings.babylonjs.touchCameraMod.TouchCamera {
  /**
    * Instantiates a new touch camera.
    * This represents a FPS type of camera controlled by touch.
    * This is like a universal camera minus the Gamepad controls.
    * @see https://doc.babylonjs.com/features/cameras#universal-camera
    * @param name Define the name of the camera in the scene
    * @param position Define the start position of the camera in the scene
    * @param scene Define the scene the camera belongs to
    */
  def this(name: String, position: Vector3, scene: Scene) = this()
}
