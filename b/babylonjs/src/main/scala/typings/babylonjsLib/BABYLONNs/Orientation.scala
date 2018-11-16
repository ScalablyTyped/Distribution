package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Orientation extends js.Object

/**
     * Defines potential orientation for back face culling
     */
@JSGlobal("BABYLON.Orientation")
@js.native
object Orientation extends js.Object {
  /** Counter clockwise */
  @js.native
  sealed trait CCW
    extends babylonjsLib.BABYLONNs.Orientation
  
  /**
           * Clockwise
           */
  @js.native
  sealed trait CW
    extends babylonjsLib.BABYLONNs.Orientation
  
  /* 1 */ val CCW: CCW with scala.Double = js.native
  /* 0 */ val CW: CW with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[babylonjsLib.BABYLONNs.Orientation with scala.Double] = js.native
}

