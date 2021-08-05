package typings.bingmaps.Microsoft.Maps

import typings.bingmaps.Microsoft.Maps.DrawingTools.DrawingBarAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDrawingToolOptions extends StObject {
  
  /** Set of buttons to show in the drawing bar */
  var drawingBarActions: js.UndefOr[DrawingBarAction] = js.undefined
}
object IDrawingToolOptions {
  
  inline def apply(): IDrawingToolOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDrawingToolOptions]
  }
  
  extension [Self <: IDrawingToolOptions](x: Self) {
    
    inline def setDrawingBarActions(value: DrawingBarAction): Self = StObject.set(x, "drawingBarActions", value.asInstanceOf[js.Any])
    
    inline def setDrawingBarActionsUndefined: Self = StObject.set(x, "drawingBarActions", js.undefined)
  }
}
