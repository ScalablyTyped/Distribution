package typings.azure.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BreakLeaseOptions extends AccessConditionsOptions {
  
  var leaseBreakPeriod: js.UndefOr[Double] = js.native
}
object BreakLeaseOptions {
  
  @scala.inline
  def apply(): BreakLeaseOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BreakLeaseOptions]
  }
  
  @scala.inline
  implicit class BreakLeaseOptionsOps[Self <: BreakLeaseOptions] (val x: Self) extends AnyVal {
    
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
    def setLeaseBreakPeriod(value: Double): Self = this.set("leaseBreakPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLeaseBreakPeriod: Self = this.set("leaseBreakPeriod", js.undefined)
  }
}
