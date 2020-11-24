package typings.awsSdk.servicequotasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QuotaPeriod extends js.Object {
  
  /**
    * The time unit of a period.
    */
  var PeriodUnit: js.UndefOr[typings.awsSdk.servicequotasMod.PeriodUnit] = js.native
  
  /**
    * The value of a period.
    */
  var PeriodValue: js.UndefOr[typings.awsSdk.servicequotasMod.PeriodValue] = js.native
}
object QuotaPeriod {
  
  @scala.inline
  def apply(): QuotaPeriod = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QuotaPeriod]
  }
  
  @scala.inline
  implicit class QuotaPeriodOps[Self <: QuotaPeriod] (val x: Self) extends AnyVal {
    
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
    def setPeriodUnit(value: PeriodUnit): Self = this.set("PeriodUnit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePeriodUnit: Self = this.set("PeriodUnit", js.undefined)
    
    @scala.inline
    def setPeriodValue(value: PeriodValue): Self = this.set("PeriodValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePeriodValue: Self = this.set("PeriodValue", js.undefined)
  }
}
