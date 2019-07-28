package typings.chrome.chromeNs.contentSettingsNs

import typings.chrome.chromeStrings.allow
import typings.chrome.chromeStrings.block
import typings.chrome.chromeStrings.detect_important_content
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginsSetDetails extends SetDetails {
  @JSName("setting")
  var setting_PluginsSetDetails: allow | block | detect_important_content
}

object PluginsSetDetails {
  @scala.inline
  def apply(
    primaryPattern: String,
    setting: allow | block | detect_important_content,
    resourceIdentifier: ResourceIdentifier = null,
    scope: ScopeEnum = null,
    secondaryPattern: String = null
  ): PluginsSetDetails = {
    val __obj = js.Dynamic.literal(primaryPattern = primaryPattern, setting = setting.asInstanceOf[js.Any])
    if (resourceIdentifier != null) __obj.updateDynamic("resourceIdentifier")(resourceIdentifier)
    if (scope != null) __obj.updateDynamic("scope")(scope)
    if (secondaryPattern != null) __obj.updateDynamic("secondaryPattern")(secondaryPattern)
    __obj.asInstanceOf[PluginsSetDetails]
  }
}

