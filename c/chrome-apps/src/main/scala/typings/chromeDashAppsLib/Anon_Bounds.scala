package typings
package chromeDashAppsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Bounds extends js.Object {
  val DisplayPosition: Anon_BOTTOM = js.native
  val MirrorMode: Anon_MIXED = js.native
  /**
    * Fired when anything changes to the display configuration.
    */
  val onDisplayChanged: chromeDashAppsLib.chromeNs.eventsNs.Event[js.Function0[scala.Unit]] = js.native
  /**
    * Resets the touch calibration for the display and brings it back to its default state by clearing any touch calibration data associated with the display.
    * @since Chrome 57
    * @param id The display's unique identifier.
    */
  def clearTouchCalibration(id: java.lang.String): scala.Unit = js.native
  /**
    * Sets the touch calibration pairs for a display.
    * These **pairs** would be used to calibrate the touch screen for display with **id** called in startCustomTouchCalibration().
    * Always call **startCustomTouchCalibration** before calling this method.
    * If another touch calibration is already in progress this will throw an error.
    * @since Chrome 57
    * @param pairs The pairs of point used to calibrate the display.
    * @param bounds Bounds of the display when the touch calibration was performed. |bounds.left| and |bounds.top| values are ignored.
    * @throws Error
    */
  def completeCustomTouchCalibration(
    pairs: chromeDashAppsLib.chromeNs.systemNs.displayNs.TouchCalibrationPairs,
    bounds: chromeDashAppsLib.chromeNs.systemNs.displayNs.Bounds
  ): scala.Unit = js.native
  /**
    * @requires(CrOS Kiosk apps | WebUI) This is only available to Chrome OS Kiosk apps and Web UI.
    * @description
    * Enables/disables the unified desktop feature.
    * Note that this simply enables the feature, but will not change the actual desktop mode.
    * (That is, if the desktop is in mirror mode, it will stay in mirror mode)
    * @since Chrome 46
    * @param {boolean} enabled True if unified desktop should be enabled.
    */
  def enableUnifiedDesktop(enabled: scala.Boolean): scala.Unit = js.native
  /**
    * @requires(CrOS Kiosk apps | WebUI) This is only available to Chrome OS Kiosk apps and Web UI.
    * @description Requests the layout info for all displays.
    * @since Chrome 53
    * @export
    * @param callback The callback to invoke with the results.
    */
  def getDisplayLayout(
    callback: js.Function1[
      /* layouts */ js.Array[chromeDashAppsLib.chromeNs.systemNs.displayNs.DisplayLayout], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
    * Requests the information for all attached display devices.
    * @param callback The callback to invoke with the results.
    */
  def getInfo(
    callback: js.Function1[
      /* info */ js.Array[chromeDashAppsLib.chromeNs.systemNs.displayNs.DisplayInfo], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
    * Requests the information for all attached display devices.
    * @since Chrome 59
    * @param flags Options affecting how the information is returned.
    * @param callback The callback to invoke with the results.
    */
  def getInfo(
    flags: chromeDashAppsLib.chromeNs.systemNs.displayNs.DisplayInfoFlags,
    callback: js.Function1[
      /* info */ js.Array[chromeDashAppsLib.chromeNs.systemNs.displayNs.DisplayInfo], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
    * Adjusts the current overscan insets for a display.
    * Typically this should etiher move the display along an axis (e.g. left+right have the same value)
    * or scale it along an axis (e.g. top+bottom have opposite values).
    * Each Adjust call is cumulative with previous calls since Start.
    * @since Chrome 53
    * @param id The display's unique identifier.
    * @param delta The amount to change the overscan insets.
    */
  def overscanCalibrationAdjust(id: java.lang.String, delta: chromeDashAppsLib.chromeNs.systemNs.displayNs.Insets): scala.Unit = js.native
  /**
    * Complete overscan adjustments for a display by saving the current values and hiding the overlay.
    * @since Chrome 53
    * @param id The display's unique identifier.
    */
  def overscanCalibrationComplete(id: java.lang.String): scala.Unit = js.native
  /**
    * Resets the overscan insets for a display to the last saved value (i.e before Start was called).
    * @since Chrome 53
    * @param id The display's unique identifier.
    */
  def overscanCalibrationReset(id: java.lang.String): scala.Unit = js.native
  /**
    * Starts overscan calibration for a display.
    * This will show an overlay on the screen indicating the current overscan insets.
    * If overscan calibration for display **id** is in progress this will reset calibration.
    * @since Chrome 53
    * @param id The display's unique identifier.
    */
  def overscanCalibrationStart(id: java.lang.String): scala.Unit = js.native
  /**
    * @requires(CrOS Kiosk apps | WebUI) This is only available to Chrome OS Kiosk apps and Web UI.
    * @description
    * Set the layout for all displays.
    * Any display not included will use the default layout.
    * If a layout would overlap or be otherwise invalid it will be adjusted to a valid layout.
    * After layout is resolved, an onDisplayChanged event will be triggered.
    * @since Chrome 53
    * @param layouts The layout information, required for all displays except the primary display.
    * @param callback Empty function called when the function finishes. To find out whether the function succeeded, runtime.lastError should be queried.
    */
  def setDisplayLayout(layouts: js.Array[chromeDashAppsLib.chromeNs.systemNs.displayNs.DisplayLayout]): scala.Unit = js.native
  def setDisplayLayout(
    layouts: js.Array[chromeDashAppsLib.chromeNs.systemNs.displayNs.DisplayLayout],
    callback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  /**
    * @requires(CrOS Kiosk apps | WebUI) This is only available to Chrome OS Kiosk apps and Web UI.
    * @description
    * Updates the properties for the display specified by **id**,
    * according to the information provided in **info**.
    * On failure, runtime.lastError will be set.
    * @param {string} id The display's unique identifier.
    * @param {DisplayPropertiesInfo} info The information about display properties that should be changed. A property will be changed only if a new value for it is specified in |info|.
    * @param {() => void} [callback] Empty function called when the function finishes. To find out whether the function succeeded, runtime.lastError should be queried.
    */
  def setDisplayProperties(id: java.lang.String, info: chromeDashAppsLib.chromeNs.systemNs.displayNs.DisplayPropertiesInfo): scala.Unit = js.native
  def setDisplayProperties(
    id: java.lang.String,
    info: chromeDashAppsLib.chromeNs.systemNs.displayNs.DisplayPropertiesInfo,
    callback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def setMirrorMode(
    info: chromeDashAppsLib.chromeNs.systemNs.displayNs.MirrorModeInfoMixed,
    callback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  /**
    * @requires(CrOS Kiosk app) Chrome OS Kiosk apps only
    * @since Chrome 65.
    * @description
    * Sets the display mode to the specified mirror mode.
    * Each call resets the state from previous calls.
    * Calling setDisplayProperties() will fail for the
    * mirroring destination displays.
    */
  def setMirrorMode(
    info: chromeDashAppsLib.chromeNs.systemNs.displayNs.MirrorModeInfo,
    callback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  /**
    * Displays the native touch calibration UX for the display with **id** as display id.
    * This will show an overlay on the screen with required instructions on how to proceed.
    * The callback will be invoked in case of successful calibraion only.
    * If the calibration fails, this will throw an error.
    * @since Chrome 57
    * @param id The display's unique identifier.
    * @param callback Optional callback to inform the caller that the touch calibration has ended. The argument of the callback informs if the calibration was a success or not.
    */
  def showNativeTouchCalibration(id: java.lang.String, callback: js.Function1[/* success */ scala.Boolean, scala.Unit]): scala.Unit = js.native
  /**
    * Starts custom touch calibration for a display.
    * This should be called when using a custom UX for collecting calibration data.
    * If another touch calibration is already in progress this will throw an error.
    * @since Chrome 57
    * @param id The display's unique identifier.
    */
  def startCustomTouchCalibration(id: java.lang.String): scala.Unit = js.native
}

