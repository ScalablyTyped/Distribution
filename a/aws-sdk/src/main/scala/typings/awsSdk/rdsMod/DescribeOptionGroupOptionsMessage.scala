package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeOptionGroupOptionsMessage extends js.Object {
  /**
    * A required parameter. Options available for the given engine name are described.
    */
  var EngineName: String = js.native
  /**
    * This parameter isn't currently supported.
    */
  var Filters: js.UndefOr[FilterList] = js.native
  /**
    * If specified, filters the results to include only options for the specified major engine version.
    */
  var MajorEngineVersion: js.UndefOr[String] = js.native
  /**
    * An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords.
    */
  var Marker: js.UndefOr[String] = js.native
  /**
    *  The maximum number of records to include in the response. If more records exist than the specified MaxRecords value, a pagination token called a marker is included in the response so that you can retrieve the remaining results.  Default: 100 Constraints: Minimum 20, maximum 100.
    */
  var MaxRecords: js.UndefOr[IntegerOptional] = js.native
}

object DescribeOptionGroupOptionsMessage {
  @scala.inline
  def apply(
    EngineName: String,
    Filters: FilterList = null,
    MajorEngineVersion: String = null,
    Marker: String = null,
    MaxRecords: Int | scala.Double = null
  ): DescribeOptionGroupOptionsMessage = {
    val __obj = js.Dynamic.literal(EngineName = EngineName.asInstanceOf[js.Any])
    if (Filters != null) __obj.updateDynamic("Filters")(Filters.asInstanceOf[js.Any])
    if (MajorEngineVersion != null) __obj.updateDynamic("MajorEngineVersion")(MajorEngineVersion.asInstanceOf[js.Any])
    if (Marker != null) __obj.updateDynamic("Marker")(Marker.asInstanceOf[js.Any])
    if (MaxRecords != null) __obj.updateDynamic("MaxRecords")(MaxRecords.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeOptionGroupOptionsMessage]
  }
}

