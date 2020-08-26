package typings.chromeApps.chrome.virtualKeyboard

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Determines whether advanced virtual keyboard features should be enabled or not.
  * They are enabled by default.
  *
  * On **Chrome 58** all properties are expected to have the same value.
  *
  * From **Chrome 63** the properties can be distinct and are optional.
  * If omitted, the current value is preserved.
  */
@js.native
trait FeatureRestrictions extends js.Object {
  /** Whether virtual keyboards can provide auto-complete. */
  var autoCompleteEnabled: js.UndefOr[Boolean] = js.native
  /** Whether virtual keyboards can provide auto-correct. */
  var autoCorrectEnabled: js.UndefOr[Boolean] = js.native
  /** Whether virtual keyboards can provide input via handwriting recognition. */
  var handwritingEnabled: js.UndefOr[Boolean] = js.native
  /** Whether virtual keyboards can provide spell-check. */
  var spellCheckEnabled: js.UndefOr[Boolean] = js.native
  /** Whether virtual keyboards can provide voice input. */
  var voiceInputEnabled: js.UndefOr[Boolean] = js.native
}

object FeatureRestrictions {
  @scala.inline
  def apply(): FeatureRestrictions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FeatureRestrictions]
  }
  @scala.inline
  implicit class FeatureRestrictionsOps[Self <: FeatureRestrictions] (val x: Self) extends AnyVal {
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
    def setAutoCompleteEnabled(value: Boolean): Self = this.set("autoCompleteEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoCompleteEnabled: Self = this.set("autoCompleteEnabled", js.undefined)
    @scala.inline
    def setAutoCorrectEnabled(value: Boolean): Self = this.set("autoCorrectEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoCorrectEnabled: Self = this.set("autoCorrectEnabled", js.undefined)
    @scala.inline
    def setHandwritingEnabled(value: Boolean): Self = this.set("handwritingEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHandwritingEnabled: Self = this.set("handwritingEnabled", js.undefined)
    @scala.inline
    def setSpellCheckEnabled(value: Boolean): Self = this.set("spellCheckEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpellCheckEnabled: Self = this.set("spellCheckEnabled", js.undefined)
    @scala.inline
    def setVoiceInputEnabled(value: Boolean): Self = this.set("voiceInputEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVoiceInputEnabled: Self = this.set("voiceInputEnabled", js.undefined)
  }
  
}

