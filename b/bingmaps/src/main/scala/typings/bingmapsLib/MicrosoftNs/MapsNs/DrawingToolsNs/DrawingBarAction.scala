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
  
  val all: all with java.lang.String = js.native
  val createShapes: createShapes with java.lang.String = js.native
  val edit: edit with java.lang.String = js.native
  val editShapes: editShapes with java.lang.String = js.native
  val erase: erase with java.lang.String = js.native
  val fillStyle: fillStyle with java.lang.String = js.native
  val point: point with java.lang.String = js.native
  val polygon: polygon with java.lang.String = js.native
  val polyline: polyline with java.lang.String = js.native
  val strokeStyle: strokeStyle with java.lang.String = js.native
  val styleShapes: styleShapes with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    bingmapsLib.MicrosoftNs.MapsNs.DrawingToolsNs.DrawingBarAction with java.lang.String
  ] = js.native
}

