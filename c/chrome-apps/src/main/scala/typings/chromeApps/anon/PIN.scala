package typings.chromeApps.anon

import typings.chromeApps.chromeAppsStrings.PUK
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PIN extends js.Object {
  
  var PIN: typings.chromeApps.chromeAppsStrings.PIN = js.native
  
  var PUK: typings.chromeApps.chromeAppsStrings.PUK = js.native
}
object PIN {
  
  @scala.inline
  def apply(PIN: typings.chromeApps.chromeAppsStrings.PIN, PUK: PUK): PIN = {
    val __obj = js.Dynamic.literal(PIN = PIN.asInstanceOf[js.Any], PUK = PUK.asInstanceOf[js.Any])
    __obj.asInstanceOf[PIN]
  }
  
  @scala.inline
  implicit class PINOps[Self <: PIN] (val x: Self) extends AnyVal {
    
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
    def setPIN(value: typings.chromeApps.chromeAppsStrings.PIN): Self = this.set("PIN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPUK(value: PUK): Self = this.set("PUK", value.asInstanceOf[js.Any])
  }
}
