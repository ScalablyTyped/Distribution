package typings.chrome.chromeNs.systemNs.displayNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DisplayMode extends js.Object {
  /** The display mode device scale factor. */
  var deviceScaleFactor: Double
  /** The display mode height in device independent (user visible) pixels. */
  var height: Double
  /** The display mode height in native pixels. */
  var heightInNativePixels: Double
  /** True if the mode is the display's native mode. */
  var isNative: Boolean
  /** True if the display mode is currently selected. */
  var isSelected: Boolean
  /**
    * The display mode refresh rate in hertz.
    * @since Chrome 67
    */
  var refreshRate: Double
  /**
    * @deprecated Deprecated since Chrome 70. Use `displayZoomFactor`
    * @description The display mode UI scale factor.
    **/
  var uiScale: Double
  /** The display mode width in device independent (user visible) pixels. */
  var width: Double
  /** The display mode width in native pixels. */
  var widthInNativePixels: Double
}

object DisplayMode {
  @scala.inline
  def apply(
    deviceScaleFactor: Double,
    height: Double,
    heightInNativePixels: Double,
    isNative: Boolean,
    isSelected: Boolean,
    refreshRate: Double,
    uiScale: Double,
    width: Double,
    widthInNativePixels: Double
  ): DisplayMode = {
    val __obj = js.Dynamic.literal(deviceScaleFactor = deviceScaleFactor, height = height, heightInNativePixels = heightInNativePixels, isNative = isNative, isSelected = isSelected, refreshRate = refreshRate, uiScale = uiScale, width = width, widthInNativePixels = widthInNativePixels)
  
    __obj.asInstanceOf[DisplayMode]
  }
}

