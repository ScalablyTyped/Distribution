package typings.awsSdk.docdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DBClusterParameterGroupsMessage extends js.Object {
  /**
    * A list of cluster parameter groups.
    */
  var DBClusterParameterGroups: js.UndefOr[DBClusterParameterGroupList] = js.native
  /**
    * An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords.
    */
  var Marker: js.UndefOr[String] = js.native
}

object DBClusterParameterGroupsMessage {
  @scala.inline
  def apply(DBClusterParameterGroups: DBClusterParameterGroupList = null, Marker: String = null): DBClusterParameterGroupsMessage = {
    val __obj = js.Dynamic.literal()
    if (DBClusterParameterGroups != null) __obj.updateDynamic("DBClusterParameterGroups")(DBClusterParameterGroups.asInstanceOf[js.Any])
    if (Marker != null) __obj.updateDynamic("Marker")(Marker.asInstanceOf[js.Any])
    __obj.asInstanceOf[DBClusterParameterGroupsMessage]
  }
}

