package typings.chromeApps.anon

import typings.chromeApps.chromeAppsStrings.bulk_
import typings.chromeApps.chromeAppsStrings.control_
import typings.chromeApps.chromeAppsStrings.interrupt_
import typings.chromeApps.chromeAppsStrings.isochronous_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BULK extends js.Object {
  
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
  implicit class BULKOps[Self <: BULK] (val x: Self) extends AnyVal {
    
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
    def setBULK(value: bulk_): Self = this.set("BULK", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCONTROL(value: control_): Self = this.set("CONTROL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setINTERRUPT(value: interrupt_): Self = this.set("INTERRUPT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setISOCHRONOUS(value: isochronous_): Self = this.set("ISOCHRONOUS", value.asInstanceOf[js.Any])
  }
}
