package typings.chromeApps.anon

import typings.chromeApps.chromeAppsStrings.bulk_
import typings.chromeApps.chromeAppsStrings.control_
import typings.chromeApps.chromeAppsStrings.interrupt_
import typings.chromeApps.chromeAppsStrings.isochronous_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BULK extends StObject {
  
  var BULK: bulk_ = js.native
  
  var CONTROL: control_ = js.native
  
  var INTERRUPT: interrupt_ = js.native
  
  var ISOCHRONOUS: isochronous_ = js.native
}
object BULK {
  
  @scala.inline
  def apply(BULK: bulk_, CONTROL: control_, INTERRUPT: interrupt_, ISOCHRONOUS: isochronous_): BULK = {
    val __obj = js.Dynamic.literal(BULK = BULK.asInstanceOf[js.Any], CONTROL = CONTROL.asInstanceOf[js.Any], INTERRUPT = INTERRUPT.asInstanceOf[js.Any], ISOCHRONOUS = ISOCHRONOUS.asInstanceOf[js.Any])
    __obj.asInstanceOf[BULK]
  }
  
  @scala.inline
  implicit class BULKMutableBuilder[Self <: BULK] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBULK(value: bulk_): Self = StObject.set(x, "BULK", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCONTROL(value: control_): Self = StObject.set(x, "CONTROL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setINTERRUPT(value: interrupt_): Self = StObject.set(x, "INTERRUPT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setISOCHRONOUS(value: isochronous_): Self = StObject.set(x, "ISOCHRONOUS", value.asInstanceOf[js.Any])
  }
}
