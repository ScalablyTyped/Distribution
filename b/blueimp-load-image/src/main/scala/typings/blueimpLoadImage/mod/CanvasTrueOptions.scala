package typings.blueimpLoadImage.mod

import typings.blueimpLoadImage.blueimpLoadImageBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Some options are only valid if 'canvas' is true.
// In addition, if 'crop' is true or 'orientation' is set,
// it automatically enables 'canvas' so in those cases,
// 'canvas' cannot be false
@js.native
trait CanvasTrueOptions extends CanvasOptions {
  
  var bottom: js.UndefOr[Double] = js.native
  
  var canvas: `true` = js.native
  
  var crop: js.UndefOr[Boolean] = js.native
  
  var downsamplingRatio: js.UndefOr[Double] = js.native
  
  var left: js.UndefOr[Double] = js.native
  
  var orientation: js.UndefOr[Orientation] = js.native
  
  var pixelRatio: js.UndefOr[Double] = js.native
  
  var right: js.UndefOr[Double] = js.native
  
  var sourceHeight: js.UndefOr[Double] = js.native
  
  var sourceWidth: js.UndefOr[Double] = js.native
  
  var top: js.UndefOr[Double] = js.native
}
object CanvasTrueOptions {
  
  @scala.inline
  def apply(canvas: `true`): CanvasTrueOptions = {
    val __obj = js.Dynamic.literal(canvas = canvas.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanvasTrueOptions]
  }
  
  @scala.inline
  implicit class CanvasTrueOptionsOps[Self <: CanvasTrueOptions] (val x: Self) extends AnyVal {
    
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
    def setCanvas(value: `true`): Self = this.set("canvas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBottom(value: Double): Self = this.set("bottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBottom: Self = this.set("bottom", js.undefined)
    
    @scala.inline
    def setCrop(value: Boolean): Self = this.set("crop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCrop: Self = this.set("crop", js.undefined)
    
    @scala.inline
    def setDownsamplingRatio(value: Double): Self = this.set("downsamplingRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDownsamplingRatio: Self = this.set("downsamplingRatio", js.undefined)
    
    @scala.inline
    def setLeft(value: Double): Self = this.set("left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLeft: Self = this.set("left", js.undefined)
    
    @scala.inline
    def setOrientation(value: Orientation): Self = this.set("orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrientation: Self = this.set("orientation", js.undefined)
    
    @scala.inline
    def setPixelRatio(value: Double): Self = this.set("pixelRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePixelRatio: Self = this.set("pixelRatio", js.undefined)
    
    @scala.inline
    def setRight(value: Double): Self = this.set("right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRight: Self = this.set("right", js.undefined)
    
    @scala.inline
    def setSourceHeight(value: Double): Self = this.set("sourceHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceHeight: Self = this.set("sourceHeight", js.undefined)
    
    @scala.inline
    def setSourceWidth(value: Double): Self = this.set("sourceWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceWidth: Self = this.set("sourceWidth", js.undefined)
    
    @scala.inline
    def setTop(value: Double): Self = this.set("top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTop: Self = this.set("top", js.undefined)
  }
}
