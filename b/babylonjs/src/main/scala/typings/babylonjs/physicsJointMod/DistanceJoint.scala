package typings.babylonjs.physicsJointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Physics/physicsJoint", "DistanceJoint")
@js.native
class DistanceJoint protected () extends PhysicsJoint {
  /**
    *
    * @param jointData The data for the Distance-Joint
    */
  def this(jointData: DistanceJointData) = this()
  /**
    * Update the predefined distance.
    * @param maxDistance The maximum preferred distance
    * @param minDistance The minimum preferred distance
    */
  def updateDistance(maxDistance: Double): Unit = js.native
  def updateDistance(maxDistance: Double, minDistance: Double): Unit = js.native
}

