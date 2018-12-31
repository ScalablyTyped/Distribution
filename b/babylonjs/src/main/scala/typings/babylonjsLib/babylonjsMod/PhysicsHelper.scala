package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A helper for physics simulations
  * @see https://doc.babylonjs.com/how_to/using_the_physics_engine
  */
@JSImport("babylonjs", "PhysicsHelper")
@js.native
class PhysicsHelper protected ()
  extends babylonjsLib.BABYLONNs.PhysicsHelper {
  /**
    * Initializes the Physics helper
    * @param scene Babylon.js scene
    */
  def this(scene: babylonjsLib.BABYLONNs.Scene) = this()
}

