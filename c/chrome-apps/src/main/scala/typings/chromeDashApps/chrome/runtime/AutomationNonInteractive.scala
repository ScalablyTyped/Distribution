package typings.chromeDashApps.chrome.runtime

import typings.chromeDashApps.chromeDashAppsNumbers.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutomationNonInteractive extends _AutomationOptions {
  var desktop: js.UndefOr[`false`] = js.undefined
  var interact: `false`
  /** Patterns for matching, use chrome url pattern */
  var matches: js.UndefOr[js.Array[String | UrlMatches]] = js.undefined
}

object AutomationNonInteractive {
  @scala.inline
  def apply(interact: `false`, desktop: `false` = null, matches: js.Array[String | UrlMatches] = null): AutomationNonInteractive = {
    val __obj = js.Dynamic.literal(interact = interact)
    if (desktop != null) __obj.updateDynamic("desktop")(desktop)
    if (matches != null) __obj.updateDynamic("matches")(matches)
    __obj.asInstanceOf[AutomationNonInteractive]
  }
}

