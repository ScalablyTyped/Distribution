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
  
  @scala.inline
  def apply(mode: DrawingMode, shape: IPrimitive): IDrawingModeChangedData = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any], shape = shape.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDrawingModeChangedData]
  }
  
  @scala.inline
  implicit class IDrawingModeChangedDataMutableBuilder[Self <: IDrawingModeChangedData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMode(value: DrawingMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShape(value: IPrimitive): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
  }
}
