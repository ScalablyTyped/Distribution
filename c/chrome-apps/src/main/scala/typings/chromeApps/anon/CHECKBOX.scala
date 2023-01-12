package typings.chromeApps.anon

import typings.chromeApps.chromeAppsStrings.checkbox_
import typings.chromeApps.chromeAppsStrings.normal_
import typings.chromeApps.chromeAppsStrings.radio_
import typings.chromeApps.chromeAppsStrings.separator_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CHECKBOX extends StObject {
  
  var CHECKBOX: checkbox_
  
  var NORMAL: normal_
  
  var RADIO: radio_
  
  var SEPARATOR: separator_
}
object CHECKBOX {
  
  inline def apply(): CHECKBOX = {
    val __obj = js.Dynamic.literal(CHECKBOX = "checkbox", NORMAL = "normal", RADIO = "radio", SEPARATOR = "separator")
    __obj.asInstanceOf[CHECKBOX]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CHECKBOX] (val x: Self) extends AnyVal {
    
    inline def setCHECKBOX(value: checkbox_): Self = StObject.set(x, "CHECKBOX", value.asInstanceOf[js.Any])
    
    inline def setNORMAL(value: normal_): Self = StObject.set(x, "NORMAL", value.asInstanceOf[js.Any])
    
    inline def setRADIO(value: radio_): Self = StObject.set(x, "RADIO", value.asInstanceOf[js.Any])
    
    inline def setSEPARATOR(value: separator_): Self = StObject.set(x, "SEPARATOR", value.asInstanceOf[js.Any])
  }
}
