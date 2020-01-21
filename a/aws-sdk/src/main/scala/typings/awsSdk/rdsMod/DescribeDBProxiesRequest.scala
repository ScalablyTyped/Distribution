package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeDBProxiesRequest extends js.Object {
  /**
    * The name of the DB proxy.
    */
  var DBProxyName: js.UndefOr[String] = js.native
  /**
    * This parameter is not currently supported.
    */
  var Filters: js.UndefOr[FilterList] = js.native
  /**
    *  An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords. 
    */
  var Marker: js.UndefOr[String] = js.native
  /**
    * The maximum number of records to include in the response. If more records exist than the specified MaxRecords value, a pagination token called a marker is included in the response so that the remaining results can be retrieved.  Default: 100 Constraints: Minimum 20, maximum 100.
    */
  var MaxRecords: js.UndefOr[typings.awsSdk.rdsMod.MaxRecords] = js.native
}

object DescribeDBProxiesRequest {
  @scala.inline
  def apply(
    DBProxyName: String = null,
    Filters: FilterList = null,
    Marker: String = null,
    MaxRecords: Int | scala.Double = null
  ): DescribeDBProxiesRequest = {
    val __obj = js.Dynamic.literal()
    if (DBProxyName != null) __obj.updateDynamic("DBProxyName")(DBProxyName.asInstanceOf[js.Any])
    if (Filters != null) __obj.updateDynamic("Filters")(Filters.asInstanceOf[js.Any])
    if (Marker != null) __obj.updateDynamic("Marker")(Marker.asInstanceOf[js.Any])
    if (MaxRecords != null) __obj.updateDynamic("MaxRecords")(MaxRecords.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDBProxiesRequest]
  }
}

