package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.PhysicsJointData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.MotorEnabledJoint")
@js.native
class MotorEnabledJoint protected ()
  extends typings.babylonjs.BABYLON.MotorEnabledJoint {
  /**
    * Initializes the Motor-Enabled Joint
    * @param type The type of the joint
    * @param jointData The physica joint data for the joint
    */
  def this(`type`: Double, jointData: PhysicsJointData) = this()
}
