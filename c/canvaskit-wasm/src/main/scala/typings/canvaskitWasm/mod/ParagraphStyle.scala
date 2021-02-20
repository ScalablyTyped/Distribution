package typings.canvaskitWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParagraphStyle extends StObject {
  
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
  implicit class ParagraphStyleMutableBuilder[Self <: ParagraphStyle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisableHinting(value: Boolean): Self = StObject.set(x, "disableHinting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableHintingUndefined: Self = StObject.set(x, "disableHinting", js.undefined)
    
    @scala.inline
    def setEllipsis(value: String): Self = StObject.set(x, "ellipsis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEllipsisUndefined: Self = StObject.set(x, "ellipsis", js.undefined)
    
    @scala.inline
    def setHeightMultiplier(value: Double): Self = StObject.set(x, "heightMultiplier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightMultiplierUndefined: Self = StObject.set(x, "heightMultiplier", js.undefined)
    
    @scala.inline
    def setMaxLines(value: Double): Self = StObject.set(x, "maxLines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxLinesUndefined: Self = StObject.set(x, "maxLines", js.undefined)
    
    @scala.inline
    def setStrutStyle(value: StrutStyle): Self = StObject.set(x, "strutStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrutStyleUndefined: Self = StObject.set(x, "strutStyle", js.undefined)
    
    @scala.inline
    def setTextAlign(value: TextAlign): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextAlignUndefined: Self = StObject.set(x, "textAlign", js.undefined)
    
    @scala.inline
    def setTextDirection(value: TextDirection): Self = StObject.set(x, "textDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextDirectionUndefined: Self = StObject.set(x, "textDirection", js.undefined)
    
    @scala.inline
    def setTextStyle(value: TextStyle): Self = StObject.set(x, "textStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextStyleUndefined: Self = StObject.set(x, "textStyle", js.undefined)
  }
}
