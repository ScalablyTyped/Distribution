package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This class represents a dual hinge physics joint (same as wheel joint)
  * @see https://doc.babylonjs.com/how_to/using_the_physics_engine
  */
@JSImport("babylonjs", "Hinge2Joint")
@js.native
class Hinge2Joint protected ()
  extends babylonjsLib.BABYLONNs.Hinge2Joint {
  /**
    * Initializes the Hinge2-Joint
    * @param jointData The joint data for the Hinge2-Joint
    */
  def this(jointData: babylonjsLib.BABYLONNs.PhysicsJointData) = this()
}

