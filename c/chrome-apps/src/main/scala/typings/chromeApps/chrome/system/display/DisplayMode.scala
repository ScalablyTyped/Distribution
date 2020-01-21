package typings.chromeApps.chrome.system.display

import typings.chromeApps.chrome.double
import typings.chromeApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @since Chrome 52
  */
trait DisplayMode extends js.Object {
  /** The display mode device scale factor. */
  var deviceScaleFactor: integer
  /** The display mode height in device independent (user visible) pixels. */
  var height: integer
  /** The display mode height in native pixels. */
  var heightInNativePixels: integer
  /** True if the mode is the display's native mode. */
  var isNative: Boolean
  /** True if the display mode is currently selected. */
  var isSelected: Boolean
  /**
    * The display mode refresh rate in hertz.
    * @since Chrome 67
    */
  var refreshRate: double
  /**
    * @deprecated Deprecated since Chrome 70. Use `displayZoomFactor`
    * @description The display mode UI scale factor.
    **/
  var uiScale: integer
  /** The display mode width in device independent (user visible) pixels. */
  var width: integer
  /** The display mode width in native pixels. */
  var widthInNativePixels: integer
}

object DisplayMode {
  @scala.inline
  def apply(
    deviceScaleFactor: integer,
    height: integer,
    heightInNativePixels: integer,
    isNative: Boolean,
    isSelected: Boolean,
    refreshRate: double,
    uiScale: integer,
    width: integer,
    widthInNativePixels: integer
  ): DisplayMode = {
    val __obj = js.Dynamic.literal(deviceScaleFactor = deviceScaleFactor.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], heightInNativePixels = heightInNativePixels.asInstanceOf[js.Any], isNative = isNative.asInstanceOf[js.Any], isSelected = isSelected.asInstanceOf[js.Any], refreshRate = refreshRate.asInstanceOf[js.Any], uiScale = uiScale.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], widthInNativePixels = widthInNativePixels.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DisplayMode]
  }
}

