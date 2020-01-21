package typings.awsSdk.documentClientMod.DocumentClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GlobalTableDescription extends js.Object {
  /**
    * The creation time of the global table.
    */
  var CreationDateTime: js.UndefOr[Date] = js.native
  /**
    * The unique identifier of the global table.
    */
  var GlobalTableArn: js.UndefOr[GlobalTableArnString] = js.native
  /**
    * The global table name.
    */
  var GlobalTableName: js.UndefOr[TableName] = js.native
  /**
    * The current state of the global table:    CREATING - The global table is being created.    UPDATING - The global table is being updated.    DELETING - The global table is being deleted.    ACTIVE - The global table is ready for use.  
    */
  var GlobalTableStatus: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.GlobalTableStatus] = js.native
  /**
    * The Regions where the global table has replicas.
    */
  var ReplicationGroup: js.UndefOr[ReplicaDescriptionList] = js.native
}

object GlobalTableDescription {
  @scala.inline
  def apply(
    CreationDateTime: Date = null,
    GlobalTableArn: GlobalTableArnString = null,
    GlobalTableName: TableName = null,
    GlobalTableStatus: GlobalTableStatus = null,
    ReplicationGroup: ReplicaDescriptionList = null
  ): GlobalTableDescription = {
    val __obj = js.Dynamic.literal()
    if (CreationDateTime != null) __obj.updateDynamic("CreationDateTime")(CreationDateTime.asInstanceOf[js.Any])
    if (GlobalTableArn != null) __obj.updateDynamic("GlobalTableArn")(GlobalTableArn.asInstanceOf[js.Any])
    if (GlobalTableName != null) __obj.updateDynamic("GlobalTableName")(GlobalTableName.asInstanceOf[js.Any])
    if (GlobalTableStatus != null) __obj.updateDynamic("GlobalTableStatus")(GlobalTableStatus.asInstanceOf[js.Any])
    if (ReplicationGroup != null) __obj.updateDynamic("ReplicationGroup")(ReplicationGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlobalTableDescription]
  }
}

