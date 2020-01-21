package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DBClusterEndpointMessage extends js.Object {
  /**
    * Contains the details of the endpoints associated with the cluster and matching any filter conditions.
    */
  var DBClusterEndpoints: js.UndefOr[DBClusterEndpointList] = js.native
  /**
    *  An optional pagination token provided by a previous DescribeDBClusterEndpoints request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords. 
    */
  var Marker: js.UndefOr[String] = js.native
}

object DBClusterEndpointMessage {
  @scala.inline
  def apply(DBClusterEndpoints: DBClusterEndpointList = null, Marker: String = null): DBClusterEndpointMessage = {
    val __obj = js.Dynamic.literal()
    if (DBClusterEndpoints != null) __obj.updateDynamic("DBClusterEndpoints")(DBClusterEndpoints.asInstanceOf[js.Any])
    if (Marker != null) __obj.updateDynamic("Marker")(Marker.asInstanceOf[js.Any])
    __obj.asInstanceOf[DBClusterEndpointMessage]
  }
}

