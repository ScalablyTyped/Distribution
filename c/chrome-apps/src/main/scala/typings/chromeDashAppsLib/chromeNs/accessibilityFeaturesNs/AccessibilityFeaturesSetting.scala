package typings
package chromeDashAppsLib.chromeNs.accessibilityFeaturesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccessibilityFeaturesSetting extends js.Object {
  /**
    * Clears the setting, restoring any default value.
    * @param details Which setting to clear.
    * @param callback Called at the completion of the clear operation.
    * If you specify the callback parameter, it should be a function that looks like this:
    * function() {...};
    */
  def clear(details: AccessibilityFeaturesClearArg): scala.Unit = js.native
  def clear(details: AccessibilityFeaturesClearArg, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
    * Gets the value of a setting.
    * @param details Which setting to consider.
    * @param callback The callback parameter should be a function that looks like this:
    * function(object details) {...};
    */
  def get(
    details: AccessibilityFeaturesGetArg,
    callback: js.Function1[/* details */ AccessibilityFeaturesCallbackArg, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Sets the value of a setting.
    * @param details Which setting to change.
    * @param callback Called at the completion of the set operation.
    * If you specify the callback parameter, it should be a function that looks like this:
    * function() {...};
    */
  def set(details: AccessibilityFeaturesSetArg): scala.Unit = js.native
  def set(details: AccessibilityFeaturesSetArg, callback: js.Function0[scala.Unit]): scala.Unit = js.native
}

