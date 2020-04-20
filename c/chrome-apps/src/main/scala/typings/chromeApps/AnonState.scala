package typings.chromeApps

import typings.chromeApps.chrome.ToStringLiteral
import typings.chromeApps.chromeAppsStrings.AUTHENTICATION_REQUIRED
import typings.chromeApps.chromeAppsStrings.DISABLED
import typings.chromeApps.chromeAppsStrings.INITIALIZING
import typings.chromeApps.chromeAppsStrings.RUNNING
import typings.chromeApps.chromeAppsStrings.TEMPORARY_UNAVAILABLE
import typings.chromeApps.chromeAppsStrings.authentication_required_
import typings.chromeApps.chromeAppsStrings.disabled__
import typings.chromeApps.chromeAppsStrings.initializing_
import typings.chromeApps.chromeAppsStrings.running_
import typings.chromeApps.chromeAppsStrings.temporary_unavailable_
import typings.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonState extends js.Object {
  var description: String
  var state: ToStringLiteral[
    AnonAUTHENTICATIONREQUIRED, 
    INITIALIZING | RUNNING | AUTHENTICATION_REQUIRED | TEMPORARY_UNAVAILABLE | DISABLED, 
    Exclude[
      INITIALIZING | RUNNING | AUTHENTICATION_REQUIRED | TEMPORARY_UNAVAILABLE | DISABLED, 
      temporary_unavailable_ | authentication_required_ | disabled__ | initializing_ | running_
    ]
  ]
}

object AnonState {
  @scala.inline
  def apply(
    description: String,
    state: ToStringLiteral[
      AnonAUTHENTICATIONREQUIRED, 
      INITIALIZING | RUNNING | AUTHENTICATION_REQUIRED | TEMPORARY_UNAVAILABLE | DISABLED, 
      Exclude[
        INITIALIZING | RUNNING | AUTHENTICATION_REQUIRED | TEMPORARY_UNAVAILABLE | DISABLED, 
        temporary_unavailable_ | authentication_required_ | disabled__ | initializing_ | running_
      ]
    ]
  ): AnonState = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonState]
  }
}

