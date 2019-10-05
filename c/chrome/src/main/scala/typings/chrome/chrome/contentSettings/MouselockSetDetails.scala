package typings.chrome.chrome.contentSettings

import typings.chrome.chromeStrings.allow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MouselockSetDetails extends SetDetails {
  @JSName("setting")
  var setting_MouselockSetDetails: allow
}

object MouselockSetDetails {
  @scala.inline
  def apply(
    primaryPattern: String,
    setting: allow,
    resourceIdentifier: ResourceIdentifier = null,
    scope: ScopeEnum = null,
    secondaryPattern: String = null
  ): MouselockSetDetails = {
    val __obj = js.Dynamic.literal(primaryPattern = primaryPattern, setting = setting)
    if (resourceIdentifier != null) __obj.updateDynamic("resourceIdentifier")(resourceIdentifier)
    if (scope != null) __obj.updateDynamic("scope")(scope)
    if (secondaryPattern != null) __obj.updateDynamic("secondaryPattern")(secondaryPattern)
    __obj.asInstanceOf[MouselockSetDetails]
  }
}

