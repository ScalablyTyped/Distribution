package typings.awsSdk.opensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeReservedInstanceOfferingsResponse extends StObject {
  
  /**
    * Provides an identifier to allow retrieval of paginated results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.opensearchMod.NextToken] = js.undefined
  
  /**
    * List of reserved OpenSearch instance offerings
    */
  var ReservedInstanceOfferings: js.UndefOr[ReservedInstanceOfferingList] = js.undefined
}
object DescribeReservedInstanceOfferingsResponse {
  
  inline def apply(): DescribeReservedInstanceOfferingsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeReservedInstanceOfferingsResponse]
  }
  
  extension [Self <: DescribeReservedInstanceOfferingsResponse](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setReservedInstanceOfferings(value: ReservedInstanceOfferingList): Self = StObject.set(x, "ReservedInstanceOfferings", value.asInstanceOf[js.Any])
    
    inline def setReservedInstanceOfferingsUndefined: Self = StObject.set(x, "ReservedInstanceOfferings", js.undefined)
    
    inline def setReservedInstanceOfferingsVarargs(value: ReservedInstanceOffering*): Self = StObject.set(x, "ReservedInstanceOfferings", js.Array(value*))
  }
}
