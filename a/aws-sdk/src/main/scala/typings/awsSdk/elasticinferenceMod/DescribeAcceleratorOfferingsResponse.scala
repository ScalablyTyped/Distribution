package typings.awsSdk.elasticinferenceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAcceleratorOfferingsResponse extends StObject {
  
  /**
    *  The list of accelerator type offerings for a specific location. 
    */
  var acceleratorTypeOfferings: js.UndefOr[AcceleratorTypeOfferingList] = js.undefined
}
object DescribeAcceleratorOfferingsResponse {
  
  inline def apply(): DescribeAcceleratorOfferingsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAcceleratorOfferingsResponse]
  }
  
  extension [Self <: DescribeAcceleratorOfferingsResponse](x: Self) {
    
    inline def setAcceleratorTypeOfferings(value: AcceleratorTypeOfferingList): Self = StObject.set(x, "acceleratorTypeOfferings", value.asInstanceOf[js.Any])
    
    inline def setAcceleratorTypeOfferingsUndefined: Self = StObject.set(x, "acceleratorTypeOfferings", js.undefined)
    
    inline def setAcceleratorTypeOfferingsVarargs(value: AcceleratorTypeOffering*): Self = StObject.set(x, "acceleratorTypeOfferings", js.Array(value :_*))
  }
}
