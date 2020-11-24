package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MonthlyTransfer extends js.Object {
  
  /**
    * The amount allocated per month (in GB).
    */
  var gbPerMonthAllocated: js.UndefOr[integer] = js.native
}
object MonthlyTransfer {
  
  @scala.inline
  def apply(): MonthlyTransfer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MonthlyTransfer]
  }
  
  @scala.inline
  implicit class MonthlyTransferOps[Self <: MonthlyTransfer] (val x: Self) extends AnyVal {
    
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
    def setGbPerMonthAllocated(value: integer): Self = this.set("gbPerMonthAllocated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGbPerMonthAllocated: Self = this.set("gbPerMonthAllocated", js.undefined)
  }
}
