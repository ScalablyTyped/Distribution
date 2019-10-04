package typings.cordovaDotPluginsDotDiagnostic

import typings.cordovaDotPluginsDotDiagnostic.cordovaDotPluginsDotDiagnosticStrings.powered_off
import typings.cordovaDotPluginsDotDiagnostic.cordovaDotPluginsDotDiagnosticStrings.powered_on
import typings.cordovaDotPluginsDotDiagnostic.cordovaDotPluginsDotDiagnosticStrings.powering_off
import typings.cordovaDotPluginsDotDiagnostic.cordovaDotPluginsDotDiagnosticStrings.powering_on
import typings.cordovaDotPluginsDotDiagnostic.cordovaDotPluginsDotDiagnosticStrings.resetting
import typings.cordovaDotPluginsDotDiagnostic.cordovaDotPluginsDotDiagnosticStrings.unauthorized
import typings.cordovaDotPluginsDotDiagnostic.cordovaDotPluginsDotDiagnosticStrings.unknown
import typings.cordovaDotPluginsDotDiagnostic.cordovaDotPluginsDotDiagnosticStrings.unsupported
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_POWEREDOFF extends js.Object {
  var POWERED_OFF: powered_off
  var POWERED_ON: powered_on
  // Android only
  var POWERING_OFF: powering_off
  var POWERING_ON: powering_on
  // iOS only
  var RESETTING: resetting
  var UNAUTHORIZED: unauthorized
  // Both iOS and Android
  var UNKNOWN: unknown
  var UNSUPPORTED: unsupported
}

object Anon_POWEREDOFF {
  @scala.inline
  def apply(
    POWERED_OFF: powered_off,
    POWERED_ON: powered_on,
    POWERING_OFF: powering_off,
    POWERING_ON: powering_on,
    RESETTING: resetting,
    UNAUTHORIZED: unauthorized,
    UNKNOWN: unknown,
    UNSUPPORTED: unsupported
  ): Anon_POWEREDOFF = {
    val __obj = js.Dynamic.literal(POWERED_OFF = POWERED_OFF, POWERED_ON = POWERED_ON, POWERING_OFF = POWERING_OFF, POWERING_ON = POWERING_ON, RESETTING = RESETTING, UNAUTHORIZED = UNAUTHORIZED, UNKNOWN = UNKNOWN, UNSUPPORTED = UNSUPPORTED)
  
    __obj.asInstanceOf[Anon_POWEREDOFF]
  }
}

