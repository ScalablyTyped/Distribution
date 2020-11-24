package typings.cordovaPluginsDiagnostic.anon

import typings.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.alert
import typings.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.badge
import typings.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.sound
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ALERT extends js.Object {
  
  var ALERT: alert = js.native
  
  var BADGE: badge = js.native
  
  var SOUND: sound = js.native
}
object ALERT {
  
  @scala.inline
  def apply(ALERT: alert, BADGE: badge, SOUND: sound): ALERT = {
    val __obj = js.Dynamic.literal(ALERT = ALERT.asInstanceOf[js.Any], BADGE = BADGE.asInstanceOf[js.Any], SOUND = SOUND.asInstanceOf[js.Any])
    __obj.asInstanceOf[ALERT]
  }
  
  @scala.inline
  implicit class ALERTOps[Self <: ALERT] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setALERT(value: alert): Self = this.set("ALERT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBADGE(value: badge): Self = this.set("BADGE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSOUND(value: sound): Self = this.set("SOUND", value.asInstanceOf[js.Any])
  }
}
