package typings.chrome.chromeNs.contentSettingsNs

import typings.chrome.chromeStrings.allow
import typings.chrome.chromeStrings.block
import typings.chrome.chromeStrings.session_only
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CookieSetDetails extends SetDetails {
  @JSName("setting")
  var setting_CookieSetDetails: allow | block | session_only
}

object CookieSetDetails {
  @scala.inline
  def apply(
    primaryPattern: String,
    setting: allow | block | session_only,
    resourceIdentifier: ResourceIdentifier = null,
    scope: ScopeEnum = null,
    secondaryPattern: String = null
  ): CookieSetDetails = {
    val __obj = js.Dynamic.literal(primaryPattern = primaryPattern, setting = setting.asInstanceOf[js.Any])
    if (resourceIdentifier != null) __obj.updateDynamic("resourceIdentifier")(resourceIdentifier)
    if (scope != null) __obj.updateDynamic("scope")(scope)
    if (secondaryPattern != null) __obj.updateDynamic("secondaryPattern")(secondaryPattern)
    __obj.asInstanceOf[CookieSetDetails]
  }
}

