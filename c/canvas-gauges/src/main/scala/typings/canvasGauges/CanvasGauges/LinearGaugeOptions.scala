package typings.canvasGauges.CanvasGauges

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LinearGaugeOptions extends GenericOptions {
  
  var barBeginCircle: js.UndefOr[Double] = js.native
  
  var barLength: js.UndefOr[Double] = js.native
  
  var borderRadius: js.UndefOr[Double] = js.native
  
  var colorBarEnd: js.UndefOr[String] = js.native
  
  var colorBarProgressEnd: js.UndefOr[String] = js.native
  
  var needleSide: js.UndefOr[String] = js.native
  
  var numberSide: js.UndefOr[String] = js.native
  
  var tickSide: js.UndefOr[String] = js.native
  
  var ticksPadding: js.UndefOr[Double] = js.native
  
  var ticksWidth: js.UndefOr[Double] = js.native
  
  var ticksWidthMinor: js.UndefOr[Double] = js.native
}
object LinearGaugeOptions {
  
  @scala.inline
  def apply(renderTo: RenderTarget): LinearGaugeOptions = {
    val __obj = js.Dynamic.literal(renderTo = renderTo.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinearGaugeOptions]
  }
  
  @scala.inline
  implicit class LinearGaugeOptionsOps[Self <: LinearGaugeOptions] (val x: Self) extends AnyVal {
    
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
    def setBarBeginCircle(value: Double): Self = this.set("barBeginCircle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBarBeginCircle: Self = this.set("barBeginCircle", js.undefined)
    
    @scala.inline
    def setBarLength(value: Double): Self = this.set("barLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBarLength: Self = this.set("barLength", js.undefined)
    
    @scala.inline
    def setBorderRadius(value: Double): Self = this.set("borderRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderRadius: Self = this.set("borderRadius", js.undefined)
    
    @scala.inline
    def setColorBarEnd(value: String): Self = this.set("colorBarEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColorBarEnd: Self = this.set("colorBarEnd", js.undefined)
    
    @scala.inline
    def setColorBarProgressEnd(value: String): Self = this.set("colorBarProgressEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColorBarProgressEnd: Self = this.set("colorBarProgressEnd", js.undefined)
    
    @scala.inline
    def setNeedleSide(value: String): Self = this.set("needleSide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNeedleSide: Self = this.set("needleSide", js.undefined)
    
    @scala.inline
    def setNumberSide(value: String): Self = this.set("numberSide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumberSide: Self = this.set("numberSide", js.undefined)
    
    @scala.inline
    def setTickSide(value: String): Self = this.set("tickSide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTickSide: Self = this.set("tickSide", js.undefined)
    
    @scala.inline
    def setTicksPadding(value: Double): Self = this.set("ticksPadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTicksPadding: Self = this.set("ticksPadding", js.undefined)
    
    @scala.inline
    def setTicksWidth(value: Double): Self = this.set("ticksWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTicksWidth: Self = this.set("ticksWidth", js.undefined)
    
    @scala.inline
    def setTicksWidthMinor(value: Double): Self = this.set("ticksWidthMinor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTicksWidthMinor: Self = this.set("ticksWidthMinor", js.undefined)
  }
}
