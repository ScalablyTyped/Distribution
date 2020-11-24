package typings.awsSdk.dynamodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  
  @scala.inline
  implicit class UpdateGlobalTableInputOps[Self <: UpdateGlobalTableInput] (val x: Self) extends AnyVal {
    
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
    def setReplicaUpdatesVarargs(value: ReplicaUpdate*): Self = this.set("ReplicaUpdates", js.Array(value :_*))
    
    @scala.inline
    def setReplicaUpdates(value: ReplicaUpdateList): Self = this.set("ReplicaUpdates", value.asInstanceOf[js.Any])
  }
}
