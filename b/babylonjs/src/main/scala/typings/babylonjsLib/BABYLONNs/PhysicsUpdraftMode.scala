package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PhysicsUpdraftMode extends js.Object

/**
     * The strength of the force in correspondence to the distance of the affected object
     * @see https://doc.babylonjs.com/how_to/using_the_physics_engine
     */
@JSGlobal("BABYLON.PhysicsUpdraftMode")
@js.native
object PhysicsUpdraftMode extends js.Object {
  /** Defines that the upstream forces will pull towards the top center of the cylinder */
  @js.native
  sealed trait Center
    extends babylonjsLib.BABYLONNs.PhysicsUpdraftMode
  
  /** Defines that once a impostor is inside the cylinder, it will shoot out perpendicular from the ground of the cylinder */
  @js.native
  sealed trait Perpendicular
    extends babylonjsLib.BABYLONNs.PhysicsUpdraftMode
  
  /* 0 */ val Center: Center with scala.Double = js.native
  /* 1 */ val Perpendicular: Perpendicular with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[babylonjsLib.BABYLONNs.PhysicsUpdraftMode with scala.Double] = js.native
}

