package typings.babylonjs.camerasIndexMod

import typings.babylonjs.camerasVRWebVRCameraMod.WebVROptions
import typings.babylonjs.mathsMathDotvectorMod.Vector3
import typings.babylonjs.sceneMod.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Cameras/index", "WebVRFreeCamera")
@js.native
open class WebVRFreeCamera protected ()
  extends typings.babylonjs.camerasVRIndexMod.WebVRFreeCamera {
  /**
    * Instantiates a WebVRFreeCamera.
    * @param name The name of the WebVRFreeCamera
    * @param position The starting anchor position for the camera
    * @param scene The scene the camera belongs to
    * @param _webVROptions a set of customizable options for the webVRCamera
    */
  def this(name: String, position: Vector3) = this()
  def this(name: String, position: Vector3, scene: Scene) = this()
  def this(name: String, position: Vector3, scene: Unit, _webVROptions: WebVROptions) = this()
  def this(name: String, position: Vector3, scene: Scene, _webVROptions: WebVROptions) = this()
}
