package typings.chromeApps.anon

import typings.chromeApps.chromeAppsStrings.OFFLINE_NOT_NECESSARY
import typings.chromeApps.chromeAppsStrings.SAVE_FOR_OFFLINE
import typings.chromeApps.chromeAppsStrings.SHARE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OFFLINENOTNECESSARY extends js.Object {
  
  var OFFLINE_NOT_NECESSARY: typings.chromeApps.chromeAppsStrings.OFFLINE_NOT_NECESSARY = js.native
  
  var SAVE_FOR_OFFLINE: typings.chromeApps.chromeAppsStrings.SAVE_FOR_OFFLINE = js.native
  
  var SHARE: typings.chromeApps.chromeAppsStrings.SHARE = js.native
}
object OFFLINENOTNECESSARY {
  
  @scala.inline
  def apply(OFFLINE_NOT_NECESSARY: OFFLINE_NOT_NECESSARY, SAVE_FOR_OFFLINE: SAVE_FOR_OFFLINE, SHARE: SHARE): OFFLINENOTNECESSARY = {
    val __obj = js.Dynamic.literal(OFFLINE_NOT_NECESSARY = OFFLINE_NOT_NECESSARY.asInstanceOf[js.Any], SAVE_FOR_OFFLINE = SAVE_FOR_OFFLINE.asInstanceOf[js.Any], SHARE = SHARE.asInstanceOf[js.Any])
    __obj.asInstanceOf[OFFLINENOTNECESSARY]
  }
  
  @scala.inline
  implicit class OFFLINENOTNECESSARYOps[Self <: OFFLINENOTNECESSARY] (val x: Self) extends AnyVal {
    
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
    def setOFFLINE_NOT_NECESSARY(value: OFFLINE_NOT_NECESSARY): Self = this.set("OFFLINE_NOT_NECESSARY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSAVE_FOR_OFFLINE(value: SAVE_FOR_OFFLINE): Self = this.set("SAVE_FOR_OFFLINE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSHARE(value: SHARE): Self = this.set("SHARE", value.asInstanceOf[js.Any])
  }
}
