package typings.bingmaps.Microsoft.Maps.DrawingTools

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
  
  /* 7 */ val all: typings.bingmaps.Microsoft.Maps.DrawingTools.DrawingBarAction.all with Double = js.native
  /* 8 */ val createShapes: typings.bingmaps.Microsoft.Maps.DrawingTools.DrawingBarAction.createShapes with Double = js.native
  /* 4 */ val edit: typings.bingmaps.Microsoft.Maps.DrawingTools.DrawingBarAction.edit with Double = js.native
  /* 9 */ val editShapes: typings.bingmaps.Microsoft.Maps.DrawingTools.DrawingBarAction.editShapes with Double = js.native
  /* 3 */ val erase: typings.bingmaps.Microsoft.Maps.DrawingTools.DrawingBarAction.erase with Double = js.native
  /* 6 */ val fillStyle: typings.bingmaps.Microsoft.Maps.DrawingTools.DrawingBarAction.fillStyle with Double = js.native
  /* 0 */ val point: typings.bingmaps.Microsoft.Maps.DrawingTools.DrawingBarAction.point with Double = js.native
  /* 2 */ val polygon: typings.bingmaps.Microsoft.Maps.DrawingTools.DrawingBarAction.polygon with Double = js.native
  /* 1 */ val polyline: typings.bingmaps.Microsoft.Maps.DrawingTools.DrawingBarAction.polyline with Double = js.native
  /* 5 */ val strokeStyle: typings.bingmaps.Microsoft.Maps.DrawingTools.DrawingBarAction.strokeStyle with Double = js.native
  /* 10 */ val styleShapes: typings.bingmaps.Microsoft.Maps.DrawingTools.DrawingBarAction.styleShapes with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DrawingBarAction with Double] = js.native
}

