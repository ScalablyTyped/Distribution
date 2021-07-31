package typings.baiduApp.swan

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CanvasToTempFilePathOptions
  extends StObject
     with BaseOptions[js.Any, js.Any] {
  
  /**
    * 画布标识，传入 <canvas/> 的 cavas-id
    */
  var canvasId: String
  
  // 输出图片宽度（默认为 width * 屏幕像素密度）
  var destHeight: js.UndefOr[Double] = js.undefined
  
  // 画布高度（默认为 canvas 高度 - y）
  var destWidth: js.UndefOr[Double] = js.undefined
  
  // 输出图片高度（默认为 height * 屏幕像素密度）
  var fileType: js.UndefOr[String] = js.undefined
  
  // 画布宽度（默认为 canvas 宽度 - x）
  var height: js.UndefOr[Double] = js.undefined
  
  // 画布 y 轴起点（默认 0 ）
  var width: js.UndefOr[Double] = js.undefined
  
  var x: js.UndefOr[Double] = js.undefined
  
  // 画布 x 轴起点（默认 0 ）
  var y: js.UndefOr[Double] = js.undefined
}
object CanvasToTempFilePathOptions {
  
  @scala.inline
  def apply(canvasId: String): CanvasToTempFilePathOptions = {
    val __obj = js.Dynamic.literal(canvasId = canvasId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanvasToTempFilePathOptions]
  }
  
  @scala.inline
  implicit class CanvasToTempFilePathOptionsMutableBuilder[Self <: CanvasToTempFilePathOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCanvasId(value: String): Self = StObject.set(x, "canvasId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestHeight(value: Double): Self = StObject.set(x, "destHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestHeightUndefined: Self = StObject.set(x, "destHeight", js.undefined)
    
    @scala.inline
    def setDestWidth(value: Double): Self = StObject.set(x, "destWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestWidthUndefined: Self = StObject.set(x, "destWidth", js.undefined)
    
    @scala.inline
    def setFileType(value: String): Self = StObject.set(x, "fileType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileTypeUndefined: Self = StObject.set(x, "fileType", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
