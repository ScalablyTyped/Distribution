package typings.cordovaPluginsDiagnostic.anon

import typings.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.authorized
import typings.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.denied_always_
import typings.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.not_available
import typings.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.not_determined
import typings.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.not_requested_
import typings.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.restricted
import typings.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.unknown
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GRANTED extends js.Object {
  
  var DENIED_ALWAYS: denied_always_ = js.native
  
  var GRANTED: authorized = js.native
  
  var NOT_AVAILABLE: not_available = js.native
  
  var NOT_DETERMINED: not_determined = js.native
  
  var NOT_REQUESTED: not_requested_ = js.native
  
  var RESTRICTED: restricted = js.native
  
  var UNKNOWN: unknown = js.native
}
object GRANTED {
  
  @scala.inline
  def apply(
    DENIED_ALWAYS: denied_always_,
    GRANTED: authorized,
    NOT_AVAILABLE: not_available,
    NOT_DETERMINED: not_determined,
    NOT_REQUESTED: not_requested_,
    RESTRICTED: restricted,
    UNKNOWN: unknown
  ): GRANTED = {
    val __obj = js.Dynamic.literal(DENIED_ALWAYS = DENIED_ALWAYS.asInstanceOf[js.Any], GRANTED = GRANTED.asInstanceOf[js.Any], NOT_AVAILABLE = NOT_AVAILABLE.asInstanceOf[js.Any], NOT_DETERMINED = NOT_DETERMINED.asInstanceOf[js.Any], NOT_REQUESTED = NOT_REQUESTED.asInstanceOf[js.Any], RESTRICTED = RESTRICTED.asInstanceOf[js.Any], UNKNOWN = UNKNOWN.asInstanceOf[js.Any])
    __obj.asInstanceOf[GRANTED]
  }
  
  @scala.inline
  implicit class GRANTEDOps[Self <: GRANTED] (val x: Self) extends AnyVal {
    
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
    def setDENIED_ALWAYS(value: denied_always_): Self = this.set("DENIED_ALWAYS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGRANTED(value: authorized): Self = this.set("GRANTED", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNOT_AVAILABLE(value: not_available): Self = this.set("NOT_AVAILABLE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNOT_DETERMINED(value: not_determined): Self = this.set("NOT_DETERMINED", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNOT_REQUESTED(value: not_requested_): Self = this.set("NOT_REQUESTED", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRESTRICTED(value: restricted): Self = this.set("RESTRICTED", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUNKNOWN(value: unknown): Self = this.set("UNKNOWN", value.asInstanceOf[js.Any])
  }
}
