package typings.chromeApps.anon

import typings.chromeApps.chromeAppsStrings.android_
import typings.chromeApps.chromeAppsStrings.cros_
import typings.chromeApps.chromeAppsStrings.linux_
import typings.chromeApps.chromeAppsStrings.mac_
import typings.chromeApps.chromeAppsStrings.openbsd_
import typings.chromeApps.chromeAppsStrings.win_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ANDROID extends StObject {
  
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
  implicit class ANDROIDMutableBuilder[Self <: ANDROID] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setANDROID(value: android_): Self = StObject.set(x, "ANDROID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCROS(value: cros_): Self = StObject.set(x, "CROS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLINUX(value: linux_): Self = StObject.set(x, "LINUX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMAC(value: mac_): Self = StObject.set(x, "MAC", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOPENBSD(value: openbsd_): Self = StObject.set(x, "OPENBSD", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWIN(value: win_): Self = StObject.set(x, "WIN", value.asInstanceOf[js.Any])
  }
}
