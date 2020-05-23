package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait JoystickAxis extends js.Object

@JSGlobal("BABYLON.JoystickAxis")
@js.native
object JoystickAxis extends js.Object {
  /** X axis */
  @js.native
  sealed trait X extends JoystickAxis
  
  /** Y axis */
  @js.native
  sealed trait Y extends JoystickAxis
  
  /** Z axis */
  @js.native
  sealed trait Z extends JoystickAxis
  
}

