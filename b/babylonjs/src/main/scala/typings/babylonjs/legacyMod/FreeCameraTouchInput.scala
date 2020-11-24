package typings.babylonjs.legacyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "FreeCameraTouchInput")
@js.native
/**
  * Manage the touch inputs to control the movement of a free camera.
  * @see https://doc.babylonjs.com/how_to/customizing_camera_inputs
  * @param allowMouse Defines if mouse events can be treated as touch events
  */
class FreeCameraTouchInput ()
  extends typings.babylonjs.indexMod.FreeCameraTouchInput {
  def this(/**
    * Define if mouse events can be treated as touch events
    */
  allowMouse: Boolean) = this()
}
