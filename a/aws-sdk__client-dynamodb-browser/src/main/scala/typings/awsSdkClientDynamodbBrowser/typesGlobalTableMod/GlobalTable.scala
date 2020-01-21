package typings.awsSdkClientDynamodbBrowser.typesGlobalTableMod

import typings.awsSdkClientDynamodbBrowser.typesReplicaMod.Replica
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlobalTable extends js.Object {
  /**
    * <p>The global table name.</p>
    */
  var GlobalTableName: js.UndefOr[String] = js.undefined
  /**
    * <p>The regions where the global table has replicas.</p>
    */
  var ReplicationGroup: js.UndefOr[js.Array[Replica] | Iterable[Replica]] = js.undefined
}

object GlobalTable {
  @scala.inline
  def apply(GlobalTableName: String = null, ReplicationGroup: js.Array[Replica] | Iterable[Replica] = null): GlobalTable = {
    val __obj = js.Dynamic.literal()
    if (GlobalTableName != null) __obj.updateDynamic("GlobalTableName")(GlobalTableName.asInstanceOf[js.Any])
    if (ReplicationGroup != null) __obj.updateDynamic("ReplicationGroup")(ReplicationGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlobalTable]
  }
}

