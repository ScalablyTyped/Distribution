package typings.awsSdk.documentClientMod.DocumentClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateGlobalTableInput extends js.Object {
  /**
    * The global table name.
    */
  var GlobalTableName: TableName = js.native
  /**
    * The Regions where the global table needs to be created.
    */
  var ReplicationGroup: ReplicaList = js.native
}

object CreateGlobalTableInput {
  @scala.inline
  def apply(GlobalTableName: TableName, ReplicationGroup: ReplicaList): CreateGlobalTableInput = {
    val __obj = js.Dynamic.literal(GlobalTableName = GlobalTableName.asInstanceOf[js.Any], ReplicationGroup = ReplicationGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateGlobalTableInput]
  }
  @scala.inline
  implicit class CreateGlobalTableInputOps[Self <: CreateGlobalTableInput] (val x: Self) extends AnyVal {
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
    def setGlobalTableName(value: TableName): Self = this.set("GlobalTableName", value.asInstanceOf[js.Any])
    @scala.inline
    def setReplicationGroupVarargs(value: Replica*): Self = this.set("ReplicationGroup", js.Array(value :_*))
    @scala.inline
    def setReplicationGroup(value: ReplicaList): Self = this.set("ReplicationGroup", value.asInstanceOf[js.Any])
  }
  
}

