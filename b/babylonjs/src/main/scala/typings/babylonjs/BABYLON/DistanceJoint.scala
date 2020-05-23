package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DistanceJoint extends PhysicsJoint {
  /**
    * Update the predefined distance.
    * @param maxDistance The maximum preferred distance
    * @param minDistance The minimum preferred distance
    */
  def updateDistance(maxDistance: Double): Unit = js.native
  def updateDistance(maxDistance: Double, minDistance: Double): Unit = js.native
}

