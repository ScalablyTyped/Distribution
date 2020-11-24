package typings.babylonjs.indexMod

import typings.babylonjs.physicsJointMod.PhysicsJointData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/index", "MotorEnabledJoint")
@js.native
class MotorEnabledJoint protected ()
  extends typings.babylonjs.physicsIndexMod.MotorEnabledJoint {
  /**
    * Initializes the Motor-Enabled Joint
    * @param type The type of the joint
    * @param jointData The physica joint data for the joint
    */
  def this(`type`: Double, jointData: PhysicsJointData) = this()
}
