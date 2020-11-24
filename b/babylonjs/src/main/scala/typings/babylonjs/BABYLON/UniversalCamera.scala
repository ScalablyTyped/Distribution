package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UniversalCamera extends TouchCamera {
  
  /**
    * Defines the gamepad rotation sensiblity.
    * This is the threshold from when rotation starts to be accounted for to prevent jittering.
    */
  def gamepadAngularSensibility: Double = js.native
  def gamepadAngularSensibility_=(value: Double): Unit = js.native
  
  /**
    * Defines the gamepad move sensiblity.
    * This is the threshold from when moving starts to be accounted for for to prevent jittering.
    */
  def gamepadMoveSensibility: Double = js.native
  def gamepadMoveSensibility_=(value: Double): Unit = js.native
}
