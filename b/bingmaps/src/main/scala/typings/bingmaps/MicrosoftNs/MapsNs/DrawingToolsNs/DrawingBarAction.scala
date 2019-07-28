package typings.bingmaps.MicrosoftNs.MapsNs.DrawingToolsNs

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
  sealed trait all extends DrawingBarAction
  
  /** All shape creation items */
  @js.native
  sealed trait createShapes extends DrawingBarAction
  
  /** Edit existing primitive */
  @js.native
  sealed trait edit extends DrawingBarAction
  
  /** All shape editing items */
  @js.native
  sealed trait editShapes extends DrawingBarAction
  
  /** Erase existing primitive */
  @js.native
  sealed trait erase extends DrawingBarAction
  
  /** Change fill style */
  @js.native
  sealed trait fillStyle extends DrawingBarAction
  
  /** Create point primitive */
  @js.native
  sealed trait point extends DrawingBarAction
  
  /** Create polygon primitive */
  @js.native
  sealed trait polygon extends DrawingBarAction
  
  /** Create polyline primitive */
  @js.native
  sealed trait polyline extends DrawingBarAction
  
  /** Change stroke style */
  @js.native
  sealed trait strokeStyle extends DrawingBarAction
  
  /** All shape styling items */
  @js.native
  sealed trait styleShapes extends DrawingBarAction
  
  /* 7 */ val all: typings.bingmaps.MicrosoftNs.MapsNs.DrawingToolsNs.DrawingBarAction.all with Double = js.native
  /* 8 */ val createShapes: typings.bingmaps.MicrosoftNs.MapsNs.DrawingToolsNs.DrawingBarAction.createShapes with Double = js.native
  /* 4 */ val edit: typings.bingmaps.MicrosoftNs.MapsNs.DrawingToolsNs.DrawingBarAction.edit with Double = js.native
  /* 9 */ val editShapes: typings.bingmaps.MicrosoftNs.MapsNs.DrawingToolsNs.DrawingBarAction.editShapes with Double = js.native
  /* 3 */ val erase: typings.bingmaps.MicrosoftNs.MapsNs.DrawingToolsNs.DrawingBarAction.erase with Double = js.native
  /* 6 */ val fillStyle: typings.bingmaps.MicrosoftNs.MapsNs.DrawingToolsNs.DrawingBarAction.fillStyle with Double = js.native
  /* 0 */ val point: typings.bingmaps.MicrosoftNs.MapsNs.DrawingToolsNs.DrawingBarAction.point with Double = js.native
  /* 2 */ val polygon: typings.bingmaps.MicrosoftNs.MapsNs.DrawingToolsNs.DrawingBarAction.polygon with Double = js.native
  /* 1 */ val polyline: typings.bingmaps.MicrosoftNs.MapsNs.DrawingToolsNs.DrawingBarAction.polyline with Double = js.native
  /* 5 */ val strokeStyle: typings.bingmaps.MicrosoftNs.MapsNs.DrawingToolsNs.DrawingBarAction.strokeStyle with Double = js.native
  /* 10 */ val styleShapes: typings.bingmaps.MicrosoftNs.MapsNs.DrawingToolsNs.DrawingBarAction.styleShapes with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DrawingBarAction with Double] = js.native
}

