package typings.awsSdk.documentClientMod.DocumentClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GlobalTable extends js.Object {
  /**
    * The global table name.
    */
  var GlobalTableName: js.UndefOr[TableName] = js.native
  /**
    * The Regions where the global table has replicas.
    */
  var ReplicationGroup: js.UndefOr[ReplicaList] = js.native
}

object GlobalTable {
  @scala.inline
  def apply(GlobalTableName: TableName = null, ReplicationGroup: ReplicaList = null): GlobalTable = {
    val __obj = js.Dynamic.literal()
    if (GlobalTableName != null) __obj.updateDynamic("GlobalTableName")(GlobalTableName.asInstanceOf[js.Any])
    if (ReplicationGroup != null) __obj.updateDynamic("ReplicationGroup")(ReplicationGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlobalTable]
  }
}

