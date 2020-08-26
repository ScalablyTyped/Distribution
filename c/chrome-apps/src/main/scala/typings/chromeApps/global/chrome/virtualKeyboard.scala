package typings.chromeApps.global.chrome

import typings.chromeApps.chrome.virtualKeyboard.FeatureRestrictions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// #endregion
// #region chrome.virtualKeyboard
//////////////////////
// Virtual Keyboard //
//////////////////////
/**
  * @requires(CrOS Kiosk) Important: This API works only in Chrome OS apps.
  * @requires Permissions: 'virtualKeyboard'
  * @since Chrome 58
  * @description
  * The *chrome.virtualKeybaord* API is a kiosk only API used
  * to configure virtual keyboard layout and behavior in kiosk sessions.
  */
@JSGlobal("chrome.virtualKeyboard")
@js.native
object virtualKeyboard extends js.Object {
  /**
    * Sets restrictions on features provided by the virtual keyboard.
    * @param restrictions the preferences to enabled/disabled virtual keyboard features.
    * @param [callback] Invoked with the values which were updated.
    */
  def restrictFeatures(restrictions: FeatureRestrictions): Unit = js.native
  def restrictFeatures(restrictions: FeatureRestrictions, callback: js.Function1[/* update */ FeatureRestrictions, Unit]): Unit = js.native
}

