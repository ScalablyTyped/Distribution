package typings.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeCacheParametersMessage extends js.Object {
  /**
    * The name of a specific cache parameter group to return details for.
    */
  var CacheParameterGroupName: String = js.native
  /**
    * An optional marker returned from a prior request. Use this marker for pagination of results from this operation. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords.
    */
  var Marker: js.UndefOr[String] = js.native
  /**
    * The maximum number of records to include in the response. If more records exist than the specified MaxRecords value, a marker is included in the response so that the remaining results can be retrieved. Default: 100 Constraints: minimum 20; maximum 100.
    */
  var MaxRecords: js.UndefOr[IntegerOptional] = js.native
  /**
    * The parameter types to return. Valid values: user | system | engine-default 
    */
  var Source: js.UndefOr[String] = js.native
}

object DescribeCacheParametersMessage {
  @scala.inline
  def apply(
    CacheParameterGroupName: String,
    Marker: String = null,
    MaxRecords: Int | scala.Double = null,
    Source: String = null
  ): DescribeCacheParametersMessage = {
    val __obj = js.Dynamic.literal(CacheParameterGroupName = CacheParameterGroupName.asInstanceOf[js.Any])
    if (Marker != null) __obj.updateDynamic("Marker")(Marker.asInstanceOf[js.Any])
    if (MaxRecords != null) __obj.updateDynamic("MaxRecords")(MaxRecords.asInstanceOf[js.Any])
    if (Source != null) __obj.updateDynamic("Source")(Source.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeCacheParametersMessage]
  }
}

