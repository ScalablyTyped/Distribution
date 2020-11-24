package typings.babylonjs.gamepadMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Gamepads/gamepad", "StickValues")
@js.native
class StickValues protected () extends js.Object {
  /**
    * Initializes the gamepad x and y control stick values
    * @param x The x component of the gamepad control stick value
    * @param y The y component of the gamepad control stick value
    */
  def this(
    /**
    * The x component of the control stick
    */
  x: Double,
    /**
    * The y component of the control stick
    */
  y: Double
  ) = this()
  
  /**
    * The x component of the control stick
    */
  var x: Double = js.native
  
  /**
    * The y component of the control stick
    */
  var y: Double = js.native
}
