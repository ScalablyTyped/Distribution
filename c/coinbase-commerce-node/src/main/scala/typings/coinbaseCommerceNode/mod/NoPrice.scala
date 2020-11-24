package typings.coinbaseCommerceNode.mod

import typings.coinbaseCommerceNode.coinbaseCommerceNodeStrings.no_price
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * No price resource.
  */
@js.native
trait NoPrice extends js.Object {
  
  /**
    * Pricing type.
    */
  var pricing_type: no_price = js.native
}
object NoPrice {
  
  @scala.inline
  def apply(pricing_type: no_price): NoPrice = {
    val __obj = js.Dynamic.literal(pricing_type = pricing_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[NoPrice]
  }
  
  @scala.inline
  implicit class NoPriceOps[Self <: NoPrice] (val x: Self) extends AnyVal {
    
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
    def setPricing_type(value: no_price): Self = this.set("pricing_type", value.asInstanceOf[js.Any])
  }
}
