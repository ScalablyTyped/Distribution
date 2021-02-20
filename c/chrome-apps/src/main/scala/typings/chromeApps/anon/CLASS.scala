package typings.chromeApps.anon

import typings.chromeApps.chromeAppsStrings.class_
import typings.chromeApps.chromeAppsStrings.reserved_
import typings.chromeApps.chromeAppsStrings.standard_
import typings.chromeApps.chromeAppsStrings.vendor_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CLASS extends StObject {
  
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
  implicit class CLASSMutableBuilder[Self <: CLASS] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCLASS(value: class_): Self = StObject.set(x, "CLASS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRESERVED(value: reserved_): Self = StObject.set(x, "RESERVED", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSTANDARD(value: standard_): Self = StObject.set(x, "STANDARD", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVENDOR(value: vendor_): Self = StObject.set(x, "VENDOR", value.asInstanceOf[js.Any])
  }
}
