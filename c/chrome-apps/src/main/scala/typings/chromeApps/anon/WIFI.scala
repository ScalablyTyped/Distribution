package typings.chromeApps.anon

import typings.chromeApps.chromeAppsStrings.WiFi
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WIFI extends js.Object {
  
  var WI_FI: WiFi = js.native
}
object WIFI {
  
  @scala.inline
  def apply(WI_FI: WiFi): WIFI = {
    val __obj = js.Dynamic.literal(WI_FI = WI_FI.asInstanceOf[js.Any])
    __obj.asInstanceOf[WIFI]
  }
  
  @scala.inline
  implicit class WIFIOps[Self <: WIFI] (val x: Self) extends AnyVal {
    
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
    def setWI_FI(value: WiFi): Self = this.set("WI_FI", value.asInstanceOf[js.Any])
  }
}
