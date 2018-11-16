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
  
  val Flat: Flat with java.lang.String = js.native
  val Round: Round with java.lang.String = js.native
  val Square: Square with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    bingmapsLib.MicrosoftNs.MapsNs.SpatialMathNs.GeometryNs.BufferEndCap with java.lang.String
  ] = js.native
}

