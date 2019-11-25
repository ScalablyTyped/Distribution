package typings.bingmaps.Microsoft.Maps

import typings.bingmaps.Microsoft.Maps.DrawingTools.DrawingMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDrawingModeChangedData extends js.Object {
  /** The new drawing mode. **/
  var mode: DrawingMode
  /** The shape being modified by the drawing tools. **/
  var shape: IPrimitive
}

object IDrawingModeChangedData {
  @scala.inline
  def apply(mode: DrawingMode, shape: IPrimitive): IDrawingModeChangedData = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any], shape = shape.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IDrawingModeChangedData]
  }
}

