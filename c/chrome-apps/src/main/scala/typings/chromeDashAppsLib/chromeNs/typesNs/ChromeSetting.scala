package typings
package chromeDashAppsLib.chromeNs.typesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface that allows access to a Chrome browser setting. See accessibilityFeatures for an example. */
@js.native
trait ChromeSetting extends js.Object {
  /** Fired after the setting changes. */
  var onChange: ChromeSettingChangedEvent = js.native
  /**
    * Clears the setting, restoring any default value.
    * @param details Which setting to clear.
    * @param callback Called at the completion of the clear operation.
    */
  def clear(details: ChromeSettingClearDetails): scala.Unit = js.native
  def clear(details: ChromeSettingClearDetails, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
    * Gets the value of a setting.
    * @param details Which setting to consider.
    */
  def get(details: ChromeSettingGetDetails): scala.Unit = js.native
  def get(details: ChromeSettingGetDetails, callback: DetailsCallback): scala.Unit = js.native
  /**
    * Sets the value of a setting.
    * @param details Which setting to change.
    * @param callback Called at the completion of the set operation.
    */
  def set(details: ChromeSettingSetDetails): scala.Unit = js.native
  def set(details: ChromeSettingSetDetails, callback: js.Function0[scala.Unit]): scala.Unit = js.native
}

