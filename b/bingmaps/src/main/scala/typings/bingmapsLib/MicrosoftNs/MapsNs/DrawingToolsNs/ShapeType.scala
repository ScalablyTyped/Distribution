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
  
  val polygon: polygon with java.lang.String = js.native
  val polyline: polyline with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[bingmapsLib.MicrosoftNs.MapsNs.DrawingToolsNs.ShapeType with java.lang.String] = js.native
}

