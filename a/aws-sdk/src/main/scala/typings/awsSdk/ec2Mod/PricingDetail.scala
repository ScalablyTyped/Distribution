package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PricingDetail extends js.Object {
  
  /**
    * The number of reservations available for the price.
    */
  var Count: js.UndefOr[Integer] = js.native
  
  /**
    * The price per instance.
    */
  var Price: js.UndefOr[Double] = js.native
}
object PricingDetail {
  
  @scala.inline
  def apply(): PricingDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PricingDetail]
  }
  
  @scala.inline
  implicit class PricingDetailOps[Self <: PricingDetail] (val x: Self) extends AnyVal {
    
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
    def setCount(value: Integer): Self = this.set("Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCount: Self = this.set("Count", js.undefined)
    
    @scala.inline
    def setPrice(value: Double): Self = this.set("Price", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrice: Self = this.set("Price", js.undefined)
  }
}
