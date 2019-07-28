package typings.bingmaps.MicrosoftNs.MapsNs

import typings.bingmaps.MicrosoftNs.MapsNs.DrawingToolsNs.DrawingBarAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDrawingToolOptions extends js.Object {
  /** Set of buttons to show in the drawing bar */
  var drawingBarActions: js.UndefOr[DrawingBarAction] = js.undefined
}

object IDrawingToolOptions {
  @scala.inline
  def apply(drawingBarActions: DrawingBarAction = null): IDrawingToolOptions = {
    val __obj = js.Dynamic.literal()
    if (drawingBarActions != null) __obj.updateDynamic("drawingBarActions")(drawingBarActions)
    __obj.asInstanceOf[IDrawingToolOptions]
  }
}

