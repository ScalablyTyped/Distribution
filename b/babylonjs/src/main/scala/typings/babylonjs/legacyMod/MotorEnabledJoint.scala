package typings.babylonjs.legacyMod

import typings.babylonjs.physicsJointMod.PhysicsJointData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "MotorEnabledJoint")
@js.native
class MotorEnabledJoint protected ()
  extends typings.babylonjs.indexMod.MotorEnabledJoint {
  /**
    * Initializes the Motor-Enabled Joint
    * @param type The type of the joint
    * @param jointData The physica joint data for the joint
    */
  def this(`type`: Double, jointData: PhysicsJointData) = this()
}
