package typings.chromeApps.anon

import typings.chromeApps.chromeAppsStrings.denied_
import typings.chromeApps.chromeAppsStrings.granted_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DENIED extends js.Object {
  
  var DENIED: denied_ = js.native
  
  var GRANTED: granted_ = js.native
}
object DENIED {
  
  @scala.inline
  def apply(DENIED: denied_, GRANTED: granted_): DENIED = {
    val __obj = js.Dynamic.literal(DENIED = DENIED.asInstanceOf[js.Any], GRANTED = GRANTED.asInstanceOf[js.Any])
    __obj.asInstanceOf[DENIED]
  }
  
  @scala.inline
  implicit class DENIEDOps[Self <: DENIED] (val x: Self) extends AnyVal {
    
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
    def setDENIED(value: denied_): Self = this.set("DENIED", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGRANTED(value: granted_): Self = this.set("GRANTED", value.asInstanceOf[js.Any])
  }
}
