package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReservedInstanceLimitPrice extends js.Object {
  
  /**
    * Used for Reserved Instance Marketplace offerings. Specifies the limit price on the total order (instanceCount * price).
    */
  var Amount: js.UndefOr[Double] = js.native
  
  /**
    * The currency in which the limitPrice amount is specified. At this time, the only supported currency is USD.
    */
  var CurrencyCode: js.UndefOr[CurrencyCodeValues] = js.native
}
object ReservedInstanceLimitPrice {
  
  @scala.inline
  def apply(): ReservedInstanceLimitPrice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReservedInstanceLimitPrice]
  }
  
  @scala.inline
  implicit class ReservedInstanceLimitPriceOps[Self <: ReservedInstanceLimitPrice] (val x: Self) extends AnyVal {
    
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
    def setAmount(value: Double): Self = this.set("Amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAmount: Self = this.set("Amount", js.undefined)
    
    @scala.inline
    def setCurrencyCode(value: CurrencyCodeValues): Self = this.set("CurrencyCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrencyCode: Self = this.set("CurrencyCode", js.undefined)
  }
}
