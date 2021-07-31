package typings.chromeApps.anon

import typings.chromeApps.chromeAppsStrings.android_
import typings.chromeApps.chromeAppsStrings.cros_
import typings.chromeApps.chromeAppsStrings.linux_
import typings.chromeApps.chromeAppsStrings.mac_
import typings.chromeApps.chromeAppsStrings.openbsd_
import typings.chromeApps.chromeAppsStrings.win_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ANDROID extends StObject {
  
  var ANDROID: android_
  
  var CROS: cros_
  
  var LINUX: linux_
  
  var MAC: mac_
  
  var OPENBSD: openbsd_
  
  var WIN: win_
}
object ANDROID {
  
  @scala.inline
  def apply(): ANDROID = {
    val __obj = js.Dynamic.literal(ANDROID = "android", CROS = "cros", LINUX = "linux", MAC = "mac", OPENBSD = "openbsd", WIN = "win")
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
