package typings
package chromeLib.chromeNs.typesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChromeSetting extends js.Object {
  /** Fired after the setting changes. */
  var onChange: ChromeSettingChangedEvent = js.native
  /**
           * Clears the setting, restoring any default value.
           * @param details Which setting to clear.
           * @param callback Optional. Called at the completion of the clear operation.
           */
  def clear(details: ChromeSettingClearDetails): scala.Unit = js.native
  /**
           * Clears the setting, restoring any default value.
           * @param details Which setting to clear.
           * @param callback Optional. Called at the completion of the clear operation.
           */
  def clear(details: ChromeSettingClearDetails, callback: js.Function): scala.Unit = js.native
  /**
           * Gets the value of a setting.
           * @param details Which setting to consider.
           */
  def get(details: ChromeSettingGetDetails): scala.Unit = js.native
  /**
           * Gets the value of a setting.
           * @param details Which setting to consider.
           */
  def get(details: ChromeSettingGetDetails, callback: DetailsCallback): scala.Unit = js.native
  /**
           * Sets the value of a setting.
           * @param details Which setting to change.
           * @param callback Optional. Called at the completion of the set operation.
           */
  def set(details: ChromeSettingSetDetails): scala.Unit = js.native
  /**
           * Sets the value of a setting.
           * @param details Which setting to change.
           * @param callback Optional. Called at the completion of the set operation.
           */
  def set(details: ChromeSettingSetDetails, callback: js.Function): scala.Unit = js.native
}

