package typings.chromeApps.chrome.accessibilityFeatures

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccessibilityFeaturesCallbackArg extends js.Object {
  /** Whether the effective value is specific to the incognito session. This property will only be present if the incognito property in the details parameter of get() was true.  */
  var incognitoSpecific: js.UndefOr[Boolean] = js.native
  /**
    * One of
    * • not_controllable: cannot be controlled by any extension
    * • controlled_by_other_extensions: controlled by extensions with higher precedence
    * • controllable_by_this_extension: can be controlled by this app
    * • controlled_by_this_extension: controlled by this app
    */
  var levelOfControl: LevelOfControl = js.native
  /** The value of the setting. */
  var value: js.Any = js.native
}

object AccessibilityFeaturesCallbackArg {
  @scala.inline
  def apply(levelOfControl: LevelOfControl, value: js.Any): AccessibilityFeaturesCallbackArg = {
    val __obj = js.Dynamic.literal(levelOfControl = levelOfControl.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessibilityFeaturesCallbackArg]
  }
  @scala.inline
  implicit class AccessibilityFeaturesCallbackArgOps[Self <: AccessibilityFeaturesCallbackArg] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setLevelOfControl(value: LevelOfControl): Self = this.set("levelOfControl", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def setIncognitoSpecific(value: Boolean): Self = this.set("incognitoSpecific", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncognitoSpecific: Self = this.set("incognitoSpecific", js.undefined)
  }
  
}

