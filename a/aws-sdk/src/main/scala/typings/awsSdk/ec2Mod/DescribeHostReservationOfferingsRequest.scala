package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeHostReservationOfferingsRequest extends js.Object {
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
  var OfferingId: js.UndefOr[String] = js.native
}

object DescribeHostReservationOfferingsRequest {
  @scala.inline
  def apply(
    Filter: FilterList = null,
    MaxDuration: Int | scala.Double = null,
    MaxResults: Int | scala.Double = null,
    MinDuration: Int | scala.Double = null,
    NextToken: String = null,
    OfferingId: String = null
  ): DescribeHostReservationOfferingsRequest = {
    val __obj = js.Dynamic.literal()
    if (Filter != null) __obj.updateDynamic("Filter")(Filter.asInstanceOf[js.Any])
    if (MaxDuration != null) __obj.updateDynamic("MaxDuration")(MaxDuration.asInstanceOf[js.Any])
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (MinDuration != null) __obj.updateDynamic("MinDuration")(MinDuration.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (OfferingId != null) __obj.updateDynamic("OfferingId")(OfferingId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeHostReservationOfferingsRequest]
  }
}

