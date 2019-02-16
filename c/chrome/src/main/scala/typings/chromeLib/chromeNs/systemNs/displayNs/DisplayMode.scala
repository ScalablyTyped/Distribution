package typings
package chromeLib.chromeNs.systemNs.displayNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DisplayMode extends js.Object {
  /** The display mode device scale factor. */
  var deviceScaleFactor: scala.Double
  /** The display mode height in device independent (user visible) pixels. */
  var height: scala.Double
  /** The display mode height in native pixels. */
  var heightInNativePixels: scala.Double
  /** True if the mode is the display's native mode. */
  var isNative: scala.Boolean
  /** True if the display mode is currently selected. */
  var isSelected: scala.Boolean
  /**
    * The display mode refresh rate in hertz.
    * @since Chrome 67
    */
  var refreshRate: scala.Double
  /**
    * @deprecated Deprecated since Chrome 70. Use `displayZoomFactor`
    * @description The display mode UI scale factor.
    **/
  var uiScale: scala.Double
  /** The display mode width in device independent (user visible) pixels. */
  var width: scala.Double
  /** The display mode width in native pixels. */
  var widthInNativePixels: scala.Double
}

