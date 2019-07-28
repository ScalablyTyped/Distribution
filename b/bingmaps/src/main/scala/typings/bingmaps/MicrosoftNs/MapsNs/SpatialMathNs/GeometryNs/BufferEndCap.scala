package typings.bingmaps.MicrosoftNs.MapsNs.SpatialMathNs.GeometryNs

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
  sealed trait Flat extends BufferEndCap
  
  /** Adds a rounded end to a buffered line. */
  @js.native
  sealed trait Round extends BufferEndCap
  
  /** Adds a square end to a buffered line that has a buffer area at the end of the line. */
  @js.native
  sealed trait Square extends BufferEndCap
  
  /* 1 */ val Flat: typings.bingmaps.MicrosoftNs.MapsNs.SpatialMathNs.GeometryNs.BufferEndCap.Flat with Double = js.native
  /* 0 */ val Round: typings.bingmaps.MicrosoftNs.MapsNs.SpatialMathNs.GeometryNs.BufferEndCap.Round with Double = js.native
  /* 2 */ val Square: typings.bingmaps.MicrosoftNs.MapsNs.SpatialMathNs.GeometryNs.BufferEndCap.Square with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BufferEndCap with Double] = js.native
}

