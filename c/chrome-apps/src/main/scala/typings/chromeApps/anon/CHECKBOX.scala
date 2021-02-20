package typings.chromeApps.anon

import typings.chromeApps.chromeAppsStrings.checkbox_
import typings.chromeApps.chromeAppsStrings.normal_
import typings.chromeApps.chromeAppsStrings.radio_
import typings.chromeApps.chromeAppsStrings.separator_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CHECKBOX extends StObject {
  
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
  implicit class CHECKBOXMutableBuilder[Self <: CHECKBOX] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCHECKBOX(value: checkbox_): Self = StObject.set(x, "CHECKBOX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNORMAL(value: normal_): Self = StObject.set(x, "NORMAL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRADIO(value: radio_): Self = StObject.set(x, "RADIO", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSEPARATOR(value: separator_): Self = StObject.set(x, "SEPARATOR", value.asInstanceOf[js.Any])
  }
}
