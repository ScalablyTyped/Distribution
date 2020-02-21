package typings.awsSdk.docdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DBClusterMessage extends js.Object {
  /**
    * A list of clusters.
    */
  var DBClusters: js.UndefOr[DBClusterList] = js.native
  /**
    * An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords.
    */
  var Marker: js.UndefOr[String] = js.native
}

object DBClusterMessage {
  @scala.inline
  def apply(DBClusters: DBClusterList = null, Marker: String = null): DBClusterMessage = {
    val __obj = js.Dynamic.literal()
    if (DBClusters != null) __obj.updateDynamic("DBClusters")(DBClusters.asInstanceOf[js.Any])
    if (Marker != null) __obj.updateDynamic("Marker")(Marker.asInstanceOf[js.Any])
    __obj.asInstanceOf[DBClusterMessage]
  }
}

