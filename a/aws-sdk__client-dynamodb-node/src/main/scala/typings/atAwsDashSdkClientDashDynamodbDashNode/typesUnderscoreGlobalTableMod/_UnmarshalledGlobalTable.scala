package typings.atAwsDashSdkClientDashDynamodbDashNode.typesUnderscoreGlobalTableMod

import typings.atAwsDashSdkClientDashDynamodbDashNode.typesUnderscoreReplicaMod._UnmarshalledReplica
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledGlobalTable extends _GlobalTable {
  /**
    * <p>The regions where the global table has replicas.</p>
    */
  @JSName("ReplicationGroup")
  var ReplicationGroup__UnmarshalledGlobalTable: js.UndefOr[js.Array[_UnmarshalledReplica]] = js.undefined
}

object _UnmarshalledGlobalTable {
  @scala.inline
  def apply(GlobalTableName: String = null, ReplicationGroup: js.Array[_UnmarshalledReplica] = null): _UnmarshalledGlobalTable = {
    val __obj = js.Dynamic.literal()
    if (GlobalTableName != null) __obj.updateDynamic("GlobalTableName")(GlobalTableName)
    if (ReplicationGroup != null) __obj.updateDynamic("ReplicationGroup")(ReplicationGroup)
    __obj.asInstanceOf[_UnmarshalledGlobalTable]
  }
}

