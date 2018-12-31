package typings
package chromeDashAppsLib.chromeNs.virtualKeyboardNs

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
  var autoCompleteEnabled: js.UndefOr[scala.Boolean] = js.undefined
  /** Whether virtual keyboards can provide auto-correct. */
  var autoCorrectEnabled: js.UndefOr[scala.Boolean] = js.undefined
  /** Whether virtual keyboards can provide input via handwriting recognition. */
  var handwritingEnabled: js.UndefOr[scala.Boolean] = js.undefined
  /** Whether virtual keyboards can provide spell-check. */
  var spellCheckEnabled: js.UndefOr[scala.Boolean] = js.undefined
  /** Whether virtual keyboards can provide voice input. */
  var voiceInputEnabled: js.UndefOr[scala.Boolean] = js.undefined
}

