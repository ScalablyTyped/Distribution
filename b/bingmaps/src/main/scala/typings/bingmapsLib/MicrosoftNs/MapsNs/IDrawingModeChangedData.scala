package typings
package bingmapsLib.MicrosoftNs.MapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDrawingModeChangedData extends js.Object {
  /** The new drawing mode. **/
  var mode: bingmapsLib.MicrosoftNs.MapsNs.DrawingToolsNs.DrawingMode
  /** The shape being modified by the drawing tools. **/
  var shape: IPrimitive
}

object IDrawingModeChangedData {
  @scala.inline
  def apply(mode: bingmapsLib.MicrosoftNs.MapsNs.DrawingToolsNs.DrawingMode, shape: IPrimitive): IDrawingModeChangedData = {
    val __obj = js.Dynamic.literal(mode = mode, shape = shape)
  
    __obj.asInstanceOf[IDrawingModeChangedData]
  }
}

