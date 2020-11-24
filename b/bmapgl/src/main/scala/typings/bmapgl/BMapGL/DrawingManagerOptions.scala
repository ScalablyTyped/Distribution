package typings.bmapgl.BMapGL

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DrawingManagerOptions extends js.Object {
  
  var circleOptions: js.UndefOr[CircleOptions] = js.native
  
  var drawingMode: js.UndefOr[DrawingType] = js.native
  
  var drawingToolOptions: js.UndefOr[DrawingToolOptions] = js.native
  
  var enableCalculate: js.UndefOr[Boolean] = js.native
  
  var enableDrawingTool: js.UndefOr[Boolean] = js.native
  
  var enableGpc: js.UndefOr[Boolean] = js.native
  
  var enableLimit: js.UndefOr[Boolean] = js.native
  
  var enableSorption: js.UndefOr[Boolean] = js.native
  
  var isOpen: js.UndefOr[Boolean] = js.native
  
  var limitOptions: js.UndefOr[DrawingLimitOptions] = js.native
  
  var markerOptions: js.UndefOr[MarkerOptions] = js.native
  
  var polygonOptions: js.UndefOr[PolygonOptions] = js.native
  
  var polylineOptions: js.UndefOr[PolylineOptions] = js.native
  
  var rectangleOptions: js.UndefOr[PolygonOptions] = js.native
  
  var sorptionDistance: js.UndefOr[Double] = js.native
}
object DrawingManagerOptions {
  
  @scala.inline
  def apply(): DrawingManagerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DrawingManagerOptions]
  }
  
  @scala.inline
  implicit class DrawingManagerOptionsOps[Self <: DrawingManagerOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCircleOptions(value: CircleOptions): Self = this.set("circleOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCircleOptions: Self = this.set("circleOptions", js.undefined)
    
    @scala.inline
    def setDrawingMode(value: DrawingType): Self = this.set("drawingMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDrawingMode: Self = this.set("drawingMode", js.undefined)
    
    @scala.inline
    def setDrawingToolOptions(value: DrawingToolOptions): Self = this.set("drawingToolOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDrawingToolOptions: Self = this.set("drawingToolOptions", js.undefined)
    
    @scala.inline
    def setEnableCalculate(value: Boolean): Self = this.set("enableCalculate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableCalculate: Self = this.set("enableCalculate", js.undefined)
    
    @scala.inline
    def setEnableDrawingTool(value: Boolean): Self = this.set("enableDrawingTool", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableDrawingTool: Self = this.set("enableDrawingTool", js.undefined)
    
    @scala.inline
    def setEnableGpc(value: Boolean): Self = this.set("enableGpc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableGpc: Self = this.set("enableGpc", js.undefined)
    
    @scala.inline
    def setEnableLimit(value: Boolean): Self = this.set("enableLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableLimit: Self = this.set("enableLimit", js.undefined)
    
    @scala.inline
    def setEnableSorption(value: Boolean): Self = this.set("enableSorption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableSorption: Self = this.set("enableSorption", js.undefined)
    
    @scala.inline
    def setIsOpen(value: Boolean): Self = this.set("isOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsOpen: Self = this.set("isOpen", js.undefined)
    
    @scala.inline
    def setLimitOptions(value: DrawingLimitOptions): Self = this.set("limitOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLimitOptions: Self = this.set("limitOptions", js.undefined)
    
    @scala.inline
    def setMarkerOptions(value: MarkerOptions): Self = this.set("markerOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarkerOptions: Self = this.set("markerOptions", js.undefined)
    
    @scala.inline
    def setPolygonOptions(value: PolygonOptions): Self = this.set("polygonOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolygonOptions: Self = this.set("polygonOptions", js.undefined)
    
    @scala.inline
    def setPolylineOptions(value: PolylineOptions): Self = this.set("polylineOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolylineOptions: Self = this.set("polylineOptions", js.undefined)
    
    @scala.inline
    def setRectangleOptions(value: PolygonOptions): Self = this.set("rectangleOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRectangleOptions: Self = this.set("rectangleOptions", js.undefined)
    
    @scala.inline
    def setSorptionDistance(value: Double): Self = this.set("sorptionDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSorptionDistance: Self = this.set("sorptionDistance", js.undefined)
  }
}
