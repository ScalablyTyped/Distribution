package typings
package bingmapsLib.MicrosoftNs.MapsNs.DrawingToolsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ShapeType extends js.Object

@JSGlobal("Microsoft.Maps.DrawingTools.ShapeType")
@js.native
object ShapeType extends js.Object {
  /** A polygon shape type. */
  @js.native
  sealed trait polygon
    extends bingmapsLib.MicrosoftNs.MapsNs.DrawingToolsNs.ShapeType
  
  /** A polyline shape type. */
  @js.native
  sealed trait polyline
    extends bingmapsLib.MicrosoftNs.MapsNs.DrawingToolsNs.ShapeType
  
  /* 0 */ val polygon: polygon with scala.Double = js.native
  /* 1 */ val polyline: polyline with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[bingmapsLib.MicrosoftNs.MapsNs.DrawingToolsNs.ShapeType with scala.Double] = js.native
}

