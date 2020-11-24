package typings.cordovaPluginsDiagnostic.anon

import typings.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.powered_off
import typings.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.powered_on
import typings.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.powering_off
import typings.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.powering_on
import typings.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.unknown
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait POWEREDON extends js.Object {
  
  var POWERED_OFF: powered_off = js.native
  
  var POWERED_ON: powered_on = js.native
  
  var POWERING_OFF: powering_off = js.native
  
  var POWERING_ON: powering_on = js.native
  
  var UNKNOWN: unknown = js.native
}
object POWEREDON {
  
  @scala.inline
  def apply(
    POWERED_OFF: powered_off,
    POWERED_ON: powered_on,
    POWERING_OFF: powering_off,
    POWERING_ON: powering_on,
    UNKNOWN: unknown
  ): POWEREDON = {
    val __obj = js.Dynamic.literal(POWERED_OFF = POWERED_OFF.asInstanceOf[js.Any], POWERED_ON = POWERED_ON.asInstanceOf[js.Any], POWERING_OFF = POWERING_OFF.asInstanceOf[js.Any], POWERING_ON = POWERING_ON.asInstanceOf[js.Any], UNKNOWN = UNKNOWN.asInstanceOf[js.Any])
    __obj.asInstanceOf[POWEREDON]
  }
  
  @scala.inline
  implicit class POWEREDONOps[Self <: POWEREDON] (val x: Self) extends AnyVal {
    
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
    def setPOWERED_OFF(value: powered_off): Self = this.set("POWERED_OFF", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPOWERED_ON(value: powered_on): Self = this.set("POWERED_ON", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPOWERING_OFF(value: powering_off): Self = this.set("POWERING_OFF", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPOWERING_ON(value: powering_on): Self = this.set("POWERING_ON", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUNKNOWN(value: unknown): Self = this.set("UNKNOWN", value.asInstanceOf[js.Any])
  }
}
