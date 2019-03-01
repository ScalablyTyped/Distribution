package typings
package chromeLib.chromeNs.contentSettingsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginsSetDetails extends SetDetails {
  @JSName("setting")
  var setting_PluginsSetDetails: chromeLib.chromeLibStrings.allow | chromeLib.chromeLibStrings.block | chromeLib.chromeLibStrings.detect_important_content
}

object PluginsSetDetails {
  @scala.inline
  def apply(
    primaryPattern: java.lang.String,
    setting: chromeLib.chromeLibStrings.allow | chromeLib.chromeLibStrings.block | chromeLib.chromeLibStrings.detect_important_content,
    resourceIdentifier: ResourceIdentifier = null,
    scope: ScopeEnum = null,
    secondaryPattern: java.lang.String = null
  ): PluginsSetDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("primaryPattern")(primaryPattern)
    __obj.updateDynamic("setting")(setting.asInstanceOf[js.Any])
    if (resourceIdentifier != null) __obj.updateDynamic("resourceIdentifier")(resourceIdentifier)
    if (scope != null) __obj.updateDynamic("scope")(scope)
    if (secondaryPattern != null) __obj.updateDynamic("secondaryPattern")(secondaryPattern)
    __obj.asInstanceOf[PluginsSetDetails]
  }
}

