package typings.chromeApps.anon

import typings.chromeApps.chromeAppsStrings.class_
import typings.chromeApps.chromeAppsStrings.reserved_
import typings.chromeApps.chromeAppsStrings.standard_
import typings.chromeApps.chromeAppsStrings.vendor_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CLASS extends js.Object {
  
  var CLASS: class_ = js.native
  
  var RESERVED: reserved_ = js.native
  
  var STANDARD: standard_ = js.native
  
  var VENDOR: vendor_ = js.native
}
object CLASS {
  
  @scala.inline
  def apply(CLASS: class_, RESERVED: reserved_, STANDARD: standard_, VENDOR: vendor_): CLASS = {
    val __obj = js.Dynamic.literal(CLASS = CLASS.asInstanceOf[js.Any], RESERVED = RESERVED.asInstanceOf[js.Any], STANDARD = STANDARD.asInstanceOf[js.Any], VENDOR = VENDOR.asInstanceOf[js.Any])
    __obj.asInstanceOf[CLASS]
  }
  
  @scala.inline
  implicit class CLASSOps[Self <: CLASS] (val x: Self) extends AnyVal {
    
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
    def setCLASS(value: class_): Self = this.set("CLASS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRESERVED(value: reserved_): Self = this.set("RESERVED", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSTANDARD(value: standard_): Self = this.set("STANDARD", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVENDOR(value: vendor_): Self = this.set("VENDOR", value.asInstanceOf[js.Any])
  }
}
