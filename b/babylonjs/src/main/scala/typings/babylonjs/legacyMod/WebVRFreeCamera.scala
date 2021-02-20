package typings.babylonjs.legacyMod

import typings.babylonjs.webVRCameraMod.WebVROptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "WebVRFreeCamera")
@js.native
class WebVRFreeCamera protected ()
  extends typings.babylonjs.indexMod.WebVRFreeCamera {
  /**
    * Instantiates a WebVRFreeCamera.
    * @param name The name of the WebVRFreeCamera
    * @param position The starting anchor position for the camera
    * @param scene The scene the camera belongs to
    * @param webVROptions a set of customizable options for the webVRCamera
    */
  def this(
    name: String,
    position: typings.babylonjs.mathVectorMod.Vector3,
    scene: typings.babylonjs.sceneMod.Scene
  ) = this()
  def this(
    name: String,
    position: typings.babylonjs.mathVectorMod.Vector3,
    scene: typings.babylonjs.sceneMod.Scene,
    webVROptions: WebVROptions
  ) = this()
}
