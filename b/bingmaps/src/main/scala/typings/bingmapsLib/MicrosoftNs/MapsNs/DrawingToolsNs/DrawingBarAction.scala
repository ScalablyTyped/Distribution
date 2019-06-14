package typings
package bingmapsLib.MicrosoftNs.MapsNs.DrawingToolsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DrawingBarAction extends js.Object

@JSGlobal("Microsoft.Maps.DrawingTools.DrawingBarAction")
@js.native
object DrawingBarAction extends js.Object {
  /** All items */
  @js.native
  sealed trait all
    extends bingmapsLib.MicrosoftNs.MapsNs.DrawingToolsNs.DrawingBarAction
  
  /** All shape creation items */
  @js.native
  sealed trait createShapes
    extends bingmapsLib.MicrosoftNs.MapsNs.DrawingToolsNs.DrawingBarAction
  
  /** Edit existing primitive */
  @js.native
  sealed trait edit
    extends bingmapsLib.MicrosoftNs.MapsNs.DrawingToolsNs.DrawingBarAction
  
  /** All shape editing items */
  @js.native
  sealed trait editShapes
    extends bingmapsLib.MicrosoftNs.MapsNs.DrawingToolsNs.DrawingBarAction
  
  /** Erase existing primitive */
  @js.native
  sealed trait erase
    extends bingmapsLib.MicrosoftNs.MapsNs.DrawingToolsNs.DrawingBarAction
  
  /** Change fill style */
  @js.native
  sealed trait fillStyle
    extends bingmapsLib.MicrosoftNs.MapsNs.DrawingToolsNs.DrawingBarAction
  
  /** Create point primitive */
  @js.native
  sealed trait point
    extends bingmapsLib.MicrosoftNs.MapsNs.DrawingToolsNs.DrawingBarAction
  
  /** Create polygon primitive */
  @js.native
  sealed trait polygon
    extends bingmapsLib.MicrosoftNs.MapsNs.DrawingToolsNs.DrawingBarAction
  
  /** Create polyline primitive */
  @js.native
  sealed trait polyline
    extends bingmapsLib.MicrosoftNs.MapsNs.DrawingToolsNs.DrawingBarAction
  
  /** Change stroke style */
  @js.native
  sealed trait strokeStyle
    extends bingmapsLib.MicrosoftNs.MapsNs.DrawingToolsNs.DrawingBarAction
  
  /** All shape styling items */
  @js.native
  sealed trait styleShapes
    extends bingmapsLib.MicrosoftNs.MapsNs.DrawingToolsNs.DrawingBarAction
  
  /* 7 */ val all: all with scala.Double = js.native
  /* 8 */ val createShapes: createShapes with scala.Double = js.native
  /* 4 */ val edit: edit with scala.Double = js.native
  /* 9 */ val editShapes: editShapes with scala.Double = js.native
  /* 3 */ val erase: erase with scala.Double = js.native
  /* 6 */ val fillStyle: fillStyle with scala.Double = js.native
  /* 0 */ val point: point with scala.Double = js.native
  /* 2 */ val polygon: polygon with scala.Double = js.native
  /* 1 */ val polyline: polyline with scala.Double = js.native
  /* 5 */ val strokeStyle: strokeStyle with scala.Double = js.native
  /* 10 */ val styleShapes: styleShapes with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[bingmapsLib.MicrosoftNs.MapsNs.DrawingToolsNs.DrawingBarAction with scala.Double] = js.native
}

