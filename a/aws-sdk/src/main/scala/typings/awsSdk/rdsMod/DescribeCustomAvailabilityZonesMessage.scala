package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeCustomAvailabilityZonesMessage extends js.Object {
  /**
    * The custom AZ identifier. If this parameter is specified, information from only the specific custom AZ is returned.
    */
  var CustomAvailabilityZoneId: js.UndefOr[String] = js.native
  /**
    * A filter that specifies one or more custom AZs to describe.
    */
  var Filters: js.UndefOr[FilterList] = js.native
  /**
    * An optional pagination token provided by a previous DescribeCustomAvailabilityZones request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords.
    */
  var Marker: js.UndefOr[String] = js.native
  /**
    * The maximum number of records to include in the response. If more records exist than the specified MaxRecords value, a pagination token called a marker is included in the response so you can retrieve the remaining results. Default: 100 Constraints: Minimum 20, maximum 100.
    */
  var MaxRecords: js.UndefOr[IntegerOptional] = js.native
}

object DescribeCustomAvailabilityZonesMessage {
  @scala.inline
  def apply(
    CustomAvailabilityZoneId: String = null,
    Filters: FilterList = null,
    Marker: String = null,
    MaxRecords: Int | scala.Double = null
  ): DescribeCustomAvailabilityZonesMessage = {
    val __obj = js.Dynamic.literal()
    if (CustomAvailabilityZoneId != null) __obj.updateDynamic("CustomAvailabilityZoneId")(CustomAvailabilityZoneId.asInstanceOf[js.Any])
    if (Filters != null) __obj.updateDynamic("Filters")(Filters.asInstanceOf[js.Any])
    if (Marker != null) __obj.updateDynamic("Marker")(Marker.asInstanceOf[js.Any])
    if (MaxRecords != null) __obj.updateDynamic("MaxRecords")(MaxRecords.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeCustomAvailabilityZonesMessage]
  }
}

