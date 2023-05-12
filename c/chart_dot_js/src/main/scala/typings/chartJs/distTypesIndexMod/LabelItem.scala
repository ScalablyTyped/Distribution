package typings.chartJs.distTypesIndexMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LabelItem extends StObject {
  
  var font: CanvasFontSpec
  
  var label: String | js.Array[String]
  
  var options: RenderTextOpts
  
  var textOffset: Double
}
object LabelItem {
  
  inline def apply(
    font: CanvasFontSpec,
    label: String | js.Array[String],
    options: RenderTextOpts,
    textOffset: Double
  ): LabelItem = {
    val __obj = js.Dynamic.literal(font = font.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], textOffset = textOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LabelItem] (val x: Self) extends AnyVal {
    
    inline def setFont(value: CanvasFontSpec): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: String | js.Array[String]): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelVarargs(value: String*): Self = StObject.set(x, "label", js.Array(value*))
    
    inline def setOptions(value: RenderTextOpts): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setTextOffset(value: Double): Self = StObject.set(x, "textOffset", value.asInstanceOf[js.Any])
  }
}
