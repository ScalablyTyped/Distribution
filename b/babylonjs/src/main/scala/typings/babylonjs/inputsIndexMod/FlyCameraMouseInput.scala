package typings.babylonjs.inputsIndexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Cameras/Inputs/index", "FlyCameraMouseInput")
@js.native
/**
  * Listen to mouse events to control the camera.
  * @param touchEnabled Define if touch is enabled. (Default is true.)
  * @see https://doc.babylonjs.com/how_to/customizing_camera_inputs
  */
class FlyCameraMouseInput ()
  extends typings.babylonjs.flyCameraMouseInputMod.FlyCameraMouseInput {
  def this(touchEnabled: Boolean) = this()
}
