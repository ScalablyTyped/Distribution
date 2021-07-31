package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PricingDetail extends StObject {
  
  /**
    * The number of reservations available for the price.
    */
  var Count: js.UndefOr[Integer] = js.undefined
  
  /**
    * The price per instance.
    */
  var Price: js.UndefOr[Double] = js.undefined
}
object PricingDetail {
  
  @scala.inline
  def apply(): PricingDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PricingDetail]
  }
  
  @scala.inline
  implicit class PricingDetailMutableBuilder[Self <: PricingDetail] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCount(value: Integer): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountUndefined: Self = StObject.set(x, "Count", js.undefined)
    
    @scala.inline
    def setPrice(value: Double): Self = StObject.set(x, "Price", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriceUndefined: Self = StObject.set(x, "Price", js.undefined)
  }
}
