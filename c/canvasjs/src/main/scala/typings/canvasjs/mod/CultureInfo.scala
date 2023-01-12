package typings.canvasjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CultureInfo extends StObject {
  
  /**
    * Day names starting from Sunday. Should be exactly 7 in total.
    * Default: [“Sunday”, “Monday”, “Tuesday”, “Wednesday”, “Thursday”, “Friday”, “Saturday”]
    * Example: [“domingo”, “lunes”, “martes”, “miércoles”, “jueves”, “viernes”, “sábado”]
    */
  var days: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Character used to separate fractional part from the whole number.
    * Default: "."
    * Example: “.“ ”,”
    */
  var decimalSeparator: js.UndefOr[String] = js.undefined
  
  /**
    * Also referred to as Thousand Separator.
    * Default: “,”
    * Example: “,”, “.”
    */
  var digitGroupSeparator: js.UndefOr[String] = js.undefined
  
  /**
    * Tool Tip for Menu Button.
    * Default: “More Options”
    * Example: “More Options”, etc
    */
  var menuText: js.UndefOr[String] = js.undefined
  
  /**
    * Month Names starting from January.
    * Default: [“January”, “February”, “March”, “April”, “May”, “June”, “July”, “August”, “September”, “October”, “November”, “December”]
    * Example: [“January”, “February”, “March”, “April”, “May”, “June”, “July”, “August”, “September”, “October”, “November”, “December”]
    */
  var months: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Text is shown inside the Button till v1.4
    * v1.5 onwards Text is shown as tooltip.
    * Default: “Pan”
    * Example: “pan”, etc
    */
  var panText: js.UndefOr[String] = js.undefined
  
  /**
    * Text is shown inside the Button till v1.4
    * v1.5 onwards Text is shown as tooltip.
    * Default: “Reset”
    * Example: “reset”, etc
    */
  var resetText: js.UndefOr[String] = js.undefined
  
  /**
    * Set text is shown instead of Save as JPG.
    * Default: “Save as JPG”
    * Example: “save as jpg”, etc
    */
  var saveJPGText: js.UndefOr[String] = js.undefined
  
  /**
    * Set text is shown instead of Save as PNG.
    * Default: “Save as PNG”
    * Example: “save as png”, etc
    */
  var savePNGText: js.UndefOr[String] = js.undefined
  
  /**
    * Short Day names starting from Sunday. Should be exactly 7 in total.
    * Default: [“Sun”, “Mon”, “Tue”, “Wed”, “Thu”, “Fri”, “Sat”]
    * Example: [“Sun”, “Mon”, “Tue”, “Wed”, “Thu”, “Fri”, “Sat”]
    */
  var shortDays: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Short Month Names starting from January.
    * Default: [“Jan”, “Feb”, “Mar”, “Apr”, “May”, “Jun”, “Jul”, “Aug”, “Sep”, “Oct”, “Nov”, “Dec”]
    * Example: [“Jan”, “Feb”, “Mar”, “Apr”, “May”, “Jun”, “Jul”, “Aug”, “Sep”, “Oct”, “Nov”, “Dec”]
    */
  var shortMonths: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Text is shown inside the Button till v1.4
    * v1.5 onwards Text is shown as tooltip.
    * Default: "Zoom"
    * Example: “zoom”, etc
    */
  var zoomText: js.UndefOr[String] = js.undefined
}
object CultureInfo {
  
  inline def apply(): CultureInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CultureInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CultureInfo] (val x: Self) extends AnyVal {
    
    inline def setDays(value: js.Array[String]): Self = StObject.set(x, "days", value.asInstanceOf[js.Any])
    
    inline def setDaysUndefined: Self = StObject.set(x, "days", js.undefined)
    
    inline def setDaysVarargs(value: String*): Self = StObject.set(x, "days", js.Array(value*))
    
    inline def setDecimalSeparator(value: String): Self = StObject.set(x, "decimalSeparator", value.asInstanceOf[js.Any])
    
    inline def setDecimalSeparatorUndefined: Self = StObject.set(x, "decimalSeparator", js.undefined)
    
    inline def setDigitGroupSeparator(value: String): Self = StObject.set(x, "digitGroupSeparator", value.asInstanceOf[js.Any])
    
    inline def setDigitGroupSeparatorUndefined: Self = StObject.set(x, "digitGroupSeparator", js.undefined)
    
    inline def setMenuText(value: String): Self = StObject.set(x, "menuText", value.asInstanceOf[js.Any])
    
    inline def setMenuTextUndefined: Self = StObject.set(x, "menuText", js.undefined)
    
    inline def setMonths(value: js.Array[String]): Self = StObject.set(x, "months", value.asInstanceOf[js.Any])
    
    inline def setMonthsUndefined: Self = StObject.set(x, "months", js.undefined)
    
    inline def setMonthsVarargs(value: String*): Self = StObject.set(x, "months", js.Array(value*))
    
    inline def setPanText(value: String): Self = StObject.set(x, "panText", value.asInstanceOf[js.Any])
    
    inline def setPanTextUndefined: Self = StObject.set(x, "panText", js.undefined)
    
    inline def setResetText(value: String): Self = StObject.set(x, "resetText", value.asInstanceOf[js.Any])
    
    inline def setResetTextUndefined: Self = StObject.set(x, "resetText", js.undefined)
    
    inline def setSaveJPGText(value: String): Self = StObject.set(x, "saveJPGText", value.asInstanceOf[js.Any])
    
    inline def setSaveJPGTextUndefined: Self = StObject.set(x, "saveJPGText", js.undefined)
    
    inline def setSavePNGText(value: String): Self = StObject.set(x, "savePNGText", value.asInstanceOf[js.Any])
    
    inline def setSavePNGTextUndefined: Self = StObject.set(x, "savePNGText", js.undefined)
    
    inline def setShortDays(value: js.Array[String]): Self = StObject.set(x, "shortDays", value.asInstanceOf[js.Any])
    
    inline def setShortDaysUndefined: Self = StObject.set(x, "shortDays", js.undefined)
    
    inline def setShortDaysVarargs(value: String*): Self = StObject.set(x, "shortDays", js.Array(value*))
    
    inline def setShortMonths(value: js.Array[String]): Self = StObject.set(x, "shortMonths", value.asInstanceOf[js.Any])
    
    inline def setShortMonthsUndefined: Self = StObject.set(x, "shortMonths", js.undefined)
    
    inline def setShortMonthsVarargs(value: String*): Self = StObject.set(x, "shortMonths", js.Array(value*))
    
    inline def setZoomText(value: String): Self = StObject.set(x, "zoomText", value.asInstanceOf[js.Any])
    
    inline def setZoomTextUndefined: Self = StObject.set(x, "zoomText", js.undefined)
  }
}
