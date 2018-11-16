package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Space extends js.Object

/** Defines supported spaces */
@JSGlobal("BABYLON.Space")
@js.native
object Space extends js.Object {
  /** Bone space */
  @js.native
  sealed trait BONE
    extends babylonjsLib.BABYLONNs.Space
  
  /** Local (object) space */
  @js.native
  sealed trait LOCAL
    extends babylonjsLib.BABYLONNs.Space
  
  /** World space */
  @js.native
  sealed trait WORLD
    extends babylonjsLib.BABYLONNs.Space
  
  /* 2 */ val BONE: BONE with scala.Double = js.native
  /* 0 */ val LOCAL: LOCAL with scala.Double = js.native
  /* 1 */ val WORLD: WORLD with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[babylonjsLib.BABYLONNs.Space with scala.Double] = js.native
}

