package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PriceScheduleSpecification extends js.Object {
  
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
object PriceScheduleSpecification {
  
  @scala.inline
  def apply(): PriceScheduleSpecification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PriceScheduleSpecification]
  }
  
  @scala.inline
  implicit class PriceScheduleSpecificationOps[Self <: PriceScheduleSpecification] (val x: Self) extends AnyVal {
    
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
