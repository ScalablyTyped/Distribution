package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AcceptReservedInstancesExchangeQuoteResult extends js.Object {
  
  /**
    * The ID of the successful exchange.
    */
  var ExchangeId: js.UndefOr[String] = js.native
}
object AcceptReservedInstancesExchangeQuoteResult {
  
  @scala.inline
  def apply(): AcceptReservedInstancesExchangeQuoteResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AcceptReservedInstancesExchangeQuoteResult]
  }
  
  @scala.inline
  implicit class AcceptReservedInstancesExchangeQuoteResultOps[Self <: AcceptReservedInstancesExchangeQuoteResult] (val x: Self) extends AnyVal {
    
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
    def setExchangeId(value: String): Self = this.set("ExchangeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExchangeId: Self = this.set("ExchangeId", js.undefined)
  }
}
