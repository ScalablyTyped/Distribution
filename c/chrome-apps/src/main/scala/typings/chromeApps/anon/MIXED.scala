package typings.chromeApps.anon

import typings.chromeApps.chromeAppsStrings.mixed
import typings.chromeApps.chromeAppsStrings.normal_
import typings.chromeApps.chromeAppsStrings.off
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MIXED extends StObject {
  
  var MIXED: mixed
  
  var NORMAL: normal_
  
  var OFF: off
}
object MIXED {
  
  inline def apply(): MIXED = {
    val __obj = js.Dynamic.literal(MIXED = "mixed", NORMAL = "normal", OFF = "off")
    __obj.asInstanceOf[MIXED]
  }
  
  extension [Self <: MIXED](x: Self) {
    
    inline def setMIXED(value: mixed): Self = StObject.set(x, "MIXED", value.asInstanceOf[js.Any])
    
    inline def setNORMAL(value: normal_): Self = StObject.set(x, "NORMAL", value.asInstanceOf[js.Any])
    
    inline def setOFF(value: off): Self = StObject.set(x, "OFF", value.asInstanceOf[js.Any])
  }
}
