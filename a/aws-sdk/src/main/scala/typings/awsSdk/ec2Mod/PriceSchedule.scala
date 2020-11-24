package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PriceSchedule extends js.Object {
  
  /**
    * The current price schedule, as determined by the term remaining for the Reserved Instance in the listing. A specific price schedule is always in effect, but only one price schedule can be active at any time. Take, for example, a Reserved Instance listing that has five months remaining in its term. When you specify price schedules for five months and two months, this means that schedule 1, covering the first three months of the remaining term, will be active during months 5, 4, and 3. Then schedule 2, covering the last two months of the term, will be active for months 2 and 1.
    */
  var Active: js.UndefOr[Boolean] = js.native
  
  /**
    * The currency for transacting the Reserved Instance resale. At this time, the only supported currency is USD.
    */
  var CurrencyCode: js.UndefOr[CurrencyCodeValues] = js.native
  
  /**
    * The fixed price for the term.
    */
  var Price: js.UndefOr[Double] = js.native
  
  /**
    * The number of months remaining in the reservation. For example, 2 is the second to the last month before the capacity reservation expires.
    */
  var Term: js.UndefOr[Long] = js.native
}
object PriceSchedule {
  
  @scala.inline
  def apply(): PriceSchedule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PriceSchedule]
  }
  
  @scala.inline
  implicit class PriceScheduleOps[Self <: PriceSchedule] (val x: Self) extends AnyVal {
    
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
    def setActive(value: Boolean): Self = this.set("Active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActive: Self = this.set("Active", js.undefined)
    
    @scala.inline
    def setCurrencyCode(value: CurrencyCodeValues): Self = this.set("CurrencyCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrencyCode: Self = this.set("CurrencyCode", js.undefined)
    
    @scala.inline
    def setPrice(value: Double): Self = this.set("Price", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrice: Self = this.set("Price", js.undefined)
    
    @scala.inline
    def setTerm(value: Long): Self = this.set("Term", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTerm: Self = this.set("Term", js.undefined)
  }
}
