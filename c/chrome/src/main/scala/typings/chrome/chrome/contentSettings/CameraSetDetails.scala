package typings.chrome.chrome.contentSettings

import typings.chrome.chromeStrings.allow
import typings.chrome.chromeStrings.ask
import typings.chrome.chromeStrings.block
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CameraSetDetails extends SetDetails {
  @JSName("setting")
  var setting_CameraSetDetails: allow | block | ask
}

object CameraSetDetails {
  @scala.inline
  def apply(
    primaryPattern: String,
    setting: allow | block | ask,
    resourceIdentifier: ResourceIdentifier = null,
    scope: ScopeEnum = null,
    secondaryPattern: String = null
  ): CameraSetDetails = {
    val __obj = js.Dynamic.literal(primaryPattern = primaryPattern, setting = setting.asInstanceOf[js.Any])
    if (resourceIdentifier != null) __obj.updateDynamic("resourceIdentifier")(resourceIdentifier)
    if (scope != null) __obj.updateDynamic("scope")(scope)
    if (secondaryPattern != null) __obj.updateDynamic("secondaryPattern")(secondaryPattern)
    __obj.asInstanceOf[CameraSetDetails]
  }
}

