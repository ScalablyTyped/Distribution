package typings.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeUpdateActionsMessage extends js.Object {
  /**
    * The cache cluster IDs
    */
  var CacheClusterIds: js.UndefOr[CacheClusterIdList] = js.native
  /**
    * The Elasticache engine to which the update applies. Either Redis or Memcached 
    */
  var Engine: js.UndefOr[String] = js.native
  /**
    * An optional marker returned from a prior request. Use this marker for pagination of results from this operation. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords.
    */
  var Marker: js.UndefOr[String] = js.native
  /**
    * The maximum number of records to include in the response
    */
  var MaxRecords: js.UndefOr[IntegerOptional] = js.native
  /**
    * The replication group IDs
    */
  var ReplicationGroupIds: js.UndefOr[ReplicationGroupIdList] = js.native
  /**
    * The unique ID of the service update
    */
  var ServiceUpdateName: js.UndefOr[String] = js.native
  /**
    * The status of the service update
    */
  var ServiceUpdateStatus: js.UndefOr[ServiceUpdateStatusList] = js.native
  /**
    * The range of time specified to search for service updates that are in available status
    */
  var ServiceUpdateTimeRange: js.UndefOr[TimeRangeFilter] = js.native
  /**
    * Dictates whether to include node level update status in the response 
    */
  var ShowNodeLevelUpdateStatus: js.UndefOr[BooleanOptional] = js.native
  /**
    * The status of the update action.
    */
  var UpdateActionStatus: js.UndefOr[UpdateActionStatusList] = js.native
}

object DescribeUpdateActionsMessage {
  @scala.inline
  def apply(
    CacheClusterIds: CacheClusterIdList = null,
    Engine: String = null,
    Marker: String = null,
    MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
    ReplicationGroupIds: ReplicationGroupIdList = null,
    ServiceUpdateName: String = null,
    ServiceUpdateStatus: ServiceUpdateStatusList = null,
    ServiceUpdateTimeRange: TimeRangeFilter = null,
    ShowNodeLevelUpdateStatus: js.UndefOr[BooleanOptional] = js.undefined,
    UpdateActionStatus: UpdateActionStatusList = null
  ): DescribeUpdateActionsMessage = {
    val __obj = js.Dynamic.literal()
    if (CacheClusterIds != null) __obj.updateDynamic("CacheClusterIds")(CacheClusterIds.asInstanceOf[js.Any])
    if (Engine != null) __obj.updateDynamic("Engine")(Engine.asInstanceOf[js.Any])
    if (Marker != null) __obj.updateDynamic("Marker")(Marker.asInstanceOf[js.Any])
    if (!js.isUndefined(MaxRecords)) __obj.updateDynamic("MaxRecords")(MaxRecords.get.asInstanceOf[js.Any])
    if (ReplicationGroupIds != null) __obj.updateDynamic("ReplicationGroupIds")(ReplicationGroupIds.asInstanceOf[js.Any])
    if (ServiceUpdateName != null) __obj.updateDynamic("ServiceUpdateName")(ServiceUpdateName.asInstanceOf[js.Any])
    if (ServiceUpdateStatus != null) __obj.updateDynamic("ServiceUpdateStatus")(ServiceUpdateStatus.asInstanceOf[js.Any])
    if (ServiceUpdateTimeRange != null) __obj.updateDynamic("ServiceUpdateTimeRange")(ServiceUpdateTimeRange.asInstanceOf[js.Any])
    if (!js.isUndefined(ShowNodeLevelUpdateStatus)) __obj.updateDynamic("ShowNodeLevelUpdateStatus")(ShowNodeLevelUpdateStatus.get.asInstanceOf[js.Any])
    if (UpdateActionStatus != null) __obj.updateDynamic("UpdateActionStatus")(UpdateActionStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeUpdateActionsMessage]
  }
}

