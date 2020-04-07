package typings.babylonjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs", "FlyCameraMouseInput")
@js.native
/**
  * Listen to mouse events to control the camera.
  * @param touchEnabled Define if touch is enabled. (Default is true.)
  * @see http://doc.babylonjs.com/how_to/customizing_camera_inputs
  */
class FlyCameraMouseInput ()
  extends typings.babylonjs.legacyMod.FlyCameraMouseInput {
  def this(touchEnabled: Boolean) = this()
}

