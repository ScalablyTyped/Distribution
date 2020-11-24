package typings.chromeApps.anon

import typings.chromeApps.chromeAppsStrings.checkbox_
import typings.chromeApps.chromeAppsStrings.normal_
import typings.chromeApps.chromeAppsStrings.radio_
import typings.chromeApps.chromeAppsStrings.separator_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CHECKBOX extends js.Object {
  
  var CHECKBOX: checkbox_ = js.native
  
  var NORMAL: normal_ = js.native
  
  var RADIO: radio_ = js.native
  
  var SEPARATOR: separator_ = js.native
}
object CHECKBOX {
  
  @scala.inline
  def apply(CHECKBOX: checkbox_, NORMAL: normal_, RADIO: radio_, SEPARATOR: separator_): CHECKBOX = {
    val __obj = js.Dynamic.literal(CHECKBOX = CHECKBOX.asInstanceOf[js.Any], NORMAL = NORMAL.asInstanceOf[js.Any], RADIO = RADIO.asInstanceOf[js.Any], SEPARATOR = SEPARATOR.asInstanceOf[js.Any])
    __obj.asInstanceOf[CHECKBOX]
  }
  
  @scala.inline
  implicit class CHECKBOXOps[Self <: CHECKBOX] (val x: Self) extends AnyVal {
    
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
    def setCHECKBOX(value: checkbox_): Self = this.set("CHECKBOX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNORMAL(value: normal_): Self = this.set("NORMAL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRADIO(value: radio_): Self = this.set("RADIO", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSEPARATOR(value: separator_): Self = this.set("SEPARATOR", value.asInstanceOf[js.Any])
  }
}
