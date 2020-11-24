package typings.chromeApps.anon

import typings.chromeApps.chromeAppsStrings.changed_
import typings.chromeApps.chromeAppsStrings.created
import typings.chromeApps.chromeAppsStrings.removed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CHANGED extends js.Object {
  
  var CHANGED: changed_ = js.native
  
  var CREATED: created = js.native
  
  var REMOVED: removed = js.native
}
object CHANGED {
  
  @scala.inline
  def apply(CHANGED: changed_, CREATED: created, REMOVED: removed): CHANGED = {
    val __obj = js.Dynamic.literal(CHANGED = CHANGED.asInstanceOf[js.Any], CREATED = CREATED.asInstanceOf[js.Any], REMOVED = REMOVED.asInstanceOf[js.Any])
    __obj.asInstanceOf[CHANGED]
  }
  
  @scala.inline
  implicit class CHANGEDOps[Self <: CHANGED] (val x: Self) extends AnyVal {
    
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
    def setCHANGED(value: changed_): Self = this.set("CHANGED", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCREATED(value: created): Self = this.set("CREATED", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setREMOVED(value: removed): Self = this.set("REMOVED", value.asInstanceOf[js.Any])
  }
}
