package typings.chromeApps.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DELETED extends js.Object {
  
  var CHANGED: typings.chromeApps.chromeAppsStrings.CHANGED = js.native
  
  var DELETED: typings.chromeApps.chromeAppsStrings.DELETED = js.native
}
object DELETED {
  
  @scala.inline
  def apply(
    CHANGED: typings.chromeApps.chromeAppsStrings.CHANGED,
    DELETED: typings.chromeApps.chromeAppsStrings.DELETED
  ): DELETED = {
    val __obj = js.Dynamic.literal(CHANGED = CHANGED.asInstanceOf[js.Any], DELETED = DELETED.asInstanceOf[js.Any])
    __obj.asInstanceOf[DELETED]
  }
  
  @scala.inline
  implicit class DELETEDOps[Self <: DELETED] (val x: Self) extends AnyVal {
    
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
    def setCHANGED(value: typings.chromeApps.chromeAppsStrings.CHANGED): Self = this.set("CHANGED", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDELETED(value: typings.chromeApps.chromeAppsStrings.DELETED): Self = this.set("DELETED", value.asInstanceOf[js.Any])
  }
}
