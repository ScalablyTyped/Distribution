package typings
package chromeLib.chromeNs.contentSettingsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CookieSetDetails extends SetDetails {
  @JSName("setting")
  var setting_CookieSetDetails: chromeLib.chromeLibStrings.allow | chromeLib.chromeLibStrings.block | chromeLib.chromeLibStrings.session_only
}

object CookieSetDetails {
  @scala.inline
  def apply(
    primaryPattern: java.lang.String,
    setting: chromeLib.chromeLibStrings.allow | chromeLib.chromeLibStrings.block | chromeLib.chromeLibStrings.session_only,
    resourceIdentifier: ResourceIdentifier = null,
    scope: ScopeEnum = null,
    secondaryPattern: java.lang.String = null
  ): CookieSetDetails = {
    val __obj = js.Dynamic.literal(primaryPattern = primaryPattern, setting = setting.asInstanceOf[js.Any])
    if (resourceIdentifier != null) __obj.updateDynamic("resourceIdentifier")(resourceIdentifier)
    if (scope != null) __obj.updateDynamic("scope")(scope)
    if (secondaryPattern != null) __obj.updateDynamic("secondaryPattern")(secondaryPattern)
    __obj.asInstanceOf[CookieSetDetails]
  }
}

