package typings.chromeApps.global.chrome

import typings.chromeApps.chrome.virtualKeyboard.FeatureRestrictions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
object virtualKeyboard {
  
  /**
    * Sets restrictions on features provided by the virtual keyboard.
    * @param restrictions the preferences to enabled/disabled virtual keyboard features.
    * @param [callback] Invoked with the values which were updated.
    */
  @JSGlobal("chrome.virtualKeyboard.restrictFeatures")
  @js.native
  def restrictFeatures(restrictions: FeatureRestrictions): Unit = js.native
  @JSGlobal("chrome.virtualKeyboard.restrictFeatures")
  @js.native
  def restrictFeatures(restrictions: FeatureRestrictions, callback: js.Function1[/* update */ FeatureRestrictions, Unit]): Unit = js.native
}
