package typings.bingmaps.Microsoft.Maps.DrawingTools

import org.scalablytyped.runtime.TopLevel
import typings.bingmaps.Microsoft.Maps.DrawingTools.DrawingBarAction.all
import typings.bingmaps.Microsoft.Maps.DrawingTools.DrawingBarAction.createShapes
import typings.bingmaps.Microsoft.Maps.DrawingTools.DrawingBarAction.edit
import typings.bingmaps.Microsoft.Maps.DrawingTools.DrawingBarAction.editShapes
import typings.bingmaps.Microsoft.Maps.DrawingTools.DrawingBarAction.erase
import typings.bingmaps.Microsoft.Maps.DrawingTools.DrawingBarAction.fillStyle
import typings.bingmaps.Microsoft.Maps.DrawingTools.DrawingBarAction.point
import typings.bingmaps.Microsoft.Maps.DrawingTools.DrawingBarAction.polygon
import typings.bingmaps.Microsoft.Maps.DrawingTools.DrawingBarAction.polyline
import typings.bingmaps.Microsoft.Maps.DrawingTools.DrawingBarAction.strokeStyle
import typings.bingmaps.Microsoft.Maps.DrawingTools.DrawingBarAction.styleShapes
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DrawingBarAction with Double] = js.native
  /* 7 */ @js.native
  object all extends TopLevel[all with Double]
  
  /* 8 */ @js.native
  object createShapes extends TopLevel[createShapes with Double]
  
  /* 4 */ @js.native
  object edit extends TopLevel[edit with Double]
  
  /* 9 */ @js.native
  object editShapes extends TopLevel[editShapes with Double]
  
  /* 3 */ @js.native
  object erase extends TopLevel[erase with Double]
  
  /* 6 */ @js.native
  object fillStyle extends TopLevel[fillStyle with Double]
  
  /* 0 */ @js.native
  object point extends TopLevel[point with Double]
  
  /* 2 */ @js.native
  object polygon extends TopLevel[polygon with Double]
  
  /* 1 */ @js.native
  object polyline extends TopLevel[polyline with Double]
  
  /* 5 */ @js.native
  object strokeStyle extends TopLevel[strokeStyle with Double]
  
  /* 10 */ @js.native
  object styleShapes extends TopLevel[styleShapes with Double]
  
}

