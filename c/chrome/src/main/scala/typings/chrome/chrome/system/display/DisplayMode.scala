package typings.chrome.chrome.system.display

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
    val __obj = js.Dynamic.literal(deviceScaleFactor = deviceScaleFactor.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], heightInNativePixels = heightInNativePixels.asInstanceOf[js.Any], isNative = isNative.asInstanceOf[js.Any], isSelected = isSelected.asInstanceOf[js.Any], refreshRate = refreshRate.asInstanceOf[js.Any], uiScale = uiScale.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], widthInNativePixels = widthInNativePixels.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DisplayMode]
  }
}

