package typings.chromeApps

import typings.chromeApps.chrome.ToStringLiteral
import typings.chromeApps.chromeAppsStrings.authentication_required
import typings.chromeApps.chromeAppsStrings.disabled_
import typings.chromeApps.chromeAppsStrings.initializing
import typings.chromeApps.chromeAppsStrings.running
import typings.chromeApps.chromeAppsStrings.temporary_unavailable
import typings.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonState extends js.Object {
  var description: String
  var state: ToStringLiteral[
    AnonAUTHENTICATIONREQUIRED, 
    String, 
    Exclude[
      String, 
      temporary_unavailable | authentication_required | disabled_ | initializing | running
    ]
  ]
}

object AnonState {
  @scala.inline
  def apply(
    description: String,
    state: ToStringLiteral[
      AnonAUTHENTICATIONREQUIRED, 
      String, 
      Exclude[
        String, 
        temporary_unavailable | authentication_required | disabled_ | initializing | running
      ]
    ]
  ): AnonState = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonState]
  }
}

