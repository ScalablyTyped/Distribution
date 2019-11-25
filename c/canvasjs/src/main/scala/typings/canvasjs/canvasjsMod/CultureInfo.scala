package typings.canvasjs.canvasjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CultureInfo extends js.Object {
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
  def apply(
    days: js.Array[String] = null,
    decimalSeparator: String = null,
    digitGroupSeparator: String = null,
    menuText: String = null,
    months: js.Array[String] = null,
    panText: String = null,
    resetText: String = null,
    saveJPGText: String = null,
    savePNGText: String = null,
    shortDays: js.Array[String] = null,
    shortMonths: js.Array[String] = null,
    zoomText: String = null
  ): CultureInfo = {
    val __obj = js.Dynamic.literal()
    if (days != null) __obj.updateDynamic("days")(days.asInstanceOf[js.Any])
    if (decimalSeparator != null) __obj.updateDynamic("decimalSeparator")(decimalSeparator.asInstanceOf[js.Any])
    if (digitGroupSeparator != null) __obj.updateDynamic("digitGroupSeparator")(digitGroupSeparator.asInstanceOf[js.Any])
    if (menuText != null) __obj.updateDynamic("menuText")(menuText.asInstanceOf[js.Any])
    if (months != null) __obj.updateDynamic("months")(months.asInstanceOf[js.Any])
    if (panText != null) __obj.updateDynamic("panText")(panText.asInstanceOf[js.Any])
    if (resetText != null) __obj.updateDynamic("resetText")(resetText.asInstanceOf[js.Any])
    if (saveJPGText != null) __obj.updateDynamic("saveJPGText")(saveJPGText.asInstanceOf[js.Any])
    if (savePNGText != null) __obj.updateDynamic("savePNGText")(savePNGText.asInstanceOf[js.Any])
    if (shortDays != null) __obj.updateDynamic("shortDays")(shortDays.asInstanceOf[js.Any])
    if (shortMonths != null) __obj.updateDynamic("shortMonths")(shortMonths.asInstanceOf[js.Any])
    if (zoomText != null) __obj.updateDynamic("zoomText")(zoomText.asInstanceOf[js.Any])
    __obj.asInstanceOf[CultureInfo]
  }
}

