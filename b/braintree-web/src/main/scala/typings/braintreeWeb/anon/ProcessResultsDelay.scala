package typings.braintreeWeb.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProcessResultsDelay extends js.Object {
  
  var processResultsDelay: js.UndefOr[Double] = js.native
}
object ProcessResultsDelay {
  
  @scala.inline
  def apply(): ProcessResultsDelay = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProcessResultsDelay]
  }
  
  @scala.inline
  implicit class ProcessResultsDelayOps[Self <: ProcessResultsDelay] (val x: Self) extends AnyVal {
    
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
    def setProcessResultsDelay(value: Double): Self = this.set("processResultsDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProcessResultsDelay: Self = this.set("processResultsDelay", js.undefined)
  }
}
