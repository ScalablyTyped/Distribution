package typings.chromeDashApps

import typings.chromeDashApps.chrome.ToStringLiteral
import typings.chromeDashApps.chromeDashAppsStrings.authentication_required
import typings.chromeDashApps.chromeDashAppsStrings.disabled_
import typings.chromeDashApps.chromeDashAppsStrings.initializing
import typings.chromeDashApps.chromeDashAppsStrings.running
import typings.chromeDashApps.chromeDashAppsStrings.temporary_unavailable
import typings.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AUTHENTICATIONREQUIRED extends js.Object {
  var AUTHENTICATION_REQUIRED: authentication_required
  var DISABLED: disabled_
  var INITIALIZING: initializing
  var RUNNING: running
  var TEMPORARY_UNAVAILABLE: temporary_unavailable
}

object Anon_AUTHENTICATIONREQUIRED {
  @scala.inline
  def apply(
    AUTHENTICATION_REQUIRED: authentication_required,
    DISABLED: disabled_,
    INITIALIZING: initializing,
    RUNNING: running,
    TEMPORARY_UNAVAILABLE: temporary_unavailable
  ): Anon_AUTHENTICATIONREQUIRED = {
    val __obj = js.Dynamic.literal(AUTHENTICATION_REQUIRED = AUTHENTICATION_REQUIRED.asInstanceOf[js.Any], DISABLED = DISABLED.asInstanceOf[js.Any], INITIALIZING = INITIALIZING.asInstanceOf[js.Any], RUNNING = RUNNING.asInstanceOf[js.Any], TEMPORARY_UNAVAILABLE = TEMPORARY_UNAVAILABLE.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_AUTHENTICATIONREQUIRED]
  }
}

trait Anon_Authenticationrequired extends js.Object {
  var description: String
  var state: ToStringLiteral[
    Anon_AUTHENTICATIONREQUIRED, 
    String, 
    Exclude[
      String, 
      temporary_unavailable | authentication_required | disabled_ | initializing | running
    ]
  ]
}

object Anon_Authenticationrequired {
  @scala.inline
  def apply(
    description: String,
    state: ToStringLiteral[
      Anon_AUTHENTICATIONREQUIRED, 
      String, 
      Exclude[
        String, 
        temporary_unavailable | authentication_required | disabled_ | initializing | running
      ]
    ]
  ): Anon_Authenticationrequired = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Authenticationrequired]
  }
}

