package typings.cordovaPluginsDiagnostic.anon

import typings.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.alert
import typings.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.badge
import typings.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.sound
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ALERT extends js.Object {
  var ALERT: alert
  var BADGE: badge
  var SOUND: sound
}

object ALERT {
  @scala.inline
  def apply(ALERT: alert, BADGE: badge, SOUND: sound): ALERT = {
    val __obj = js.Dynamic.literal(ALERT = ALERT.asInstanceOf[js.Any], BADGE = BADGE.asInstanceOf[js.Any], SOUND = SOUND.asInstanceOf[js.Any])
    __obj.asInstanceOf[ALERT]
  }
}

