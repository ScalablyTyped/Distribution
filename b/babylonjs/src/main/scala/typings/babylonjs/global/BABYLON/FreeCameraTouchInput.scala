package typings.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.FreeCameraTouchInput")
@js.native
/**
  * Manage the touch inputs to control the movement of a free camera.
  * @see https://doc.babylonjs.com/how_to/customizing_camera_inputs
  * @param allowMouse Defines if mouse events can be treated as touch events
  */
class FreeCameraTouchInput ()
  extends StObject
     with typings.babylonjs.BABYLON.FreeCameraTouchInput {
  def this(/**
    * Define if mouse events can be treated as touch events
    */
  allowMouse: Boolean) = this()
}
