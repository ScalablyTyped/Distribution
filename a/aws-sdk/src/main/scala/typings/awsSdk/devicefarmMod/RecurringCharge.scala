package typings.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RecurringCharge extends js.Object {
  
  /**
    * The cost of the recurring charge.
    */
  var cost: js.UndefOr[MonetaryAmount] = js.native
  
  /**
    * The frequency in which charges recur.
    */
  var frequency: js.UndefOr[RecurringChargeFrequency] = js.native
}
object RecurringCharge {
  
  @scala.inline
  def apply(): RecurringCharge = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecurringCharge]
  }
  
  @scala.inline
  implicit class RecurringChargeOps[Self <: RecurringCharge] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCost(value: MonetaryAmount): Self = this.set("cost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCost: Self = this.set("cost", js.undefined)
    
    @scala.inline
    def setFrequency(value: RecurringChargeFrequency): Self = this.set("frequency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrequency: Self = this.set("frequency", js.undefined)
  }
}
