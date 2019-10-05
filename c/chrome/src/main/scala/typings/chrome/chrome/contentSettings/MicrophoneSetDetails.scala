package typings.chrome.chrome.contentSettings

import typings.chrome.chromeStrings.allow
import typings.chrome.chromeStrings.ask
import typings.chrome.chromeStrings.block
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MicrophoneSetDetails extends SetDetails {
  @JSName("setting")
  var setting_MicrophoneSetDetails: allow | block | ask
}

object MicrophoneSetDetails {
  @scala.inline
  def apply(
    primaryPattern: String,
    setting: allow | block | ask,
    resourceIdentifier: ResourceIdentifier = null,
    scope: ScopeEnum = null,
    secondaryPattern: String = null
  ): MicrophoneSetDetails = {
    val __obj = js.Dynamic.literal(primaryPattern = primaryPattern, setting = setting.asInstanceOf[js.Any])
    if (resourceIdentifier != null) __obj.updateDynamic("resourceIdentifier")(resourceIdentifier)
    if (scope != null) __obj.updateDynamic("scope")(scope)
    if (secondaryPattern != null) __obj.updateDynamic("secondaryPattern")(secondaryPattern)
    __obj.asInstanceOf[MicrophoneSetDetails]
  }
}

