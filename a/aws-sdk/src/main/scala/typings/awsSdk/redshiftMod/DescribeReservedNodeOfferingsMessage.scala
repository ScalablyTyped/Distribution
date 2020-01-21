package typings.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeReservedNodeOfferingsMessage extends js.Object {
  /**
    * An optional parameter that specifies the starting point to return a set of response records. When the results of a DescribeReservedNodeOfferings request exceed the value specified in MaxRecords, AWS returns a value in the Marker field of the response. You can retrieve the next set of response records by providing the returned marker value in the Marker parameter and retrying the request. 
    */
  var Marker: js.UndefOr[String] = js.native
  /**
    * The maximum number of response records to return in each call. If the number of remaining response records exceeds the specified MaxRecords value, a value is returned in a marker field of the response. You can retrieve the next set of records by retrying the command with the returned marker value.  Default: 100  Constraints: minimum 20, maximum 100.
    */
  var MaxRecords: js.UndefOr[IntegerOptional] = js.native
  /**
    * The unique identifier for the offering.
    */
  var ReservedNodeOfferingId: js.UndefOr[String] = js.native
}

object DescribeReservedNodeOfferingsMessage {
  @scala.inline
  def apply(
    Marker: String = null,
    MaxRecords: Int | scala.Double = null,
    ReservedNodeOfferingId: String = null
  ): DescribeReservedNodeOfferingsMessage = {
    val __obj = js.Dynamic.literal()
    if (Marker != null) __obj.updateDynamic("Marker")(Marker.asInstanceOf[js.Any])
    if (MaxRecords != null) __obj.updateDynamic("MaxRecords")(MaxRecords.asInstanceOf[js.Any])
    if (ReservedNodeOfferingId != null) __obj.updateDynamic("ReservedNodeOfferingId")(ReservedNodeOfferingId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeReservedNodeOfferingsMessage]
  }
}

