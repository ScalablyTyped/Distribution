package typings.canvasjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChartTitleOptions extends StObject {
  
  /**
    * Sets the background color of Chart Title. Values can be "HTML Color Name" or "hex" code.
    * Default: null
    * Example: "red", "#FF0000" ..
    */
  var backgroundColor: js.UndefOr[String] = js.undefined
  
  /**
    * Sets the color of border around Chart Title. Values of borderColor can be "HTML Color Name" or "hex" code .
    * Default: "black"
    * Example: "red", "#FF0000" ..
    */
  var borderColor: js.UndefOr[String] = js.undefined
  
  /**
    * Sets the thickness of border around the Title in pixels. To display border around title, set the borderThickness to a number greater than zero.
    * Default: 0
    * Example: 2,4 ..
    */
  var borderThickness: js.UndefOr[Double] = js.undefined
  
  /**
    * To display rounded borders around the title, set the cornerRadius of title. Higher the value, more rounded are the corners.
    * Default: 0
    * Options: 5,8 ..
    */
  var cornerRadius: js.UndefOr[Double] = js.undefined
  
  /**
    * When dockInsidePlotArea is set to true, title renders inside the plot area there by giving more space to plot area.
    * Default: false
    * Example: false, true.
    */
  var dockInsidePlotArea: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Sets the font color of Chart Title. The value of fontColor can be a "HTML Color Name" or "hex" code .
    * Default: "black"
    * Example: "red", "#FAC003" ..
    */
  var fontColor: js.UndefOr[String] = js.undefined
  
  /**
    * Sets the Font Family of Chart Title.
    * Default: "calibri, Optima, Candara, verdana, Geneva, sans-serif"
    * Example: "arial" , "tahoma", "verdana" ..
    */
  var fontFamily: js.UndefOr[String] = js.undefined
  
  /**
    * Sets the font Size of Chart Title in pixels.
    * Default: 20
    * Example: 16,18,22 ..
    */
  var fontSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Sets the fontStyle of Chart Title. fontStyle can be set to one of the below options.
    * Default: "normal"
    * Options: "normal", "italic" , "oblique"
    */
  var fontStyle: js.UndefOr[String] = js.undefined
  
  /**
    * Sets the Font Weight used in the Chart Title.
    * Default: "normal"
    * Options: "lighter", "normal", "bold" , "bolder"
    */
  var fontWeight: js.UndefOr[String] = js.undefined
  
  /**
    * This property lets you align the Chart Title horizontally.
    * Default: "center"
    * Options: "left", "right", "center"
    */
  var horizontalAlign: js.UndefOr[String] = js.undefined
  
  /**
    * This property lets you set margin around the Chart Title in pixels.
    * Default: 5
    * Example: 4,12 ..
    */
  var margin: js.UndefOr[Double] = js.undefined
  
  /**
    * Sets the maximum width of title after which it gets wrapped or clipped depending on whether wrap is set to true (default) or false.
    * Default: Automatically calculated based on the chart size.
    * Example: 200, 400 ..
    */
  var maxWidth: js.UndefOr[Double] = js.undefined
  
  /**
    * This property allows you to set the padding for Chart Title
    * Default: 0
    * Example: 5, 8 ..
    */
  var padding: js.UndefOr[Double] = js.undefined
  
  /**
    * Sets the Title’s text.
    * Default: null
    * Example: "Chart title"
    */
  var text: js.UndefOr[String] = js.undefined
  
  /**
    * This property lets you align the Chart Title vertically.
    * Default: "top"
    * Options: "top", "center", "bottom"
    */
  var verticalAlign: js.UndefOr[String] = js.undefined
  
  /**
    * Wrap specifies whether to wrap the title once its width crosses maxWidth or not. If it is set to false, title gets clipped after reaching maxWidth.
    * Default: true;
    * Example : true, false
    */
  var wrap: js.UndefOr[Boolean] = js.undefined
}
object ChartTitleOptions {
  
  inline def apply(): ChartTitleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartTitleOptions]
  }
  
  extension [Self <: ChartTitleOptions](x: Self) {
    
    inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    inline def setBorderColor(value: String): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    inline def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
    
    inline def setBorderThickness(value: Double): Self = StObject.set(x, "borderThickness", value.asInstanceOf[js.Any])
    
    inline def setBorderThicknessUndefined: Self = StObject.set(x, "borderThickness", js.undefined)
    
    inline def setCornerRadius(value: Double): Self = StObject.set(x, "cornerRadius", value.asInstanceOf[js.Any])
    
    inline def setCornerRadiusUndefined: Self = StObject.set(x, "cornerRadius", js.undefined)
    
    inline def setDockInsidePlotArea(value: Boolean): Self = StObject.set(x, "dockInsidePlotArea", value.asInstanceOf[js.Any])
    
    inline def setDockInsidePlotAreaUndefined: Self = StObject.set(x, "dockInsidePlotArea", js.undefined)
    
    inline def setFontColor(value: String): Self = StObject.set(x, "fontColor", value.asInstanceOf[js.Any])
    
    inline def setFontColorUndefined: Self = StObject.set(x, "fontColor", js.undefined)
    
    inline def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
    
    inline def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
    
    inline def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
    
    inline def setFontStyle(value: String): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
    
    inline def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
    
    inline def setFontWeight(value: String): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
    
    inline def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
    
    inline def setHorizontalAlign(value: String): Self = StObject.set(x, "horizontalAlign", value.asInstanceOf[js.Any])
    
    inline def setHorizontalAlignUndefined: Self = StObject.set(x, "horizontalAlign", js.undefined)
    
    inline def setMargin(value: Double): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
    
    inline def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
    
    inline def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
    
    inline def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setVerticalAlign(value: String): Self = StObject.set(x, "verticalAlign", value.asInstanceOf[js.Any])
    
    inline def setVerticalAlignUndefined: Self = StObject.set(x, "verticalAlign", js.undefined)
    
    inline def setWrap(value: Boolean): Self = StObject.set(x, "wrap", value.asInstanceOf[js.Any])
    
    inline def setWrapUndefined: Self = StObject.set(x, "wrap", js.undefined)
  }
}
