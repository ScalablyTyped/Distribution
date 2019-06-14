package typings
package bingmapsLib.MicrosoftNs.MapsNs.DrawingToolsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DrawingMode extends js.Object

@JSGlobal("Microsoft.Maps.DrawingTools.DrawingMode")
@js.native
object DrawingMode extends js.Object {
  /** Edit an existing shape. Click on a shape to edit it. */
  @js.native
  sealed trait edit
    extends bingmapsLib.MicrosoftNs.MapsNs.DrawingToolsNs.DrawingMode
  
  /** Erase and existing shape. Click on the shapes to erase them. */
  @js.native
  sealed trait erase
    extends bingmapsLib.MicrosoftNs.MapsNs.DrawingToolsNs.DrawingMode
  
  /** Sets the drawing manager into an idle mode. */
  @js.native
  sealed trait none
    extends bingmapsLib.MicrosoftNs.MapsNs.DrawingToolsNs.DrawingMode
  
  /** Allow the user to draw a polygon. */
  @js.native
  sealed trait polygon
    extends bingmapsLib.MicrosoftNs.MapsNs.DrawingToolsNs.DrawingMode
  
  /** Allow the user to draw a polyline. */
  @js.native
  sealed trait polyline
    extends bingmapsLib.MicrosoftNs.MapsNs.DrawingToolsNs.DrawingMode
  
  /** Allow the user to draw a pushpin. */
  @js.native
  sealed trait pushpin
    extends bingmapsLib.MicrosoftNs.MapsNs.DrawingToolsNs.DrawingMode
  
  /* 0 */ val edit: edit with scala.Double = js.native
  /* 1 */ val erase: erase with scala.Double = js.native
  /* 2 */ val none: none with scala.Double = js.native
  /* 3 */ val polygon: polygon with scala.Double = js.native
  /* 4 */ val polyline: polyline with scala.Double = js.native
  /* 5 */ val pushpin: pushpin with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[bingmapsLib.MicrosoftNs.MapsNs.DrawingToolsNs.DrawingMode with scala.Double] = js.native
}

