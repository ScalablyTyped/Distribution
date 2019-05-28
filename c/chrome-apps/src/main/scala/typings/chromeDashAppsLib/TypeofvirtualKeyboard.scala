package typings
package chromeDashAppsLib

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
  def restrictFeatures(restrictions: chromeDashAppsLib.chromeNs.virtualKeyboardNs.FeatureRestrictions): scala.Unit = js.native
  def restrictFeatures(
    restrictions: chromeDashAppsLib.chromeNs.virtualKeyboardNs.FeatureRestrictions,
    callback: js.Function1[
      /* update */ chromeDashAppsLib.chromeNs.virtualKeyboardNs.FeatureRestrictions, 
      scala.Unit
    ]
  ): scala.Unit = js.native
}

