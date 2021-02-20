package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeHostReservationOfferingsRequest extends StObject {
  
  /**
    * The filters.    instance-family - The instance family of the offering (for example, m4).    payment-option - The payment option (NoUpfront | PartialUpfront | AllUpfront).  
    */
  var Filter: js.UndefOr[FilterList] = js.native
  
  /**
    * This is the maximum duration of the reservation to purchase, specified in seconds. Reservations are available in one-year and three-year terms. The number of seconds specified must be the number of seconds in a year (365x24x60x60) times one of the supported durations (1 or 3). For example, specify 94608000 for three years.
    */
  var MaxDuration: js.UndefOr[Integer] = js.native
  
  /**
    * The maximum number of results to return for the request in a single page. The remaining results can be seen by sending another request with the returned nextToken value. This value can be between 5 and 500. If maxResults is given a larger value than 500, you receive an error.
    */
  var MaxResults: js.UndefOr[DescribeHostReservationsMaxResults] = js.native
  
  /**
    * This is the minimum duration of the reservation you'd like to purchase, specified in seconds. Reservations are available in one-year and three-year terms. The number of seconds specified must be the number of seconds in a year (365x24x60x60) times one of the supported durations (1 or 3). For example, specify 31536000 for one year.
    */
  var MinDuration: js.UndefOr[Integer] = js.native
  
  /**
    * The token to use to retrieve the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.native
  
  /**
    * The ID of the reservation offering.
    */
  var OfferingId: js.UndefOr[typings.awsSdk.ec2Mod.OfferingId] = js.native
}
object DescribeHostReservationOfferingsRequest {
  
  @scala.inline
  def apply(): DescribeHostReservationOfferingsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeHostReservationOfferingsRequest]
  }
  
  @scala.inline
  implicit class DescribeHostReservationOfferingsRequestMutableBuilder[Self <: DescribeHostReservationOfferingsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilter(value: FilterList): Self = StObject.set(x, "Filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "Filter", js.undefined)
    
    @scala.inline
    def setFilterVarargs(value: Filter*): Self = StObject.set(x, "Filter", js.Array(value :_*))
    
    @scala.inline
    def setMaxDuration(value: Integer): Self = StObject.set(x, "MaxDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxDurationUndefined: Self = StObject.set(x, "MaxDuration", js.undefined)
    
    @scala.inline
    def setMaxResults(value: DescribeHostReservationsMaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setMinDuration(value: Integer): Self = StObject.set(x, "MinDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinDurationUndefined: Self = StObject.set(x, "MinDuration", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setOfferingId(value: OfferingId): Self = StObject.set(x, "OfferingId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOfferingIdUndefined: Self = StObject.set(x, "OfferingId", js.undefined)
  }
}
