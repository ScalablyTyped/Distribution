package typings.cordovaPluginsDiagnostic.anon

import typings.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.always
import typings.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.when_in_use
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ALWAYS extends js.Object {
  
  var ALWAYS: always = js.native
  
  var WHEN_IN_USE: when_in_use = js.native
}
object ALWAYS {
  
  @scala.inline
  def apply(ALWAYS: always, WHEN_IN_USE: when_in_use): ALWAYS = {
    val __obj = js.Dynamic.literal(ALWAYS = ALWAYS.asInstanceOf[js.Any], WHEN_IN_USE = WHEN_IN_USE.asInstanceOf[js.Any])
    __obj.asInstanceOf[ALWAYS]
  }
  
  @scala.inline
  implicit class ALWAYSOps[Self <: ALWAYS] (val x: Self) extends AnyVal {
    
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
    def setALWAYS(value: always): Self = this.set("ALWAYS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWHEN_IN_USE(value: when_in_use): Self = this.set("WHEN_IN_USE", value.asInstanceOf[js.Any])
  }
}
