package typings.cordovaPluginsDiagnostic

import typings.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.authorized
import typings.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.denied_always_
import typings.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.not_available
import typings.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.not_determined
import typings.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.not_requested_
import typings.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.restricted
import typings.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.unknown
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGRANTED extends js.Object {
  var DENIED_ALWAYS: denied_always_
  var GRANTED: authorized
  var NOT_AVAILABLE: not_available
  var NOT_DETERMINED: not_determined
  var NOT_REQUESTED: not_requested_
  var RESTRICTED: restricted
  var UNKNOWN: unknown
}

object AnonGRANTED {
  @scala.inline
  def apply(
    DENIED_ALWAYS: denied_always_,
    GRANTED: authorized,
    NOT_AVAILABLE: not_available,
    NOT_DETERMINED: not_determined,
    NOT_REQUESTED: not_requested_,
    RESTRICTED: restricted,
    UNKNOWN: unknown
  ): AnonGRANTED = {
    val __obj = js.Dynamic.literal(DENIED_ALWAYS = DENIED_ALWAYS.asInstanceOf[js.Any], GRANTED = GRANTED.asInstanceOf[js.Any], NOT_AVAILABLE = NOT_AVAILABLE.asInstanceOf[js.Any], NOT_DETERMINED = NOT_DETERMINED.asInstanceOf[js.Any], NOT_REQUESTED = NOT_REQUESTED.asInstanceOf[js.Any], RESTRICTED = RESTRICTED.asInstanceOf[js.Any], UNKNOWN = UNKNOWN.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonGRANTED]
  }
}

