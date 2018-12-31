package typings
package chromeDashAppsLib.chromeNs.systemNs.displayNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @since Chrome 52
  */
trait DisplayMode extends js.Object {
  /** The display mode device scale factor. */
  var deviceScaleFactor: chromeDashAppsLib.chromeNs.integer
  /** The display mode height in device independent (user visible) pixels. */
  var height: chromeDashAppsLib.chromeNs.integer
  /** The display mode height in native pixels. */
  var heightInNativePixels: chromeDashAppsLib.chromeNs.integer
  /** True if the mode is the display's native mode. */
  var isNative: scala.Boolean
  /** True if the display mode is currently selected. */
  var isSelected: scala.Boolean
  /**
    * The display mode refresh rate in hertz.
    * @since Chrome 67
    */
  var refreshRate: chromeDashAppsLib.chromeNs.double
  /**
    * @deprecated Deprecated since Chrome 70. Use `displayZoomFactor`
    * @description The display mode UI scale factor.
    **/
  var uiScale: chromeDashAppsLib.chromeNs.integer
  /** The display mode width in device independent (user visible) pixels. */
  var width: chromeDashAppsLib.chromeNs.integer
  /** The display mode width in native pixels. */
  var widthInNativePixels: chromeDashAppsLib.chromeNs.integer
}

