package typings.chromeApps.anon

import typings.chromeApps.chromeAppsStrings.class_
import typings.chromeApps.chromeAppsStrings.reserved_
import typings.chromeApps.chromeAppsStrings.standard_
import typings.chromeApps.chromeAppsStrings.vendor_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CLASS extends StObject {
  
  var CLASS: class_
  
  var RESERVED: reserved_
  
  var STANDARD: standard_
  
  var VENDOR: vendor_
}
object CLASS {
  
  inline def apply(): CLASS = {
    val __obj = js.Dynamic.literal(CLASS = "class", RESERVED = "reserved", STANDARD = "standard", VENDOR = "vendor")
    __obj.asInstanceOf[CLASS]
  }
  
  extension [Self <: CLASS](x: Self) {
    
    inline def setCLASS(value: class_): Self = StObject.set(x, "CLASS", value.asInstanceOf[js.Any])
    
    inline def setRESERVED(value: reserved_): Self = StObject.set(x, "RESERVED", value.asInstanceOf[js.Any])
    
    inline def setSTANDARD(value: standard_): Self = StObject.set(x, "STANDARD", value.asInstanceOf[js.Any])
    
    inline def setVENDOR(value: vendor_): Self = StObject.set(x, "VENDOR", value.asInstanceOf[js.Any])
  }
}
