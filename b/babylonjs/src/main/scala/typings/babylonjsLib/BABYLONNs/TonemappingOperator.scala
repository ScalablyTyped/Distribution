package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TonemappingOperator extends js.Object

/** Defines operator used for tonemapping */
@JSGlobal("BABYLON.TonemappingOperator")
@js.native
object TonemappingOperator extends js.Object {
  /** Hable */
  @js.native
  sealed trait Hable
    extends babylonjsLib.BABYLONNs.TonemappingOperator
  
  /** HejiDawson */
  @js.native
  sealed trait HejiDawson
    extends babylonjsLib.BABYLONNs.TonemappingOperator
  
  /** Photographic */
  @js.native
  sealed trait Photographic
    extends babylonjsLib.BABYLONNs.TonemappingOperator
  
  /** Reinhard */
  @js.native
  sealed trait Reinhard
    extends babylonjsLib.BABYLONNs.TonemappingOperator
  
  /* 0 */ val Hable: Hable with scala.Double = js.native
  /* 2 */ val HejiDawson: HejiDawson with scala.Double = js.native
  /* 3 */ val Photographic: Photographic with scala.Double = js.native
  /* 1 */ val Reinhard: Reinhard with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[babylonjsLib.BABYLONNs.TonemappingOperator with scala.Double] = js.native
}

