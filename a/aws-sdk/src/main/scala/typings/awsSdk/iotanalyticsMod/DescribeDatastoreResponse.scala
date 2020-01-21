package typings.awsSdk.iotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeDatastoreResponse extends js.Object {
  /**
    * Information about the data store.
    */
  var datastore: js.UndefOr[Datastore] = js.native
  /**
    * Additional statistical information about the data store. Included if the 'includeStatistics' parameter is set to true in the request.
    */
  var statistics: js.UndefOr[DatastoreStatistics] = js.native
}

object DescribeDatastoreResponse {
  @scala.inline
  def apply(datastore: Datastore = null, statistics: DatastoreStatistics = null): DescribeDatastoreResponse = {
    val __obj = js.Dynamic.literal()
    if (datastore != null) __obj.updateDynamic("datastore")(datastore.asInstanceOf[js.Any])
    if (statistics != null) __obj.updateDynamic("statistics")(statistics.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDatastoreResponse]
  }
}

