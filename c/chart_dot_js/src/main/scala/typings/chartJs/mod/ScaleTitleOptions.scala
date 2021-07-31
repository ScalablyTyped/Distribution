package typings.chartJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScaleTitleOptions extends StObject {
  
  var display: js.UndefOr[Boolean] = js.undefined
  
  var fontColor: js.UndefOr[ChartColor] = js.undefined
  
  var fontFamily: js.UndefOr[String] = js.undefined
  
  var fontSize: js.UndefOr[Double] = js.undefined
  
  var fontStyle: js.UndefOr[String] = js.undefined
  
  var labelString: js.UndefOr[String] = js.undefined
  
  var lineHeight: js.UndefOr[Double | String] = js.undefined
  
  var padding: js.UndefOr[ChartLayoutPaddingObject | Double] = js.undefined
}
object ScaleTitleOptions {
  
  @scala.inline
  def apply(): ScaleTitleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScaleTitleOptions]
  }
  
  @scala.inline
  implicit class ScaleTitleOptionsMutableBuilder[Self <: ScaleTitleOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplay(value: Boolean): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
    
    @scala.inline
    def setFontColor(value: ChartColor): Self = StObject.set(x, "fontColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontColorUndefined: Self = StObject.set(x, "fontColor", js.undefined)
    
    @scala.inline
    def setFontColorVarargs(value: String*): Self = StObject.set(x, "fontColor", js.Array(value :_*))
    
    @scala.inline
    def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
    
    @scala.inline
    def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
    
    @scala.inline
    def setFontStyle(value: String): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
    
    @scala.inline
    def setLabelString(value: String): Self = StObject.set(x, "labelString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelStringUndefined: Self = StObject.set(x, "labelString", js.undefined)
    
    @scala.inline
    def setLineHeight(value: Double | String): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineHeightUndefined: Self = StObject.set(x, "lineHeight", js.undefined)
    
    @scala.inline
    def setPadding(value: ChartLayoutPaddingObject | Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
  }
}
