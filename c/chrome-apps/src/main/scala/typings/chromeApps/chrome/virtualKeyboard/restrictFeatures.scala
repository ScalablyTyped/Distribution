package typings.chromeApps.chrome.virtualKeyboard

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.virtualKeyboard.restrictFeatures")
@js.native
object restrictFeatures extends js.Object {
  /**
    * Sets restrictions on features provided by the virtual keyboard.
    * @param restrictions the preferences to enabled/disabled virtual keyboard features.
    * @param [callback] Invoked with the values which were updated.
    */
  def apply(restrictions: FeatureRestrictions): Unit = js.native
  def apply(restrictions: FeatureRestrictions, callback: js.Function1[/* update */ FeatureRestrictions, Unit]): Unit = js.native
}

