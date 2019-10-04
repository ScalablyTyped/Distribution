package typings.cordovaDotPluginsDotDiagnostic

import typings.cordovaDotPluginsDotDiagnostic.cordovaDotPluginsDotDiagnosticStrings.authorized
import typings.cordovaDotPluginsDotDiagnostic.cordovaDotPluginsDotDiagnosticStrings.denied_always
import typings.cordovaDotPluginsDotDiagnostic.cordovaDotPluginsDotDiagnosticStrings.not_available
import typings.cordovaDotPluginsDotDiagnostic.cordovaDotPluginsDotDiagnosticStrings.not_determined
import typings.cordovaDotPluginsDotDiagnostic.cordovaDotPluginsDotDiagnosticStrings.not_requested
import typings.cordovaDotPluginsDotDiagnostic.cordovaDotPluginsDotDiagnosticStrings.restricted
import typings.cordovaDotPluginsDotDiagnostic.cordovaDotPluginsDotDiagnosticStrings.unknown
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AuthorizedDENIEDALWAYS extends js.Object {
  var DENIED_ALWAYS: denied_always
  var GRANTED: authorized
  var NOT_AVAILABLE: not_available
  var NOT_DETERMINED: not_determined
  var NOT_REQUESTED: not_requested
  var RESTRICTED: restricted
  var UNKNOWN: unknown
}

object Anon_AuthorizedDENIEDALWAYS {
  @scala.inline
  def apply(
    DENIED_ALWAYS: denied_always,
    GRANTED: authorized,
    NOT_AVAILABLE: not_available,
    NOT_DETERMINED: not_determined,
    NOT_REQUESTED: not_requested,
    RESTRICTED: restricted,
    UNKNOWN: unknown
  ): Anon_AuthorizedDENIEDALWAYS = {
    val __obj = js.Dynamic.literal(DENIED_ALWAYS = DENIED_ALWAYS, GRANTED = GRANTED, NOT_AVAILABLE = NOT_AVAILABLE, NOT_DETERMINED = NOT_DETERMINED, NOT_REQUESTED = NOT_REQUESTED, RESTRICTED = RESTRICTED, UNKNOWN = UNKNOWN)
  
    __obj.asInstanceOf[Anon_AuthorizedDENIEDALWAYS]
  }
}

