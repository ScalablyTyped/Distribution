package typings.cordovaDotPluginsDotDiagnostic

import typings.cordovaDotPluginsDotDiagnostic.cordovaDotPluginsDotDiagnosticStrings.DENIED_ALWAYS
import typings.cordovaDotPluginsDotDiagnostic.cordovaDotPluginsDotDiagnosticStrings.DENIED_ONCE
import typings.cordovaDotPluginsDotDiagnostic.cordovaDotPluginsDotDiagnosticStrings.GRANTED
import typings.cordovaDotPluginsDotDiagnostic.cordovaDotPluginsDotDiagnosticStrings.NOT_REQUESTED
import typings.cordovaDotPluginsDotDiagnostic.cordovaDotPluginsDotDiagnosticStrings.authorized
import typings.cordovaDotPluginsDotDiagnostic.cordovaDotPluginsDotDiagnosticStrings.authorized_when_in_use
import typings.cordovaDotPluginsDotDiagnostic.cordovaDotPluginsDotDiagnosticStrings.denied_always
import typings.cordovaDotPluginsDotDiagnostic.cordovaDotPluginsDotDiagnosticStrings.not_determined
import typings.cordovaDotPluginsDotDiagnostic.cordovaDotPluginsDotDiagnosticStrings.restricted
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Authorized extends js.Object {
  var DENIED_ALWAYS: denied_always | typings.cordovaDotPluginsDotDiagnostic.cordovaDotPluginsDotDiagnosticStrings.DENIED_ALWAYS
  // Android only
  var DENIED_ONCE: typings.cordovaDotPluginsDotDiagnostic.cordovaDotPluginsDotDiagnosticStrings.DENIED_ONCE
  // Both iOS and Android
  var GRANTED: authorized | typings.cordovaDotPluginsDotDiagnostic.cordovaDotPluginsDotDiagnosticStrings.GRANTED
  var GRANTED_WHEN_IN_USE: authorized_when_in_use
  var NOT_REQUESTED: not_determined | typings.cordovaDotPluginsDotDiagnostic.cordovaDotPluginsDotDiagnosticStrings.NOT_REQUESTED
  // iOS only
  var RESTRICTED: restricted
}

object Anon_Authorized {
  @scala.inline
  def apply(
    DENIED_ALWAYS: denied_always | DENIED_ALWAYS,
    DENIED_ONCE: DENIED_ONCE,
    GRANTED: authorized | GRANTED,
    GRANTED_WHEN_IN_USE: authorized_when_in_use,
    NOT_REQUESTED: not_determined | NOT_REQUESTED,
    RESTRICTED: restricted
  ): Anon_Authorized = {
    val __obj = js.Dynamic.literal(DENIED_ALWAYS = DENIED_ALWAYS.asInstanceOf[js.Any], DENIED_ONCE = DENIED_ONCE, GRANTED = GRANTED.asInstanceOf[js.Any], GRANTED_WHEN_IN_USE = GRANTED_WHEN_IN_USE, NOT_REQUESTED = NOT_REQUESTED.asInstanceOf[js.Any], RESTRICTED = RESTRICTED)
  
    __obj.asInstanceOf[Anon_Authorized]
  }
}

