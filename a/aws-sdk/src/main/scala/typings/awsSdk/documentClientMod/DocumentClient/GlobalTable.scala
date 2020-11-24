package typings.awsSdk.documentClientMod.DocumentClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(): GlobalTable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GlobalTable]
  }
  
  @scala.inline
  implicit class GlobalTableOps[Self <: GlobalTable] (val x: Self) extends AnyVal {
    
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
    def deleteGlobalTableName: Self = this.set("GlobalTableName", js.undefined)
    
    @scala.inline
    def setReplicationGroupVarargs(value: Replica*): Self = this.set("ReplicationGroup", js.Array(value :_*))
    
    @scala.inline
    def setReplicationGroup(value: ReplicaList): Self = this.set("ReplicationGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplicationGroup: Self = this.set("ReplicationGroup", js.undefined)
  }
}
