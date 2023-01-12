package typings.chromeApps.anon

import typings.chromeApps.chromeAppsStrings.bulk_
import typings.chromeApps.chromeAppsStrings.control_
import typings.chromeApps.chromeAppsStrings.interrupt_
import typings.chromeApps.chromeAppsStrings.isochronous_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BULK extends StObject {
  
  var BULK: bulk_
  
  var CONTROL: control_
  
  var INTERRUPT: interrupt_
  
  var ISOCHRONOUS: isochronous_
}
object BULK {
  
  inline def apply(): BULK = {
    val __obj = js.Dynamic.literal(BULK = "bulk", CONTROL = "control", INTERRUPT = "interrupt", ISOCHRONOUS = "isochronous")
    __obj.asInstanceOf[BULK]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BULK] (val x: Self) extends AnyVal {
    
    inline def setBULK(value: bulk_): Self = StObject.set(x, "BULK", value.asInstanceOf[js.Any])
    
    inline def setCONTROL(value: control_): Self = StObject.set(x, "CONTROL", value.asInstanceOf[js.Any])
    
    inline def setINTERRUPT(value: interrupt_): Self = StObject.set(x, "INTERRUPT", value.asInstanceOf[js.Any])
    
    inline def setISOCHRONOUS(value: isochronous_): Self = StObject.set(x, "ISOCHRONOUS", value.asInstanceOf[js.Any])
  }
}
