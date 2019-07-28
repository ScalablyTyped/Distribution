package typings.chromeDashApps

import typings.chromeDashApps.chromeDashAppsStrings.authentication_required
import typings.chromeDashApps.chromeDashAppsStrings.disabled
import typings.chromeDashApps.chromeDashAppsStrings.initializing
import typings.chromeDashApps.chromeDashAppsStrings.running
import typings.chromeDashApps.chromeDashAppsStrings.temporary_unavailable
import typings.chromeDashApps.chromeNs.ToStringLiteral
import typings.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AUTHENTICATIONREQUIRED extends js.Object {
  var AUTHENTICATION_REQUIRED: authentication_required
  var DISABLED: disabled
  var INITIALIZING: initializing
  var RUNNING: running
  var TEMPORARY_UNAVAILABLE: temporary_unavailable
}

trait Anon_Authenticationrequired extends js.Object {
  var description: String
  var state: ToStringLiteral[
    Anon_AUTHENTICATIONREQUIRED, 
    String, 
    Exclude[
      String, 
      initializing | running | temporary_unavailable | authentication_required | disabled
    ]
  ]
}

object Anon_AUTHENTICATIONREQUIRED {
  @scala.inline
  def apply(
    AUTHENTICATION_REQUIRED: authentication_required,
    DISABLED: disabled,
    INITIALIZING: initializing,
    RUNNING: running,
    TEMPORARY_UNAVAILABLE: temporary_unavailable
  ): Anon_AUTHENTICATIONREQUIRED = {
    val __obj = js.Dynamic.literal(AUTHENTICATION_REQUIRED = AUTHENTICATION_REQUIRED, DISABLED = DISABLED, INITIALIZING = INITIALIZING, RUNNING = RUNNING, TEMPORARY_UNAVAILABLE = TEMPORARY_UNAVAILABLE)
  
    __obj.asInstanceOf[Anon_AUTHENTICATIONREQUIRED]
  }
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
        initializing | running | temporary_unavailable | authentication_required | disabled
      ]
    ]
  ): Anon_Authenticationrequired = {
    val __obj = js.Dynamic.literal(description = description, state = state.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Authenticationrequired]
  }
}

