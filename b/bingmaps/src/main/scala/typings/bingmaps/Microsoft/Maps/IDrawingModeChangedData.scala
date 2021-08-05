package typings.bingmaps.Microsoft.Maps

import typings.bingmaps.Microsoft.Maps.DrawingTools.DrawingMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDrawingModeChangedData extends StObject {
  
  /** The new drawing mode. **/
  var mode: DrawingMode
  
  /** The shape being modified by the drawing tools. **/
  var shape: IPrimitive
}
object IDrawingModeChangedData {
  
  inline def apply(mode: DrawingMode, shape: IPrimitive): IDrawingModeChangedData = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any], shape = shape.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDrawingModeChangedData]
  }
  
  extension [Self <: IDrawingModeChangedData](x: Self) {
    
    inline def setMode(value: DrawingMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setShape(value: IPrimitive): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
  }
}
