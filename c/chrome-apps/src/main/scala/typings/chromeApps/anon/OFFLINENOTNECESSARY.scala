package typings.chromeApps.anon

import typings.chromeApps.chromeAppsStrings.OFFLINE_NOT_NECESSARY
import typings.chromeApps.chromeAppsStrings.SAVE_FOR_OFFLINE
import typings.chromeApps.chromeAppsStrings.SHARE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OFFLINENOTNECESSARY extends StObject {
  
  var OFFLINE_NOT_NECESSARY: typings.chromeApps.chromeAppsStrings.OFFLINE_NOT_NECESSARY
  
  var SAVE_FOR_OFFLINE: typings.chromeApps.chromeAppsStrings.SAVE_FOR_OFFLINE
  
  var SHARE: typings.chromeApps.chromeAppsStrings.SHARE
}
object OFFLINENOTNECESSARY {
  
  inline def apply(): OFFLINENOTNECESSARY = {
    val __obj = js.Dynamic.literal(OFFLINE_NOT_NECESSARY = "OFFLINE_NOT_NECESSARY", SAVE_FOR_OFFLINE = "SAVE_FOR_OFFLINE", SHARE = "SHARE")
    __obj.asInstanceOf[OFFLINENOTNECESSARY]
  }
  
  extension [Self <: OFFLINENOTNECESSARY](x: Self) {
    
    inline def setOFFLINE_NOT_NECESSARY(value: OFFLINE_NOT_NECESSARY): Self = StObject.set(x, "OFFLINE_NOT_NECESSARY", value.asInstanceOf[js.Any])
    
    inline def setSAVE_FOR_OFFLINE(value: SAVE_FOR_OFFLINE): Self = StObject.set(x, "SAVE_FOR_OFFLINE", value.asInstanceOf[js.Any])
    
    inline def setSHARE(value: SHARE): Self = StObject.set(x, "SHARE", value.asInstanceOf[js.Any])
  }
}
