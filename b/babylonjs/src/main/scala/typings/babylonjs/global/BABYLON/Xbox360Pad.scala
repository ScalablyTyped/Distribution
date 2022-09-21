package typings.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.Xbox360Pad")
@js.native
open class Xbox360Pad protected ()
  extends StObject
     with typings.babylonjs.BABYLON.Xbox360Pad {
  /**
    * Creates a new XBox360 gamepad object
    * @param id defines the id of this gamepad
    * @param index defines its index
    * @param gamepad defines the internal HTML gamepad object
    * @param xboxOne defines if it is a XBox One gamepad
    */
  def this(id: String, index: Double, gamepad: Any) = this()
  def this(id: String, index: Double, gamepad: Any, xboxOne: Boolean) = this()
}
