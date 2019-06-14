package typings
package bingmapsLib.MicrosoftNs.MapsNs.SpatialMathNs.GeometryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BufferEndCap extends js.Object

@JSGlobal("Microsoft.Maps.SpatialMath.Geometry.BufferEndCap")
@js.native
object BufferEndCap extends js.Object {
  /** Adds a flat end to a buffered line that touches the end of the line. */
  @js.native
  sealed trait Flat
    extends bingmapsLib.MicrosoftNs.MapsNs.SpatialMathNs.GeometryNs.BufferEndCap
  
  /** Adds a rounded end to a buffered line. */
  @js.native
  sealed trait Round
    extends bingmapsLib.MicrosoftNs.MapsNs.SpatialMathNs.GeometryNs.BufferEndCap
  
  /** Adds a square end to a buffered line that has a buffer area at the end of the line. */
  @js.native
  sealed trait Square
    extends bingmapsLib.MicrosoftNs.MapsNs.SpatialMathNs.GeometryNs.BufferEndCap
  
  /* 1 */ val Flat: Flat with scala.Double = js.native
  /* 0 */ val Round: Round with scala.Double = js.native
  /* 2 */ val Square: Square with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    bingmapsLib.MicrosoftNs.MapsNs.SpatialMathNs.GeometryNs.BufferEndCap with scala.Double
  ] = js.native
}

