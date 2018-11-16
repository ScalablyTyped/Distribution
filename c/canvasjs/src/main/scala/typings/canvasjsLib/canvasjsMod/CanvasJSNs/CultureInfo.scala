package typings
package canvasjsLib.canvasjsMod.CanvasJSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait CultureInfo extends js.Object {
  /**
           * Day names starting from Sunday. Should be exactly 7 in total.
           * Default: [“Sunday”, “Monday”, “Tuesday”, “Wednesday”, “Thursday”, “Friday”, “Saturday”]
           * Example: [“domingo”, “lunes”, “martes”, “miércoles”, “jueves”, “viernes”, “sábado”]
           */
  var days: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
           * Character used to separate fractional part from the whole number.
           * Default: "."
           * Example: “.“ ”,”
           */
  var decimalSeparator: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Also referred to as Thousand Separator.
           * Default: “,”
           * Example: “,”, “.”
           */
  var digitGroupSeparator: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Tool Tip for Menu Button.
           * Default: “More Options”
           * Example: “More Options”, etc
           */
  var menuText: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Month Names starting from January.
           * Default: [“January”, “February”, “March”, “April”, “May”, “June”, “July”, “August”, “September”, “October”, “November”, “December”]
           * Example: [“January”, “February”, “March”, “April”, “May”, “June”, “July”, “August”, “September”, “October”, “November”, “December”]
           */
  var months: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
           * Text is shown inside the Button till v1.4
           * v1.5 onwards Text is shown as tooltip.
           * Default: “Pan”
           * Example: “pan”, etc
           */
  var panText: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Text is shown inside the Button till v1.4
           * v1.5 onwards Text is shown as tooltip.
           * Default: “Reset”
           * Example: “reset”, etc
           */
  var resetText: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Set text is shown instead of Save as JPG.
           * Default: “Save as JPG”
           * Example: “save as jpg”, etc
           */
  var saveJPGText: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Set text is shown instead of Save as PNG.
           * Default: “Save as PNG”
           * Example: “save as png”, etc
           */
  var savePNGText: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Short Day names starting from Sunday. Should be exactly 7 in total.
           * Default: [“Sun”, “Mon”, “Tue”, “Wed”, “Thu”, “Fri”, “Sat”]
           * Example: [“Sun”, “Mon”, “Tue”, “Wed”, “Thu”, “Fri”, “Sat”]
           */
  var shortDays: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
           * Short Month Names starting from January.
           * Default: [“Jan”, “Feb”, “Mar”, “Apr”, “May”, “Jun”, “Jul”, “Aug”, “Sep”, “Oct”, “Nov”, “Dec”]
           * Example: [“Jan”, “Feb”, “Mar”, “Apr”, “May”, “Jun”, “Jul”, “Aug”, “Sep”, “Oct”, “Nov”, “Dec”]
           */
  var shortMonths: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
           * Text is shown inside the Button till v1.4
           * v1.5 onwards Text is shown as tooltip.
           * Default: "Zoom"
           * Example: “zoom”, etc
           */
  var zoomText: js.UndefOr[java.lang.String] = js.undefined
}

