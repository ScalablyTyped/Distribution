package typings.bingmaps.MicrosoftNs.MapsNs.DrawingToolsNs

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
  sealed trait polygon extends ShapeType
  
  /** A polyline shape type. */
  @js.native
  sealed trait polyline extends ShapeType
  
  /* 0 */ val polygon: typings.bingmaps.MicrosoftNs.MapsNs.DrawingToolsNs.ShapeType.polygon with Double = js.native
  /* 1 */ val polyline: typings.bingmaps.MicrosoftNs.MapsNs.DrawingToolsNs.ShapeType.polyline with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ShapeType with Double] = js.native
}

