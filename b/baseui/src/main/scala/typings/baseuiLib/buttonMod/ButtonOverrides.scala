package typings
package baseuiLib.buttonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ButtonOverrides extends js.Object {
  var BaseButton: js.UndefOr[baseuiLib.Override[_]] = js.undefined
  var EndEnhancer: js.UndefOr[baseuiLib.Override[_]] = js.undefined
  var LoadingSpinner: js.UndefOr[baseuiLib.Override[_]] = js.undefined
  var LoadingSpinnerContainer: js.UndefOr[baseuiLib.Override[_]] = js.undefined
  var StartEnhancer: js.UndefOr[baseuiLib.Override[_]] = js.undefined
}

object ButtonOverrides {
  @scala.inline
  def apply(
    BaseButton: baseuiLib.Override[_] = null,
    EndEnhancer: baseuiLib.Override[_] = null,
    LoadingSpinner: baseuiLib.Override[_] = null,
    LoadingSpinnerContainer: baseuiLib.Override[_] = null,
    StartEnhancer: baseuiLib.Override[_] = null
  ): ButtonOverrides = {
    val __obj = js.Dynamic.literal()
    if (BaseButton != null) __obj.updateDynamic("BaseButton")(BaseButton.asInstanceOf[js.Any])
    if (EndEnhancer != null) __obj.updateDynamic("EndEnhancer")(EndEnhancer.asInstanceOf[js.Any])
    if (LoadingSpinner != null) __obj.updateDynamic("LoadingSpinner")(LoadingSpinner.asInstanceOf[js.Any])
    if (LoadingSpinnerContainer != null) __obj.updateDynamic("LoadingSpinnerContainer")(LoadingSpinnerContainer.asInstanceOf[js.Any])
    if (StartEnhancer != null) __obj.updateDynamic("StartEnhancer")(StartEnhancer.asInstanceOf[js.Any])
    __obj.asInstanceOf[ButtonOverrides]
  }
}

