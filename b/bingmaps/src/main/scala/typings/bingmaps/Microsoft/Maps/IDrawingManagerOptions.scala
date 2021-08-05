package typings.bingmaps.Microsoft.Maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDrawingManagerOptions
  extends StObject
     with IDrawingToolOptions {
  
  /** The fill color used for pushpins and polygons. */
  var fillColor: js.UndefOr[String | Color] = js.undefined
  
  /** The stroke color used for polylines and polygons. */
  var strokeColor: js.UndefOr[String | Color] = js.undefined
}
object IDrawingManagerOptions {
  
  inline def apply(): IDrawingManagerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDrawingManagerOptions]
  }
  
  extension [Self <: IDrawingManagerOptions](x: Self) {
    
    inline def setFillColor(value: String | Color): Self = StObject.set(x, "fillColor", value.asInstanceOf[js.Any])
    
    inline def setFillColorUndefined: Self = StObject.set(x, "fillColor", js.undefined)
    
    inline def setStrokeColor(value: String | Color): Self = StObject.set(x, "strokeColor", value.asInstanceOf[js.Any])
    
    inline def setStrokeColorUndefined: Self = StObject.set(x, "strokeColor", js.undefined)
  }
}
