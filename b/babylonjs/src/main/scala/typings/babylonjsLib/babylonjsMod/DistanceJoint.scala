package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * A class representing a physics distance joint
     * @see https://doc.babylonjs.com/how_to/using_the_physics_engine
     */
@JSImport("babylonjs", "DistanceJoint")
@js.native
class DistanceJoint protected ()
  extends babylonjsLib.BABYLONNs.DistanceJoint {
  /**
           *
           * @param jointData The data for the Distance-Joint
           */
  def this(jointData: babylonjsLib.BABYLONNs.DistanceJointData) = this()
}

