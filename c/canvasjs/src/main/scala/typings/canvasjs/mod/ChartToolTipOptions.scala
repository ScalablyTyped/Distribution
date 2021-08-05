package typings.canvasjs.mod

import typings.canvasjs.anon.Entries
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChartToolTipOptions extends StObject {
  
  /**
    * While mouse hovers from one dataPoint to another there is a smooth transition in toolTip.
    * This effect can be controlled by animationEnabled Property. Setting it to false, will disable the animation and toolTip will directly switch from one dataPoint to the other.
    * Default: True
    * Example: True, False
    */
  var animationEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Sets the background color of toolTip. Values can be “HTML Color Name” or “hex” code.
    * Default: white
    * Example: “red”, “#FF0000” ..
    */
  var backgroundColor: js.UndefOr[String] = js.undefined
  
  /**
    * Sets the border color around Tool Tip. When not set it takes the color of corresponding dataSeries or dataPoint.
    * Default: dataSeries color/ dataPoint color
    * Example: "red", "#808080"..
    */
  var borderColor: js.UndefOr[String] = js.undefined
  
  /**
    * Sets the thickness of border around the toolTip in pixels. To display border around toolTip, set the borderThickness to a number greater than zero. Setting it to zero removes the border.
    * Default: 2
    * Example: 2,4 ..
    */
  var borderThickness: js.UndefOr[Double] = js.undefined
  
  /**
    * toolTip for entire chart can be set by adding content at toolTip object.
    * content can either be a string or a custom function that returns HTML/String to be displayed inside the toolTip.
    * Default: auto
    */
  var content: js.UndefOr[String] = js.undefined
  
  /**
    * A custom formatter function that returns the content (text/html) to be displayed inside the toolTip.
    */
  var contentFormatter: js.UndefOr[js.Function1[/* e */ Entries, String]] = js.undefined
  
  /**
    * Setting a value higher than 0 makes the corners of toolTip rounded. Higher the value, more rounded the corners are.
    * Default: 5
    * Options: 2,3,8 ..
    */
  var cornerRadius: js.UndefOr[Double] = js.undefined
  
  /**
    * Enables or Disables the toolTip for the chart.
    * Default: True
    * Example: True, False
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Sets the Font Color of toolTipContent. The value of fontColor can be a “HTML Color Name” or “hex” code.
    * Default: “black”
    * Example: “red”, “#FAC003″ ..
    */
  var fontColor: js.UndefOr[String] = js.undefined
  
  /**
    * Sets the Font Family of ToolTip Content.
    * Default: “Calibri, Arial, Georgia, serif”
    * Example: “arial” , “tahoma”, “verdana” ..
    */
  var fontFamily: js.UndefOr[String] = js.undefined
  
  /**
    * Sets the font Size of ToolTip Content in pixels.
    * Default: 14
    * Example: 16,18,22 ..
    */
  var fontSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Sets the Font Style of ToolTip Content. It can be set to one of the below options.
    * Default: “italic”
    * Example: “normal”, “italic” , “oblique”
    */
  var fontStyle: js.UndefOr[String] = js.undefined
  
  /**
    * Set the font Weight of ToolTip Content.
    * Default: “normal”
    * Example: “lighter”, “normal”, “bold” , “bolder”
    */
  var fontWeight: js.UndefOr[String] = js.undefined
  
  /**
    * Reverses the order in which items inside toolTip are shown.
    * Default: false
    * Example: true, false
    */
  var reversed: js.UndefOr[Boolean] = js.undefined
  
  /**
    * In a Multi-Series or a Combination Chart, it is often required to display all values common to x value in a single bubble.
    * Setting shared to true will show in a common bubble all the values of y from each series next to their name.
    * Default: True
    * Example: True, False
    */
  var shared: js.UndefOr[Boolean] = js.undefined
}
object ChartToolTipOptions {
  
  inline def apply(): ChartToolTipOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartToolTipOptions]
  }
  
  extension [Self <: ChartToolTipOptions](x: Self) {
    
    inline def setAnimationEnabled(value: Boolean): Self = StObject.set(x, "animationEnabled", value.asInstanceOf[js.Any])
    
    inline def setAnimationEnabledUndefined: Self = StObject.set(x, "animationEnabled", js.undefined)
    
    inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    inline def setBorderColor(value: String): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    inline def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
    
    inline def setBorderThickness(value: Double): Self = StObject.set(x, "borderThickness", value.asInstanceOf[js.Any])
    
    inline def setBorderThicknessUndefined: Self = StObject.set(x, "borderThickness", js.undefined)
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentFormatter(value: /* e */ Entries => String): Self = StObject.set(x, "contentFormatter", js.Any.fromFunction1(value))
    
    inline def setContentFormatterUndefined: Self = StObject.set(x, "contentFormatter", js.undefined)
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setCornerRadius(value: Double): Self = StObject.set(x, "cornerRadius", value.asInstanceOf[js.Any])
    
    inline def setCornerRadiusUndefined: Self = StObject.set(x, "cornerRadius", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
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
    
    inline def setReversed(value: Boolean): Self = StObject.set(x, "reversed", value.asInstanceOf[js.Any])
    
    inline def setReversedUndefined: Self = StObject.set(x, "reversed", js.undefined)
    
    inline def setShared(value: Boolean): Self = StObject.set(x, "shared", value.asInstanceOf[js.Any])
    
    inline def setSharedUndefined: Self = StObject.set(x, "shared", js.undefined)
  }
}
