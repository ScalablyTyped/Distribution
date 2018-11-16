package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * This class represents a single physics Hinge-Joint
     * @see https://doc.babylonjs.com/how_to/using_the_physics_engine
     */
@JSImport("babylonjs", "HingeJoint")
@js.native
class HingeJoint protected ()
  extends babylonjsLib.BABYLONNs.HingeJoint {
  /**
           * Initializes the Hinge-Joint
           * @param jointData The joint data for the Hinge-Joint
           */
  def this(jointData: babylonjsLib.BABYLONNs.PhysicsJointData) = this()
}

