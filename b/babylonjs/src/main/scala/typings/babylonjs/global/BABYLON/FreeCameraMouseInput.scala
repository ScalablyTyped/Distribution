package typings.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.FreeCameraMouseInput")
@js.native
/**
  * Manage the mouse inputs to control the movement of a free camera.
  * @see https://doc.babylonjs.com/features/featuresDeepDive/cameras/customizingCameraInputs
  * @param touchEnabled Defines if touch is enabled or not
  */
open class FreeCameraMouseInput ()
  extends StObject
     with typings.babylonjs.BABYLON.FreeCameraMouseInput {
  def this(/**
    * Define if touch is enabled in the mouse input
    */
  touchEnabled: Boolean) = this()
}
