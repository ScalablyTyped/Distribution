package typings.awsSdk.dynamodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateGlobalTableInput extends js.Object {
  /**
    * The global table name.
    */
  var GlobalTableName: TableName = js.native
  /**
    * A list of Regions that should be added or removed from the global table.
    */
  var ReplicaUpdates: ReplicaUpdateList = js.native
}

object UpdateGlobalTableInput {
  @scala.inline
  def apply(GlobalTableName: TableName, ReplicaUpdates: ReplicaUpdateList): UpdateGlobalTableInput = {
    val __obj = js.Dynamic.literal(GlobalTableName = GlobalTableName.asInstanceOf[js.Any], ReplicaUpdates = ReplicaUpdates.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UpdateGlobalTableInput]
  }
}

