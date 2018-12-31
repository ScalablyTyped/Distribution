package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PhysicsRadialImpulseFalloff extends js.Object

/**
  * The strenght of the force in correspondence to the distance of the affected object
  * @see https://doc.babylonjs.com/how_to/using_the_physics_engine
  */
@JSGlobal("BABYLON.PhysicsRadialImpulseFalloff")
@js.native
object PhysicsRadialImpulseFalloff extends js.Object {
  /** Defines that impulse is constant in strength across it's whole radius */
  @js.native
  sealed trait Constant
    extends babylonjsLib.BABYLONNs.PhysicsRadialImpulseFalloff
  
  /** DEfines that impulse gets weaker if it's further from the origin */
  @js.native
  sealed trait Linear
    extends babylonjsLib.BABYLONNs.PhysicsRadialImpulseFalloff
  
  /* 0 */ val Constant: Constant with scala.Double = js.native
  /* 1 */ val Linear: Linear with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[babylonjsLib.BABYLONNs.PhysicsRadialImpulseFalloff with scala.Double] = js.native
}

