package typings.awsSdk.esMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeReservedElasticsearchInstanceOfferingsRequest extends StObject {
  
  /**
    * Set this value to limit the number of results returned. If not specified, defaults to 100.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.esMod.MaxResults] = js.undefined
  
  /**
    * NextToken should be sent in case if earlier API call produced result containing NextToken. It is used for pagination.
    */
  var NextToken: js.UndefOr[typings.awsSdk.esMod.NextToken] = js.undefined
  
  /**
    * The offering identifier filter value. Use this parameter to show only the available offering that matches the specified reservation identifier.
    */
  var ReservedElasticsearchInstanceOfferingId: js.UndefOr[GUID] = js.undefined
}
object DescribeReservedElasticsearchInstanceOfferingsRequest {
  
  @scala.inline
  def apply(): DescribeReservedElasticsearchInstanceOfferingsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeReservedElasticsearchInstanceOfferingsRequest]
  }
  
  @scala.inline
  implicit class DescribeReservedElasticsearchInstanceOfferingsRequestMutableBuilder[Self <: DescribeReservedElasticsearchInstanceOfferingsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setReservedElasticsearchInstanceOfferingId(value: GUID): Self = StObject.set(x, "ReservedElasticsearchInstanceOfferingId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReservedElasticsearchInstanceOfferingIdUndefined: Self = StObject.set(x, "ReservedElasticsearchInstanceOfferingId", js.undefined)
  }
}
