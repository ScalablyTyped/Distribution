package typings
package chromeDashAppsLib.chromeNs.runtimeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutomationNonInteractive extends _AutomationOptions {
  var desktop: js.UndefOr[chromeDashAppsLib.chromeDashAppsLibNumbers.`false`] = js.undefined
  var interact: chromeDashAppsLib.chromeDashAppsLibNumbers.`false`
  /** Patterns for matching, use chrome url pattern */
  var matches: js.UndefOr[js.Array[java.lang.String | UrlMatches]] = js.undefined
}

object AutomationNonInteractive {
  @scala.inline
  def apply(
    interact: chromeDashAppsLib.chromeDashAppsLibNumbers.`false`,
    desktop: chromeDashAppsLib.chromeDashAppsLibNumbers.`false` = null,
    matches: js.Array[java.lang.String | UrlMatches] = null
  ): AutomationNonInteractive = {
    val __obj = js.Dynamic.literal(interact = interact)
    if (desktop != null) __obj.updateDynamic("desktop")(desktop)
    if (matches != null) __obj.updateDynamic("matches")(matches)
    __obj.asInstanceOf[AutomationNonInteractive]
  }
}

