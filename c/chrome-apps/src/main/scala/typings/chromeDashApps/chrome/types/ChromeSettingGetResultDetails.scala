package typings.chromeDashApps.chrome.types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChromeSettingGetResultDetails extends js.Object {
  /**
    * Whether the effective value is specific to the incognito session.
    * This property will only be present if the incognito property in the details parameter of get() was true.
    */
  var incognitoSpecific: js.UndefOr[Boolean] = js.undefined
  /**
    * One of
    * • not_controllable: cannot be controlled by any extension
    * • controlled_by_other_extensions: controlled by extensions with higher precedence
    * • controllable_by_this_extension: can be controlled by this app
    * • controlled_by_this_extension: controlled by this app
    */
  var levelOfControl: String
  /** The value of the setting. */
  var value: js.Any
}

object ChromeSettingGetResultDetails {
  @scala.inline
  def apply(levelOfControl: String, value: js.Any, incognitoSpecific: js.UndefOr[Boolean] = js.undefined): ChromeSettingGetResultDetails = {
    val __obj = js.Dynamic.literal(levelOfControl = levelOfControl.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (!js.isUndefined(incognitoSpecific)) __obj.updateDynamic("incognitoSpecific")(incognitoSpecific.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChromeSettingGetResultDetails]
  }
}

