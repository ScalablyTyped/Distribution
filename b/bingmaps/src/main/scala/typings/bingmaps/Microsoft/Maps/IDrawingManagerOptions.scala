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
  
  @scala.inline
  def apply(): IDrawingManagerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDrawingManagerOptions]
  }
  
  @scala.inline
  implicit class IDrawingManagerOptionsMutableBuilder[Self <: IDrawingManagerOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFillColor(value: String | Color): Self = StObject.set(x, "fillColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillColorUndefined: Self = StObject.set(x, "fillColor", js.undefined)
    
    @scala.inline
    def setStrokeColor(value: String | Color): Self = StObject.set(x, "strokeColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeColorUndefined: Self = StObject.set(x, "strokeColor", js.undefined)
  }
}
