package typings.chromeDashApps.chrome.virtualKeyboard

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
trait FeatureRestrictions extends js.Object {
  /** Whether virtual keyboards can provide auto-complete. */
  var autoCompleteEnabled: js.UndefOr[Boolean] = js.undefined
  /** Whether virtual keyboards can provide auto-correct. */
  var autoCorrectEnabled: js.UndefOr[Boolean] = js.undefined
  /** Whether virtual keyboards can provide input via handwriting recognition. */
  var handwritingEnabled: js.UndefOr[Boolean] = js.undefined
  /** Whether virtual keyboards can provide spell-check. */
  var spellCheckEnabled: js.UndefOr[Boolean] = js.undefined
  /** Whether virtual keyboards can provide voice input. */
  var voiceInputEnabled: js.UndefOr[Boolean] = js.undefined
}

object FeatureRestrictions {
  @scala.inline
  def apply(
    autoCompleteEnabled: js.UndefOr[Boolean] = js.undefined,
    autoCorrectEnabled: js.UndefOr[Boolean] = js.undefined,
    handwritingEnabled: js.UndefOr[Boolean] = js.undefined,
    spellCheckEnabled: js.UndefOr[Boolean] = js.undefined,
    voiceInputEnabled: js.UndefOr[Boolean] = js.undefined
  ): FeatureRestrictions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoCompleteEnabled)) __obj.updateDynamic("autoCompleteEnabled")(autoCompleteEnabled)
    if (!js.isUndefined(autoCorrectEnabled)) __obj.updateDynamic("autoCorrectEnabled")(autoCorrectEnabled)
    if (!js.isUndefined(handwritingEnabled)) __obj.updateDynamic("handwritingEnabled")(handwritingEnabled)
    if (!js.isUndefined(spellCheckEnabled)) __obj.updateDynamic("spellCheckEnabled")(spellCheckEnabled)
    if (!js.isUndefined(voiceInputEnabled)) __obj.updateDynamic("voiceInputEnabled")(voiceInputEnabled)
    __obj.asInstanceOf[FeatureRestrictions]
  }
}

