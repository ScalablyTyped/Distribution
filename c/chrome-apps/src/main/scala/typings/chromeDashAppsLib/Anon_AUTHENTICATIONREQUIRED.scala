package typings
package chromeDashAppsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AUTHENTICATIONREQUIRED extends js.Object {
  var AUTHENTICATION_REQUIRED: chromeDashAppsLib.chromeDashAppsLibStrings.authentication_required
  var DISABLED: chromeDashAppsLib.chromeDashAppsLibStrings.disabled
  var INITIALIZING: chromeDashAppsLib.chromeDashAppsLibStrings.initializing
  var RUNNING: chromeDashAppsLib.chromeDashAppsLibStrings.running
  var TEMPORARY_UNAVAILABLE: chromeDashAppsLib.chromeDashAppsLibStrings.temporary_unavailable
}

trait Anon_Authenticationrequired extends js.Object {
  var description: java.lang.String
  var state: chromeDashAppsLib.chromeNs.ToStringLiteral[
    Anon_AUTHENTICATIONREQUIRED, 
    java.lang.String, 
    stdLib.Exclude[
      java.lang.String, 
      chromeDashAppsLib.chromeDashAppsLibStrings.initializing | chromeDashAppsLib.chromeDashAppsLibStrings.running | chromeDashAppsLib.chromeDashAppsLibStrings.temporary_unavailable | chromeDashAppsLib.chromeDashAppsLibStrings.authentication_required | chromeDashAppsLib.chromeDashAppsLibStrings.disabled
    ]
  ]
}

object Anon_AUTHENTICATIONREQUIRED {
  @scala.inline
  def apply(
    AUTHENTICATION_REQUIRED: chromeDashAppsLib.chromeDashAppsLibStrings.authentication_required,
    DISABLED: chromeDashAppsLib.chromeDashAppsLibStrings.disabled,
    INITIALIZING: chromeDashAppsLib.chromeDashAppsLibStrings.initializing,
    RUNNING: chromeDashAppsLib.chromeDashAppsLibStrings.running,
    TEMPORARY_UNAVAILABLE: chromeDashAppsLib.chromeDashAppsLibStrings.temporary_unavailable
  ): Anon_AUTHENTICATIONREQUIRED = {
    val __obj = js.Dynamic.literal(AUTHENTICATION_REQUIRED = AUTHENTICATION_REQUIRED, DISABLED = DISABLED, INITIALIZING = INITIALIZING, RUNNING = RUNNING, TEMPORARY_UNAVAILABLE = TEMPORARY_UNAVAILABLE)
  
    __obj.asInstanceOf[Anon_AUTHENTICATIONREQUIRED]
  }
}

object Anon_Authenticationrequired {
  @scala.inline
  def apply(
    description: java.lang.String,
    state: chromeDashAppsLib.chromeNs.ToStringLiteral[
      Anon_AUTHENTICATIONREQUIRED, 
      java.lang.String, 
      stdLib.Exclude[
        java.lang.String, 
        chromeDashAppsLib.chromeDashAppsLibStrings.initializing | chromeDashAppsLib.chromeDashAppsLibStrings.running | chromeDashAppsLib.chromeDashAppsLibStrings.temporary_unavailable | chromeDashAppsLib.chromeDashAppsLibStrings.authentication_required | chromeDashAppsLib.chromeDashAppsLibStrings.disabled
      ]
    ]
  ): Anon_Authenticationrequired = {
    val __obj = js.Dynamic.literal(description = description, state = state.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Authenticationrequired]
  }
}

