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
  def apply(): DBClusterMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DBClusterMessage]
  }
  @scala.inline
  implicit class DBClusterMessageOps[Self <: DBClusterMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDBClustersVarargs(value: DBCluster*): Self = this.set("DBClusters", js.Array(value :_*))
    @scala.inline
    def setDBClusters(value: DBClusterList): Self = this.set("DBClusters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDBClusters: Self = this.set("DBClusters", js.undefined)
    @scala.inline
    def setMarker(value: String): Self = this.set("Marker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarker: Self = this.set("Marker", js.undefined)
  }
  
}

