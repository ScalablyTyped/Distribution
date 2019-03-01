package typings
package chromeLib.chromeNs.contentSettingsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MouselockSetDetails extends SetDetails {
  @JSName("setting")
  var setting_MouselockSetDetails: chromeLib.chromeLibStrings.allow
}

object MouselockSetDetails {
  @scala.inline
  def apply(
    primaryPattern: java.lang.String,
    setting: chromeLib.chromeLibStrings.allow,
    resourceIdentifier: ResourceIdentifier = null,
    scope: ScopeEnum = null,
    secondaryPattern: java.lang.String = null
  ): MouselockSetDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("primaryPattern")(primaryPattern)
    __obj.updateDynamic("setting")(setting)
    if (resourceIdentifier != null) __obj.updateDynamic("resourceIdentifier")(resourceIdentifier)
    if (scope != null) __obj.updateDynamic("scope")(scope)
    if (secondaryPattern != null) __obj.updateDynamic("secondaryPattern")(secondaryPattern)
    __obj.asInstanceOf[MouselockSetDetails]
  }
}

