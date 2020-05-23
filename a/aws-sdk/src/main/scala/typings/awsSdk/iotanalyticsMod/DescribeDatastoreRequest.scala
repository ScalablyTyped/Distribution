package typings.awsSdk.iotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeDatastoreRequest extends js.Object {
  /**
    * The name of the data store
    */
  var datastoreName: DatastoreName = js.native
  /**
    * If true, additional statistical information about the data store is included in the response. This feature cannot be used with a data store whose S3 storage is customer-managed.
    */
  var includeStatistics: js.UndefOr[IncludeStatisticsFlag] = js.native
}

object DescribeDatastoreRequest {
  @scala.inline
  def apply(datastoreName: DatastoreName, includeStatistics: js.UndefOr[IncludeStatisticsFlag] = js.undefined): DescribeDatastoreRequest = {
    val __obj = js.Dynamic.literal(datastoreName = datastoreName.asInstanceOf[js.Any])
    if (!js.isUndefined(includeStatistics)) __obj.updateDynamic("includeStatistics")(includeStatistics.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDatastoreRequest]
  }
}

