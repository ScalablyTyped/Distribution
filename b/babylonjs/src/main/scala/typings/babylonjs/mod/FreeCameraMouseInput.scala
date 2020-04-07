package typings.babylonjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs", "FreeCameraMouseInput")
@js.native
/**
  * Manage the mouse inputs to control the movement of a free camera.
  * @see http://doc.babylonjs.com/how_to/customizing_camera_inputs
  * @param touchEnabled Defines if touch is enabled or not
  */
class FreeCameraMouseInput ()
  extends typings.babylonjs.legacyMod.FreeCameraMouseInput {
  def this(/**
    * Define if touch is enabled in the mouse input
    */
  touchEnabled: Boolean) = this()
}

