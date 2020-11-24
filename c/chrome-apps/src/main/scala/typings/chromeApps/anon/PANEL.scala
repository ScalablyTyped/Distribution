package typings.chromeApps.anon

import typings.chromeApps.chromeAppsStrings.panel
import typings.chromeApps.chromeAppsStrings.shell
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PANEL extends js.Object {
  
  var PANEL: panel = js.native
  
  var SHELL: shell = js.native
}
object PANEL {
  
  @scala.inline
  def apply(PANEL: panel, SHELL: shell): PANEL = {
    val __obj = js.Dynamic.literal(PANEL = PANEL.asInstanceOf[js.Any], SHELL = SHELL.asInstanceOf[js.Any])
    __obj.asInstanceOf[PANEL]
  }
  
  @scala.inline
  implicit class PANELOps[Self <: PANEL] (val x: Self) extends AnyVal {
    
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
    def setPANEL(value: panel): Self = this.set("PANEL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSHELL(value: shell): Self = this.set("SHELL", value.asInstanceOf[js.Any])
  }
}
