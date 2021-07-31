package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AcceptReservedInstancesExchangeQuoteResult extends StObject {
  
  /**
    * The ID of the successful exchange.
    */
  var ExchangeId: js.UndefOr[String] = js.undefined
}
object AcceptReservedInstancesExchangeQuoteResult {
  
  @scala.inline
  def apply(): AcceptReservedInstancesExchangeQuoteResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AcceptReservedInstancesExchangeQuoteResult]
  }
  
  @scala.inline
  implicit class AcceptReservedInstancesExchangeQuoteResultMutableBuilder[Self <: AcceptReservedInstancesExchangeQuoteResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExchangeId(value: String): Self = StObject.set(x, "ExchangeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExchangeIdUndefined: Self = StObject.set(x, "ExchangeId", js.undefined)
  }
}
