package typings.chromeApps.anon

import typings.chromeApps.chromeAppsStrings.android_
import typings.chromeApps.chromeAppsStrings.cros_
import typings.chromeApps.chromeAppsStrings.linux_
import typings.chromeApps.chromeAppsStrings.mac_
import typings.chromeApps.chromeAppsStrings.openbsd_
import typings.chromeApps.chromeAppsStrings.win_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ANDROID extends js.Object {
  
  var ANDROID: android_ = js.native
  
  var CROS: cros_ = js.native
  
  var LINUX: linux_ = js.native
  
  var MAC: mac_ = js.native
  
  var OPENBSD: openbsd_ = js.native
  
  var WIN: win_ = js.native
}
object ANDROID {
  
  @scala.inline
  def apply(ANDROID: android_, CROS: cros_, LINUX: linux_, MAC: mac_, OPENBSD: openbsd_, WIN: win_): ANDROID = {
    val __obj = js.Dynamic.literal(ANDROID = ANDROID.asInstanceOf[js.Any], CROS = CROS.asInstanceOf[js.Any], LINUX = LINUX.asInstanceOf[js.Any], MAC = MAC.asInstanceOf[js.Any], OPENBSD = OPENBSD.asInstanceOf[js.Any], WIN = WIN.asInstanceOf[js.Any])
    __obj.asInstanceOf[ANDROID]
  }
  
  @scala.inline
  implicit class ANDROIDOps[Self <: ANDROID] (val x: Self) extends AnyVal {
    
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
    def setANDROID(value: android_): Self = this.set("ANDROID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCROS(value: cros_): Self = this.set("CROS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLINUX(value: linux_): Self = this.set("LINUX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMAC(value: mac_): Self = this.set("MAC", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOPENBSD(value: openbsd_): Self = this.set("OPENBSD", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWIN(value: win_): Self = this.set("WIN", value.asInstanceOf[js.Any])
  }
}
