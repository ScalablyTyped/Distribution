package typings.canvasjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CultureInfo extends js.Object {
  /**
    * Day names starting from Sunday. Should be exactly 7 in total.
    * Default: [“Sunday”, “Monday”, “Tuesday”, “Wednesday”, “Thursday”, “Friday”, “Saturday”]
    * Example: [“domingo”, “lunes”, “martes”, “miércoles”, “jueves”, “viernes”, “sábado”]
    */
  var days: js.UndefOr[js.Array[String]] = js.native
  /**
    * Character used to separate fractional part from the whole number.
    * Default: "."
    * Example: “.“ ”,”
    */
  var decimalSeparator: js.UndefOr[String] = js.native
  /**
    * Also referred to as Thousand Separator.
    * Default: “,”
    * Example: “,”, “.”
    */
  var digitGroupSeparator: js.UndefOr[String] = js.native
  /**
    * Tool Tip for Menu Button.
    * Default: “More Options”
    * Example: “More Options”, etc
    */
  var menuText: js.UndefOr[String] = js.native
  /**
    * Month Names starting from January.
    * Default: [“January”, “February”, “March”, “April”, “May”, “June”, “July”, “August”, “September”, “October”, “November”, “December”]
    * Example: [“January”, “February”, “March”, “April”, “May”, “June”, “July”, “August”, “September”, “October”, “November”, “December”]
    */
  var months: js.UndefOr[js.Array[String]] = js.native
  /**
    * Text is shown inside the Button till v1.4
    * v1.5 onwards Text is shown as tooltip.
    * Default: “Pan”
    * Example: “pan”, etc
    */
  var panText: js.UndefOr[String] = js.native
  /**
    * Text is shown inside the Button till v1.4
    * v1.5 onwards Text is shown as tooltip.
    * Default: “Reset”
    * Example: “reset”, etc
    */
  var resetText: js.UndefOr[String] = js.native
  /**
    * Set text is shown instead of Save as JPG.
    * Default: “Save as JPG”
    * Example: “save as jpg”, etc
    */
  var saveJPGText: js.UndefOr[String] = js.native
  /**
    * Set text is shown instead of Save as PNG.
    * Default: “Save as PNG”
    * Example: “save as png”, etc
    */
  var savePNGText: js.UndefOr[String] = js.native
  /**
    * Short Day names starting from Sunday. Should be exactly 7 in total.
    * Default: [“Sun”, “Mon”, “Tue”, “Wed”, “Thu”, “Fri”, “Sat”]
    * Example: [“Sun”, “Mon”, “Tue”, “Wed”, “Thu”, “Fri”, “Sat”]
    */
  var shortDays: js.UndefOr[js.Array[String]] = js.native
  /**
    * Short Month Names starting from January.
    * Default: [“Jan”, “Feb”, “Mar”, “Apr”, “May”, “Jun”, “Jul”, “Aug”, “Sep”, “Oct”, “Nov”, “Dec”]
    * Example: [“Jan”, “Feb”, “Mar”, “Apr”, “May”, “Jun”, “Jul”, “Aug”, “Sep”, “Oct”, “Nov”, “Dec”]
    */
  var shortMonths: js.UndefOr[js.Array[String]] = js.native
  /**
    * Text is shown inside the Button till v1.4
    * v1.5 onwards Text is shown as tooltip.
    * Default: "Zoom"
    * Example: “zoom”, etc
    */
  var zoomText: js.UndefOr[String] = js.native
}

object CultureInfo {
  @scala.inline
  def apply(): CultureInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CultureInfo]
  }
  @scala.inline
  implicit class CultureInfoOps[Self <: CultureInfo] (val x: Self) extends AnyVal {
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
    def setDaysVarargs(value: String*): Self = this.set("days", js.Array(value :_*))
    @scala.inline
    def setDays(value: js.Array[String]): Self = this.set("days", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDays: Self = this.set("days", js.undefined)
    @scala.inline
    def setDecimalSeparator(value: String): Self = this.set("decimalSeparator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDecimalSeparator: Self = this.set("decimalSeparator", js.undefined)
    @scala.inline
    def setDigitGroupSeparator(value: String): Self = this.set("digitGroupSeparator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDigitGroupSeparator: Self = this.set("digitGroupSeparator", js.undefined)
    @scala.inline
    def setMenuText(value: String): Self = this.set("menuText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMenuText: Self = this.set("menuText", js.undefined)
    @scala.inline
    def setMonthsVarargs(value: String*): Self = this.set("months", js.Array(value :_*))
    @scala.inline
    def setMonths(value: js.Array[String]): Self = this.set("months", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMonths: Self = this.set("months", js.undefined)
    @scala.inline
    def setPanText(value: String): Self = this.set("panText", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePanText: Self = this.set("panText", js.undefined)
    @scala.inline
    def setResetText(value: String): Self = this.set("resetText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResetText: Self = this.set("resetText", js.undefined)
    @scala.inline
    def setSaveJPGText(value: String): Self = this.set("saveJPGText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSaveJPGText: Self = this.set("saveJPGText", js.undefined)
    @scala.inline
    def setSavePNGText(value: String): Self = this.set("savePNGText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSavePNGText: Self = this.set("savePNGText", js.undefined)
    @scala.inline
    def setShortDaysVarargs(value: String*): Self = this.set("shortDays", js.Array(value :_*))
    @scala.inline
    def setShortDays(value: js.Array[String]): Self = this.set("shortDays", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShortDays: Self = this.set("shortDays", js.undefined)
    @scala.inline
    def setShortMonthsVarargs(value: String*): Self = this.set("shortMonths", js.Array(value :_*))
    @scala.inline
    def setShortMonths(value: js.Array[String]): Self = this.set("shortMonths", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShortMonths: Self = this.set("shortMonths", js.undefined)
    @scala.inline
    def setZoomText(value: String): Self = this.set("zoomText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZoomText: Self = this.set("zoomText", js.undefined)
  }
  
}

