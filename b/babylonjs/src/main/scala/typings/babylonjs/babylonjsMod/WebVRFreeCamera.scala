package typings.babylonjs.babylonjsMod

import typings.babylonjs.mathVectorMod.Vector3
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.webVRCameraMod.WebVROptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Cameras/index", "WebVRFreeCamera")
@js.native
class WebVRFreeCamera protected ()
  extends typings.babylonjs.vRIndexMod.WebVRFreeCamera {
  /**
    * Instantiates a WebVRFreeCamera.
    * @param name The name of the WebVRFreeCamera
    * @param position The starting anchor position for the camera
    * @param scene The scene the camera belongs to
    * @param webVROptions a set of customizable options for the webVRCamera
    */
  def this(name: String, position: Vector3, scene: Scene) = this()
  def this(name: String, position: Vector3, scene: Scene, webVROptions: WebVROptions) = this()
}

