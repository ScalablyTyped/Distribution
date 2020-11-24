package typings.canvaskitWasm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParagraphStyle extends js.Object {
  
  var disableHinting: js.UndefOr[Boolean] = js.native
  
  var ellipsis: js.UndefOr[String] = js.native
  
  var heightMultiplier: js.UndefOr[Double] = js.native
  
  var maxLines: js.UndefOr[Double] = js.native
  
  var strutStyle: js.UndefOr[StrutStyle] = js.native
  
  var textAlign: js.UndefOr[TextAlign] = js.native
  
  var textDirection: js.UndefOr[TextDirection] = js.native
  
  var textStyle: js.UndefOr[TextStyle] = js.native
}
object ParagraphStyle {
  
  @scala.inline
  def apply(): ParagraphStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParagraphStyle]
  }
  
  @scala.inline
  implicit class ParagraphStyleOps[Self <: ParagraphStyle] (val x: Self) extends AnyVal {
    
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
    def setDisableHinting(value: Boolean): Self = this.set("disableHinting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableHinting: Self = this.set("disableHinting", js.undefined)
    
    @scala.inline
    def setEllipsis(value: String): Self = this.set("ellipsis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEllipsis: Self = this.set("ellipsis", js.undefined)
    
    @scala.inline
    def setHeightMultiplier(value: Double): Self = this.set("heightMultiplier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeightMultiplier: Self = this.set("heightMultiplier", js.undefined)
    
    @scala.inline
    def setMaxLines(value: Double): Self = this.set("maxLines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxLines: Self = this.set("maxLines", js.undefined)
    
    @scala.inline
    def setStrutStyle(value: StrutStyle): Self = this.set("strutStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrutStyle: Self = this.set("strutStyle", js.undefined)
    
    @scala.inline
    def setTextAlign(value: TextAlign): Self = this.set("textAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextAlign: Self = this.set("textAlign", js.undefined)
    
    @scala.inline
    def setTextDirection(value: TextDirection): Self = this.set("textDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextDirection: Self = this.set("textDirection", js.undefined)
    
    @scala.inline
    def setTextStyle(value: TextStyle): Self = this.set("textStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextStyle: Self = this.set("textStyle", js.undefined)
  }
}
