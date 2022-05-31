package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait JoystickAxis extends StObject
@JSGlobal("BABYLON.JoystickAxis")
@js.native
object JoystickAxis extends StObject {
  
  /** X axis */
  @js.native
  sealed trait X
    extends StObject
       with JoystickAxis
  
  /** Y axis */
  @js.native
  sealed trait Y
    extends StObject
       with JoystickAxis
  
  /** Z axis */
  @js.native
  sealed trait Z
    extends StObject
       with JoystickAxis
}
