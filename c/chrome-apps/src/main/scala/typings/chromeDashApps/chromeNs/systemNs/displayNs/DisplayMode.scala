package typings.chromeDashApps.chromeNs.systemNs.displayNs

import typings.chromeDashApps.chromeNs.double
import typings.chromeDashApps.chromeNs.integer
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
    val __obj = js.Dynamic.literal(deviceScaleFactor = deviceScaleFactor, height = height, heightInNativePixels = heightInNativePixels, isNative = isNative, isSelected = isSelected, refreshRate = refreshRate, uiScale = uiScale, width = width, widthInNativePixels = widthInNativePixels)
  
    __obj.asInstanceOf[DisplayMode]
  }
}

