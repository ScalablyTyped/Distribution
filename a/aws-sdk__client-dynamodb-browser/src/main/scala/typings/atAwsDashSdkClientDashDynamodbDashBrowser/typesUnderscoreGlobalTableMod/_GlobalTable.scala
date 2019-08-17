package typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesUnderscoreGlobalTableMod

import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesUnderscoreReplicaMod._Replica
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _GlobalTable extends js.Object {
  /**
    * <p>The global table name.</p>
    */
  var GlobalTableName: js.UndefOr[String] = js.undefined
  /**
    * <p>The regions where the global table has replicas.</p>
    */
  var ReplicationGroup: js.UndefOr[js.Array[_Replica] | Iterable[_Replica]] = js.undefined
}

object _GlobalTable {
  @scala.inline
  def apply(GlobalTableName: String = null, ReplicationGroup: js.Array[_Replica] | Iterable[_Replica] = null): _GlobalTable = {
    val __obj = js.Dynamic.literal()
    if (GlobalTableName != null) __obj.updateDynamic("GlobalTableName")(GlobalTableName)
    if (ReplicationGroup != null) __obj.updateDynamic("ReplicationGroup")(ReplicationGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[_GlobalTable]
  }
}

