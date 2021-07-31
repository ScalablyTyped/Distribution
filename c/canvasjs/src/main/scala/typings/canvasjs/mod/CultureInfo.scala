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
  
  @scala.inline
  def apply(): CultureInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CultureInfo]
  }
  
  @scala.inline
  implicit class CultureInfoMutableBuilder[Self <: CultureInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDays(value: js.Array[String]): Self = StObject.set(x, "days", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDaysUndefined: Self = StObject.set(x, "days", js.undefined)
    
    @scala.inline
    def setDaysVarargs(value: String*): Self = StObject.set(x, "days", js.Array(value :_*))
    
    @scala.inline
    def setDecimalSeparator(value: String): Self = StObject.set(x, "decimalSeparator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecimalSeparatorUndefined: Self = StObject.set(x, "decimalSeparator", js.undefined)
    
    @scala.inline
    def setDigitGroupSeparator(value: String): Self = StObject.set(x, "digitGroupSeparator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDigitGroupSeparatorUndefined: Self = StObject.set(x, "digitGroupSeparator", js.undefined)
    
    @scala.inline
    def setMenuText(value: String): Self = StObject.set(x, "menuText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMenuTextUndefined: Self = StObject.set(x, "menuText", js.undefined)
    
    @scala.inline
    def setMonths(value: js.Array[String]): Self = StObject.set(x, "months", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonthsUndefined: Self = StObject.set(x, "months", js.undefined)
    
    @scala.inline
    def setMonthsVarargs(value: String*): Self = StObject.set(x, "months", js.Array(value :_*))
    
    @scala.inline
    def setPanText(value: String): Self = StObject.set(x, "panText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPanTextUndefined: Self = StObject.set(x, "panText", js.undefined)
    
    @scala.inline
    def setResetText(value: String): Self = StObject.set(x, "resetText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResetTextUndefined: Self = StObject.set(x, "resetText", js.undefined)
    
    @scala.inline
    def setSaveJPGText(value: String): Self = StObject.set(x, "saveJPGText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSaveJPGTextUndefined: Self = StObject.set(x, "saveJPGText", js.undefined)
    
    @scala.inline
    def setSavePNGText(value: String): Self = StObject.set(x, "savePNGText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSavePNGTextUndefined: Self = StObject.set(x, "savePNGText", js.undefined)
    
    @scala.inline
    def setShortDays(value: js.Array[String]): Self = StObject.set(x, "shortDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShortDaysUndefined: Self = StObject.set(x, "shortDays", js.undefined)
    
    @scala.inline
    def setShortDaysVarargs(value: String*): Self = StObject.set(x, "shortDays", js.Array(value :_*))
    
    @scala.inline
    def setShortMonths(value: js.Array[String]): Self = StObject.set(x, "shortMonths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShortMonthsUndefined: Self = StObject.set(x, "shortMonths", js.undefined)
    
    @scala.inline
    def setShortMonthsVarargs(value: String*): Self = StObject.set(x, "shortMonths", js.Array(value :_*))
    
    @scala.inline
    def setZoomText(value: String): Self = StObject.set(x, "zoomText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoomTextUndefined: Self = StObject.set(x, "zoomText", js.undefined)
  }
}
