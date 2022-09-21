package typings.awsSdk.opensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeReservedInstanceOfferingsRequest extends StObject {
  
  /**
    * Set this value to limit the number of results returned. If not specified, defaults to 100.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.opensearchMod.MaxResults] = js.undefined
  
  /**
    * Provides an identifier to allow retrieval of paginated results. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.opensearchMod.NextToken] = js.undefined
  
  /**
    * The offering identifier filter value. Use this parameter to show only the available offering that matches the specified reservation identifier. 
    */
  var ReservedInstanceOfferingId: js.UndefOr[GUID] = js.undefined
}
object DescribeReservedInstanceOfferingsRequest {
  
  inline def apply(): DescribeReservedInstanceOfferingsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeReservedInstanceOfferingsRequest]
  }
  
  extension [Self <: DescribeReservedInstanceOfferingsRequest](x: Self) {
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setReservedInstanceOfferingId(value: GUID): Self = StObject.set(x, "ReservedInstanceOfferingId", value.asInstanceOf[js.Any])
    
    inline def setReservedInstanceOfferingIdUndefined: Self = StObject.set(x, "ReservedInstanceOfferingId", js.undefined)
  }
}
