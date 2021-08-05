package typings.canvaskitWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParagraphStyle extends StObject {
  
  var disableHinting: js.UndefOr[Boolean] = js.undefined
  
  var ellipsis: js.UndefOr[String] = js.undefined
  
  var heightMultiplier: js.UndefOr[Double] = js.undefined
  
  var maxLines: js.UndefOr[Double] = js.undefined
  
  var strutStyle: js.UndefOr[StrutStyle] = js.undefined
  
  var textAlign: js.UndefOr[TextAlign] = js.undefined
  
  var textDirection: js.UndefOr[TextDirection] = js.undefined
  
  var textStyle: js.UndefOr[TextStyle] = js.undefined
}
object ParagraphStyle {
  
  inline def apply(): ParagraphStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParagraphStyle]
  }
  
  extension [Self <: ParagraphStyle](x: Self) {
    
    inline def setDisableHinting(value: Boolean): Self = StObject.set(x, "disableHinting", value.asInstanceOf[js.Any])
    
    inline def setDisableHintingUndefined: Self = StObject.set(x, "disableHinting", js.undefined)
    
    inline def setEllipsis(value: String): Self = StObject.set(x, "ellipsis", value.asInstanceOf[js.Any])
    
    inline def setEllipsisUndefined: Self = StObject.set(x, "ellipsis", js.undefined)
    
    inline def setHeightMultiplier(value: Double): Self = StObject.set(x, "heightMultiplier", value.asInstanceOf[js.Any])
    
    inline def setHeightMultiplierUndefined: Self = StObject.set(x, "heightMultiplier", js.undefined)
    
    inline def setMaxLines(value: Double): Self = StObject.set(x, "maxLines", value.asInstanceOf[js.Any])
    
    inline def setMaxLinesUndefined: Self = StObject.set(x, "maxLines", js.undefined)
    
    inline def setStrutStyle(value: StrutStyle): Self = StObject.set(x, "strutStyle", value.asInstanceOf[js.Any])
    
    inline def setStrutStyleUndefined: Self = StObject.set(x, "strutStyle", js.undefined)
    
    inline def setTextAlign(value: TextAlign): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
    
    inline def setTextAlignUndefined: Self = StObject.set(x, "textAlign", js.undefined)
    
    inline def setTextDirection(value: TextDirection): Self = StObject.set(x, "textDirection", value.asInstanceOf[js.Any])
    
    inline def setTextDirectionUndefined: Self = StObject.set(x, "textDirection", js.undefined)
    
    inline def setTextStyle(value: TextStyle): Self = StObject.set(x, "textStyle", value.asInstanceOf[js.Any])
    
    inline def setTextStyleUndefined: Self = StObject.set(x, "textStyle", js.undefined)
  }
}
