package typings.cordovaPluginsDiagnostic.anon

import typings.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.full
import typings.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.reduced
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FULL extends js.Object {
  
  var FULL: full = js.native
  
  var REDUCED: reduced = js.native
}
object FULL {
  
  @scala.inline
  def apply(FULL: full, REDUCED: reduced): FULL = {
    val __obj = js.Dynamic.literal(FULL = FULL.asInstanceOf[js.Any], REDUCED = REDUCED.asInstanceOf[js.Any])
    __obj.asInstanceOf[FULL]
  }
  
  @scala.inline
  implicit class FULLOps[Self <: FULL] (val x: Self) extends AnyVal {
    
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
    def setFULL(value: full): Self = this.set("FULL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setREDUCED(value: reduced): Self = this.set("REDUCED", value.asInstanceOf[js.Any])
  }
}
