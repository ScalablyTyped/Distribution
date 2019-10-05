package typings.chromeDashApps

import typings.chromeDashApps.chrome.virtualKeyboard.FeatureRestrictions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofvirtualKeyboard extends js.Object {
  /**
    * Sets restrictions on features provided by the virtual keyboard.
    * @param restrictions the preferences to enabled/disabled virtual keyboard features.
    * @param [callback] Invoked with the values which were updated.
    */
  def restrictFeatures(restrictions: FeatureRestrictions): Unit = js.native
  def restrictFeatures(restrictions: FeatureRestrictions, callback: js.Function1[/* update */ FeatureRestrictions, Unit]): Unit = js.native
}

