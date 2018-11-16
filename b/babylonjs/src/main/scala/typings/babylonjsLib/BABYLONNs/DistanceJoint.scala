package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * A class representing a physics distance joint
     * @see https://doc.babylonjs.com/how_to/using_the_physics_engine
     */
@JSGlobal("BABYLON.DistanceJoint")
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
  def updateDistance(maxDistance: scala.Double): scala.Unit = js.native
  /**
           * Update the predefined distance.
           * @param maxDistance The maximum preferred distance
           * @param minDistance The minimum preferred distance
           */
  def updateDistance(maxDistance: scala.Double, minDistance: scala.Double): scala.Unit = js.native
}

