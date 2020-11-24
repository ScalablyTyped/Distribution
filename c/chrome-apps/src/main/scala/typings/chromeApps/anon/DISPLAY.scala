package typings.chromeApps.anon

import typings.chromeApps.chromeAppsStrings.display_
import typings.chromeApps.chromeAppsStrings.system_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DISPLAY extends js.Object {
  
  var DISPLAY: display_ = js.native
  
  var SYSTEM: system_ = js.native
}
object DISPLAY {
  
  @scala.inline
  def apply(DISPLAY: display_, SYSTEM: system_): DISPLAY = {
    val __obj = js.Dynamic.literal(DISPLAY = DISPLAY.asInstanceOf[js.Any], SYSTEM = SYSTEM.asInstanceOf[js.Any])
    __obj.asInstanceOf[DISPLAY]
  }
  
  @scala.inline
  implicit class DISPLAYOps[Self <: DISPLAY] (val x: Self) extends AnyVal {
    
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
    def setDISPLAY(value: display_): Self = this.set("DISPLAY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSYSTEM(value: system_): Self = this.set("SYSTEM", value.asInstanceOf[js.Any])
  }
}
