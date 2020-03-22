package typings.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeGlobalReplicationGroupsMessage extends js.Object {
  /**
    * The name of the Global Datastore
    */
  var GlobalReplicationGroupId: js.UndefOr[String] = js.native
  /**
    * An optional marker returned from a prior request. Use this marker for pagination of results from this operation. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords. 
    */
  var Marker: js.UndefOr[String] = js.native
  /**
    * The maximum number of records to include in the response. If more records exist than the specified MaxRecords value, a marker is included in the response so that the remaining results can be retrieved. 
    */
  var MaxRecords: js.UndefOr[IntegerOptional] = js.native
  /**
    * Returns the list of members that comprise the Global Datastore.
    */
  var ShowMemberInfo: js.UndefOr[BooleanOptional] = js.native
}

object DescribeGlobalReplicationGroupsMessage {
  @scala.inline
  def apply(
    GlobalReplicationGroupId: String = null,
    Marker: String = null,
    MaxRecords: Int | scala.Double = null,
    ShowMemberInfo: js.UndefOr[scala.Boolean] = js.undefined
  ): DescribeGlobalReplicationGroupsMessage = {
    val __obj = js.Dynamic.literal()
    if (GlobalReplicationGroupId != null) __obj.updateDynamic("GlobalReplicationGroupId")(GlobalReplicationGroupId.asInstanceOf[js.Any])
    if (Marker != null) __obj.updateDynamic("Marker")(Marker.asInstanceOf[js.Any])
    if (MaxRecords != null) __obj.updateDynamic("MaxRecords")(MaxRecords.asInstanceOf[js.Any])
    if (!js.isUndefined(ShowMemberInfo)) __obj.updateDynamic("ShowMemberInfo")(ShowMemberInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeGlobalReplicationGroupsMessage]
  }
}

