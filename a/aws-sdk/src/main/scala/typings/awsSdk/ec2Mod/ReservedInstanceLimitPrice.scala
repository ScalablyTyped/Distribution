package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReservedInstanceLimitPrice extends StObject {
  
  /**
    * Used for Reserved Instance Marketplace offerings. Specifies the limit price on the total order (instanceCount * price).
    */
  var Amount: js.UndefOr[Double] = js.undefined
  
  /**
    * The currency in which the limitPrice amount is specified. At this time, the only supported currency is USD.
    */
  var CurrencyCode: js.UndefOr[CurrencyCodeValues] = js.undefined
}
object ReservedInstanceLimitPrice {
  
  @scala.inline
  def apply(): ReservedInstanceLimitPrice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReservedInstanceLimitPrice]
  }
  
  @scala.inline
  implicit class ReservedInstanceLimitPriceMutableBuilder[Self <: ReservedInstanceLimitPrice] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAmount(value: Double): Self = StObject.set(x, "Amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAmountUndefined: Self = StObject.set(x, "Amount", js.undefined)
    
    @scala.inline
    def setCurrencyCode(value: CurrencyCodeValues): Self = StObject.set(x, "CurrencyCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrencyCodeUndefined: Self = StObject.set(x, "CurrencyCode", js.undefined)
  }
}
