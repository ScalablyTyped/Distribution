package typings.canvasjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChartToolbar extends StObject {
  
  /**
    * Sets the background color of particular option (zoom/pan, reset, export-menu & export-options)
    * within toolbar on mouse hover. Values of itemBackgroundColorOnHover can be specified in
    * “HTML Color Name”, “hex code” or “rgba values”.
    * Default: “#2196f3”
    */
  var buttonBorderColor: js.UndefOr[String] = js.undefined
  
  /**
    * Sets the border thickness of buttons (zoom/pan, reset & export-menu) in chart toolbar.
    * Default: 1
    */
  var buttonBorderThickness: js.UndefOr[Double] = js.undefined
  
  /**
    * Sets the font color of text within chart toolbar. Values of fontColor can be specified in
    * “HTML Color Name”, “hex code” or “rgba values”.
    * Default: “black”
    */
  var fontColor: js.UndefOr[String] = js.undefined
  
  /**
    * Sets the font color of text within chart toolbar on mouse hover. Values of fontColorOnHover
    * can be specified in “HTML Color Name”, “hex code” or “rgba values”.
    * Default: “black”
    */
  var fontColorOnHover: js.UndefOr[String] = js.undefined
  
  /**
    * Sets the background color of toolbar options (zoom/pan, reset, export-menu & export-options).
    * Values of itemBackgroundColor can be specified in “HTML Color Name”, “hex code” or “rgba values”.
    * Default: "white"
    */
  var itemBackgroundColor: js.UndefOr[String] = js.undefined
  
  /**
    * Sets the background color of particular option (zoom/pan, reset, export-menu & export-options)
    * within toolbar on mouse hover. Values of itemBackgroundColorOnHover can be specified in
    * “HTML Color Name”, “hex code” or “rgba values”.
    * Default: "#2196f3"
    */
  var itemBackgroundColorOnHover: js.UndefOr[String] = js.undefined
}
object ChartToolbar {
  
  inline def apply(): ChartToolbar = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartToolbar]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChartToolbar] (val x: Self) extends AnyVal {
    
    inline def setButtonBorderColor(value: String): Self = StObject.set(x, "buttonBorderColor", value.asInstanceOf[js.Any])
    
    inline def setButtonBorderColorUndefined: Self = StObject.set(x, "buttonBorderColor", js.undefined)
    
    inline def setButtonBorderThickness(value: Double): Self = StObject.set(x, "buttonBorderThickness", value.asInstanceOf[js.Any])
    
    inline def setButtonBorderThicknessUndefined: Self = StObject.set(x, "buttonBorderThickness", js.undefined)
    
    inline def setFontColor(value: String): Self = StObject.set(x, "fontColor", value.asInstanceOf[js.Any])
    
    inline def setFontColorOnHover(value: String): Self = StObject.set(x, "fontColorOnHover", value.asInstanceOf[js.Any])
    
    inline def setFontColorOnHoverUndefined: Self = StObject.set(x, "fontColorOnHover", js.undefined)
    
    inline def setFontColorUndefined: Self = StObject.set(x, "fontColor", js.undefined)
    
    inline def setItemBackgroundColor(value: String): Self = StObject.set(x, "itemBackgroundColor", value.asInstanceOf[js.Any])
    
    inline def setItemBackgroundColorOnHover(value: String): Self = StObject.set(x, "itemBackgroundColorOnHover", value.asInstanceOf[js.Any])
    
    inline def setItemBackgroundColorOnHoverUndefined: Self = StObject.set(x, "itemBackgroundColorOnHover", js.undefined)
    
    inline def setItemBackgroundColorUndefined: Self = StObject.set(x, "itemBackgroundColor", js.undefined)
  }
}
