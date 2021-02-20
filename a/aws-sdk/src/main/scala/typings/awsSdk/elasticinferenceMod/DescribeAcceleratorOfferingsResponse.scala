package typings.awsSdk.elasticinferenceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeAcceleratorOfferingsResponse extends StObject {
  
  /**
    *  The list of accelerator type offerings for a specific location. 
    */
  var acceleratorTypeOfferings: js.UndefOr[AcceleratorTypeOfferingList] = js.native
}
object DescribeAcceleratorOfferingsResponse {
  
  @scala.inline
  def apply(): DescribeAcceleratorOfferingsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAcceleratorOfferingsResponse]
  }
  
  @scala.inline
  implicit class DescribeAcceleratorOfferingsResponseMutableBuilder[Self <: DescribeAcceleratorOfferingsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAcceleratorTypeOfferings(value: AcceleratorTypeOfferingList): Self = StObject.set(x, "acceleratorTypeOfferings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAcceleratorTypeOfferingsUndefined: Self = StObject.set(x, "acceleratorTypeOfferings", js.undefined)
    
    @scala.inline
    def setAcceleratorTypeOfferingsVarargs(value: AcceleratorTypeOffering*): Self = StObject.set(x, "acceleratorTypeOfferings", js.Array(value :_*))
  }
}
