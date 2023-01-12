package typings.bmapgl.BMapGL

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DrawingManagerOptions extends StObject {
  
  var circleOptions: js.UndefOr[CircleOptions] = js.undefined
  
  var drawingMode: js.UndefOr[DrawingType] = js.undefined
  
  var drawingToolOptions: js.UndefOr[DrawingToolOptions] = js.undefined
  
  var enableCalculate: js.UndefOr[Boolean] = js.undefined
  
  var enableDrawingTool: js.UndefOr[Boolean] = js.undefined
  
  var enableGpc: js.UndefOr[Boolean] = js.undefined
  
  var enableLimit: js.UndefOr[Boolean] = js.undefined
  
  var enableSorption: js.UndefOr[Boolean] = js.undefined
  
  var isOpen: js.UndefOr[Boolean] = js.undefined
  
  var limitOptions: js.UndefOr[DrawingLimitOptions] = js.undefined
  
  var markerOptions: js.UndefOr[MarkerOptions] = js.undefined
  
  var polygonOptions: js.UndefOr[PolygonOptions] = js.undefined
  
  var polylineOptions: js.UndefOr[PolylineOptions] = js.undefined
  
  var rectangleOptions: js.UndefOr[PolygonOptions] = js.undefined
  
  var sorptionDistance: js.UndefOr[Double] = js.undefined
}
object DrawingManagerOptions {
  
  inline def apply(): DrawingManagerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DrawingManagerOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DrawingManagerOptions] (val x: Self) extends AnyVal {
    
    inline def setCircleOptions(value: CircleOptions): Self = StObject.set(x, "circleOptions", value.asInstanceOf[js.Any])
    
    inline def setCircleOptionsUndefined: Self = StObject.set(x, "circleOptions", js.undefined)
    
    inline def setDrawingMode(value: DrawingType): Self = StObject.set(x, "drawingMode", value.asInstanceOf[js.Any])
    
    inline def setDrawingModeUndefined: Self = StObject.set(x, "drawingMode", js.undefined)
    
    inline def setDrawingToolOptions(value: DrawingToolOptions): Self = StObject.set(x, "drawingToolOptions", value.asInstanceOf[js.Any])
    
    inline def setDrawingToolOptionsUndefined: Self = StObject.set(x, "drawingToolOptions", js.undefined)
    
    inline def setEnableCalculate(value: Boolean): Self = StObject.set(x, "enableCalculate", value.asInstanceOf[js.Any])
    
    inline def setEnableCalculateUndefined: Self = StObject.set(x, "enableCalculate", js.undefined)
    
    inline def setEnableDrawingTool(value: Boolean): Self = StObject.set(x, "enableDrawingTool", value.asInstanceOf[js.Any])
    
    inline def setEnableDrawingToolUndefined: Self = StObject.set(x, "enableDrawingTool", js.undefined)
    
    inline def setEnableGpc(value: Boolean): Self = StObject.set(x, "enableGpc", value.asInstanceOf[js.Any])
    
    inline def setEnableGpcUndefined: Self = StObject.set(x, "enableGpc", js.undefined)
    
    inline def setEnableLimit(value: Boolean): Self = StObject.set(x, "enableLimit", value.asInstanceOf[js.Any])
    
    inline def setEnableLimitUndefined: Self = StObject.set(x, "enableLimit", js.undefined)
    
    inline def setEnableSorption(value: Boolean): Self = StObject.set(x, "enableSorption", value.asInstanceOf[js.Any])
    
    inline def setEnableSorptionUndefined: Self = StObject.set(x, "enableSorption", js.undefined)
    
    inline def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
    
    inline def setIsOpenUndefined: Self = StObject.set(x, "isOpen", js.undefined)
    
    inline def setLimitOptions(value: DrawingLimitOptions): Self = StObject.set(x, "limitOptions", value.asInstanceOf[js.Any])
    
    inline def setLimitOptionsUndefined: Self = StObject.set(x, "limitOptions", js.undefined)
    
    inline def setMarkerOptions(value: MarkerOptions): Self = StObject.set(x, "markerOptions", value.asInstanceOf[js.Any])
    
    inline def setMarkerOptionsUndefined: Self = StObject.set(x, "markerOptions", js.undefined)
    
    inline def setPolygonOptions(value: PolygonOptions): Self = StObject.set(x, "polygonOptions", value.asInstanceOf[js.Any])
    
    inline def setPolygonOptionsUndefined: Self = StObject.set(x, "polygonOptions", js.undefined)
    
    inline def setPolylineOptions(value: PolylineOptions): Self = StObject.set(x, "polylineOptions", value.asInstanceOf[js.Any])
    
    inline def setPolylineOptionsUndefined: Self = StObject.set(x, "polylineOptions", js.undefined)
    
    inline def setRectangleOptions(value: PolygonOptions): Self = StObject.set(x, "rectangleOptions", value.asInstanceOf[js.Any])
    
    inline def setRectangleOptionsUndefined: Self = StObject.set(x, "rectangleOptions", js.undefined)
    
    inline def setSorptionDistance(value: Double): Self = StObject.set(x, "sorptionDistance", value.asInstanceOf[js.Any])
    
    inline def setSorptionDistanceUndefined: Self = StObject.set(x, "sorptionDistance", js.undefined)
  }
}
