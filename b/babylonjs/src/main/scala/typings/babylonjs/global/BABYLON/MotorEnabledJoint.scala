package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.PhysicsJointData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.MotorEnabledJoint")
@js.native
open class MotorEnabledJoint protected ()
  extends StObject
     with typings.babylonjs.BABYLON.MotorEnabledJoint {
  /**
    * Initializes the Motor-Enabled Joint
    * @param type The type of the joint
    * @param jointData The physical joint data for the joint
    */
  def this(`type`: Double, jointData: PhysicsJointData) = this()
}
