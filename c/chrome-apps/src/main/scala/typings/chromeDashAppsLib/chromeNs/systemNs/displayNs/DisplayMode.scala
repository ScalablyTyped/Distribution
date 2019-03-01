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

object DisplayMode {
  @scala.inline
  def apply(
    deviceScaleFactor: chromeDashAppsLib.chromeNs.integer,
    height: chromeDashAppsLib.chromeNs.integer,
    heightInNativePixels: chromeDashAppsLib.chromeNs.integer,
    isNative: scala.Boolean,
    isSelected: scala.Boolean,
    refreshRate: chromeDashAppsLib.chromeNs.double,
    uiScale: chromeDashAppsLib.chromeNs.integer,
    width: chromeDashAppsLib.chromeNs.integer,
    widthInNativePixels: chromeDashAppsLib.chromeNs.integer
  ): DisplayMode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("deviceScaleFactor")(deviceScaleFactor)
    __obj.updateDynamic("height")(height)
    __obj.updateDynamic("heightInNativePixels")(heightInNativePixels)
    __obj.updateDynamic("isNative")(isNative)
    __obj.updateDynamic("isSelected")(isSelected)
    __obj.updateDynamic("refreshRate")(refreshRate)
    __obj.updateDynamic("uiScale")(uiScale)
    __obj.updateDynamic("width")(width)
    __obj.updateDynamic("widthInNativePixels")(widthInNativePixels)
    __obj.asInstanceOf[DisplayMode]
  }
}

