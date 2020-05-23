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
  
}

