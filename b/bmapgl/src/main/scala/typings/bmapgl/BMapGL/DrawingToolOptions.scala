package typings.bmapgl.BMapGL

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DrawingToolOptions extends js.Object {
  
  var anchor: js.UndefOr[ControlAnchor] = js.native
  
  var customContainer: js.UndefOr[String | HTMLElement] = js.native
  
  var drawingModes: js.UndefOr[js.Array[DrawingType]] = js.native
  
  var enableTips: js.UndefOr[Boolean] = js.native
  
  var hasCustomStyle: js.UndefOr[Boolean] = js.native
  
  var offset: js.UndefOr[Size] = js.native
  
  var scale: js.UndefOr[Double] = js.native
}
object DrawingToolOptions {
  
  @scala.inline
  def apply(): DrawingToolOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DrawingToolOptions]
  }
  
  @scala.inline
  implicit class DrawingToolOptionsOps[Self <: DrawingToolOptions] (val x: Self) extends AnyVal {
    
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
    def setAnchor(value: ControlAnchor): Self = this.set("anchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnchor: Self = this.set("anchor", js.undefined)
    
    @scala.inline
    def setCustomContainer(value: String | HTMLElement): Self = this.set("customContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomContainer: Self = this.set("customContainer", js.undefined)
    
    @scala.inline
    def setDrawingModesVarargs(value: DrawingType*): Self = this.set("drawingModes", js.Array(value :_*))
    
    @scala.inline
    def setDrawingModes(value: js.Array[DrawingType]): Self = this.set("drawingModes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDrawingModes: Self = this.set("drawingModes", js.undefined)
    
    @scala.inline
    def setEnableTips(value: Boolean): Self = this.set("enableTips", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableTips: Self = this.set("enableTips", js.undefined)
    
    @scala.inline
    def setHasCustomStyle(value: Boolean): Self = this.set("hasCustomStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHasCustomStyle: Self = this.set("hasCustomStyle", js.undefined)
    
    @scala.inline
    def setOffset(value: Size): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    
    @scala.inline
    def setScale(value: Double): Self = this.set("scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScale: Self = this.set("scale", js.undefined)
  }
}
