package typings.chromeApps.chrome.system.display

import typings.chromeApps.chrome.double
import typings.chromeApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @since Chrome 52
  */
@js.native
trait DisplayMode extends js.Object {
  
  /** The display mode device scale factor. */
  var deviceScaleFactor: integer = js.native
  
  /** The display mode height in device independent (user visible) pixels. */
  var height: integer = js.native
  
  /** The display mode height in native pixels. */
  var heightInNativePixels: integer = js.native
  
  /** True if the mode is the display's native mode. */
  var isNative: Boolean = js.native
  
  /** True if the display mode is currently selected. */
  var isSelected: Boolean = js.native
  
  /**
    * The display mode refresh rate in hertz.
    * @since Chrome 67
    */
  var refreshRate: double = js.native
  
  /**
    * @deprecated Deprecated since Chrome 70. Use `displayZoomFactor`
    * @description The display mode UI scale factor.
    **/
  var uiScale: integer = js.native
  
  /** The display mode width in device independent (user visible) pixels. */
  var width: integer = js.native
  
  /** The display mode width in native pixels. */
  var widthInNativePixels: integer = js.native
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
  
  @scala.inline
  implicit class DisplayModeOps[Self <: DisplayMode] (val x: Self) extends AnyVal {
    
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
    def setDeviceScaleFactor(value: integer): Self = this.set("deviceScaleFactor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: integer): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightInNativePixels(value: integer): Self = this.set("heightInNativePixels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsNative(value: Boolean): Self = this.set("isNative", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSelected(value: Boolean): Self = this.set("isSelected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefreshRate(value: double): Self = this.set("refreshRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUiScale(value: integer): Self = this.set("uiScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: integer): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthInNativePixels(value: integer): Self = this.set("widthInNativePixels", value.asInstanceOf[js.Any])
  }
}
