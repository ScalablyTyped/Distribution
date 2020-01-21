package typings.awsSdkClientDynamodbBrowser.typesGlobalTableMod

import typings.awsSdkClientDynamodbBrowser.typesReplicaMod.UnmarshalledReplica
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledGlobalTable extends GlobalTable {
  /**
    * <p>The regions where the global table has replicas.</p>
    */
  @JSName("ReplicationGroup")
  var ReplicationGroup_UnmarshalledGlobalTable: js.UndefOr[js.Array[UnmarshalledReplica]] = js.undefined
}

object UnmarshalledGlobalTable {
  @scala.inline
  def apply(GlobalTableName: String = null, ReplicationGroup: js.Array[UnmarshalledReplica] = null): UnmarshalledGlobalTable = {
    val __obj = js.Dynamic.literal()
    if (GlobalTableName != null) __obj.updateDynamic("GlobalTableName")(GlobalTableName.asInstanceOf[js.Any])
    if (ReplicationGroup != null) __obj.updateDynamic("ReplicationGroup")(ReplicationGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledGlobalTable]
  }
}

